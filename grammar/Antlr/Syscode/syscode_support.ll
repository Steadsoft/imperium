; ModuleID = 'syscode_support.bc'
source_filename = "syscode_support.ll"

define i1 @syscode.get_unaliged_bit(i8* %array, i32 %N) {
entry:
  %byte_idx = udiv i32 %N, 8
  %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
  %byte = load i8, i8* %byte_ptr, align 1
  %bit_idx = urem i32 %N, 8
  %bit_idx_i8 = trunc i32 %bit_idx to i8
  %shifted = lshr i8 %byte, %bit_idx_i8
  %bit = and i8 %shifted, 1
  %result = trunc i8 %bit to i1
  ret i1 %result
}

define void @syscode.set_unaliged_bit(i8* %array, i32 %N) {
entry:
  %byte_idx = udiv i32 %N, 8
  %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
  %byte = load i8, i8* %byte_ptr, align 1
  %bit_idx = urem i32 %N, 8
  %bit_idx_i8 = trunc i32 %bit_idx to i8
  %bit_mask = shl i8 1, %bit_idx_i8
  %new_byte = or i8 %byte, %bit_mask
  store i8 %new_byte, i8* %byte_ptr, align 1
  ret void
}

; Copilot generated code for access elements of an unaliged bit array where each element is 5 bits long.
; Where This 5 Appears and What It Means:
; %bit_pos = mul i32 %N, 5

; Multiplies the index N by 5 to determine the starting bit position of the requested element.

; icmp uge i32 %bit_offset, 3

; Checks whether the 5-bit element crosses a byte boundary (%bit_offset ≥ 3 means it spills into another byte).

; and i16 %merged, 31

; Applies a bitmask (0b11111 or decimal 31) to extract exactly 5 bits from the merged byte data.


define i8 @get_element(i8* %array, i32 %N) {
entry:
    ; Compute the starting bit position
    %bit_pos = mul i32 %N, 5 ;; NOTE: this is the bit length of the bit arrays elements

    ; Determine the primary byte index
    %byte_idx = udiv i32 %bit_pos, 8
    %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
    %byte = load i8, i8* %byte_ptr

    ; Compute the bit offset within the byte
    %bit_offset = urem i32 %bit_pos, 8
    %bit_offset_i8 = trunc i32 %bit_offset to i8

    ; Create the first bitmask (lower bits in primary byte)
    %first_part = lshr i8 %byte, %bit_offset_i8

    ; Check if we need the next byte (if bits spill over)
    %needs_extra = icmp uge i32 %bit_offset, 3  ; 5-bit span crosses boundary?

    ; Load the next byte if needed
    %next_byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
    %byte_idx_plus_one = add i32 %byte_idx, 1
    %next_byte_ptr2 = getelementptr i8, i8* %array, i32 %byte_idx_plus_one    
    %next_byte = load i8, i8* %next_byte_ptr2

    ; Shift next byte into position and merge if necessary
    %next_byte_i16 = zext i8 %next_byte to i16
    %shift_next = shl i16 %next_byte_i16, 8
    %first_part_i16 = zext i8 %first_part to i16
    %merged = or i16 %first_part_i16, %shift_next

    ; Mask to extract exactly 5 bits
    %result = and i16 %merged, 31

    ; Truncate to i8 for return value
    %final_result = trunc i16 %result to i8
    ret i8 %final_result
}

; This is supposed to work, get array element N where the elements are bit_len long
define i8 @get_element2(i8* %array, i32 %N, i32 %bit_len) {
entry:
    ; Compute the starting bit position
    %bit_pos = mul i32 %N, %bit_len

    ; Determine the primary byte index
    %byte_idx = udiv i32 %bit_pos, 8
    %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
    %byte = load i8, i8* %byte_ptr

    ; Compute the bit offset within the byte
    %bit_offset = urem i32 %bit_pos, 8
    %bit_offset_i8 = trunc i32 %bit_offset to i8

    ; Extract first part from primary byte
    %first_part = lshr i8 %byte, %bit_offset_i8

    ; Check if we need the next byte (if crossing a boundary)
    %byte_boundary = sub i32 8, %bit_offset
    %needs_extra = icmp ult i32 %byte_boundary, %bit_len  ; Dynamic check

    ; Load the next byte if needed
    %byte_idx_plus_one = add i32 %byte_idx, 1
    %next_byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx_plus_one
    %next_byte = load i8, i8* %next_byte_ptr

    ; Shift next byte into position if crossing boundary
    %next_byte_i16 = zext i8 %next_byte to i16
    %shift_next = shl i16 %next_byte_i16, 8
    %first_part_i16 = zext i8 %first_part to i16
    %merged = or i16 %first_part_i16, %shift_next

    ; Create dynamic bitmask (2^bit_len - 1)
    %bit_len_i16 = trunc i32 %bit_len to i16
    %shifted_mask = shl i16 1, %bit_len_i16
    %mask = sub i16 %shifted_mask, 1
    %result = and i16 %merged, %mask

    ; Truncate to i8 for return
    %final_result = trunc i16 %result to i8
    ret i8 %final_result
}

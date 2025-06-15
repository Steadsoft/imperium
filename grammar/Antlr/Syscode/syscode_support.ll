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

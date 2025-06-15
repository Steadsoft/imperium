; ModuleID = 'factorial'
declare i43 @printf(i8*, ...)


%outermost = type { i32, i16, <{[32 x i8]}>, %inner_1, %inner_2 }
%inner_1 = type { i14, i27 }
%inner_2 = type { i16, i64, i11, %inner_2_inner_1 }
%inner_2_inner_1 = type { i16, i32 }
%second = type { i32, i8 }




@.fmt = private constant [22 x i8] c"Factorial of %d = %d\0A\00"

define i43 @factorial(i43 %n) 
{
entry:
  %cmp = icmp eq i43 %n, 0
  br i1 %cmp, label %base, label %recurse

base:
  ret i43 1

recurse:
  %n1 = sub i43 %n, 1
  %rec = call i43 @factorial(i43 %n1)
  %res = mul i43 %n, %rec
  ret i43 %res
}

define i43 @main() 
{

entry:

  %val = call i43 @factorial(i43 5)
  %fmtptr = getelementptr inbounds [22 x i8], [22 x i8]* @.fmt, i43 0, i43 0
  call i43 (i8*, ...) @printf(i8* %fmtptr, i43 5, i43 %val)
  ret i43 0
}

; In LLVM we will represent arbitrary length bit strings as some multiple
; of some chosen length like 8 or 16 or 32 etc.
; For a 128 bit string we'd get the n'th bit like this:


define i1 @syscode.get_unaliged_bit(i8* %array, i32 %N) {
entry:
    ; Compute the byte index
    %byte_idx = udiv i32 %N, 8
    %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
    %byte = load i8, i8* %byte_ptr

    ; Compute the bit index within the byte and cast it to i8
    %bit_idx = urem i32 %N, 8
    %bit_idx_i8 = trunc i32 %bit_idx to i8

    ; Shift right and extract the bit
    %shifted = lshr i8 %byte, %bit_idx_i8
    %bit = and i8 %shifted, 1

    ; Convert result to i1
    %result = trunc i8 %bit to i1
    ret i1 %result
}

define void @syscode.set_unaliged_bit(i8* %array, i32 %N) {
entry:
    ; Compute the byte index
    %byte_idx = udiv i32 %N, 8
    %byte_ptr = getelementptr i8, i8* %array, i32 %byte_idx
    %byte = load i8, i8* %byte_ptr

    ; Compute the bit index within the byte and cast to i8
    %bit_idx = urem i32 %N, 8
    %bit_idx_i8 = trunc i32 %bit_idx to i8

    ; Create bitmask by shifting 1 to the correct bit position
    %bit_mask = shl i8 1, %bit_idx_i8

    ; Set the bit using 'or'
    %new_byte = or i8 %byte, %bit_mask

    ; Store the modified byte back into memory
    store i8 %new_byte, i8* %byte_ptr

    ret void
}
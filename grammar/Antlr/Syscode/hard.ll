; ModuleID = 'factorial'
declare i43 @printf(i8*, ...)

%outermost = type { i32, i16, [32 x i8], %inner_1, %inner_2 }
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
; of some chosen length lik 8 or 16 or 32 etc.
; For a 128 bit string we'd get the n'th bit like this:

define i1 @get_bit_128(i32* %registers, i32 %bit_index) {
entry:
    %register_index = udiv i32 %bit_index, 32   ; Find the register
    %bit_position = urem i32 %bit_index, 32     ; Find position in register
    %register_ptr = getelementptr i32, i32* %registers, i32 %register_index
    %register_value = load i32, i32* %register_ptr
    %shifted = lshr i32 %register_value, %bit_position
    %bit = and i32 %shifted, 1
    %result = trunc i32 %bit to i1
    ret i1 %result
}
; ModuleID = 'factorial'
declare i43 @printf(i8*, ...)

  %Outer = type { i64, %Inner, double }

  %Inner = type { i8, i32 } 



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
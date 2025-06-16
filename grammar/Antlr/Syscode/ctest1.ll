; ModuleID = 'ctest1.c'
source_filename = "ctest1.c"
target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-windows-msvc19.44.35208"

%struct.databits = type { [32 x i16] }

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @arrays(ptr noundef %ba_ptr) #0 {
entry:
  %ba_ptr.addr = alloca ptr, align 8
  %ptr = alloca ptr, align 8
  %ee = alloca i32, align 4
  %ba = alloca %struct.databits, align 2
  store ptr %ba_ptr, ptr %ba_ptr.addr, align 8
  %0 = load ptr, ptr %ba_ptr.addr, align 8
  %array = getelementptr inbounds nuw %struct.databits, ptr %0, i32 0, i32 0
  %arrayidx = getelementptr inbounds [32 x i16], ptr %array, i64 0, i64 3
  %1 = load i16, ptr %arrayidx, align 2
  %conv = sext i16 %1 to i32
  %cmp = icmp eq i32 %conv, 40
  br i1 %cmp, label %if.then, label %if.else

if.then:                                          ; preds = %entry
  %2 = load ptr, ptr %ba_ptr.addr, align 8
  %array2 = getelementptr inbounds nuw %struct.databits, ptr %2, i32 0, i32 0
  %arrayidx3 = getelementptr inbounds [32 x i16], ptr %array2, i64 0, i64 0
  store i16 3, ptr %arrayidx3, align 2
  br label %if.end

if.else:                                          ; preds = %entry
  %3 = load ptr, ptr %ba_ptr.addr, align 8
  %array4 = getelementptr inbounds nuw %struct.databits, ptr %3, i32 0, i32 0
  %arrayidx5 = getelementptr inbounds [32 x i16], ptr %array4, i64 0, i64 1
  store i16 3, ptr %arrayidx5, align 2
  br label %if.end

if.end:                                           ; preds = %if.else, %if.then
  ret void
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local i8 @get_bit_value(ptr noundef %array, i64 noundef %X, i64 noundef %W) #0 {
entry:
  %W.addr = alloca i64, align 8
  %X.addr = alloca i64, align 8
  %array.addr = alloca ptr, align 8
  %byte_index = alloca i64, align 8
  %bit_index = alloca i64, align 8
  store i64 %W, ptr %W.addr, align 8
  store i64 %X, ptr %X.addr, align 8
  store ptr %array, ptr %array.addr, align 8
  %0 = load i64, ptr %W.addr, align 8
  %div = udiv i64 %0, 8
  store i64 %div, ptr %byte_index, align 8
  %1 = load i64, ptr %W.addr, align 8
  %rem = urem i64 %1, 8
  store i64 %rem, ptr %bit_index, align 8
  %2 = load ptr, ptr %array.addr, align 8
  %3 = load i64, ptr %byte_index, align 8
  %arrayidx = getelementptr inbounds nuw i8, ptr %2, i64 %3
  %4 = load i8, ptr %arrayidx, align 1
  %conv = sext i8 %4 to i32
  %5 = load i64, ptr %bit_index, align 8
  %sh_prom = trunc i64 %5 to i32
  %shr = ashr i32 %conv, %sh_prom
  %and = and i32 %shr, 1
  %conv1 = trunc i32 %and to i8
  ret i8 %conv1
}

attributes #0 = { noinline nounwind optnone uwtable "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }

!llvm.module.flags = !{!0, !1, !2, !3}
!llvm.ident = !{!4}

!0 = !{i32 1, !"wchar_size", i32 2}
!1 = !{i32 8, !"PIC Level", i32 2}
!2 = !{i32 7, !"uwtable", i32 2}
!3 = !{i32 1, !"MaxTLSAlign", i32 65536}
!4 = !{!"clang version 20.1.7 (https://github.com/wareya/llvm-custom-builds fb64f1750b46b9b3116ef126a3b0c61566cbae96)"}

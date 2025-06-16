; ModuleID = 'ctest1.ll'
source_filename = "ctest1.c"
target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-windows-msvc19.44.35208"

%struct.databits = type { [32 x i16] }

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @arrays() local_unnamed_addr #0 !dbg !20 {
entry:
  %ptr = alloca ptr, align 8
  %ee = alloca i32, align 4
  %ba = alloca %struct.databits, align 2
    #dbg_declare(ptr %ptr, !24, !DIExpression(), !34)
    #dbg_declare(ptr %ee, !35, !DIExpression(), !37)
    #dbg_declare(ptr %ba, !38, !DIExpression(), !39)
  %array = getelementptr inbounds nuw %struct.databits, ptr %ba, i32 0, i32 0, !dbg !40
  %arrayidx = getelementptr inbounds nuw [32 x i16], ptr %array, i64 0, i64 0, !dbg !40
  store i16 3, ptr %arrayidx, align 2, !dbg !40
  ret void, !dbg !41
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local range(i8 0, 2) i8 @get_bit_value(ptr noundef %array, i64 noundef %X, i64 noundef %W) local_unnamed_addr #0 !dbg !42 {
entry:
  %W.addr = alloca i64, align 8
  %X.addr = alloca i64, align 8
  %array.addr = alloca ptr, align 8
  %byte_index = alloca i64, align 8
  %bit_index = alloca i64, align 8
  store i64 %W, ptr %W.addr, align 8
    #dbg_declare(ptr %W.addr, !51, !DIExpression(), !52)
  store i64 %X, ptr %X.addr, align 8
    #dbg_declare(ptr %X.addr, !53, !DIExpression(), !52)
  store ptr %array, ptr %array.addr, align 8
    #dbg_declare(ptr %array.addr, !54, !DIExpression(), !52)
    #dbg_declare(ptr %byte_index, !55, !DIExpression(), !56)
  %0 = load i64, ptr %W.addr, align 8, !dbg !56
  %div = udiv i64 %0, 8, !dbg !56
  store i64 %div, ptr %byte_index, align 8, !dbg !56
    #dbg_declare(ptr %bit_index, !57, !DIExpression(), !58)
  %1 = load i64, ptr %W.addr, align 8, !dbg !58
  %rem = urem i64 %1, 8, !dbg !58
  store i64 %rem, ptr %bit_index, align 8, !dbg !58
  %2 = load ptr, ptr %array.addr, align 8, !dbg !59
  %3 = load i64, ptr %byte_index, align 8, !dbg !59
  %arrayidx = getelementptr inbounds nuw i8, ptr %2, i64 %3, !dbg !59
  %4 = load i8, ptr %arrayidx, align 1, !dbg !59
  %conv = sext i8 %4 to i32, !dbg !59
  %5 = load i64, ptr %bit_index, align 8, !dbg !59
  %sh_prom = trunc i64 %5 to i32, !dbg !59
  %shr = ashr i32 %conv, %sh_prom, !dbg !59
  %and = and i32 %shr, 1, !dbg !59
  %conv1 = trunc nuw nsw i32 %and to i8, !dbg !59
  ret i8 %conv1, !dbg !59
}

attributes #0 = { noinline nounwind optnone uwtable "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }

!llvm.dbg.cu = !{!0}
!llvm.module.flags = !{!13, !14, !15, !16, !17, !18}
!llvm.ident = !{!19}

!0 = distinct !DICompileUnit(language: DW_LANG_C11, file: !1, producer: "clang version 20.1.7 (https://github.com/wareya/llvm-custom-builds fb64f1750b46b9b3116ef126a3b0c61566cbae96)", isOptimized: false, runtimeVersion: 0, emissionKind: FullDebug, enums: !2, globals: !10, splitDebugInlining: false, nameTableKind: None)
!1 = !DIFile(filename: "ctest1.c", directory: "D:\\Git\\GitHub\\Steadsoft\\imperium\\grammar\\Antlr\\Syscode", checksumkind: CSK_MD5, checksum: "3b4376128043bd43767b704a1c133ac6")
!2 = !{!3}
!3 = !DICompositeType(tag: DW_TAG_enumeration_type, name: "set", file: !1, line: 8, baseType: !4, size: 32, elements: !5)
!4 = !DIBasicType(name: "int", size: 32, encoding: DW_ATE_signed)
!5 = !{!6, !7, !8, !9}
!6 = !DIEnumerator(name: "a", value: 0)
!7 = !DIEnumerator(name: "b", value: 1)
!8 = !DIEnumerator(name: "c", value: 2)
!9 = !DIEnumerator(name: "d", value: 3)
!10 = !{!11}
!11 = !DIGlobalVariableExpression(var: !12, expr: !DIExpression(DW_OP_constu, 3, DW_OP_stack_value))
!12 = distinct !DIGlobalVariable(name: "d", scope: !0, file: !1, line: 13, type: !4, isLocal: true, isDefinition: true)
!13 = !{i32 2, !"CodeView", i32 1}
!14 = !{i32 2, !"Debug Info Version", i32 3}
!15 = !{i32 1, !"wchar_size", i32 2}
!16 = !{i32 8, !"PIC Level", i32 2}
!17 = !{i32 7, !"uwtable", i32 2}
!18 = !{i32 1, !"MaxTLSAlign", i32 65536}
!19 = !{!"clang version 20.1.7 (https://github.com/wareya/llvm-custom-builds fb64f1750b46b9b3116ef126a3b0c61566cbae96)"}
!20 = distinct !DISubprogram(name: "arrays", scope: !1, file: !1, line: 19, type: !21, scopeLine: 20, spFlags: DISPFlagDefinition, unit: !0, retainedNodes: !23)
!21 = !DISubroutineType(types: !22)
!22 = !{null}
!23 = !{}
!24 = !DILocalVariable(name: "ptr", scope: !20, file: !1, line: 22, type: !25)
!25 = !DIDerivedType(tag: DW_TAG_pointer_type, baseType: !26, size: 64)
!26 = !DIDerivedType(tag: DW_TAG_typedef, name: "Bitarray", file: !1, line: 6, baseType: !27)
!27 = distinct !DICompositeType(tag: DW_TAG_structure_type, name: "databits", file: !1, line: 2, size: 512, elements: !28)
!28 = !{!29}
!29 = !DIDerivedType(tag: DW_TAG_member, name: "array", scope: !27, file: !1, line: 4, baseType: !30, size: 512)
!30 = !DICompositeType(tag: DW_TAG_array_type, baseType: !31, size: 512, elements: !32)
!31 = !DIBasicType(name: "short", size: 16, encoding: DW_ATE_signed)
!32 = !{!33}
!33 = !DISubrange(count: 32)
!34 = !DILocation(line: 22, scope: !20)
!35 = !DILocalVariable(name: "ee", scope: !20, file: !1, line: 24, type: !36)
!36 = !DIDerivedType(tag: DW_TAG_typedef, name: "Bitenum", file: !1, line: 15, baseType: !3)
!37 = !DILocation(line: 24, scope: !20)
!38 = !DILocalVariable(name: "ba", scope: !20, file: !1, line: 26, type: !26)
!39 = !DILocation(line: 26, scope: !20)
!40 = !DILocation(line: 28, scope: !20)
!41 = !DILocation(line: 30, scope: !20)
!42 = distinct !DISubprogram(name: "get_bit_value", scope: !1, file: !1, line: 34, type: !43, scopeLine: 34, flags: DIFlagPrototyped, spFlags: DISPFlagDefinition, unit: !0, retainedNodes: !23)
!43 = !DISubroutineType(types: !44)
!44 = !{!45, !46, !49, !49}
!45 = !DIBasicType(name: "unsigned char", size: 8, encoding: DW_ATE_unsigned_char)
!46 = !DIDerivedType(tag: DW_TAG_pointer_type, baseType: !47, size: 64)
!47 = !DIDerivedType(tag: DW_TAG_const_type, baseType: !48)
!48 = !DIBasicType(name: "char", size: 8, encoding: DW_ATE_signed_char)
!49 = !DIDerivedType(tag: DW_TAG_typedef, name: "size_t", file: !1, baseType: !50)
!50 = !DIBasicType(name: "unsigned long long", size: 64, encoding: DW_ATE_unsigned)
!51 = !DILocalVariable(name: "W", arg: 3, scope: !42, file: !1, line: 34, type: !49)
!52 = !DILocation(line: 34, scope: !42)
!53 = !DILocalVariable(name: "X", arg: 2, scope: !42, file: !1, line: 34, type: !49)
!54 = !DILocalVariable(name: "array", arg: 1, scope: !42, file: !1, line: 34, type: !46)
!55 = !DILocalVariable(name: "byte_index", scope: !42, file: !1, line: 40, type: !49)
!56 = !DILocation(line: 40, scope: !42)
!57 = !DILocalVariable(name: "bit_index", scope: !42, file: !1, line: 41, type: !49)
!58 = !DILocation(line: 41, scope: !42)
!59 = !DILocation(line: 43, scope: !42)

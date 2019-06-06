package com.snap.core.db;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.akax;
import defpackage.akbk;
import defpackage.akcs;
import defpackage.in;
import java.io.Closeable;

final class SqliteDbClient$queryFirst$$inlined$systrace$lambda$1 extends akcs implements akbk<R> {
    final /* synthetic */ ainw $mapper$inlined;
    final /* synthetic */ ainx $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$queryFirst$$inlined$systrace$lambda$1(SqliteDbClient sqliteDbClient, ainx ainx, ainw ainw) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainx;
        this.$mapper$inlined = ainw;
        super(0);
    }

    public final R invoke() {
        R r = "";
        Closeable query = this.this$0.query(this.$statement$inlined);
        R r2 = null;
        try {
            Cursor cursor = (Cursor) query;
            in.a(r);
            try {
                if (cursor.moveToFirst()) {
                    in.a(r);
                    r = this.$mapper$inlined.map(cursor);
                    in.a();
                    akax.a(query, r2);
                    return r;
                }
                in.a();
                akax.a(query, r2);
                return r;
            } catch (Throwable th) {
                r = th;
            } finally {
                in.a();
            }
        } finally {
            r = 
/*
Method generation error in method: com.snap.core.db.SqliteDbClient$queryFirst$$inlined$systrace$lambda$1.invoke():R, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r0_10 'r' R) = (r0_0 'r' R), (r2_4 'r2' R) in method: com.snap.core.db.SqliteDbClient$queryFirst$$inlined$systrace$lambda$1.invoke():R, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:228)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:205)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:102)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:52)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:300)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:321)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:221)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:10)
	at jadx.core.ProcessClass.process(ProcessClass.java:38)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:539)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:511)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:222)
	... 21 more

*/
}

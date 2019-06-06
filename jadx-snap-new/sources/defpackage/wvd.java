package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: wvd */
public final class wvd implements abov {
    private final long a = 10;
    private final String b = "db_snapshot.db";
    private File c;
    private final ftl d;
    private final Context e;

    public wvd(ftl ftl, Context context) {
        akcr.b(ftl, "configProvider");
        akcr.b(context, "context");
        this.d = ftl;
        this.e = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:72:0x0208 in {2, 17, 19, 24, 26, 29, 32, 38, 44, 45, 46, 54, 55, 56, 57, 60, 61, 63, 65, 67, 69, 71} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.io.File a(android.content.Context r11, java.io.File r12) {
        /*
        r10 = this;
        r0 = "context";
        defpackage.akcr.b(r11, r0);
        r11 = "outputFile";
        defpackage.akcr.b(r12, r11);
        r10.c = r12;
        r11 = r10.e;
        r12 = new com.snap.core.db.SnapDbSchema;
        r12.<init>();
        r12 = r12.getDatabaseName();
        r11 = r11.getDatabasePath(r12);
        r12 = r10.c;
        r0 = "file";
        if (r12 != 0) goto L_0x0024;
        defpackage.akcr.a(r0);
        if (r11 == 0) goto L_0x0200;
        if (r12 == 0) goto L_0x01f8;
        r1 = r11.exists();
        r2 = "Source '";
        if (r1 == 0) goto L_0x01e1;
        r1 = r11.isDirectory();
        if (r1 != 0) goto L_0x01ca;
        r1 = r11.getCanonicalPath();
        r3 = r12.getCanonicalPath();
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x01ab;
        r1 = r12.getParentFile();
        r2 = "Destination '";
        if (r1 == 0) goto L_0x0070;
        r3 = r1.mkdirs();
        if (r3 != 0) goto L_0x0070;
        r3 = r1.isDirectory();
        if (r3 == 0) goto L_0x0059;
        goto L_0x0070;
        r11 = new java.io.IOException;
        r12 = new java.lang.StringBuilder;
        r12.<init>(r2);
        r12.append(r1);
        r0 = "' directory cannot be created";
        r12.append(r0);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
        r1 = r12.exists();
        if (r1 == 0) goto L_0x0094;
        r1 = r12.canWrite();
        if (r1 == 0) goto L_0x007d;
        goto L_0x0094;
        r11 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r2);
        r0.append(r12);
        r12 = "' exists but is read-only";
        r0.append(r12);
        r12 = r0.toString();
        r11.<init>(r12);
        throw r11;
        defpackage.akkz.a(r11, r12);
        r11 = r10.c;
        if (r11 != 0) goto L_0x009e;
        defpackage.akcr.a(r0);
        r11 = r11.getCanonicalPath();
        r12 = 0;
        r1 = 0;
        r11 = android.database.sqlite.SQLiteDatabase.openDatabase(r11, r12, r1);
        r2 = defpackage.wve.a.values();
        r3 = new java.util.ArrayList;
        r4 = r2.length;
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r4 = r2.length;
        r5 = 0;
        if (r5 >= r4) goto L_0x00c6;
        r6 = r2[r5];
        r6 = r6.tableSpec;
        r6 = r6.getTableName();
        r3.add(r6);
        r5 = r5 + 1;
        goto L_0x00b6;
        r3 = (java.util.List) r3;
        r2 = new com.snap.core.db.SnapDbSchema;
        r2.<init>();
        r2 = r2.getTables();
        r2 = (java.lang.Iterable) r2;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r4 = (java.util.Collection) r4;
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x00fb;
        r5 = r2.next();
        r6 = r5;
        r6 = (com.snap.core.db.SnapDbSchema.Tables) r6;
        r6 = r6.getTableName();
        r6 = r3.contains(r6);
        r6 = r6 ^ 1;
        if (r6 == 0) goto L_0x00de;
        r4.add(r5);
        goto L_0x00de;
        r4 = (java.util.List) r4;
        r4 = (java.lang.Iterable) r4;
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r4, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r3 = r4.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0147;
        r4 = r3.next();
        r4 = (com.snap.core.db.SnapDbSchema.Tables) r4;
        r5 = r4.getTableType();
        r6 = com.snap.core.db.api.TableType.TABLE;
        if (r5 != r6) goto L_0x012c;
        r5 = new java.lang.StringBuilder;
        r6 = "DROP TABLE ";
        r5.<init>(r6);
        goto L_0x0133;
        r5 = new java.lang.StringBuilder;
        r6 = "DROP VIEW ";
        r5.<init>(r6);
        r4 = r4.getTableName();
        r5.append(r4);
        r4 = r5.toString();
        r11.execSQL(r4);
        r4 = defpackage.ajxw.a;
        r2.add(r4);
        goto L_0x0110;
        r2 = defpackage.wve.a.values();
        r3 = new java.util.ArrayList;
        r4 = r2.length;
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r4 = r2.length;
        if (r1 >= r4) goto L_0x01a0;
        r5 = r2[r1];
        r6 = r5.blackListedColumns;
        if (r6 == 0) goto L_0x0199;
        r6 = r6.iterator();
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0196;
        r7 = r6.next();
        r7 = (java.lang.String) r7;
        r8 = new java.lang.StringBuilder;
        r9 = "UPDATE ";
        r8.<init>(r9);
        r9 = r5.tableSpec;
        r9 = r9.getTableName();
        r8.append(r9);
        r9 = " SET ";
        r8.append(r9);
        r8.append(r7);
        r7 = " = ";
        r8.append(r7);
        r7 = "'XXXXXXXXXXXXXXX'";
        r8.append(r7);
        r7 = r8.toString();
        r11.execSQL(r7);
        goto L_0x0160;
        r5 = defpackage.ajxw.a;
        goto L_0x019a;
        r5 = r12;
        r3.add(r5);
        r1 = r1 + 1;
        goto L_0x0154;
        r11.close();
        r11 = r10.c;
        if (r11 != 0) goto L_0x01aa;
        defpackage.akcr.a(r0);
        return r11;
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r2);
        r1.append(r11);
        r11 = "' and destination '";
        r1.append(r11);
        r1.append(r12);
        r11 = "' are the same";
        r1.append(r11);
        r11 = r1.toString();
        r0.<init>(r11);
        throw r0;
        r12 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r2);
        r0.append(r11);
        r11 = "' exists but is a directory";
        r0.append(r11);
        r11 = r0.toString();
        r12.<init>(r11);
        throw r12;
        r12 = new java.io.FileNotFoundException;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r2);
        r0.append(r11);
        r11 = "' does not exist";
        r0.append(r11);
        r11 = r0.toString();
        r12.<init>(r11);
        throw r12;
        r11 = new java.lang.NullPointerException;
        r12 = "Destination must not be null";
        r11.<init>(r12);
        throw r11;
        r11 = new java.lang.NullPointerException;
        r12 = "Source must not be null";
        r11.<init>(r12);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvd.a(android.content.Context, java.io.File):java.io.File");
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d.a((fth) wrc.DB_DUMP_ENABLED);
    }

    public final long c() {
        return 10;
    }
}

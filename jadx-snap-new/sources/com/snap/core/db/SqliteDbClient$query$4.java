package com.snap.core.db;

import defpackage.ainw;
import defpackage.ainx;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SqliteDbClient$query$4 extends akcs implements akbk<Boolean> {
    final /* synthetic */ akbl $handler;
    final /* synthetic */ ainw $mapper;
    final /* synthetic */ ainx $statement;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$query$4(SqliteDbClient sqliteDbClient, ainx ainx, ainw ainw, akbl akbl) {
        this.this$0 = sqliteDbClient;
        this.$statement = ainx;
        this.$mapper = ainw;
        this.$handler = akbl;
        super(0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x0051 in {14, 17, 20, 24, 28, 34, 36} preds:[]
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
    public final boolean invoke() {
        /*
        r6 = this;
        r0 = "";
        r1 = r6.this$0;
        r2 = r6.$statement;
        r1 = r1.query(r2);
        r1 = (java.io.Closeable) r1;
        r2 = 0;
        r3 = r1;	 Catch:{ Throwable -> 0x004a }
        r3 = (android.database.Cursor) r3;	 Catch:{ Throwable -> 0x004a }
        defpackage.in.a(r0);	 Catch:{ Throwable -> 0x004a }
        r4 = r3.moveToNext();	 Catch:{ all -> 0x0043 }
        if (r4 == 0) goto L_0x003b;	 Catch:{ all -> 0x0043 }
        defpackage.in.a(r0);	 Catch:{ all -> 0x0043 }
        r4 = r6.$mapper;	 Catch:{ all -> 0x0036 }
        r4 = r4.map(r3);	 Catch:{ all -> 0x0036 }
        defpackage.in.a();	 Catch:{ all -> 0x0043 }
        defpackage.in.a(r0);	 Catch:{ all -> 0x0043 }
        r5 = r6.$handler;	 Catch:{ all -> 0x0031 }
        r5.invoke(r4);	 Catch:{ all -> 0x0031 }
        defpackage.in.a();	 Catch:{ all -> 0x0043 }
        goto L_0x0013;	 Catch:{ all -> 0x0043 }
        r0 = move-exception;	 Catch:{ all -> 0x0043 }
        defpackage.in.a();	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
        r0 = move-exception;	 Catch:{ all -> 0x0043 }
        defpackage.in.a();	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
        defpackage.in.a();	 Catch:{ Throwable -> 0x004a }
        defpackage.akax.a(r1, r2);
        r0 = 1;
        return r0;
        r0 = move-exception;
        defpackage.in.a();	 Catch:{ Throwable -> 0x004a }
        throw r0;	 Catch:{ Throwable -> 0x004a }
        r0 = move-exception;
        goto L_0x004d;
        r0 = move-exception;
        r2 = r0;
        throw r2;	 Catch:{ all -> 0x0048 }
        defpackage.akax.a(r1, r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SqliteDbClient$query$4.invoke():boolean");
    }
}

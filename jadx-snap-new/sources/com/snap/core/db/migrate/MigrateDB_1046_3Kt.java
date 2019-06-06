package com.snap.core.db.migrate;

public final class MigrateDB_1046_3Kt {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00a2 in {11, 13, 17, 22, 25, 28} preds:[]
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
    public static final void update_custom_story_snap_clientids_1046_3(defpackage.pa r11) {
        /*
        r0 = "db";
        defpackage.akcr.b(r11, r0);
        r0 = "\n            SELECT StorySnap._id, StorySnap.clientId, StorySnap.username\n            FROM StorySnap\n            JOIN Story ON StorySnap.storyRowId = Story._id\n            WHERE Story.kind = 1;\n        ";
        r11.a();
        r1 = 0;
        r0 = r11.a(r0, r1);	 Catch:{ all -> 0x009d }
        r0 = (java.io.Closeable) r0;	 Catch:{ all -> 0x009d }
        r2 = r0;	 Catch:{ Throwable -> 0x0097 }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0097 }
        r3 = r2.moveToNext();	 Catch:{ Throwable -> 0x0097 }
        if (r3 == 0) goto L_0x008b;	 Catch:{ Throwable -> 0x0097 }
        r3 = 0;	 Catch:{ Throwable -> 0x0097 }
        r4 = r2.getLong(r3);	 Catch:{ Throwable -> 0x0097 }
        r6 = 1;	 Catch:{ Throwable -> 0x0097 }
        r7 = r2.getString(r6);	 Catch:{ Throwable -> 0x0097 }
        r8 = 2;	 Catch:{ Throwable -> 0x0097 }
        r8 = r2.getString(r8);	 Catch:{ Throwable -> 0x0097 }
        r9 = "clientId";	 Catch:{ Throwable -> 0x0097 }
        defpackage.akcr.a(r7, r9);	 Catch:{ Throwable -> 0x0097 }
        r7 = (java.lang.CharSequence) r7;	 Catch:{ Throwable -> 0x0097 }
        r9 = new char[r6];	 Catch:{ Throwable -> 0x0097 }
        r10 = 126; // 0x7e float:1.77E-43 double:6.23E-322;	 Catch:{ Throwable -> 0x0097 }
        r9[r3] = r10;	 Catch:{ Throwable -> 0x0097 }
        r3 = defpackage.akgc.b(r7, r9);	 Catch:{ Throwable -> 0x0097 }
        r3 = defpackage.ajyu.a(r3, r6);	 Catch:{ Throwable -> 0x0097 }
        r3 = (java.lang.String) r3;	 Catch:{ Throwable -> 0x0097 }
        if (r3 == 0) goto L_0x0014;	 Catch:{ Throwable -> 0x0097 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0097 }
        r6.<init>();	 Catch:{ Throwable -> 0x0097 }
        r7 = "username";	 Catch:{ Throwable -> 0x0097 }
        defpackage.akcr.a(r8, r7);	 Catch:{ Throwable -> 0x0097 }
        if (r8 == 0) goto L_0x0083;	 Catch:{ Throwable -> 0x0097 }
        r7 = r8.toUpperCase();	 Catch:{ Throwable -> 0x0097 }
        r8 = "(this as java.lang.String).toUpperCase()";	 Catch:{ Throwable -> 0x0097 }
        defpackage.akcr.a(r7, r8);	 Catch:{ Throwable -> 0x0097 }
        r6.append(r7);	 Catch:{ Throwable -> 0x0097 }
        r6.append(r10);	 Catch:{ Throwable -> 0x0097 }
        r6.append(r3);	 Catch:{ Throwable -> 0x0097 }
        r3 = r6.toString();	 Catch:{ Throwable -> 0x0097 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0097 }
        r7 = "\n                        UPDATE StorySnap SET clientId='";	 Catch:{ Throwable -> 0x0097 }
        r6.<init>(r7);	 Catch:{ Throwable -> 0x0097 }
        r6.append(r3);	 Catch:{ Throwable -> 0x0097 }
        r3 = "' WHERE _id=";	 Catch:{ Throwable -> 0x0097 }
        r6.append(r3);	 Catch:{ Throwable -> 0x0097 }
        r6.append(r4);	 Catch:{ Throwable -> 0x0097 }
        r3 = ";\n                    ";	 Catch:{ Throwable -> 0x0097 }
        r6.append(r3);	 Catch:{ Throwable -> 0x0097 }
        r3 = r6.toString();	 Catch:{ Throwable -> 0x0097 }
        r11.c(r3);	 Catch:{ Throwable -> 0x0097 }
        goto L_0x0014;	 Catch:{ Throwable -> 0x0097 }
        r2 = new ajxt;	 Catch:{ Throwable -> 0x0097 }
        r3 = "null cannot be cast to non-null type java.lang.String";	 Catch:{ Throwable -> 0x0097 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0097 }
        throw r2;	 Catch:{ Throwable -> 0x0097 }
        defpackage.akax.a(r0, r1);	 Catch:{ all -> 0x009d }
        r11.d();	 Catch:{ all -> 0x009d }
        r11.c();
        return;
        r2 = move-exception;
        goto L_0x0099;
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0095 }
        defpackage.akax.a(r0, r1);	 Catch:{ all -> 0x009d }
        throw r2;	 Catch:{ all -> 0x009d }
        r0 = move-exception;
        r11.c();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.migrate.MigrateDB_1046_3Kt.update_custom_story_snap_clientids_1046_3(pa):void");
    }
}

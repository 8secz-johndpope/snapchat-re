package defpackage;

import java.util.Map;

/* renamed from: rbi */
public final class rbi {
    public final Map<String, String> a;

    public rbi(Map<String, String> map) {
        akcr.b(map, "map");
        this.a = map;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x003b in {7, 8, 11, 14} preds:[]
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
    public final synchronized defpackage.rbi a(java.util.List<? extends com.snap.core.db.record.FriendmojiRecord.FriendmojiDict> r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = "friendmojis";	 Catch:{ all -> 0x0038 }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0038 }
        r0 = r4.a;	 Catch:{ all -> 0x0038 }
        r0 = defpackage.ajzm.d(r0);	 Catch:{ all -> 0x0038 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0038 }
        r1 = r5.hasNext();	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ all -> 0x0038 }
        r1 = r5.next();	 Catch:{ all -> 0x0038 }
        r1 = (com.snap.core.db.record.FriendmojiRecord.FriendmojiDict) r1;	 Catch:{ all -> 0x0038 }
        r2 = r1.category();	 Catch:{ all -> 0x0038 }
        r3 = "friendMojiCategory.category()";	 Catch:{ all -> 0x0038 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0038 }
        r1 = r1.emoji();	 Catch:{ all -> 0x0038 }
        if (r1 != 0) goto L_0x002d;	 Catch:{ all -> 0x0038 }
        r1 = "";	 Catch:{ all -> 0x0038 }
        r0.put(r2, r1);	 Catch:{ all -> 0x0038 }
        goto L_0x0010;	 Catch:{ all -> 0x0038 }
        r5 = new rbi;	 Catch:{ all -> 0x0038 }
        r5.<init>(r0);	 Catch:{ all -> 0x0038 }
        monitor-exit(r4);
        return r5;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbi.a(java.util.List):rbi");
    }
}

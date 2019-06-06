package defpackage;

/* renamed from: djf */
public final class djf {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00f9 in {7, 8, 11, 14, 18, 26, 27, 30, 31} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static boolean a(defpackage.zym r8, boolean r9) {
        /*
        r0 = 0;
        com.google.common.base.Preconditions.checkNotNull(r8);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.c;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.d;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.b;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.a;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.e;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.g;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r1);	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.d;	 Catch:{ Exception -> 0x00f4 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x00f4 }
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x00f4 }
        r3 = 1;	 Catch:{ Exception -> 0x00f4 }
        if (r2 == 0) goto L_0x0085;	 Catch:{ Exception -> 0x00f4 }
        r2 = r1.next();	 Catch:{ Exception -> 0x00f4 }
        r2 = (defpackage.zyq) r2;	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.a;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.j;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.c;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.i;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.e;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.f;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.d;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.b;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.b;	 Catch:{ Exception -> 0x00f4 }
        r4 = r4.size();	 Catch:{ Exception -> 0x00f4 }
        r5 = defpackage.zyo.values();	 Catch:{ Exception -> 0x00f4 }
        r5 = r5.length;	 Catch:{ Exception -> 0x00f4 }
        if (r4 != r5) goto L_0x006b;	 Catch:{ Exception -> 0x00f4 }
        goto L_0x006c;	 Catch:{ Exception -> 0x00f4 }
        r3 = 0;	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkArgument(r3);	 Catch:{ Exception -> 0x00f4 }
        r3 = defpackage.zyo.values();	 Catch:{ Exception -> 0x00f4 }
        r4 = r3.length;	 Catch:{ Exception -> 0x00f4 }
        r5 = 0;	 Catch:{ Exception -> 0x00f4 }
        if (r5 >= r4) goto L_0x0028;	 Catch:{ Exception -> 0x00f4 }
        r6 = r3[r5];	 Catch:{ Exception -> 0x00f4 }
        r7 = r2.b;	 Catch:{ Exception -> 0x00f4 }
        r6 = r7.containsKey(r6);	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkArgument(r6);	 Catch:{ Exception -> 0x00f4 }
        r5 = r5 + 1;	 Catch:{ Exception -> 0x00f4 }
        goto L_0x0075;	 Catch:{ Exception -> 0x00f4 }
        r1 = defpackage.aavd.values();	 Catch:{ Exception -> 0x00f4 }
        r2 = r1.length;	 Catch:{ Exception -> 0x00f4 }
        r4 = 0;	 Catch:{ Exception -> 0x00f4 }
        if (r4 >= r2) goto L_0x009b;	 Catch:{ Exception -> 0x00f4 }
        r5 = r1[r4];	 Catch:{ Exception -> 0x00f4 }
        r6 = r8.e;	 Catch:{ Exception -> 0x00f4 }
        r5 = r6.containsKey(r5);	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkArgument(r5);	 Catch:{ Exception -> 0x00f4 }
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00f4 }
        goto L_0x008b;	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.d;	 Catch:{ Exception -> 0x00f4 }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00f4 }
        r2.<init>();	 Catch:{ Exception -> 0x00f4 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x00f4 }
        r4 = r1.hasNext();	 Catch:{ Exception -> 0x00f4 }
        if (r4 == 0) goto L_0x00b8;	 Catch:{ Exception -> 0x00f4 }
        r4 = r1.next();	 Catch:{ Exception -> 0x00f4 }
        r4 = (defpackage.zyq) r4;	 Catch:{ Exception -> 0x00f4 }
        r4 = r4.a;	 Catch:{ Exception -> 0x00f4 }
        r2.add(r4);	 Catch:{ Exception -> 0x00f4 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00f4 }
        r8 = r8.e;	 Catch:{ Exception -> 0x00f4 }
        r8 = r8.entrySet();	 Catch:{ Exception -> 0x00f4 }
        r8 = r8.iterator();	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.hasNext();	 Catch:{ Exception -> 0x00f4 }
        if (r1 == 0) goto L_0x00f3;	 Catch:{ Exception -> 0x00f4 }
        r1 = r8.next();	 Catch:{ Exception -> 0x00f4 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ Exception -> 0x00f4 }
        r4 = r1.getValue();	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkNotNull(r4);	 Catch:{ Exception -> 0x00f4 }
        r1 = r1.getValue();	 Catch:{ Exception -> 0x00f4 }
        r1 = (java.util.List) r1;	 Catch:{ Exception -> 0x00f4 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x00f4 }
        r4 = r1.hasNext();	 Catch:{ Exception -> 0x00f4 }
        if (r4 == 0) goto L_0x00c2;	 Catch:{ Exception -> 0x00f4 }
        r4 = r1.next();	 Catch:{ Exception -> 0x00f4 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x00f4 }
        r4 = r2.contains(r4);	 Catch:{ Exception -> 0x00f4 }
        com.google.common.base.Preconditions.checkArgument(r4);	 Catch:{ Exception -> 0x00f4 }
        goto L_0x00df;
        return r3;
        r8 = move-exception;
        if (r9 != 0) goto L_0x00f8;
        return r0;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djf.a(zym, boolean):boolean");
    }
}

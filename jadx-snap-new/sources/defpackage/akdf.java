package defpackage;

import java.util.ArrayList;

/* renamed from: akdf */
public final class akdf {
    public final ArrayList<Object> a;

    public akdf(int i) {
        this.a = new ArrayList(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x003e in {1, 8, 9, 11} preds:[]
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
    public final void a(java.lang.Object r5) {
        /*
        r4 = this;
        if (r5 != 0) goto L_0x0003;
        return;
        r0 = r5 instanceof java.lang.Object[];
        if (r0 == 0) goto L_0x0026;
        r5 = (java.lang.Object[]) r5;
        r0 = r5.length;
        if (r0 <= 0) goto L_0x0025;
        r0 = r4.a;
        r1 = r0.size();
        r2 = r5.length;
        r1 = r1 + r2;
        r0.ensureCapacity(r1);
        r0 = r5.length;
        r1 = 0;
        if (r1 >= r0) goto L_0x0025;
        r2 = r5[r1];
        r3 = r4.a;
        r3.add(r2);
        r1 = r1 + 1;
        goto L_0x0019;
        return;
        r0 = new java.lang.UnsupportedOperationException;
        r1 = new java.lang.StringBuilder;
        r2 = "Don't know how to spread ";
        r1.<init>(r2);
        r5 = r5.getClass();
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdf.a(java.lang.Object):void");
    }

    public final Object[] a(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    public final void b(Object obj) {
        this.a.add(obj);
    }
}

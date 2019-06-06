package defpackage;

/* renamed from: akli */
public final class akli {
    static {
        akli.a(akli.a(aklh.a, akli.a("CVS")));
        akli.a(akli.a(aklh.a, akli.a(".svn")));
    }

    public static aklj a(aklj aklj) {
        return new akll(aklj);
    }

    private static aklj a(String str) {
        return new aklk(str);
    }

    public static aklj a(aklj... akljArr) {
        return new aklg(akli.b(akljArr));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x003a in {6, 8, 9, 11} preds:[]
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
    public static java.util.List<defpackage.aklj> b(defpackage.aklj... r3) {
        /*
        if (r3 == 0) goto L_0x0032;
        r0 = new java.util.ArrayList;
        r1 = r3.length;
        r0.<init>(r1);
        r1 = 0;
        r2 = r3.length;
        if (r1 >= r2) goto L_0x0031;
        r2 = r3[r1];
        if (r2 == 0) goto L_0x0018;
        r2 = r3[r1];
        r0.add(r2);
        r1 = r1 + 1;
        goto L_0x0009;
        r3 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r2 = "The filter[";
        r0.<init>(r2);
        r0.append(r1);
        r1 = "] is null";
        r0.append(r1);
        r0 = r0.toString();
        r3.<init>(r0);
        throw r3;
        return r0;
        r3 = new java.lang.IllegalArgumentException;
        r0 = "The filters must not be null";
        r3.<init>(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akli.b(aklj[]):java.util.List");
    }
}

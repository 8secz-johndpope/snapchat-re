package defpackage;

/* renamed from: aksf */
public abstract class aksf implements akrx, Comparable<akrx> {
    protected aksf() {
    }

    private int c(akra akra) {
        int a = a();
        for (int i = 0; i < a; i++) {
            if (c(i) == akra) {
                return i;
            }
        }
        return -1;
    }

    public int a(akra akra) {
        int c = c(akra);
        if (c != -1) {
            return a(c);
        }
        StringBuilder stringBuilder = new StringBuilder("Field '");
        stringBuilder.append(akra);
        stringBuilder.append("' is not supported");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0053 in {2, 9, 11, 17, 21, 22, 23, 25} preds:[]
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
    /* renamed from: a */
    public int compareTo(defpackage.akrx r7) {
        /*
        r6 = this;
        r0 = 0;
        if (r6 != r7) goto L_0x0004;
        return r0;
        r1 = r6.a();
        r2 = r7.a();
        r3 = "ReadablePartial objects must have matching field types";
        if (r1 != r2) goto L_0x004d;
        r1 = r6.a();
        r2 = 0;
        if (r2 >= r1) goto L_0x002a;
        r4 = r6.c(r2);
        r5 = r7.c(r2);
        if (r4 != r5) goto L_0x0024;
        r2 = r2 + 1;
        goto L_0x0015;
        r7 = new java.lang.ClassCastException;
        r7.<init>(r3);
        throw r7;
        r1 = r6.a();
        r2 = 0;
        if (r2 >= r1) goto L_0x004c;
        r3 = r6.a(r2);
        r4 = r7.a(r2);
        if (r3 <= r4) goto L_0x003d;
        r7 = 1;
        return r7;
        r3 = r6.a(r2);
        r4 = r7.a(r2);
        if (r3 >= r4) goto L_0x0049;
        r7 = -1;
        return r7;
        r2 = r2 + 1;
        goto L_0x002f;
        return r0;
        r7 = new java.lang.ClassCastException;
        r7.<init>(r3);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aksf.compareTo(akrx):int");
    }

    public abstract akqz a(int i, akqx akqx);

    public final String a(akty akty) {
        return akty == null ? toString() : akty.a((akrx) this);
    }

    public boolean b(akra akra) {
        return c(akra) != -1;
    }

    public final akra c(int i) {
        return a(i, b()).a();
    }

    public final akqz d(int i) {
        return a(i, b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akrx)) {
            return false;
        }
        akrx akrx = (akrx) obj;
        if (a() != akrx.a()) {
            return false;
        }
        int a = a();
        int i = 0;
        while (i < a) {
            if (a(i) != akrx.a(i) || c(i) != akrx.c(i)) {
                return false;
            }
            i++;
        }
        return aktl.a(b(), akrx.b());
    }

    public int hashCode() {
        int i = 157;
        for (int i2 = 0; i2 < a(); i2++) {
            i = (((i * 23) + a(i2)) * 23) + c(i2).hashCode();
        }
        return i + b().hashCode();
    }
}

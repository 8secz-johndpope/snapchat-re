package defpackage;

/* renamed from: dap */
public class dap extends das<dap> {
    public final jh<Class<? extends das>, das> a = new jh();
    final jh<Class<? extends das>, Boolean> b = new jh();

    private dap a(dap dap) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.a.b(i);
            das a = dap.a(cls);
            if (a != null) {
                a(cls).a(a);
                a(cls, dap.b(cls));
            } else {
                a(cls, false);
            }
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final <T extends das<T>> T a(Class<T> cls) {
        return (das) cls.cast(this.a.get(cls));
    }

    public final void a(Class cls, boolean z) {
        this.b.put(cls, z ? Boolean.TRUE : Boolean.FALSE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x004f in {3, 10, 11, 15, 16, 17, 19} preds:[]
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
    public final /* synthetic */ defpackage.das b(defpackage.das r9, defpackage.das r10) {
        /*
        r8 = this;
        r9 = (defpackage.dap) r9;
        r10 = (defpackage.dap) r10;
        if (r10 == 0) goto L_0x0047;
        if (r9 != 0) goto L_0x000c;
        r10.a(r8);
        goto L_0x0046;
        r0 = r8.a;
        r0 = r0.size();
        r1 = 0;
        r2 = 0;
        if (r2 >= r0) goto L_0x0046;
        r3 = r8.a;
        r3 = r3.b(r2);
        r3 = (java.lang.Class) r3;
        r4 = r8.b(r3);
        if (r4 == 0) goto L_0x002c;
        r4 = r9.b(r3);
        if (r4 == 0) goto L_0x002c;
        r4 = 1;
        goto L_0x002d;
        r4 = 0;
        if (r4 == 0) goto L_0x0040;
        r5 = r10.a(r3);
        if (r5 == 0) goto L_0x0040;
        r6 = r8.a(r3);
        r7 = r9.a(r3);
        r6.b(r7, r5);
        r10.a(r3, r4);
        r2 = r2 + 1;
        goto L_0x0014;
        return r10;
        r9 = new java.lang.IllegalArgumentException;
        r10 = "CompositeMetrics doesn't support nullable results";
        r9.<init>(r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dap.b(das, das):das");
    }

    public final boolean b(Class cls) {
        Boolean bool = (Boolean) this.b.get(cls);
        return bool != null && bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dap dap = (dap) obj;
            return dau.a(this.b, dap.b) && dau.a(this.a, dap.a);
        }
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Composite Metrics{\n");
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(this.a.c(i));
            stringBuilder.append(b((Class) this.a.b(i)) ? " [valid]" : " [invalid]");
            stringBuilder.append(10);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

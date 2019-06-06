package defpackage;

/* renamed from: jf */
public final class jf {

    /* renamed from: jf$a */
    public interface a<T> {
        T a();

        boolean a(T t);
    }

    /* renamed from: jf$b */
    public static class b<T> implements a<T> {
        private final Object[] a;
        private int b;

        public b(int i) {
            if (i > 0) {
                this.a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public T a() {
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x002b in {5, 6, 7, 12, 13, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public boolean a(T r6) {
            /*
            r5 = this;
            r0 = 0;
            r1 = 0;
            r2 = r5.b;
            r3 = 1;
            if (r1 >= r2) goto L_0x0012;
            r2 = r5.a;
            r2 = r2[r1];
            if (r2 != r6) goto L_0x000f;
            r1 = 1;
            goto L_0x0013;
            r1 = r1 + 1;
            goto L_0x0002;
            r1 = 0;
            if (r1 != 0) goto L_0x0023;
            r1 = r5.b;
            r2 = r5.a;
            r4 = r2.length;
            if (r1 >= r4) goto L_0x0022;
            r2[r1] = r6;
            r1 = r1 + r3;
            r5.b = r1;
            return r3;
            return r0;
            r6 = new java.lang.IllegalStateException;
            r0 = "Already in the pool!";
            r6.<init>(r0);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jf$b.a(java.lang.Object):boolean");
        }
    }

    /* renamed from: jf$c */
    public static class c<T> extends b<T> {
        private final Object a = new Object();

        public c(int i) {
            super(i);
        }

        public final T a() {
            Object a;
            synchronized (this.a) {
                a = super.a();
            }
            return a;
        }

        public final boolean a(T t) {
            boolean a;
            synchronized (this.a) {
                a = super.a(t);
            }
            return a;
        }
    }
}

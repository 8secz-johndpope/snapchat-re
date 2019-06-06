package defpackage;

/* renamed from: mic */
public final class mic {

    /* renamed from: mic$b */
    static final class b<Upstream, Downstream> implements ajdu<T, T> {
        private /* synthetic */ ajdu[] a;

        b(ajdu[] ajduArr) {
            this.a = ajduArr;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x001e in {7, 10, 11, 13} preds:[]
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
        private defpackage.ajdp<T> a(defpackage.ajdp<T> r5) {
            /*
            r4 = this;
            r0 = "upstream";
            defpackage.akcr.b(r5, r0);
            r0 = r4.a;	 Catch:{ all -> 0x001c }
            r1 = r0.length;	 Catch:{ all -> 0x001c }
            r2 = 0;	 Catch:{ all -> 0x001c }
            if (r2 >= r1) goto L_0x001b;	 Catch:{ all -> 0x001c }
            r3 = r0[r2];	 Catch:{ all -> 0x001c }
            r5 = r5.a(r3);	 Catch:{ all -> 0x0019 }
            r3 = "combinedUpstream.compose(observableTransformer)";	 Catch:{ all -> 0x0019 }
            defpackage.akcr.a(r5, r3);	 Catch:{ all -> 0x0019 }
            r2 = r2 + 1;
            goto L_0x0009;
            r5 = move-exception;
            throw r5;	 Catch:{ all -> 0x001c }
            return r5;
            r5 = move-exception;
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mic$b.a(ajdp):ajdp");
        }

        public final /* synthetic */ ajdt apply(ajdp ajdp) {
            return a(ajdp);
        }
    }

    /* renamed from: mic$c */
    static final class c<Upstream, Downstream> implements ajdu<T, T> {
        private /* synthetic */ ajdp a;

        /* renamed from: mic$c$1 */
        static final class 1<T1, T2, R> implements ajex<T, V, T> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                mis mis = (mis) obj;
                akcr.b(mis, "valueConsumer");
                return (mis) mis.invoke(obj2);
            }
        }

        c(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ ajdt apply(ajdp ajdp) {
            akcr.b(ajdp, "upstream");
            return ajdp.a((ajdt) ajdp, (ajdt) this.a, (ajex) 1.a);
        }
    }

    /* renamed from: mic$a */
    public static final class a implements ajdu<Object, Object> {
        public static final a a = new a();

        private a() {
        }

        public final /* synthetic */ ajdt apply(ajdp ajdp) {
            akcr.b(ajdp, "upstream");
            return ajdp;
        }
    }

    static {
        mic mic = new mic();
    }

    private mic() {
    }

    public static final <V, T extends mis<V, T>> ajdu<T, T> a(ajdp<V> ajdp) {
        akcr.b(ajdp, "value");
        return new c(ajdp);
    }

    public static final <T> ajdu<T, T> a(ajdu<T, T>... ajduArr) {
        akcr.b(ajduArr, "observableTransformers");
        int i = (ajduArr.length == 0 ? 1 : 0) ^ 1;
        if (!ajxy.a || i != 0) {
            return new b(ajduArr);
        }
        throw new AssertionError("observableTransformers cannot be empty");
    }
}

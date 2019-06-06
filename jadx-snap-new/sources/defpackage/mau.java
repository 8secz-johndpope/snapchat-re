package defpackage;

import defpackage.mbg.a;
import defpackage.mbg.b;

/* renamed from: mau */
public final class mau implements mbg {
    final ajws<a> a;
    private final ajxe b = ajxh.a(new b(this));

    /* renamed from: mau$a */
    static final class a extends akcq implements akbl<defpackage.mbg.a, ajxw> {
        a(ajws ajws) {
            super(1, ajws);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajws.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.mbg.a aVar = (defpackage.mbg.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mau$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mbg.b>> {
        private /* synthetic */ mau a;

        /* renamed from: mau$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0046 in {2, 4, 7, 10, 12} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
                /*
                r2 = this;
                r3 = (defpackage.mbg.a) r3;
                r0 = "it";
                defpackage.akcr.b(r3, r0);
                r0 = r3 instanceof defpackage.mbg.a.c;
                if (r0 == 0) goto L_0x0026;
                r3 = 2;
                r3 = new defpackage.mbg.b[r3];
                r0 = 0;
                r1 = defpackage.mbg.b.b.a;
                r1 = (defpackage.mbg.b) r1;
                r3[r0] = r1;
                r0 = 1;
                r1 = defpackage.mbg.b.a.a;
                r1 = (defpackage.mbg.b) r1;
                r3[r0] = r1;
                r3 = defpackage.ajdp.a(r3);
                r0 = "Observable.fromArray(\n  …tonUseCase.Result.Hidden)";
                defpackage.akcr.a(r3, r0);
                return r3;
                r0 = r3 instanceof defpackage.mbg.a.a;
                if (r0 == 0) goto L_0x0033;
                r3 = defpackage.mbg.b.c.a;
                r3 = defpackage.ajdp.b(r3);
                r0 = "Observable.just(LensButtonUseCase.Result.Visible)";
                goto L_0x0022;
                r3 = r3 instanceof defpackage.mbg.a.b;
                if (r3 == 0) goto L_0x0040;
                r3 = defpackage.mbg.b.a.a;
                r3 = defpackage.ajdp.b(r3);
                r0 = "Observable.just(LensButtonUseCase.Result.Hidden)";
                goto L_0x0022;
                r3 = new ajxk;
                r3.<init>();
                throw r3;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mau$b$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        b(mau mau) {
            this.a = mau;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.u(1.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mau.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mau() {
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Le….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mav(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.b.b();
    }
}

package defpackage;

import defpackage.mbv.a;
import defpackage.mbv.b.b;

/* renamed from: mbl */
public final class mbl implements mbv {
    final ajws<a> a;
    final mbu b;
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: mbl$a */
    static final class a extends akcq implements akbl<defpackage.mbv.a, ajxw> {
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
            defpackage.mbv.a aVar = (defpackage.mbv.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mbl$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mbv.b>> {
        final /* synthetic */ mbl a;

        /* renamed from: mbl$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0048 in {2, 4, 7, 9} preds:[]
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
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
                /*
                r1 = this;
                r2 = (defpackage.mbv.a) r2;
                r0 = "it";
                defpackage.akcr.b(r2, r0);
                r0 = defpackage.mbv.a.b.a;
                r0 = defpackage.akcr.a(r2, r0);
                if (r0 == 0) goto L_0x0031;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.b;
                r2 = r2.a();
                r0 = defpackage.mbl.c.a;
                r0 = (defpackage.ajfc) r0;
                r2 = r2.f(r0);
                r2 = r2.i();
                r0 = defpackage.ajfu.a;
                r2 = r2.j(r0);
                r0 = "settings.shouldShowLensB…  .distinctUntilChanged()";
                defpackage.akcr.a(r2, r0);
                return r2;
                r0 = defpackage.mbv.a.a.a;
                r2 = defpackage.akcr.a(r2, r0);
                if (r2 == 0) goto L_0x0042;
                r2 = defpackage.mbv.b.a.a;
                r2 = defpackage.ajdp.b(r2);
                r0 = "Observable.just(Result.Hidden)";
                goto L_0x002d;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mbl$b$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        b(mbl mbl) {
            this.a = mbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.u(new 1(this))).a();
        }
    }

    /* renamed from: mbl$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldShow");
            return bool.booleanValue() ? b.a : mbv.b.a.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mbl.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mbl(mbu mbu) {
        akcr.b(mbu, "settings");
        this.b = mbu;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mbm(new a(this.a));
    }

    public final ajdp<mbv.b> b() {
        return (ajdp) this.c.b();
    }
}

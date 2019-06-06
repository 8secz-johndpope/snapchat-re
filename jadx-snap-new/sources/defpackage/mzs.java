package defpackage;

import android.view.MotionEvent;
import android.view.View;
import defpackage.mmi.c;
import defpackage.naa.a;
import defpackage.naa.b;

/* renamed from: mzs */
public final class mzs implements naa {
    final ajws<a> a;
    final ajdp<mmt> b;
    private final ajxe c = ajxh.a(new c(this));

    /* renamed from: mzs$a */
    static final class a extends akcq implements akbl<defpackage.naa.a, ajxw> {
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
            defpackage.naa.a aVar = (defpackage.naa.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mzs$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mzs a;

        /* renamed from: mzs$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x003a in {2, 4, 7, 9} preds:[]
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
                r2 = (defpackage.naa.a) r2;
                r0 = "action";
                defpackage.akcr.b(r2, r0);
                r0 = defpackage.naa.a.a.a;
                r0 = defpackage.akcr.a(r2, r0);
                if (r0 == 0) goto L_0x0023;
                r2 = r1.a;
                r2 = r2.a;
                r2 = r2.b;
                r0 = defpackage.mzs.b.a;
                r0 = (defpackage.ajfc) r0;
                r2 = r2.u(r0);
                r0 = "lensCore\n               …      }\n                }";
                defpackage.akcr.a(r2, r0);
                return r2;
                r0 = defpackage.naa.a.b.a;
                r2 = defpackage.akcr.a(r2, r0);
                if (r2 == 0) goto L_0x0034;
                r2 = defpackage.naa.b.b.a;
                r2 = defpackage.ajdp.b(r2);
                r0 = "just(TouchUseCase.Result.Deactivated)";
                goto L_0x001f;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mzs$c$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        c(mzs mzs) {
            this.a = mzs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.f().u(new 1(this))).a();
        }
    }

    /* renamed from: mzs$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return mmt.a().b().p(new ajfc<T, R>() {

                /* renamed from: mzs$b$1$a */
                static final class a extends akcs implements akbw<View, MotionEvent, Boolean> {
                    private /* synthetic */ mpa a;
                    private /* synthetic */ c b;

                    a(mpa mpa, c cVar) {
                        this.a = mpa;
                        this.b = cVar;
                        super(2);
                    }

                    /* JADX WARNING: Missing block: B:13:0x0039, code skipped:
            if (r2 == false) goto L_0x003c;
     */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                        /*
                        r1 = this;
                        r2 = (android.view.View) r2;
                        r3 = (android.view.MotionEvent) r3;
                        r0 = "view";
                        defpackage.akcr.b(r2, r0);
                        r0 = "event";
                        defpackage.akcr.b(r3, r0);
                        r0 = r1.a;
                        r2 = r0.a(r2, r3);
                        r3 = 0;
                        if (r2 != 0) goto L_0x003b;
                    L_0x0017:
                        r2 = r1.b;
                        r2 = (defpackage.mmi.c.a) r2;
                        r0 = r2 instanceof defpackage.mmi.c.a.d;
                        if (r0 == 0) goto L_0x0026;
                    L_0x001f:
                        r2 = (defpackage.mmi.c.a.d) r2;
                        r2 = r2.b;
                    L_0x0023:
                        r2 = r2.e;
                        goto L_0x0039;
                    L_0x0026:
                        r0 = r2 instanceof defpackage.mmi.c.a.b;
                        if (r0 == 0) goto L_0x002f;
                    L_0x002a:
                        r2 = (defpackage.mmi.c.a.b) r2;
                        r2 = r2.b;
                        goto L_0x0023;
                    L_0x002f:
                        r0 = r2 instanceof defpackage.mmi.c.a.c;
                        if (r0 == 0) goto L_0x0038;
                    L_0x0033:
                        r2 = (defpackage.mmi.c.a.c) r2;
                        r2 = r2.b;
                        goto L_0x0023;
                    L_0x0038:
                        r2 = 0;
                    L_0x0039:
                        if (r2 == 0) goto L_0x003c;
                    L_0x003b:
                        r3 = 1;
                    L_0x003c:
                        r2 = java.lang.Boolean.valueOf(r3);
                        return r2;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzs$b$1$a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
                    /*
                    r2 = this;
                    r3 = (defpackage.mmi.c) r3;
                    r0 = "it";
                    defpackage.akcr.b(r3, r0);
                    r0 = r3 instanceof defpackage.mmi.c.a;
                    if (r0 == 0) goto L_0x0043;
                L_0x000b:
                    r0 = r3;
                    r0 = (defpackage.mmi.c.a) r0;
                    r1 = r0 instanceof defpackage.mmi.c.a.d;
                    if (r1 == 0) goto L_0x0019;
                L_0x0012:
                    r0 = (defpackage.mmi.c.a.d) r0;
                    r0 = r0.b;
                L_0x0016:
                    r0 = r0.b;
                    goto L_0x002c;
                L_0x0019:
                    r1 = r0 instanceof defpackage.mmi.c.a.b;
                    if (r1 == 0) goto L_0x0022;
                L_0x001d:
                    r0 = (defpackage.mmi.c.a.b) r0;
                    r0 = r0.b;
                    goto L_0x0016;
                L_0x0022:
                    r1 = r0 instanceof defpackage.mmi.c.a.c;
                    if (r1 == 0) goto L_0x002b;
                L_0x0026:
                    r0 = (defpackage.mmi.c.a.c) r0;
                    r0 = r0.b;
                    goto L_0x0016;
                L_0x002b:
                    r0 = 0;
                L_0x002c:
                    if (r0 == 0) goto L_0x0043;
                L_0x002e:
                    r0 = r3;
                    r0 = r0.s();
                    r1 = new mzs$b$1$a;
                    r1.<init>(r0, r3);
                    r1 = (defpackage.akbw) r1;
                    r3 = new naa$b$a$b;
                    r3.<init>(r1);
                L_0x0040:
                    r3 = (defpackage.naa.b.a) r3;
                    return r3;
                L_0x0043:
                    r3 = defpackage.naa.b.a.a.a;
                    goto L_0x0040;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mzs$b$1.apply(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mzs.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mzs(ajdp<mmt> ajdp) {
        akcr.b(ajdp, "lensCore");
        this.b = ajdp;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<To….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mzt(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.c.b();
    }
}

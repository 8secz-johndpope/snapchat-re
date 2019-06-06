package defpackage;

import defpackage.lwo.d;
import defpackage.mha.a;
import defpackage.mjn.c.h;
import defpackage.mjn.d.c;

/* renamed from: lwt */
public final class lwt implements lwr {
    final ajdp<mmt> a;
    private final ajxe b = ajxh.a(new a(this));
    private final ajxe c = ajxh.a(new b(this));
    private final ajfb<lwo> d;

    /* renamed from: lwt$a */
    static final class a extends akcs implements akbk<ajdp<lwo>> {
        private /* synthetic */ lwt a;

        /* renamed from: lwt$a$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.f().b();
            }
        }

        /* renamed from: lwt$a$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0024 in {2, 4, 7, 10, 12} preds:[]
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
                r2 = (defpackage.mjm.a) r2;
                r0 = "it";
                defpackage.akcr.b(r2, r0);
                r0 = r2 instanceof defpackage.mjm.a.a;
                if (r0 == 0) goto L_0x0010;
                r2 = defpackage.lwo.b.a;
                r2 = (defpackage.lwo) r2;
                return r2;
                r0 = r2 instanceof defpackage.mjm.a.b.b;
                if (r0 == 0) goto L_0x0017;
                r2 = defpackage.lwo.c.b.a;
                goto L_0x000d;
                r2 = r2 instanceof defpackage.mjm.a.b.a;
                if (r2 == 0) goto L_0x001e;
                r2 = defpackage.lwo.c.a.a;
                goto L_0x000d;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lwt$a$2.apply(java.lang.Object):java.lang.Object");
            }
        }

        a(lwt lwt) {
            this.a = lwt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.u(1.a).p(2.a);
        }
    }

    /* renamed from: lwt$b */
    static final class b extends akcs implements akbk<ajdp<d>> {
        private /* synthetic */ lwt a;

        /* renamed from: lwt$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 1 a = new 1();

            /* renamed from: lwt$b$1$a */
            public static final class a<T> implements ajfl<mjn.d> {
                public static final a a = new a();

                public final /* synthetic */ boolean test(Object obj) {
                    mjn.d dVar = (mjn.d) obj;
                    akcr.b(dVar, "it");
                    return akcr.a(dVar.b(), h.a);
                }
            }

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.g().a().a((ajfl) a.a);
                akcr.a(obj, "requests.filter { it.int…trol.ToggleCameraButton }");
                return obj;
            }
        }

        /* renamed from: lwt$b$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mjn.d dVar = (mjn.d) obj;
                akcr.b(dVar, "it");
                return dVar instanceof c ? ajdp.b(d.a) : ajvo.a(ajot.a);
            }
        }

        b(lwt lwt) {
            this.a = lwt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.u(1.a).u(2.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lwt.class), "captureRequests", "getCaptureRequests()Lio/reactivex/Observable;"), new akdc(akde.a(lwt.class), "toggleRequests", "getToggleRequests()Lio/reactivex/Observable;")};
    }

    public lwt(ajdp<mmt> ajdp, ajfb<lwo> ajfb) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajfb, "captureConsumer");
        this.a = ajdp;
        this.d = ajfb;
    }

    public final ajej a() {
        return ajdp.b((ajdt) (ajdp) this.b.b(), (ajdt) (ajdp) this.c.b()).f(this.d);
    }

    public final ajdp<Object> b() {
        return a.a(this);
    }
}

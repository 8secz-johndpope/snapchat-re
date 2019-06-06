package defpackage;

import defpackage.kqe.ac;
import defpackage.meo.a;
import defpackage.meo.b;

/* renamed from: meh */
public final class meh implements meo {
    final ajws<a> a;
    final kqf b;
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: meh$a */
    static final class a extends akcq implements akbl<defpackage.meo.a, ajxw> {
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
            defpackage.meo.a aVar = (defpackage.meo.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: meh$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.meo.b>> {
        final /* synthetic */ meh a;

        /* renamed from: meh$b$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0030 in {2, 4, 7, 10, 12} preds:[]
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
                r2 = (defpackage.meo.a) r2;
                r0 = "action";
                defpackage.akcr.b(r2, r0);
                r0 = defpackage.meo.a.c.a;
                r0 = defpackage.akcr.a(r2, r0);
                if (r0 == 0) goto L_0x0014;
                r2 = defpackage.meo.b.c.a;
                r2 = (defpackage.meo.b) r2;
                return r2;
                r0 = defpackage.meo.a.b.a;
                r0 = defpackage.akcr.a(r2, r0);
                if (r0 == 0) goto L_0x001f;
                r2 = defpackage.meo.b.b.a;
                goto L_0x0011;
                r0 = defpackage.meo.a.a.a;
                r2 = defpackage.akcr.a(r2, r0);
                if (r2 == 0) goto L_0x002a;
                r2 = defpackage.meo.b.a.a;
                goto L_0x0011;
                r2 = new ajxk;
                r2.<init>();
                throw r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.meh$b$1.apply(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: meh$b$2 */
        static final class 2<T> implements ajfb<defpackage.meo.b> {
            private /* synthetic */ b a;

            2(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((defpackage.meo.b) obj) instanceof defpackage.meo.b.a) {
                    this.a.a.b.a(ac.b);
                }
            }
        }

        b(meh meh) {
            this.a = meh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object d = this.a.a.p(1.a).d((ajfb) new 2(this));
            akcr.a(d, "actionsRelay\n           …      }\n                }");
            return ajpy.k(d).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(meh.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public meh(kqf kqf) {
        akcr.b(kqf, "analyticsEventHandler");
        this.b = kqf;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Fu….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return new mei(new a(this.a));
    }

    public final ajdp<b> b() {
        return (ajdp) this.c.b();
    }
}

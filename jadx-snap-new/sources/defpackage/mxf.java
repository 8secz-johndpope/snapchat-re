package defpackage;

import defpackage.mha.a;
import defpackage.mxl.b;
import java.util.concurrent.TimeUnit;

/* renamed from: mxf */
public final class mxf implements mxk {
    private final ajdp<mmt> a;
    private final mxl b;
    private final zfw c;
    private final long d;
    private final TimeUnit e;

    /* renamed from: mxf$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.l().b();
        }
    }

    /* renamed from: mxf$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x002d in {2, 4, 7, 9} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.mnq.a) r3;
            r0 = "request";
            defpackage.akcr.b(r3, r0);
            r0 = r3 instanceof defpackage.mnq.a.a;
            if (r0 == 0) goto L_0x0017;
            r0 = new mxl$a$b;
            r3 = (defpackage.mnq.a.a) r3;
            r3 = r3.a;
            r0.<init>(r3);
            r0 = (defpackage.mxl.a) r0;
            return r0;
            r0 = r3 instanceof defpackage.mnq.a.b;
            if (r0 == 0) goto L_0x0027;
            r0 = new mxl$a$c;
            r3 = (defpackage.mnq.a.b) r3;
            r1 = r3.a;
            r3 = r3.b;
            r0.<init>(r1, r3);
            goto L_0x0014;
            r3 = new ajxk;
            r3.<init>();
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mxf$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: mxf$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.l();
        }
    }

    /* renamed from: mxf$d */
    static final class d<T> implements ajfb<ajxm<? extends mnq, ? extends b>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            mnq mnq = (mnq) ajxm.a;
            b bVar = (b) ajxm.b;
            if (bVar instanceof b.b) {
                b.b bVar2 = (b.b) bVar;
                mnq.a().accept(new mnq.b(bVar2.a, bVar2.b));
            }
        }
    }

    public /* synthetic */ mxf(ajdp ajdp, mxl mxl, zfw zfw) {
        this(ajdp, mxl, zfw, TimeUnit.SECONDS);
    }

    private mxf(ajdp<mmt> ajdp, mxl mxl, zfw zfw, TimeUnit timeUnit) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mxl, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "disposalDelayTimeUnit");
        this.a = ajdp;
        this.b = mxl;
        this.c = zfw;
        this.d = 10;
        this.e = timeUnit;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        Object p = this.a.u(a.a).p(b.a);
        akcr.a(p, "lensCore\n               …     }\n\n                }");
        p = p.f(this.b.a());
        akcr.a(p, "lensCore\n               …subscribe(useCase.inputs)");
        ajvv.a(ajei, mho.a(p, 10, this.e, this.c.f()));
        p = this.a.p(c.a);
        akcr.a(p, "lensCore.map { it.persistenceProcessor }");
        p = myu.a(p, this.b.b()).f((ajfb) d.a);
        akcr.a(p, "pairLatest(lensCore.map …      }\n                }");
        ajvv.a(ajei, mho.a(p, 10, this.e, this.c.f()));
        return ajei;
    }

    public final ajdp<Object> b() {
        return a.a(this);
    }
}

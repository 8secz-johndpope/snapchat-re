package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.common.base.Supplier;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.lenses.app.data.LensesAssetsUploadingHttpInterface;
import com.snap.lenses.app.snappable.SnappableMetadataHttpInterface;
import defpackage.kyc.c;
import defpackage.ljx.d;
import defpackage.lno.a;
import defpackage.mhs.b;
import java.io.File;
import java.util.Set;

/* renamed from: ksw */
public final class ksw {
    static /* synthetic */ aken[] a = new aken[]{new akda(akde.a(ksw.class), "lensesDataComponent", "<v#0>"), new akda(akde.a(ksw.class), "snappableMetadataHttpInterface", "<v#1>")};

    /* renamed from: ksw$p */
    public static final class p implements d {
        final /* synthetic */ ajwy a;
        private final Context b;
        private final Supplier<nbl> c = new a(this);
        private final zgb d;
        private final mxa e;
        private final miw f;
        private /* synthetic */ Context g;
        private /* synthetic */ zgb h;
        private /* synthetic */ ajwy i;
        private /* synthetic */ lbp j;

        /* renamed from: ksw$p$a */
        static final class a<T> implements Supplier<nbl> {
            private /* synthetic */ p a;

            a(p pVar) {
                this.a = pVar;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return (nbl) this.a.a.get();
            }
        }

        p(Context context, ajwy ajwy, zgb zgb, ajwy ajwy2, lbp lbp) {
            this.g = context;
            this.a = ajwy;
            this.h = zgb;
            this.i = ajwy2;
            this.j = lbp;
            this.b = context;
            this.d = zgb;
            this.e = kut.a(ajwy2);
            this.f = lbp.e();
        }

        public final Context a() {
            return this.b;
        }

        public final Supplier<nbl> b() {
            return this.c;
        }

        public final zgb c() {
            return this.d;
        }

        public final mxa d() {
            return this.e;
        }

        public final miw e() {
            return this.f;
        }
    }

    /* renamed from: ksw$h */
    static final class h extends akcq implements akbk<sso> {
        h(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (sso) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$i */
    static final class i extends akcq implements akbk<gvp> {
        i(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gvp) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$j */
    static final class j extends akcq implements akbk<gvl> {
        j(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gvl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$k */
    static final class k extends akcq implements akbk<hbe> {
        k(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hbe) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$u */
    static final class u extends akcq implements akbk<sso> {
        u(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (sso) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$x */
    static final class x extends akcq implements akbk<sdu> {
        x(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (sdu) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$n */
    static final class n extends akcq implements akbk<iha> {
        n(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iha) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$o */
    static final class o extends akcq implements akbk<kpc> {
        o(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (kpc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$t */
    static final class t<T> implements Supplier<sjm> {
        private /* synthetic */ a a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ajwy c;
        private /* synthetic */ ajei d;

        t(a aVar, ajwy ajwy, ajwy ajwy2, ajei ajei) {
            this.a = aVar;
            this.b = ajwy;
            this.c = ajwy2;
            this.d = ajei;
        }

        public final /* synthetic */ Object get() {
            Object obj = this.c.get();
            akcr.a(obj, "deepLinkUriMatcherProvider.get()");
            lnn lnn = new lnn((gvp) obj);
            this.d.a((ajej) lnn);
            return lnn;
        }
    }

    /* renamed from: ksw$ae */
    static final class ae extends akcs implements akbl<mmt, lly> {
        private /* synthetic */ llx a;
        private /* synthetic */ zgb b;

        ae(llx llx, zgb zgb) {
            this.a = llx;
            this.b = zgb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return new lly(mmt, this.a, zgb.a(kus.b.callsite("SnappablesUriDataHandler")));
        }
    }

    /* renamed from: ksw$g */
    static final class g extends akcs implements akbl<mmt, lhp> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ ajwy c;
        private /* synthetic */ zfw d;

        g(ajwy ajwy, ajwy ajwy2, ajwy ajwy3, zfw zfw) {
            this.a = ajwy;
            this.b = ajwy2;
            this.c = ajwy3;
            this.d = zfw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((mmt) obj, "it");
            return new lhp(this.a, this.b, this.c, this.d);
        }
    }

    /* renamed from: ksw$ah */
    static final class ah extends akcs implements akbl<mmt, lhh> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ zgb b;

        ah(ajwy ajwy, zgb zgb) {
            this.a = ajwy;
            this.b = zgb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((mmt) obj, "lensCore");
            return new lhh(kut.a(this.a), zgb.a(kus.b.callsite("WhitelistedHttpUriDataHandler")));
        }
    }

    /* renamed from: ksw$c */
    static final class c<T> implements Supplier<LensesAssetsUploadingHttpInterface> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* synthetic */ Object get() {
            return (LensesAssetsUploadingHttpInterface) kut.a(this.a).a(LensesAssetsUploadingHttpInterface.class);
        }
    }

    /* renamed from: ksw$b */
    public static final class b implements akbw<byte[], byte[], abnb> {
        b() {
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            akcr.b(bArr, "key");
            akcr.b(bArr2, "iv");
            return new abmv(bArr, bArr2);
        }
    }

    /* renamed from: ksw$a */
    static final class a<T> implements Supplier<File> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        public final /* synthetic */ Object get() {
            return new File(this.a.getFilesDir(), "looksery_user_data_cache");
        }
    }

    /* renamed from: ksw$af */
    static final class af<T> implements Supplier<absi> {
        private /* synthetic */ ajwy a;

        af(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (absi) this.a.get();
        }
    }

    /* renamed from: ksw$ag */
    static final class ag<T> implements Supplier<iib> {
        private /* synthetic */ ajwy a;

        ag(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (iib) this.a.get();
        }
    }

    /* renamed from: ksw$v */
    static final class v extends akcs implements akbl<achk<zjm, zjk>, ajxw> {
        private /* synthetic */ ajwy a;

        v(ajwy ajwy) {
            this.a = ajwy;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            achk achk = (achk) obj;
            akcr.b(achk, "navigationSubscriber");
            ((achb) this.a.get()).a(achk);
            return ajxw.a;
        }
    }

    /* renamed from: ksw$w */
    static final class w extends akcs implements akbl<achk<zjm, zjk>, ajxw> {
        private /* synthetic */ ajwy a;

        w(ajwy ajwy) {
            this.a = ajwy;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            achk achk = (achk) obj;
            akcr.b(achk, "navigationSubscriber");
            ((achb) this.a.get()).b(achk);
            return ajxw.a;
        }
    }

    /* renamed from: ksw$l */
    public static final class l implements c {
        private /* synthetic */ ajwy A;
        private /* synthetic */ mwy B;
        private /* synthetic */ lkn C;
        private /* synthetic */ nal.a D;
        private /* synthetic */ nbd E;
        private final zgb a = this.b;
        private /* synthetic */ zgb b;
        private /* synthetic */ lfu.a c;
        private /* synthetic */ lni.a d;
        private /* synthetic */ kws.a e;
        private /* synthetic */ ljx.a f;
        private /* synthetic */ kwd.a g;
        private /* synthetic */ a h;
        private /* synthetic */ kvl i;
        private /* synthetic */ kvg.a j;
        private /* synthetic */ lbp.a k;
        private /* synthetic */ ljj.a l;
        private /* synthetic */ ifb m;
        private /* synthetic */ ajwy n;
        private /* synthetic */ ajwy o;
        private /* synthetic */ zkq p;
        private /* synthetic */ vpc q;
        private /* synthetic */ lkp.a r;
        private /* synthetic */ lna.a s;
        private /* synthetic */ lnr t;
        private /* synthetic */ Set u;
        private /* synthetic */ mzn v;
        private /* synthetic */ abss w;
        private /* synthetic */ mio x;
        private /* synthetic */ ajdp y;
        private /* synthetic */ mqt z;

        l(zgb zgb, lfu.a aVar, lni.a aVar2, kws.a aVar3, ljx.a aVar4, kwd.a aVar5, a aVar6, kvl kvl, kvg.a aVar7, lbp.a aVar8, ljj.a aVar9, ifb ifb, ajwy ajwy, ajwy ajwy2, zkq zkq, vpc vpc, lkp.a aVar10, lna.a aVar11, lnr lnr, Set set, mzn mzn, abss abss, mio mio, ajdp ajdp, mqt mqt, ajwy ajwy3, mwy mwy, lkn lkn, nal.a aVar12, nbd nbd) {
            this.b = zgb;
            this.c = aVar;
            this.d = aVar2;
            this.e = aVar3;
            this.f = aVar4;
            this.g = aVar5;
            this.h = aVar6;
            this.i = kvl;
            this.j = aVar7;
            this.k = aVar8;
            this.l = aVar9;
            this.m = ifb;
            this.n = ajwy;
            this.o = ajwy2;
            this.p = zkq;
            this.q = vpc;
            this.r = aVar10;
            this.s = aVar11;
            this.t = lnr;
            this.u = set;
            this.v = mzn;
            this.w = abss;
            this.x = mio;
            this.y = ajdp;
            this.z = mqt;
            this.A = ajwy3;
            this.B = mwy;
            this.C = lkn;
            this.D = aVar12;
            this.E = nbd;
        }

        public final zgb a() {
            return this.a;
        }
    }

    /* renamed from: ksw$m */
    static final class m<T> implements Supplier<iib> {
        private /* synthetic */ mwy A;
        private /* synthetic */ lkn B;
        private /* synthetic */ nal.a C;
        private /* synthetic */ nbd D;
        private /* synthetic */ zgb a;
        private /* synthetic */ lfu.a b;
        private /* synthetic */ lni.a c;
        private /* synthetic */ kws.a d;
        private /* synthetic */ ljx.a e;
        private /* synthetic */ kwd.a f;
        private /* synthetic */ a g;
        private /* synthetic */ kvl h;
        private /* synthetic */ kvg.a i;
        private /* synthetic */ lbp.a j;
        private /* synthetic */ ljj.a k;
        private /* synthetic */ ifb l;
        private /* synthetic */ ajwy m;
        private /* synthetic */ ajwy n;
        private /* synthetic */ zkq o;
        private /* synthetic */ vpc p;
        private /* synthetic */ lkp.a q;
        private /* synthetic */ lna.a r;
        private /* synthetic */ lnr s;
        private /* synthetic */ Set t;
        private /* synthetic */ mzn u;
        private /* synthetic */ abss v;
        private /* synthetic */ mio w;
        private /* synthetic */ ajdp x;
        private /* synthetic */ mqt y;
        private /* synthetic */ ajwy z;

        m(zgb zgb, lfu.a aVar, lni.a aVar2, kws.a aVar3, ljx.a aVar4, kwd.a aVar5, a aVar6, kvl kvl, kvg.a aVar7, lbp.a aVar8, ljj.a aVar9, ifb ifb, ajwy ajwy, ajwy ajwy2, zkq zkq, vpc vpc, lkp.a aVar10, lna.a aVar11, lnr lnr, Set set, mzn mzn, abss abss, mio mio, ajdp ajdp, mqt mqt, ajwy ajwy3, mwy mwy, lkn lkn, nal.a aVar12, nbd nbd) {
            this.a = zgb;
            this.b = aVar;
            this.c = aVar2;
            this.d = aVar3;
            this.e = aVar4;
            this.f = aVar5;
            this.g = aVar6;
            this.h = kvl;
            this.i = aVar7;
            this.j = aVar8;
            this.k = aVar9;
            this.l = ifb;
            this.m = ajwy;
            this.n = ajwy2;
            this.o = zkq;
            this.p = vpc;
            this.q = aVar10;
            this.r = aVar11;
            this.s = lnr;
            this.t = set;
            this.u = mzn;
            this.v = abss;
            this.w = mio;
            this.x = ajdp;
            this.y = mqt;
            this.z = ajwy3;
            this.A = mwy;
            this.B = lkn;
            this.C = aVar12;
            this.D = nbd;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (iib) this.z.get();
        }
    }

    /* renamed from: ksw$r */
    static final class r extends akcq implements akbk<iha> {
        r(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iha) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$s */
    static final class s extends akcq implements akbk<kpc> {
        s(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (kpc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$q */
    public static final class q implements lkw.c {
        private final zgb a = this.c;
        private final kus b = kus.b;
        private /* synthetic */ zgb c;
        private /* synthetic */ lfu.a d;
        private /* synthetic */ lnr e;
        private /* synthetic */ Set f;
        private /* synthetic */ Context g;
        private /* synthetic */ ajwy h;
        private /* synthetic */ ajwy i;

        q(zgb zgb, lfu.a aVar, lnr lnr, Set set, Context context, ajwy ajwy, ajwy ajwy2) {
            this.c = zgb;
            this.d = aVar;
            this.e = lnr;
            this.f = set;
            this.g = context;
            this.h = ajwy;
            this.i = ajwy2;
        }

        public final zgb a() {
            return this.a;
        }

        public final /* bridge */ /* synthetic */ ide b() {
            return this.b;
        }
    }

    /* renamed from: ksw$f */
    public static final class f implements lmh.c {
        private final zgb a;
        private /* synthetic */ zgb b;

        f(zgb zgb) {
            this.b = zgb;
            this.a = zgb;
        }

        public final zgb a() {
            return this.a;
        }
    }

    /* renamed from: ksw$aa */
    static final class aa extends akcs implements akbk<mze.a> {
        public static final aa a = new aa();

        aa() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return mze.a.a;
        }
    }

    /* renamed from: ksw$ab */
    static final class ab extends akcs implements akbk<llv> {
        final /* synthetic */ ajws a;
        final /* synthetic */ ajxe b;
        final /* synthetic */ ajwy c;
        private /* synthetic */ zgb d;
        private /* synthetic */ kus e;
        private /* synthetic */ ajdx f;
        private /* synthetic */ iqw g;
        private /* synthetic */ ajxe h;
        private /* synthetic */ aken i;
        private /* synthetic */ aken j;

        /* renamed from: ksw$ab$1 */
        static final class 1<T> implements ajfb<psh> {
            private /* synthetic */ ab a;

            1(ab abVar) {
                this.a = abVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.a((Object) (psh) obj);
            }
        }

        /* renamed from: ksw$ab$2 */
        static final class 2<T> implements Supplier<mwe> {
            private /* synthetic */ ab a;

            2(ab abVar) {
                this.a = abVar;
            }

            public final /* synthetic */ Object get() {
                return ((lfu) this.a.b.b()).m();
            }
        }

        /* renamed from: ksw$ab$3 */
        static final class 3<T> implements Supplier<lfs> {
            private /* synthetic */ ab a;

            3(ab abVar) {
                this.a = abVar;
            }

            public final /* synthetic */ Object get() {
                return ((lfu) this.a.b.b()).q();
            }
        }

        /* renamed from: ksw$ab$4 */
        static final class 4<T> implements Supplier<kqf> {
            private /* synthetic */ ab a;

            4(ab abVar) {
                this.a = abVar;
            }

            public final /* synthetic */ Object get() {
                return ((kvl) this.a.c.get()).b();
            }
        }

        ab(zgb zgb, kus kus, ajdx ajdx, iqw iqw, ajws ajws, ajxe ajxe, aken aken, ajxe ajxe2, aken aken2, ajwy ajwy) {
            this.d = zgb;
            this.e = kus;
            this.f = ajdx;
            this.g = iqw;
            this.a = ajws;
            this.h = ajxe;
            this.i = aken;
            this.b = ajxe2;
            this.j = aken2;
            this.c = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new llv(zgb.a(this.e, "SnappableOperaPlugin"), this.f, this.g, new 1(this), new lma((SnappableMetadataHttpInterface) this.h.b()), new 2(this), new 3(this), new 4(this));
        }
    }

    /* renamed from: ksw$ac */
    static final class ac extends akcs implements akbk<lfu> {
        private /* synthetic */ lfu.a a;
        private /* synthetic */ kus b;

        ac(lfu.a aVar, kus kus) {
            this.a = aVar;
            this.b = kus;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a((ide) this.b).a();
        }
    }

    /* renamed from: ksw$ad */
    static final class ad extends akcs implements akbk<SnappableMetadataHttpInterface> {
        private /* synthetic */ ajwy a;

        ad(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnappableMetadataHttpInterface) kut.a(this.a).a(SnappableMetadataHttpInterface.class);
        }
    }

    /* renamed from: ksw$z */
    static final class z extends akcs implements akbk<llm> {
        private /* synthetic */ lmh.a a;
        private /* synthetic */ Context b;

        /* renamed from: ksw$z$1 */
        static final class 1 extends akcs implements akbw<SnappableLensMetadata, abnb, SnappableLensMetadata> {
            public static final 1 a = new 1();

            1() {
                super(2);
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0030 A:{RETURN} */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
                /*
                r2 = this;
                r3 = (com.snap.core.db.column.SnappableLensMetadata) r3;
                r4 = (defpackage.abnb) r4;
                r0 = "snappableLensMetadata";
                defpackage.akcr.b(r3, r0);
                r0 = "encryptionAlgorithm";
                defpackage.akcr.b(r4, r0);
                r1 = "receiver$0";
                defpackage.akcr.b(r3, r1);
                defpackage.akcr.b(r4, r0);
                r0 = r3.getLensMetadata();
                r0 = defpackage.llr.a(r0);
                if (r0 == 0) goto L_0x002d;
            L_0x0020:
                r0 = r0.a;
                if (r0 == 0) goto L_0x002d;
            L_0x0024:
                r0 = r0.a;
                if (r0 == 0) goto L_0x002d;
            L_0x0028:
                r0 = r0.b();
                goto L_0x002e;
            L_0x002d:
                r0 = 0;
            L_0x002e:
                if (r0 != 0) goto L_0x0031;
            L_0x0030:
                return r3;
            L_0x0031:
                r0 = new com.snap.core.db.column.SnappableLensMetadata;
                r1 = r3.getLensId();
                r3 = r3.getLensMetadata();
                r3 = defpackage.llr.a(r3, r4);
                r0.<init>(r1, r3);
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ksw$z$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        z(lmh.a aVar, Context context) {
            this.a = aVar;
            this.b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new llm(1.a, this.a.a(this.b), kus.b);
        }
    }

    /* renamed from: ksw$d */
    static final class d extends akcq implements akbk<iha> {
        d(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iha) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$e */
    static final class e extends akcq implements akbk<kpc> {
        e(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (kpc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ksw$y */
    static final class y extends akcq implements akbl<b, ajdj<String>> {
        y(llx llx) {
            super(1, llx);
        }

        public final String getName() {
            return "metadataFor";
        }

        public final akej getOwner() {
            return akde.a(llx.class);
        }

        public final String getSignature() {
            return "metadataFor(Lcom/snap/lenses/common/Identifier$Known;)Lio/reactivex/Maybe;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            return ((llx) this.receiver).a(bVar);
        }
    }

    static {
        ksw ksw = new ksw();
    }

    private ksw() {
    }

    public static final kvg.a a(kvg.a aVar, ajwy<cjp> ajwy) {
        akcr.b(aVar, "adInfoComponentBuilder");
        akcr.b(ajwy, "adInfoNavigator");
        Object obj = ajwy.get();
        akcr.a(obj, "adInfoNavigator.get()");
        return aVar.a((cjp) obj);
    }

    public static final kwd.a a(kwd.a aVar, zgb zgb, ajwy<sso> ajwy, ajwy<gvp> ajwy2, ajwy<gvl> ajwy3, ajwy<hbe> ajwy4, kvl kvl) {
        akcr.b(aVar, "lensesAttachmentComponentBuilder");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "operaLauncherProvider");
        akcr.b(ajwy2, "deepLinkUriMatcherProvider");
        akcr.b(ajwy3, "deepLinkDispatcherProvider");
        akcr.b(ajwy4, "videoPropertiesStoreProvider");
        akcr.b(kvl, "lensesAnalyticsComponent");
        return aVar.d(new kuv(new h(ajwy))).c(new kuv(new i(ajwy2))).b(new kuv(new j(ajwy3))).a(zgb).a((Supplier) new kuv(new k(ajwy4))).a(kvl.d());
    }

    public static final kws.a a(kws.a aVar, ajwy<ddj> ajwy) {
        akcr.b(aVar, "lensesBitmojiComponentBuilder");
        akcr.b(ajwy, "bitmojiLinkageDelegate");
        Object obj = ajwy.get();
        akcr.a(obj, "bitmojiLinkageDelegate.get()");
        return aVar.a((ddj) obj);
    }

    public static final kyc.a a(lfu.a aVar, kwd.a aVar2, a aVar3, kws.a aVar4, ljx.a aVar5, kvg.a aVar6, lni.a aVar7, lbp.a aVar8, lkp.a aVar9, lna.a aVar10, nal.a aVar11, ljj.a aVar12, kvl kvl, zgb zgb, ifb ifb, ajwy<iha> ajwy, ajwy<kpc> ajwy2, zkq zkq, vpc vpc, Set<akbl<mmt, mph>> set, lnr lnr, mzn mzn, abss abss, mio mio, mqt mqt, ajdp<achi<zjm, zjk>> ajdp, lkn lkn, ajwy<iib> ajwy3, mwy mwy, nbd nbd) {
        kwd.a aVar13 = aVar2;
        a aVar14 = aVar3;
        kws.a aVar15 = aVar4;
        ljx.a aVar16 = aVar5;
        kvg.a aVar17 = aVar6;
        lni.a aVar18 = aVar7;
        lbp.a aVar19 = aVar8;
        lkp.a aVar20 = aVar9;
        lna.a aVar21 = aVar10;
        nal.a aVar22 = aVar11;
        ljj.a aVar23 = aVar12;
        ajwy<iha> ajwy4 = ajwy;
        ajwy<kpc> ajwy5 = ajwy2;
        vpc vpc2 = vpc;
        Set<akbl<mmt, mph>> set2 = set;
        akcr.b(aVar, "lensesDataComponentBuilder");
        akcr.b(aVar13, "lensesAttachmentComponentBuilder");
        akcr.b(aVar14, "lensesWebViewComponentBuilder");
        akcr.b(aVar15, "lensesBitmojiComponentBuilder");
        akcr.b(aVar16, "lensesGeoDataComponentBuilder");
        akcr.b(aVar17, "lensesAdInfoComponentBuilder");
        akcr.b(aVar18, "lensesUserComponentBuilder");
        akcr.b(aVar19, "lensesConfigurationComponentBuilder");
        akcr.b(aVar20, "lensesPersistenceComponentBuilder");
        akcr.b(aVar21, "lensesStatisticsComponentBuilder");
        akcr.b(aVar22, "lensesUsageComponentBuilder");
        akcr.b(aVar23, "lensesExternalImagesComponentBuilder");
        akcr.b(kvl, "lensesAnalyticsComponent");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ifb, "userAgent");
        akcr.b(ajwy4, "serializationHelper");
        akcr.b(ajwy5, "codecLeasingEngine");
        akcr.b(zkq, "insetsDetector");
        akcr.b(vpc2, "scanCardsClient");
        akcr.b(set, "uriDataHandlerFactories");
        akcr.b(lnr, "assetUploader");
        akcr.b(abss, "releaseManager");
        akcr.b(mio, "systemUiElementsPositionProvider");
        akcr.b(mqt, "lensesExplorerController");
        akcr.b(ajdp, "navigationEventObservable");
        akcr.b(lkn, "notifier");
        akcr.b(ajwy3, "screenParameterProvider");
        akcr.b(mwy, "modalDialogLauncher");
        akcr.b(nbd, "wakeLock");
        Set<akbl<mmt, mph>> set3 = set;
        vpc vpc3 = vpc2;
        ajwy<kpc> ajwy6 = ajwy5;
        ajwy<iha> ajwy7 = ajwy4;
        ljj.a aVar24 = aVar23;
        lbp.a aVar25 = aVar19;
        lni.a aVar26 = aVar18;
        c lVar = new l(zgb, aVar, aVar7, aVar4, aVar5, aVar2, aVar3, kvl, aVar6, aVar8, aVar12, ifb, ajwy, ajwy2, zkq, vpc, aVar9, aVar10, lnr, set, mzn, abss, mio, ajdp, mqt, ajwy3, mwy, lkn, aVar11, nbd);
        akcr.b(lVar, "parentComponent");
        Object h = kxj.h();
        h.a(lVar);
        h.f();
        h.e();
        h.d();
        h.c();
        h.b();
        h.a((dpv) dpv.a.a.b.a);
        Object b = ajdp.b(new Rect());
        akcr.a(b, "Observable.just(Rect())");
        h.i(b);
        h.a((vpc) vpc.a.a);
        h.a(myr.a());
        h.c(ajdp.b(ebs.d.b));
        h.d(ajdp.b(ebk.READY));
        h.a((dnr) new dnr.a());
        h.a(ajvo.a(ajot.a));
        h.b(ajvo.a(ajot.a));
        h.e(ajvo.a(ajot.a));
        h.f(ajvo.a(ajot.a));
        h.g(ajvo.a(ajot.a));
        h.a((Set) ajyy.a);
        h.a((lnr) lnr.a.a);
        b = ajvo.a(ajot.a);
        akcr.a(b, "Observable.empty()");
        h.h(b);
        h.a(igl.a);
        h.b(igl.a);
        h.a((czq) czr.b);
        h.a(false);
        h.a((mio) mio.a.a);
        h.a((mqt) mqt.b.a);
        h.a((lkn) lkn.a.a);
        h.a((mwy) mwy.a.a);
        h.a((nbd) nbd.a.a);
        akcr.a(h, "DaggerLensesCameraFeatur…eLock.Noop)\n            }");
        kyc.a b2 = h.b((ide) kus.b).a(aVar).a(aVar26).a(aVar4).a(aVar5).a(aVar2).a(aVar3).a(kvl.h()).a(aVar6).a(aVar8).a(aVar12).a(ifb.j()).c(new kuv(new n(ajwy))).b((Supplier) new kuv(new o(ajwy2)));
        h = zkq.a();
        akcr.a(h, "insetsDetector.windowRectObservable");
        lkn lkn2 = lkn;
        return b2.i(h).a(vpc).a(aVar9).a(aVar10).a(lnr).a((Set) set).a(mzn).a(abss.l()).a(mio).h(ajdp).a(mqt).a((Supplier) new m(zgb, aVar, aVar7, aVar4, aVar5, aVar2, aVar3, kvl, aVar6, aVar8, aVar12, ifb, ajwy, ajwy2, zkq, vpc, aVar9, aVar10, lnr, set, mzn, abss, mio, ajdp, mqt, ajwy3, mwy, lkn, aVar11, nbd)).a(mwy).a(lkn).a(aVar11).a(nbd);
    }

    public static final lfu.a a(lfu.a aVar, ckx ckx, ajwy<zpo> ajwy, kvl kvl, gnk gnk) {
        akcr.b(aVar, "lensesDataComponentBuilder");
        akcr.b(ckx, "swipeToLensSource");
        akcr.b(ajwy, "unlockablesApi");
        akcr.b(kvl, "lensesAnalyticsComponent");
        akcr.b(gnk, "prefetchScheduler");
        return aVar.a(ckx).a((zpo) ajwy.get()).a(kvl.b()).a(gnk);
    }

    public static final ljx.a a(Context context, ajwy<nbl> ajwy, zgb zgb, ajwy<gcy> ajwy2, lbp lbp) {
        akcr.b(context, "context");
        akcr.b(ajwy, "currentLocationManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "fsnServiceFactory");
        akcr.b(lbp, "lensesConfigurationComponent");
        d pVar = new p(context, ajwy, zgb, ajwy2, lbp);
        akcr.b(pVar, "parentComponent");
        return ljs.a().a(pVar);
    }

    public static final a a(a aVar, ajwy<gvp> ajwy, ajwy<sso> ajwy2, ajei ajei) {
        akcr.b(aVar, "lensesWebViewComponentBuilder");
        akcr.b(ajwy, "deepLinkUriMatcherProvider");
        akcr.b(ajwy2, "operaLauncherProvider");
        akcr.b(ajei, "activityDisposable");
        return aVar.b(new kuv(new u(ajwy2))).a((Supplier) new t(aVar, ajwy2, ajwy, ajei));
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    public static final defpackage.mze a(android.content.Context r3, defpackage.ajwy<defpackage.lbp> r4, defpackage.lmh.a r5) {
        /*
        r0 = "context";
        defpackage.akcr.b(r3, r0);
        r0 = "lensesConfigurationComponent";
        defpackage.akcr.b(r4, r0);
        r0 = "depthSnappableComponentBuilder";
        defpackage.akcr.b(r5, r0);
        r4 = r4.get();
        r4 = (defpackage.lbp) r4;
        r4 = r4.e();
        r4 = r4.a(defpackage.miw.b.a.a);
        r0 = defpackage.mja.SNAPPABLE_LENSES_ENABLED;
        r0 = (defpackage.mje) r0;
        r1 = java.lang.Boolean.class;
        r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00db }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00c0;
    L_0x002b:
        r2 = java.lang.Boolean.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 == 0) goto L_0x0035;
    L_0x0033:
        goto L_0x00c0;
    L_0x0035:
        r2 = java.lang.Integer.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00bb;
    L_0x003d:
        r2 = java.lang.Integer.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x00bb;
    L_0x0046:
        r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00db }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00b6;
    L_0x004e:
        r2 = java.lang.Long.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 == 0) goto L_0x0057;
    L_0x0056:
        goto L_0x00b6;
    L_0x0057:
        r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00db }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00b1;
    L_0x005f:
        r2 = java.lang.Float.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x00b1;
    L_0x0068:
        r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00db }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00ac;
    L_0x0070:
        r2 = java.lang.Double.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 == 0) goto L_0x0079;
    L_0x0078:
        goto L_0x00ac;
    L_0x0079:
        r2 = java.lang.String.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r2 != 0) goto L_0x00a7;
    L_0x0081:
        r2 = java.lang.String.class;
        r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00db }
        if (r1 == 0) goto L_0x008a;
    L_0x0089:
        goto L_0x00a7;
    L_0x008a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00db }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00db }
        r2 = "Unsupported input type: [";
        r1.<init>(r2);	 Catch:{ Throwable -> 0x00db }
        r2 = java.lang.Boolean.class;
        r1.append(r2);	 Catch:{ Throwable -> 0x00db }
        r2 = 93;
        r1.append(r2);	 Catch:{ Throwable -> 0x00db }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x00db }
        r4.<init>(r1);	 Catch:{ Throwable -> 0x00db }
        r4 = (java.lang.Throwable) r4;	 Catch:{ Throwable -> 0x00db }
        throw r4;	 Catch:{ Throwable -> 0x00db }
    L_0x00a7:
        r4 = r4.f(r0);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00c4;
    L_0x00ac:
        r4 = r4.c(r0);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00c4;
    L_0x00b1:
        r4 = r4.b(r0);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00c4;
    L_0x00b6:
        r4 = r4.e(r0);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00c4;
    L_0x00bb:
        r4 = r4.d(r0);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00c4;
    L_0x00c0:
        r4 = r4.a(r0);	 Catch:{ Throwable -> 0x00db }
    L_0x00c4:
        r1 = java.lang.Boolean.class;
        r4 = r4.a(r1);	 Catch:{ Throwable -> 0x00db }
        r1 = "cast(R::class.java)";
        defpackage.akcr.a(r4, r1);	 Catch:{ Throwable -> 0x00db }
        r4 = r4.b();	 Catch:{ Throwable -> 0x00db }
        r1 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r4, r1);	 Catch:{ Throwable -> 0x00db }
        goto L_0x00fc;
    L_0x00d9:
        r3 = move-exception;
        goto L_0x0122;
    L_0x00db:
        r4 = move-exception;
        r1 = com.google.common.base.Throwables.getRootCause(r4);	 Catch:{ all -> 0x00d9 }
        r1 = r1 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00d9 }
        if (r1 == 0) goto L_0x0121;
    L_0x00e4:
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00d9 }
        r4.interrupt();	 Catch:{ all -> 0x00d9 }
        r4 = r0.a();	 Catch:{ all -> 0x00d9 }
        r0 = "key.delegate";
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x00d9 }
        r4 = r4.b();	 Catch:{ all -> 0x00d9 }
        if (r4 == 0) goto L_0x0119;
    L_0x00fa:
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x00d9 }
    L_0x00fc:
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0110;
    L_0x0104:
        r4 = new ksw$z;
        r4.<init>(r5, r3);
        r4 = (defpackage.akbk) r4;
        r3 = defpackage.mzf.a(r4);
        return r3;
    L_0x0110:
        r3 = defpackage.ksw.aa.a;
        r3 = (defpackage.akbk) r3;
        r3 = defpackage.mzf.a(r3);
        return r3;
    L_0x0119:
        r3 = new ajxt;	 Catch:{ all -> 0x00d9 }
        r4 = "null cannot be cast to non-null type kotlin.Boolean";
        r3.<init>(r4);	 Catch:{ all -> 0x00d9 }
        throw r3;	 Catch:{ all -> 0x00d9 }
    L_0x0121:
        throw r4;	 Catch:{ all -> 0x00d9 }
    L_0x0122:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksw.a(android.content.Context, ajwy, lmh$a):mze");
    }

    public static final tvy.a a(Context context, lfu.a aVar, zgb zgb, lnr lnr, Set<akbl<mmt, mph>> set, ajwy<iha> ajwy, ajwy<kpc> ajwy2) {
        akcr.b(context, "context");
        akcr.b(aVar, "lensesDataComponentBuilder");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(lnr, "assetUploader");
        akcr.b(set, "uriDataHandlerFactories");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(ajwy2, "codecLeasingEngine");
        lkw.c qVar = new q(zgb, aVar, lnr, set, context, ajwy, ajwy2);
        akcr.b(qVar, "parentComponent");
        return lku.b().a(qVar).a().a((lnr) lnr.a.a).a((Set) ajyy.a).a(aVar).a(lnr).a((Set) set).a(context).b(new kuv(new r(ajwy))).a((Supplier) new kuv(new s(ajwy2)));
    }
}

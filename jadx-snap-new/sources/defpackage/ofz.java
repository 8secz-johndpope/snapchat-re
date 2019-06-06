package defpackage;

import android.net.Uri;
import com.facebook.animated.webp.WebPImage;
import com.google.common.base.Supplier;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ofz */
public class ofz implements ofy {
    final ajxe a;
    final odl b;
    final jwe c;
    final jwb d;
    final aipn<gfu> e;
    final oet f;
    final oeu g;
    final ofg h;
    final oep i;
    private final ajxe j = ajxh.a(new b(this));
    private final ajxe k = ajxh.a(new a(this));
    private final ajxe l = ajxh.a(new u(this));
    private final zgb m;

    /* renamed from: ofz$b */
    static final class b extends akcs implements akbk<jwc> {
        private /* synthetic */ ofz a;

        b(ofz ofz) {
            this.a = ofz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a();
        }
    }

    /* renamed from: ofz$a */
    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ ofz a;

        a(ofz ofz) {
            this.a = ofz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.a(this.a.b);
        }
    }

    /* renamed from: ofz$u */
    static final class u extends akcs implements akbk<zfw> {
        private /* synthetic */ ofz a;

        u(ofz ofz) {
            this.a = ofz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.b.callsite(oga.a));
        }
    }

    /* renamed from: ofz$c */
    static final class c extends akcs implements akbk<oeb> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (oeb) this.a.get();
        }
    }

    /* renamed from: ofz$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ ofz a;
        private /* synthetic */ idd b;
        private /* synthetic */ abtl c;
        private /* synthetic */ abzy d;

        /* renamed from: ofz$d$a */
        static final class a<T> implements Supplier<kaz<jwj>> {
            private /* synthetic */ kaz a;

            a(kaz kaz) {
                this.a = kaz;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return this.a;
            }
        }

        d(ofz ofz, idd idd, abtl abtl, abzy abzy) {
            this.a = ofz;
            this.b = idd;
            this.c = abtl;
            this.d = abzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "it");
            Object a = kaz.a(this.b.a());
            kaz.dispose();
            abtl abtl = this.c;
            akcr.a(a, "clonedBitmap");
            return new ofx(new ofw(1.0d, 1.0d, this.d.e(), new a(a)), ofz.a(Math.max(1.0f, ((((float) jwz.a(a).getHeight()) * ((float) Math.min(abtl.c(), abtl.b()))) / ((float) jwz.a(a).getWidth())) / ((float) Math.max(abtl.c(), abtl.b())))));
        }
    }

    /* renamed from: ofz$e */
    static final class e<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final ofx ofx = (ofx) obj;
            akcr.b(ofx, "it");
            return ajdj.b((Callable) new Callable<T>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return ofx;
                }
            });
        }
    }

    /* renamed from: ofz$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ ofz a;
        private /* synthetic */ abtl b;
        private /* synthetic */ abzy c;

        f(ofz ofz, abtl abtl, abzy abzy) {
            this.a = ofz;
            this.b = abtl;
            this.c = abzy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "contentResult");
            Object a = auq.a((Closeable) new azf(ayg.a(WebPImage.a(((gdt) gej.c().get(0)).b()))));
            if (a == null) {
                akcr.a();
            }
            akcr.a(a, "CloseableReference.of(Cl…     as CloseableImage)!!");
            obj = a.a();
            if (obj != null) {
                obj = ((azf) obj).d();
                abtl abtl = this.b;
                akcr.a(obj, "animatedImage");
                return new ofx(new ofu(1.0d, 1.0d, this.c.e(), ((jwa) this.a.k.b()), this.b.b(), this.b.c(), a), ofz.a(Math.max(1.0f, ((((float) obj.c()) * ((float) Math.min(abtl.c(), abtl.b()))) / ((float) obj.b())) / ((float) Math.max(abtl.c(), abtl.b())))));
            }
            throw new ajxt("null cannot be cast to non-null type com.facebook.fresco.animation.image.CloseableAnimatedImage");
        }
    }

    /* renamed from: ofz$g */
    static final class g<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final ofx ofx = (ofx) obj;
            akcr.b(ofx, "it");
            return ajdj.b((Callable) new Callable<T>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return ofx;
                }
            });
        }
    }

    /* renamed from: ofz$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ idl b;

        h(ofz ofz, idl idl) {
            this.a = ofz;
            this.b = idl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "it");
            return this.a.a().a(uri, this.b);
        }
    }

    /* renamed from: ofz$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ofz$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ idd a;
        private /* synthetic */ abtl b;
        private /* synthetic */ abzg c;

        /* renamed from: ofz$j$a */
        static final class a<T> implements Supplier<kaz<jwj>> {
            private /* synthetic */ kaz a;

            a(kaz kaz) {
                this.a = kaz;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return this.a;
            }
        }

        j(idd idd, abtl abtl, abzg abzg) {
            this.a = idd;
            this.b = abtl;
            this.c = abzg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "it");
            Object a = kaz.a(this.a.a());
            kaz.dispose();
            akcr.a(a, "clonedBitmap");
            double width = (double) jwz.a(a).getWidth();
            double b = (double) this.b.b();
            Double.isNaN(width);
            Double.isNaN(b);
            double d = width / b;
            width = (double) jwz.a(a).getHeight();
            b = (double) this.b.c();
            Double.isNaN(width);
            Double.isNaN(b);
            ofw ofw = new ofw(d, width / b, 17, new a(a));
            Object j = this.c.j();
            akcr.a(j, "caption.normalizedTrajectory");
            return new ofx(ofw, j);
        }
    }

    /* renamed from: ofz$k */
    static final class k<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list;
        }
    }

    /* renamed from: ofz$l */
    static final class l<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ List b;
        private /* synthetic */ abtl c;
        private /* synthetic */ idl d;
        private /* synthetic */ idd e;

        l(ofz ofz, List list, abtl abtl, idl idl, idd idd) {
            this.a = ofz;
            this.b = list;
            this.c = abtl;
            this.d = idl;
            this.e = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abzg abzg = (abzg) obj;
            akcr.b(abzg, "it");
            ofz ofz = this.a;
            abtl abtl = this.c;
            obj = ofz.i.a(abzg).a((ajfc) new h(ofz, this.d)).a((ajdw) ofz.b().f()).d((ajfb) i.a).f(new j(this.e, abtl, abzg));
            akcr.a(obj, "captionUriProvider.getUr…ectory)\n                }");
            return obj.i().f((ajdt) ajvo.a(ajot.a));
        }
    }

    /* renamed from: ofz$m */
    static final class m<T> implements ajfl<abzg> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            abzg abzg = (abzg) obj;
            akcr.b(abzg, "it");
            return abzg.i();
        }
    }

    /* renamed from: ofz$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ idl b;

        n(ofz ofz, idl idl) {
            this.a = ofz;
            this.b = idl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "it");
            return ((gfu) this.a.e.get()).a(uri, this.b, true, new gdy[0]);
        }
    }

    /* renamed from: ofz$o */
    static final class o<T, R> implements ajfc<T, R> {
        private /* synthetic */ ofz a;
        private /* synthetic */ acam b;
        private /* synthetic */ abtl c;

        o(ofz ofz, acam acam, abtl abtl) {
            this.a = ofz;
            this.b = acam;
            this.c = abtl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "contentResult");
            Object a = auq.a((Closeable) new azf(ayg.a(WebPImage.a(((gdt) gej.c().get(0)).b()))));
            if (a == null) {
                akcr.a();
            }
            akcr.a(a, "CloseableReference.of(Cl…     as CloseableImage)!!");
            double m = this.b.m();
            double n = this.b.n();
            jwa a2 = ((jwa) this.a.k.b());
            double m2 = this.b.m();
            double b = (double) this.c.b();
            Double.isNaN(b);
            int i = (int) (m2 * b);
            m2 = this.b.n();
            double c = (double) this.c.c();
            Double.isNaN(c);
            ofw ofu = new ofu(m, n, 17, a2, i, (int) (m2 * c), a);
            Object r = this.b.r();
            akcr.a(r, "stickerData.animatedStickerNormalizedTrajectory");
            return new ofx(ofu, r);
        }
    }

    /* renamed from: ofz$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ idl b;

        p(ofz ofz, idl idl) {
            this.a = ofz;
            this.b = idl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "it");
            return this.a.a().a(uri, this.b);
        }
    }

    /* renamed from: ofz$q */
    static final class q<T, R> implements ajfc<T, R> {
        private /* synthetic */ idd a;
        private /* synthetic */ acam b;

        /* renamed from: ofz$q$a */
        static final class a<T> implements Supplier<kaz<jwj>> {
            private /* synthetic */ kaz a;

            a(kaz kaz) {
                this.a = kaz;
            }

            public final /* bridge */ /* synthetic */ Object get() {
                return this.a;
            }
        }

        q(idd idd, acam acam) {
            this.a = idd;
            this.b = acam;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "it");
            kaz a = kaz.a(this.a.a());
            kaz.dispose();
            ofw ofw = new ofw(this.b.m(), this.b.n(), 17, new a(a));
            Object r = this.b.r();
            akcr.a(r, "stickerData.animatedStickerNormalizedTrajectory");
            return new ofx(ofw, r);
        }
    }

    /* renamed from: ofz$r */
    static final class r<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ abyy b;
        private /* synthetic */ abtl c;
        private /* synthetic */ idl d;
        private /* synthetic */ idd e;

        r(ofz ofz, abyy abyy, abtl abtl, idl idl, idd idd) {
            this.a = ofz;
            this.b = abyy;
            this.c = abtl;
            this.d = idl;
            this.e = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdj b;
            ajdj a;
            abzy abzy = (abzy) obj;
            akcr.b(abzy, "it");
            ofz ofz = this.a;
            String u = this.b.u();
            String v = this.b.v();
            abtl abtl = this.c;
            idl idl = this.d;
            idd idd = this.e;
            ajdj[] ajdjArr = new ajdj[2];
            if (abzy.j()) {
                b = ((gfu) ofz.e.get()).a(ofz.f.a(abzy, u, v), idl, true, new gdy[0]).f(new f(ofz, abtl, abzy)).b((ajfc) g.a);
                akcr.a((Object) b, "contentResolver.get().re…ybe.fromCallable { it } }");
            } else {
                b = ofz.a(ofz.f.a(abzy, u, v), abzy, idl, idd, abtl);
            }
            ajdjArr[0] = b;
            List g = abzy.g();
            Object obj2 = (g == null || g.isEmpty()) ? null : 1;
            oeb oeb = (oeb) ofz.a.b();
            Object a2 = abzy.a();
            akcr.a(a2, "geofilter.id");
            oea a3 = oeb.a(a2, new oea());
            if (obj2 != null) {
                a = ofz.a(ofz.g.a(abzy, a3.a, a3.b), abzy, idl, idd, abtl);
            } else {
                a = ajvo.a(ajlu.a);
                akcr.a((Object) a, "Maybe.empty()");
            }
            ajdjArr[1] = a;
            obj = ajdj.a(ajde.a((Iterable) ajym.b((Object[]) ajdjArr))).i();
            akcr.a(obj, "Maybe.merge(observableLi…                .toList()");
            return obj.i().f((ajdt) ajvo.a(ajot.a));
        }
    }

    /* renamed from: ofz$s */
    static final class s<T> implements ajfl<acam> {
        private /* synthetic */ ofz a;
        private /* synthetic */ acan b;
        private /* synthetic */ boolean c;
        private /* synthetic */ abzt d;
        private /* synthetic */ abtl e;
        private /* synthetic */ idl f;
        private /* synthetic */ idd g;

        s(ofz ofz, acan acan, boolean z, abzt abzt, abtl abtl, idl idl, idd idd) {
            this.a = ofz;
            this.b = acan;
            this.c = z;
            this.d = abzt;
            this.e = abtl;
            this.f = idl;
            this.g = idd;
        }

        public final /* synthetic */ boolean test(Object obj) {
            acam acam = (acam) obj;
            akcr.b(acam, "it");
            return acam.o() == this.c;
        }
    }

    /* renamed from: ofz$t */
    static final class t<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ofz a;
        private /* synthetic */ acan b;
        private /* synthetic */ boolean c;
        private /* synthetic */ abzt d;
        private /* synthetic */ abtl e;
        private /* synthetic */ idl f;
        private /* synthetic */ idd g;

        t(ofz ofz, acan acan, boolean z, abzt abzt, abtl abtl, idl idl, idd idd) {
            this.a = ofz;
            this.b = acan;
            this.c = z;
            this.d = abzt;
            this.e = abtl;
            this.f = idl;
            this.g = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            acam acam = (acam) obj;
            akcr.b(acam, "it");
            ofz ofz = this.a;
            abzt abzt = this.d;
            abtl abtl = this.e;
            idl idl = this.f;
            String str = "stickerUriProvider.getUr…ry)\n                    }";
            obj = acam.v() ? ofz.h.a(acam, abzt).a((ajfc) new n(ofz, idl)).f(new o(ofz, acam, abtl)) : ofz.h.a(acam, abzt).a((ajfc) new p(ofz, idl)).a((ajdw) ofz.b().f()).f(new q(this.g, acam));
            akcr.a(obj, str);
            return obj.i().f((ajdt) ajvo.a(ajot.a));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ofz.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(ofz.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(ofz.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ofz.class), "geofilterPipelineContextStore", "getGeofilterPipelineContextStore()Lcom/snap/media/api/overlay/GeofilterPipelineContextStore;")};
    }

    public ofz(odl odl, zgb zgb, jwe jwe, jwb jwb, aipn<gfu> aipn, oet oet, oeu oeu, ofg ofg, oep oep, ajwy<oeb> ajwy) {
        akcr.b(odl, "mediaRenderingFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(aipn, "contentResolver");
        akcr.b(oet, "geoFilterUriProvider");
        akcr.b(oeu, "geofilterOverlayUriProvider");
        akcr.b(ofg, "stickerUriProvider");
        akcr.b(oep, "captionUriProvider");
        akcr.b(ajwy, "geofilterPipelineContextStoreProvider");
        this.b = odl;
        this.m = zgb;
        this.c = jwe;
        this.d = jwb;
        this.e = aipn;
        this.f = oet;
        this.g = oeu;
        this.h = ofg;
        this.i = oep;
        this.a = ajxh.a(new c(ajwy));
    }

    private ajdp<ofx> a(acan acan, abzt abzt, abtl abtl, boolean z, idl idl, idd idd) {
        akcr.b(abtl, "animationSpaceResolution");
        akcr.b(idl, "page");
        akcr.b(idd, "callsite");
        if (acan != null) {
            acan acan2 = acan;
            boolean z2 = z;
            abzt abzt2 = abzt;
            abtl abtl2 = abtl;
            idl idl2 = idl;
            idd idd2 = idd;
            ajdp c = ajdp.b((Iterable) acan.a()).a((ajdw) b().f()).a((ajfl) new s(this, acan2, z2, abzt2, abtl2, idl2, idd2)).c((ajfc) new t(this, acan2, z2, abzt2, abtl2, idl2, idd2));
            if (c != null) {
                return c;
            }
        }
        Object a = ajvo.a(ajot.a);
        akcr.a(a, "Observable.empty<PinnableImageTranscodingTarget>()");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final ajdj<ofx> a(Uri uri, abzy abzy, idl idl, idd idd, abtl abtl) {
        Object b = a().a(uri, idl).a((ajdw) b().f()).f(new d(this, idd, abtl, abzy)).b((ajfc) e.a);
        akcr.a(b, "bitmapLoader.loadBitmap(…ybe.fromCallable { it } }");
        return b;
    }

    /* JADX WARNING: Missing block: B:21:0x00cc, code skipped:
            if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Missing block: B:37:0x014f, code skipped:
            if (r0 == null) goto L_0x0151;
     */
    /* JADX WARNING: Missing block: B:39:0x0157, code skipped:
            if (r0 == null) goto L_0x0159;
     */
    public final defpackage.ajdx<java.util.List<defpackage.ofx>> a(defpackage.abyy r21, defpackage.abtl r22, defpackage.idl r23, defpackage.idd r24, boolean r25) {
        /*
        r20 = this;
        r6 = r21;
        r14 = r22;
        r15 = r23;
        r5 = r24;
        r4 = "edits";
        defpackage.akcr.b(r6, r4);
        r3 = "animationSpaceResolution";
        defpackage.akcr.b(r14, r3);
        r2 = "page";
        defpackage.akcr.b(r15, r2);
        r1 = "callsite";
        defpackage.akcr.b(r5, r1);
        r0 = r21.D();
        r7 = r21.f();
        r16 = 0;
        if (r7 == 0) goto L_0x002f;
    L_0x0028:
        r7 = r7.c();
        r17 = r7;
        goto L_0x0031;
    L_0x002f:
        r17 = 0;
    L_0x0031:
        r7 = r21.a();
        if (r7 == 0) goto L_0x003e;
    L_0x0037:
        r7 = r7.f();
        r18 = r7;
        goto L_0x0040;
    L_0x003e:
        r18 = 0;
    L_0x0040:
        if (r0 == 0) goto L_0x00f9;
    L_0x0042:
        defpackage.akcr.b(r6, r4);
        defpackage.akcr.b(r14, r3);
        defpackage.akcr.b(r15, r2);
        defpackage.akcr.b(r5, r1);
        r0 = r21.c();
        r0 = defpackage.abzg.a(r0);
        r7 = r21.f();
        if (r7 == 0) goto L_0x0061;
    L_0x005c:
        r7 = r7.b();
        goto L_0x0062;
    L_0x0061:
        r7 = 0;
    L_0x0062:
        if (r7 == 0) goto L_0x007a;
    L_0x0064:
        r8 = r21.f();
        r9 = r21.a();
        r11 = 1;
        r7 = r20;
        r10 = r22;
        r12 = r23;
        r13 = r24;
        r7 = r7.a(r8, r9, r10, r11, r12, r13);
        goto L_0x0080;
    L_0x007a:
        r7 = defpackage.ajot.a;
        r7 = defpackage.ajvo.a(r7);
    L_0x0080:
        r7 = (defpackage.ajdt) r7;
        if (r0 == 0) goto L_0x00e1;
    L_0x0084:
        r8 = r21.c();
        defpackage.akcr.b(r14, r3);
        defpackage.akcr.b(r15, r2);
        defpackage.akcr.b(r5, r1);
        if (r8 == 0) goto L_0x00cf;
    L_0x0093:
        r0 = r8;
        r0 = (java.lang.Iterable) r0;
        r0 = defpackage.ajdp.b(r0);
        r9 = r20.b();
        r9 = r9.f();
        r9 = (defpackage.ajdw) r9;
        r0 = r0.a(r9);
        r9 = defpackage.ofz.m.a;
        r9 = (defpackage.ajfl) r9;
        r9 = r0.a(r9);
        r10 = new ofz$l;
        r0 = r10;
        r11 = r1;
        r1 = r20;
        r12 = r2;
        r2 = r8;
        r8 = r3;
        r3 = r22;
        r13 = r4;
        r4 = r23;
        r19 = r11;
        r11 = r5;
        r5 = r24;
        r0.<init>(r1, r2, r3, r4, r5);
        r10 = (defpackage.ajfc) r10;
        r0 = r9.c(r10);
        if (r0 != 0) goto L_0x00ed;
    L_0x00ce:
        goto L_0x00d5;
    L_0x00cf:
        r19 = r1;
        r12 = r2;
        r8 = r3;
        r13 = r4;
        r11 = r5;
    L_0x00d5:
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
        r1 = "Observable.empty<PinnableImageTranscodingTarget>()";
        defpackage.akcr.a(r0, r1);
        goto L_0x00ed;
    L_0x00e1:
        r19 = r1;
        r12 = r2;
        r8 = r3;
        r13 = r4;
        r11 = r5;
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
    L_0x00ed:
        r0 = (defpackage.ajdt) r0;
        r0 = defpackage.ajdp.a(r7, r0);
        r1 = "Observable.concat(\n     …gTarget>()\n            })";
        defpackage.akcr.a(r0, r1);
        goto L_0x0105;
    L_0x00f9:
        r19 = r1;
        r12 = r2;
        r8 = r3;
        r13 = r4;
        r11 = r5;
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
    L_0x0105:
        r7 = r0;
        r7 = (defpackage.ajdt) r7;
        if (r18 != 0) goto L_0x0116;
    L_0x010a:
        if (r17 == 0) goto L_0x010f;
    L_0x010c:
        if (r25 == 0) goto L_0x010f;
    L_0x010e:
        goto L_0x0116;
    L_0x010f:
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
        goto L_0x016c;
    L_0x0116:
        defpackage.akcr.b(r6, r13);
        defpackage.akcr.b(r14, r8);
        defpackage.akcr.b(r15, r12);
        r0 = r19;
        defpackage.akcr.b(r11, r0);
        r0 = r21.a();
        if (r0 == 0) goto L_0x0159;
    L_0x012a:
        r1 = "allFilters";
        defpackage.akcr.a(r0, r1);
        r0 = r0.g();
        if (r0 == 0) goto L_0x0151;
    L_0x0135:
        r8 = defpackage.ajdp.b(r0);
        r9 = new ofz$r;
        r0 = r9;
        r1 = r20;
        r2 = r21;
        r3 = r22;
        r4 = r23;
        r5 = r24;
        r0.<init>(r1, r2, r3, r4, r5);
        r9 = (defpackage.ajfc) r9;
        r0 = r8.k(r9);
        if (r0 != 0) goto L_0x0157;
    L_0x0151:
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
    L_0x0157:
        if (r0 != 0) goto L_0x0164;
    L_0x0159:
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
        r1 = "Observable.empty<List<Pi…mageTranscodingTarget>>()";
        defpackage.akcr.a(r0, r1);
    L_0x0164:
        r1 = defpackage.ofz.k.a;
        r1 = (defpackage.ajfc) r1;
        r0 = r0.l(r1);
    L_0x016c:
        r8 = r0;
        r8 = (defpackage.ajdt) r8;
        if (r17 == 0) goto L_0x0187;
    L_0x0171:
        r1 = r21.f();
        r2 = r21.a();
        r4 = 0;
        r0 = r20;
        r3 = r22;
        r5 = r23;
        r6 = r24;
        r0 = r0.a(r1, r2, r3, r4, r5, r6);
        goto L_0x018d;
    L_0x0187:
        r0 = defpackage.ajot.a;
        r0 = defpackage.ajvo.a(r0);
    L_0x018d:
        r0 = (defpackage.ajdt) r0;
        r1 = "source1 is null";
        defpackage.ajfv.a(r7, r1);
        r1 = "source2 is null";
        defpackage.ajfv.a(r8, r1);
        r1 = "source3 is null";
        defpackage.ajfv.a(r0, r1);
        r1 = 3;
        r1 = new defpackage.ajdt[r1];
        r1[r16] = r7;
        r2 = 1;
        r1[r2] = r8;
        r2 = 2;
        r1[r2] = r0;
        r0 = defpackage.ajdp.b(r1);
        r1 = 16;
        r0 = r0.a(r1);
        r1 = "Observable.concat(\n     …              }).toList()";
        defpackage.akcr.a(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofz.a(abyy, abtl, idl, idd, boolean):ajdx");
    }

    /* Access modifiers changed, original: final */
    public final jwc a() {
        return (jwc) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.l.b();
    }
}

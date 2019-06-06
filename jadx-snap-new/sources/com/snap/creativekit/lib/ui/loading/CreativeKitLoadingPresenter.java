package com.snap.creativekit.lib.ui.loading;

import android.content.Context;
import android.net.Uri;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import defpackage.aaho;
import defpackage.aapa;
import defpackage.abyi;
import defpackage.acam;
import defpackage.acas;
import defpackage.achb;
import defpackage.achi;
import defpackage.achk;
import defpackage.aesf;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyl;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akgb;
import defpackage.akhw;
import defpackage.akws;
import defpackage.ftl;
import defpackage.gcn;
import defpackage.gts;
import defpackage.gtt;
import defpackage.guc;
import defpackage.gud;
import defpackage.hxs;
import defpackage.idd;
import defpackage.iha;
import defpackage.ihh;
import defpackage.nhb;
import defpackage.odn;
import defpackage.pse;
import defpackage.ptg;
import defpackage.pth;
import defpackage.pun;
import defpackage.s;
import defpackage.tod;
import defpackage.wjd;
import defpackage.wki;
import defpackage.wkm;
import defpackage.xwe;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class CreativeKitLoadingPresenter extends zll<guc> implements defpackage.k {
    final zfw a = zgb.a(gts.c, "CreativeKitLoadingPresenter");
    final ajxe b = ajxh.a(b.a);
    acam c;
    boolean d;
    String e;
    final achb<zjm, zjk> f;
    final aipn<SnapKitHttpInterface> g;
    final ajwy<iha> h;
    final aipn<hxs> i;
    final ajwy<odn> j;
    final ihh k;
    final ajwy<wki> l;
    private final aipn<ftl> m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<V> implements Callable<T> {
        private /* synthetic */ CreativeKitLoadingPresenter a;
        private /* synthetic */ Uri b;
        private /* synthetic */ aesf c;

        c(CreativeKitLoadingPresenter creativeKitLoadingPresenter, Uri uri, aesf aesf) {
            this.a = creativeKitLoadingPresenter;
            this.b = uri;
            this.c = aesf;
        }

        public final /* synthetic */ Object call() {
            return ((odn) this.a.j.get()).a(this.b, this.c, this.a.k.a(), (idd) this.a.b.b());
        }
    }

    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx ajdx = (ajdx) obj;
            akcr.b(ajdx, "it");
            return ajdx;
        }
    }

    static final class e<T> implements ajfb<abyi> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        e(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            abyi abyi = (abyi) obj;
            if (abyi == null) {
                this.a.a();
                return;
            }
            aaho aaho;
            CreativeKitLoadingPresenter creativeKitLoadingPresenter = this.a;
            Object a = ajyl.a(abyi);
            boolean z = abyi.e.u.longValue() > 11000;
            guc guc = (guc) creativeKitLoadingPresenter.getTarget();
            String str = null;
            defpackage.wkm.a a2 = ((wki) creativeKitLoadingPresenter.l.get()).a(new pun(new pse(creativeKitLoadingPresenter.e, guc != null ? guc.a() : null), null, null, null, null, null, null, 254), new pth(gcn.SHARE, new ptg(), null, 0, null, null, null, 16368));
            ajdx b = ajdx.b(a);
            akcr.a((Object) b, "Single.just<List<MediaPackage>>(mediaPackageList)");
            a2 = a2.a(b);
            Iterable<abyi> iterable = (Iterable) a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abyi abyi2 : iterable) {
                arrayList.add(abyi2.e.a());
            }
            defpackage.wkm.a a3 = a2.a(defpackage.ebp.a.a((Collection) ajyu.c((Iterable) (List) arrayList, 1), z, 4)).a(tod.EXT_SHARE).a(defpackage.wkm.b.EDIT_AND_SEND_TO);
            guc guc2 = (guc) creativeKitLoadingPresenter.getTarget();
            String a4 = guc2 != null ? guc2.a() : null;
            guc2 = (guc) creativeKitLoadingPresenter.getTarget();
            if (guc2 == null || !guc2.k()) {
                guc2 = (guc) creativeKitLoadingPresenter.getTarget();
                aaho = (guc2 == null || !guc2.l()) ? aaho.UNKNOWN_CREATIVE_KIT_SHARE_TYPE : aaho.PREVIEW;
            } else {
                aaho = aaho.CAMERA;
            }
            aaho aaho2 = aaho;
            acam acam = creativeKitLoadingPresenter.c;
            guc2 = (guc) creativeKitLoadingPresenter.getTarget();
            String g = guc2 != null ? guc2.g() : null;
            guc2 = (guc) creativeKitLoadingPresenter.getTarget();
            if (guc2 != null) {
                str = guc2.h();
            }
            creativeKitLoadingPresenter.f.a((achk) new n(creativeKitLoadingPresenter, a3.a(new gtt(a4, aaho2, acam, g, str)).b()));
            creativeKitLoadingPresenter.f.a(true);
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        f(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ CreativeKitLoadingPresenter a;
        private /* synthetic */ List b;
        private /* synthetic */ float c;

        g(CreativeKitLoadingPresenter creativeKitLoadingPresenter, List list, float f) {
            this.a = creativeKitLoadingPresenter;
            this.b = list;
            this.c = f;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "stickerExtra");
            return (gud) ((iha) this.a.h.get()).a(str, gud.class);
        }
    }

    static final class h<T> implements ajfb<gud> {
        private /* synthetic */ CreativeKitLoadingPresenter a;
        private /* synthetic */ List b;
        private /* synthetic */ float c;

        h(CreativeKitLoadingPresenter creativeKitLoadingPresenter, List list, float f) {
            this.a = creativeKitLoadingPresenter;
            this.b = list;
            this.c = f;
        }

        public final /* synthetic */ void accept(Object obj) {
            gud gud = (gud) obj;
            CreativeKitLoadingPresenter creativeKitLoadingPresenter = this.a;
            defpackage.acam.a b = new defpackage.acam.a().a(xwe.SNAP_CONNECT.ordinal()).b(String.valueOf(gud.a));
            double d = gud.c;
            double d2 = (double) this.c;
            Double.isNaN(d2);
            b = b.h(d / d2);
            d = gud.b;
            d2 = (double) this.c;
            Double.isNaN(d2);
            creativeKitLoadingPresenter.c = b.g(d / d2).d(1.0d).c(gud.f).a(new acas(gud.d, gud.e)).e(gud.g).a();
        }
    }

    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        i(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            this.a.d = bool.booleanValue() ^ 1;
        }
    }

    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class l implements ajev {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        l(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final void run() {
            CreativeKitLoadingPresenter creativeKitLoadingPresenter = this.a;
            guc guc = (guc) creativeKitLoadingPresenter.getTarget();
            String str = null;
            String i = guc != null ? guc.i() : null;
            CharSequence charSequence = i;
            Object obj = (charSequence == null || akgb.a(charSequence)) ? 1 : null;
            if (obj != null) {
                creativeKitLoadingPresenter.a();
                return;
            }
            guc = (guc) creativeKitLoadingPresenter.getTarget();
            creativeKitLoadingPresenter.e = guc != null ? guc.a(i) : null;
            SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) creativeKitLoadingPresenter.g.get();
            guc = (guc) creativeKitLoadingPresenter.getTarget();
            String a = guc != null ? guc.a() : null;
            guc = (guc) creativeKitLoadingPresenter.getTarget();
            if (guc != null) {
                str = guc.j();
            }
            String str2 = str;
            String aapa = aapa.CREATIVE_KIT.toString();
            Object a2 = wjd.SNAP_KIT.a();
            akcr.a(a2, "SnapTokenAccessTokenScop…P_KIT.serverSideScopeName");
            zln.bindTo$default(creativeKitLoadingPresenter, snapKitHttpInterface.validateThirdPartyClient(a, i, null, str2, aapa, a2).b((ajdw) creativeKitLoadingPresenter.a.g()).a((ajdw) creativeKitLoadingPresenter.a.l()).a((ajfb) new o(creativeKitLoadingPresenter), (ajfb) new p(creativeKitLoadingPresenter)), creativeKitLoadingPresenter, null, null, 6, null);
        }
    }

    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        m(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    public static final class n implements achk<zjm, zjk> {
        private /* synthetic */ CreativeKitLoadingPresenter a;
        private /* synthetic */ wkm b;

        n(CreativeKitLoadingPresenter creativeKitLoadingPresenter, wkm wkm) {
            this.a = creativeKitLoadingPresenter;
            this.b = wkm;
        }

        public final void a(achi<zjm, zjk> achi) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
        public final void b(defpackage.achi<defpackage.zjm, defpackage.zjk> r2) {
            /*
            r1 = this;
            if (r2 == 0) goto L_0x000d;
        L_0x0002:
            r2 = r2.e;
            if (r2 == 0) goto L_0x000d;
        L_0x0006:
            r2 = r2.e();
            r2 = (defpackage.zjm) r2;
            goto L_0x000e;
        L_0x000d:
            r2 = 0;
        L_0x000e:
            r0 = defpackage.gts.a;
            r2 = defpackage.akcr.a(r2, r0);
            if (r2 == 0) goto L_0x002f;
        L_0x0016:
            r2 = r1.a;
            r2 = r2.f;
            r0 = r1;
            r0 = (defpackage.achk) r0;
            r2.b(r0);
            r2 = r1.a;
            r2 = r2.l;
            r2 = r2.get();
            r2 = (defpackage.wki) r2;
            r0 = r1.b;
            r2.a(r0);
        L_0x002f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter$n.b(achi):void");
        }

        public final void c(achi<zjm, zjk> achi) {
        }
    }

    static final class o<T> implements ajfb<akws<akhw>> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        o(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        /* JADX WARNING: Missing block: B:48:0x00e4, code skipped:
            if (r1.equals("video/*") != false) goto L_0x00ef;
     */
        /* JADX WARNING: Missing block: B:50:0x00ed, code skipped:
            if (r1.equals("snapvideo/*") != false) goto L_0x00ef;
     */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
            r13 = this;
            r14 = (defpackage.akws) r14;
            r0 = "response";
            defpackage.akcr.a(r14, r0);
            r14 = r14.e();
            if (r14 != 0) goto L_0x0013;
        L_0x000d:
            r14 = r13.a;
            r14.a();
            return;
        L_0x0013:
            r14 = r13.a;
            r14 = r14.getTarget();
            r14 = (defpackage.guc) r14;
            r0 = 1;
            r1 = 0;
            if (r14 == 0) goto L_0x008a;
        L_0x001f:
            r14 = r14.k();
            if (r14 != r0) goto L_0x008a;
        L_0x0025:
            r14 = r13.a;
            r2 = r14.f;
            r3 = new acik;
            r4 = defpackage.dnh.a;
            r4 = (defpackage.achg) r4;
            r5 = new dnk$a;
            r12 = new gtt;
            r6 = r14.getTarget();
            r6 = (defpackage.guc) r6;
            if (r6 == 0) goto L_0x0041;
        L_0x003b:
            r6 = r6.a();
            r7 = r6;
            goto L_0x0042;
        L_0x0041:
            r7 = r1;
        L_0x0042:
            r8 = defpackage.aaho.CAMERA;
            r9 = r14.c;
            r6 = r14.getTarget();
            r6 = (defpackage.guc) r6;
            if (r6 == 0) goto L_0x0054;
        L_0x004e:
            r6 = r6.g();
            r10 = r6;
            goto L_0x0055;
        L_0x0054:
            r10 = r1;
        L_0x0055:
            r6 = r14.getTarget();
            r6 = (defpackage.guc) r6;
            if (r6 == 0) goto L_0x0061;
        L_0x005d:
            r1 = r6.h();
        L_0x0061:
            r11 = r1;
            r6 = r12;
            r6.<init>(r7, r8, r9, r10, r11);
            r1 = r14.d;
            r6 = 4;
            r5.<init>(r12, r1, r6);
            r5 = (defpackage.acih) r5;
            r3.<init>(r4, r0, r5);
            r3 = (defpackage.acig) r3;
            r2.b(r3);
            r0 = r14.d;
            if (r0 == 0) goto L_0x0089;
        L_0x007a:
            r14 = r14.i;
            r14 = r14.get();
            r14 = (defpackage.hxs) r14;
            r0 = defpackage.nhb.CREATIVE_KIT_USER_SEEN_CLEAR_CAMERA_ONBOARDING;
            r0 = (defpackage.fth) r0;
            r14.a(r0);
        L_0x0089:
            return;
        L_0x008a:
            r14 = r13.a;
            r14 = r14.getTarget();
            r14 = (defpackage.guc) r14;
            if (r14 == 0) goto L_0x013e;
        L_0x0094:
            r14 = r14.l();
            if (r14 != r0) goto L_0x013e;
        L_0x009a:
            r2 = r13.a;
            r14 = r2.getTarget();
            r14 = (defpackage.guc) r14;
            if (r14 == 0) goto L_0x00a9;
        L_0x00a4:
            r14 = r14.c();
            goto L_0x00aa;
        L_0x00a9:
            r14 = r1;
        L_0x00aa:
            if (r14 != 0) goto L_0x00b0;
        L_0x00ac:
            r2.a();
            return;
        L_0x00b0:
            r0 = r2.getTarget();
            r0 = (defpackage.guc) r0;
            if (r0 == 0) goto L_0x00bc;
        L_0x00b8:
            r1 = r0.f();
        L_0x00bc:
            if (r1 != 0) goto L_0x00bf;
        L_0x00be:
            goto L_0x013b;
        L_0x00bf:
            r0 = r1.hashCode();
            r3 = -1783005044; // 0xffffffff95b9808c float:-7.4923716E-26 double:NaN;
            if (r0 == r3) goto L_0x00e7;
        L_0x00c8:
            r3 = 452781974; // 0x1afce796 float:1.04598904E-22 double:2.237040184E-315;
            if (r0 == r3) goto L_0x00de;
        L_0x00cd:
            r3 = 1911932022; // 0x71f5c476 float:2.4339627E30 double:9.446199293E-315;
            if (r0 == r3) goto L_0x00d3;
        L_0x00d2:
            goto L_0x013b;
        L_0x00d3:
            r0 = "image/*";
            r0 = r1.equals(r0);
            if (r0 == 0) goto L_0x013b;
        L_0x00db:
            r0 = defpackage.aesf.IMAGE;
            goto L_0x00f1;
        L_0x00de:
            r0 = "video/*";
            r0 = r1.equals(r0);
            if (r0 == 0) goto L_0x013b;
        L_0x00e6:
            goto L_0x00ef;
        L_0x00e7:
            r0 = "snapvideo/*";
            r0 = r1.equals(r0);
            if (r0 == 0) goto L_0x013b;
        L_0x00ef:
            r0 = defpackage.aesf.VIDEO;
        L_0x00f1:
            r1 = new com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter$c;
            r1.<init>(r2, r14, r0);
            r1 = (java.util.concurrent.Callable) r1;
            r14 = defpackage.ajdx.c(r1);
            r0 = com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter.d.a;
            r0 = (defpackage.ajfc) r0;
            r14 = r14.a(r0);
            r0 = r2.a;
            r0 = r0.h();
            r0 = (defpackage.ajdw) r0;
            r14 = r14.b(r0);
            r0 = r2.a;
            r0 = r0.l();
            r0 = (defpackage.zfr) r0;
            r0 = (defpackage.ajdw) r0;
            r14 = r14.a(r0);
            r0 = new com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter$e;
            r0.<init>(r2);
            r0 = (defpackage.ajfb) r0;
            r1 = new com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter$f;
            r1.<init>(r2);
            r1 = (defpackage.ajfb) r1;
            r3 = r14.a(r0, r1);
            r4 = r2;
            r4 = (defpackage.zln) r4;
            r5 = 0;
            r6 = 0;
            r7 = 6;
            r8 = 0;
            defpackage.zln.bindTo$default(r2, r3, r4, r5, r6, r7, r8);
            goto L_0x013e;
        L_0x013b:
            r2.a();
        L_0x013e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.creativekit.lib.ui.loading.CreativeKitLoadingPresenter$o.accept(java.lang.Object):void");
        }
    }

    static final class p<T> implements ajfb<Throwable> {
        private /* synthetic */ CreativeKitLoadingPresenter a;

        p(CreativeKitLoadingPresenter creativeKitLoadingPresenter) {
            this.a = creativeKitLoadingPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return gts.c.callsite("CreativeKitLoadingPresenter");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(CreativeKitLoadingPresenter.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;");
        a aVar = new a();
    }

    public CreativeKitLoadingPresenter(zgb zgb, achb<zjm, zjk> achb, aipn<SnapKitHttpInterface> aipn, ajwy<iha> ajwy, aipn<ftl> aipn2, aipn<hxs> aipn3, ajwy<odn> ajwy2, ihh ihh, ajwy<wki> ajwy3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "snapkitHttpInterface");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(aipn2, "compositeConfigurationProvider");
        akcr.b(aipn3, "featureConfiguration");
        akcr.b(ajwy2, "externalMediaToMediaPackageBuilder");
        akcr.b(ihh, "clock");
        akcr.b(ajwy3, "sendToController");
        this.f = achb;
        this.g = aipn;
        this.h = ajwy;
        this.m = aipn2;
        this.i = aipn3;
        this.j = ajwy2;
        this.k = ihh;
        this.l = ajwy3;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        guc guc = (guc) getTarget();
        if (guc != null) {
            Context b = guc.b();
            if (b != null) {
                defpackage.gua.a.a(b, gts.b, this.f);
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(guc guc) {
        akcr.b(guc, "target");
        super.takeTarget(guc);
        guc.getLifecycle().a(this);
    }

    public final void dropTarget() {
        guc guc = (guc) getTarget();
        if (guc != null) {
            defpackage.j lifecycle = guc.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onLoadingFragmentCreate() {
        guc guc = (guc) getTarget();
        if (guc != null) {
            Context b = guc.b();
            if (b != null) {
                Object e;
                Object resources = b.getResources();
                akcr.a(resources, "context.resources");
                float f = resources.getDisplayMetrics().density;
                List arrayList = new ArrayList();
                guc guc2 = (guc) getTarget();
                if (guc2 != null && guc2.k()) {
                    e = ((ftl) this.m.get()).p(nhb.CREATIVE_KIT_USER_SEEN_CLEAR_CAMERA_ONBOARDING).e().b((ajdw) this.a.f()).a((ajdw) this.a.l()).c((ajfb) new i(this)).d((ajfb) j.a).e();
                    akcr.a(e, "compositeConfigurationPr…        }.ignoreElement()");
                    arrayList.add(e);
                }
                guc2 = (guc) getTarget();
                if (guc2 != null) {
                    e = guc2.d();
                    if (e != null) {
                        resources = ajdx.b(e).f(new g(this, arrayList, f)).b((ajdw) this.a.f()).a((ajdw) this.a.l()).c((ajfb) new h(this, arrayList, f)).d((ajfb) k.a).e();
                        akcr.a(resources, "Single.just(it)\n        …        }.ignoreElement()");
                        arrayList.add(resources);
                    }
                }
                zln.bindTo$default(this, ajcx.b((Iterable) arrayList).a((ajdw) this.a.l()).a((ajev) new l(this), (ajfb) new m(this)), this, null, null, 6, null);
            }
        }
    }
}

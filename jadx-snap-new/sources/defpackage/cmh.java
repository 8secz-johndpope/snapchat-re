package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.aecl.a;
import defpackage.cly.d;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cmh */
public final class cmh implements cin {
    final cjt a;
    final ajwy<ckv> b;
    final ajwy<cly> c;
    private final ajxe d = ajxh.a(b.a);
    private final ajxe e;
    private final ajxe f;
    private final ajxe g;
    private final cnm h;
    private final cjr i;
    private final cil j;
    private final ajwy<ftl> k;
    private final cmd l;

    /* renamed from: cmh$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("AdSourcePayloadProcessor");
        }
    }

    /* renamed from: cmh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cmh$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ cmh a;
        private /* synthetic */ ajwy b;

        k(cmh cmh, ajwy ajwy) {
            this.a = cmh;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a(((idd) this.a.d.b()));
        }
    }

    /* renamed from: cmh$j */
    static final class j extends akcs implements akbk<ckv> {
        private /* synthetic */ cmh a;

        j(cmh cmh) {
            this.a = cmh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ckv) this.a.b.get();
        }
    }

    /* renamed from: cmh$c */
    static final class c extends akcs implements akbk<cly> {
        private /* synthetic */ cmh a;

        c(cmh cmh) {
            this.a = cmh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cly) this.a.c.get();
        }
    }

    /* renamed from: cmh$e */
    static final class e extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ cmh a;

        e(cmh cmh) {
            this.a = cmh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            this.a.a.a(ckt.HIGH, ((idd) this.a.d.b()), "init_failed", th, false);
            return ajxw.a;
        }
    }

    /* renamed from: cmh$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ cmh a;

        i(cmh cmh) {
            this.a = cmh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            this.a.a.a(ckt.HIGH, ((idd) this.a.d.b()), "idfa_fetch_failed", th, false);
            return ajxw.a;
        }
    }

    /* renamed from: cmh$d */
    static final class d extends akcs implements akbl<Boolean, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: cmh$h */
    static final class h extends akcs implements akbl<String, ajxw> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: cmh$f */
    static final class f extends akcs implements akbk<ajxw> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: cmh$g */
    static final class g extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ cmh a;

        g(cmh cmh) {
            this.a = cmh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            this.a.a.a(ckt.HIGH, ((idd) this.a.d.b()), "ensure_pixel_cookie_failed", th, false);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cmh.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cmh.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(cmh.class), "pixelTrackApi", "getPixelTrackApi()Lcom/snap/ads/api/PixelTrackApi;"), new akdc(akde.a(cmh.class), "cookieManager", "getCookieManager()Lcom/snap/ads/core/lib/adcookie/AdsCookieManagerV2;")};
        a aVar = new a();
    }

    public cmh(ajwy<zgb> ajwy, cnm cnm, cjr cjr, cil cil, cjt cjt, ajwy<ftl> ajwy2, cmd cmd, ajwy<ckv> ajwy3, ajwy<cly> ajwy4) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(cnm, "adSourceProvider");
        akcr.b(cjr, "adInitializer");
        akcr.b(cil, "idfaProvider");
        akcr.b(cjt, "issuesReporter");
        akcr.b(ajwy2, "compositeConfigProvider");
        akcr.b(cmd, "adDisposableManager");
        akcr.b(ajwy3, "pixelTrackApiProvider");
        akcr.b(ajwy4, "adsCookieManagerProvider");
        this.h = cnm;
        this.i = cjr;
        this.j = cil;
        this.a = cjt;
        this.k = ajwy2;
        this.l = cmd;
        this.b = ajwy3;
        this.c = ajwy4;
        this.e = ajxh.a(new k(this, ajwy));
        this.f = ajxh.a(new j(this));
        this.g = ajxh.a(new c(this));
    }

    private final zfw a() {
        return (zfw) this.e.b();
    }

    public final void a(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (((ftl) this.k.get()).a((fth) cld.SNAP_ADS_GATING_ENABLED)) {
            afeq afeq = aecy.c;
            if (afeq != null) {
                aecn aecn = afeq.ba;
                if (aecn != null) {
                    List list = aecn.a;
                    if (list != null) {
                        if (list.isEmpty()) {
                            this.a.a(ckt.HIGH, "updates_response_empty");
                        } else {
                            String str;
                            Object obj;
                            akcr.b(list, "adSourceConfigList");
                            Map linkedHashMap = new LinkedHashMap();
                            Collection collection = list;
                            int i = 1;
                            if (!(collection.isEmpty() || list.get(0) == null)) {
                                Map map = ((aecl) list.get(0)).d;
                                Object obj2 = (map == null || map.isEmpty()) ? 1 : null;
                                if (obj2 == null) {
                                    String str2 = "init_host_and_path_v2";
                                    str = (String) ((aecl) list.get(0)).d.get(str2);
                                    CharSequence charSequence = str;
                                    Object obj3 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                                    if (obj3 == null) {
                                        linkedHashMap.put(a.PRIMARY, new ckk(a.PRIMARY, str));
                                    }
                                    if (collection.size() > 1) {
                                        String str3 = (String) ((aecl) list.get(1)).d.get(str2);
                                        CharSequence charSequence2 = str3;
                                        obj = (charSequence2 == null || charSequence2.length() == 0) ? 1 : null;
                                        if (obj == null) {
                                            linkedHashMap.put(a.SHADOW, new ckk(a.SHADOW, str3));
                                        }
                                    }
                                }
                            }
                            if (linkedHashMap.isEmpty()) {
                                this.a.a(ckt.HIGH, "init_url_not_found");
                            }
                            Map a = this.h.a();
                            obj = (a == null || a.isEmpty()) ? 1 : null;
                            if (!(obj == null && a.size() == linkedHashMap.size())) {
                                this.h.a(cnn.INIT_HOST_AND_PATH_V2, a.SHADOW);
                                this.h.a(cnn.SERVE_HOST_AND_PATH_BATCH, a.SHADOW);
                                this.h.a(cnn.TRACK_HOST_AND_PATH_V2, a.SHADOW);
                                this.h.a(cnn.INIT_HOST_AND_PATH_V2, ajyu.k(linkedHashMap.values()));
                            }
                            ajdx a2 = this.i.a().b((ajdw) a().g()).a((ajdw) a().b());
                            akcr.a((Object) a2, "adInitializer.init()\n   …schedulers.computation())");
                            cjl.a(a2, (akbl) d.a, (akbl) new e(this), (cjo) this.l);
                            if (((ftl) this.k.get()).a((fth) cld.ENABLE_V2_COOKIE_MANAGER)) {
                                ajdx b;
                                Object e;
                                ajcx a3;
                                cly cly = (cly) this.g.b();
                                clz clz = cly.e;
                                String b2 = cly.b();
                                str = (String) cly.c.b();
                                akcr.b(b2, "url");
                                akcr.b(str, "name");
                                String str4 = "Single.just(Optional.absent())";
                                if ((((CharSequence) b2).length() == 0 ? 1 : null) == null) {
                                    if (str.length() != 0) {
                                        i = 0;
                                    }
                                    if (i == 0) {
                                        String a4 = clz.a(b2, str);
                                        if (clz.b(b2, str)) {
                                            b = ajdx.b(clz.c());
                                            b2 = "Single.just(getPixelCookie())";
                                        } else if (clz.b.containsKey(a4)) {
                                            b = ajdx.b(Optional.fromNullable(clz.b.get(a4)));
                                            b2 = "Single.just(Optional.fro…e(sessionCookieMap[key]))";
                                        } else if (clz.b().containsKey(a4)) {
                                            b = ajdx.b(Optional.fromNullable(clz.b().get(a4)));
                                            b2 = "Single.just(Optional.fro…persistedCookieMap[key]))";
                                        }
                                        akcr.a((Object) b, b2);
                                        e = b.e((ajfc) new d(cly));
                                        akcr.a(e, "cookieStore.getCookie(bu…      }\n                }");
                                        a3 = e.b((ajdw) a().b()).a((ajdw) a().b());
                                        akcr.a((Object) a3, "cookieManager.ensurePixe…schedulers.computation())");
                                        cjl.a(a3, (akbk) f.a, (akbl) new g(this), (cjo) this.l);
                                    }
                                }
                                b = ajdx.b(Optional.absent());
                                akcr.a((Object) b, str4);
                                e = b.e((ajfc) new d(cly));
                                akcr.a(e, "cookieStore.getCookie(bu…      }\n                }");
                                a3 = e.b((ajdw) a().b()).a((ajdw) a().b());
                                akcr.a((Object) a3, "cookieManager.ensurePixe…schedulers.computation())");
                                cjl.a(a3, (akbk) f.a, (akbl) new g(this), (cjo) this.l);
                            } else {
                                ((ckv) this.f.b()).a();
                            }
                            a2 = this.j.c().b((ajdw) a().b()).a((ajdw) a().b());
                            akcr.a((Object) a2, "idfaProvider.fetchAdId()…schedulers.computation())");
                            cjl.a(a2, (akbl) h.a, (akbl) new i(this), (cjo) this.l);
                        }
                    }
                }
            }
        }
    }
}

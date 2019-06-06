package defpackage;

import defpackage.cnm.a;
import java.net.MalformedURLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cnl */
public final class cnl implements cnm {
    private final ajxe a = ajxh.a(b.a);
    private final ajxe b;
    private final ajwy<cnk> c;
    private final ajwy<ftl> d;
    private final cjt e;

    /* renamed from: cnl$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("AdSourceProvider");
        }
    }

    /* renamed from: cnl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cnl$c */
    static final class c extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cnl.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(cnl.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
        a aVar = new a();
    }

    public cnl(ajwy<cnk> ajwy, ajwy<ftl> ajwy2, cjt cjt, ajwy<ilv> ajwy3) {
        akcr.b(ajwy, "adSourceDataStore");
        akcr.b(ajwy2, "configProvider");
        akcr.b(cjt, "issuesReporter");
        akcr.b(ajwy3, "grapheneProvider");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = cjt;
        this.b = ajxh.a(new c(ajwy3));
    }

    private String a(String str, cnn cnn) {
        akcr.b(str, "urlBase");
        akcr.b(cnn, "adUrlType");
        String str2;
        if (abps.b(str)) {
            throw new MalformedURLException("base url is malformed: ".concat(String.valueOf(str)));
        } else if (a.b.containsKey(cnn)) {
            str2 = (String) a.b.get(cnn);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else {
            str2 = "adurltype_not_found";
            this.e.a(ckt.HIGH, d(), str2, new IllegalArgumentException("supplied adUrlType not found: ".concat(String.valueOf(cnn))), false);
            return null;
        }
    }

    private final Map<aecl.a, ckk> b(cnn cnn) {
        String j = ((ftl) this.d.get()).j(cld.CUSTOM_AD_SERVER_HOST);
        String a;
        if (abps.b(j)) {
            cla cla = (cla) ((ftl) this.d.get()).l(cld.PRESET_AD_SERVER_HOST);
            if (cla == null || cla == cla.DEFAULT) {
                List<ckk> a2 = ((cnk) this.c.get()).a(cnn);
                if (a2 == null || (a2.isEmpty() ^ 1) == 0) {
                    return ajyx.a;
                }
                Map linkedHashMap = new LinkedHashMap();
                for (ckk ckk : a2) {
                    linkedHashMap.put(ckk.a, ckk);
                }
                return linkedHashMap;
            }
            j = cla.url;
            if (j == null) {
                akcr.a();
            }
            a = a(j, cnn);
            if (a == null) {
                akcr.a();
            }
            return ajzl.a(ajxs.a(aecl.a.PRIMARY, new ckk(aecl.a.PRIMARY, a)));
        }
        akcr.a((Object) j, "customBaseUrl");
        a = a(j, cnn);
        if (a == null) {
            akcr.a();
        }
        return ajzl.a(ajxs.a(aecl.a.PRIMARY, new ckk(aecl.a.PRIMARY, a)));
    }

    private final idd d() {
        return (idd) this.a.b();
    }

    public final ckk a(cnn cnn) {
        akcr.b(cnn, "urlType");
        ((ilv) this.b.b()).c(inm.AD_SOURCE_DEFAULTED.a("url_type", cnn.toString()), 1);
        aecl.a aVar = aecl.a.PRIMARY;
        akcr.b(aVar, "behaviour");
        akcr.b(cnn, "adUrlType");
        String str = null;
        String str2;
        if (a.a.containsKey(aVar)) {
            str2 = (String) a.a.get(aVar);
            String str3;
            if (a.b.containsKey(cnn)) {
                str3 = (String) a.b.get(cnn);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(str3);
                str = stringBuilder.toString();
            } else {
                str3 = "adurltype_not_found";
                this.e.a(ckt.HIGH, d(), str3, new IllegalArgumentException("supplied adUrlType not found: ".concat(String.valueOf(cnn))), false);
            }
        } else {
            str2 = "behaviour_not_found";
            this.e.a(ckt.HIGH, d(), str2, new IllegalArgumentException("supplied behaviour not found: ".concat(String.valueOf(aVar))), false);
        }
        if (str == null) {
            akcr.a();
        }
        return new ckk(aecl.a.PRIMARY, str);
    }

    public final Map<aecl.a, ckk> a() {
        return b(cnn.INIT_HOST_AND_PATH_V2);
    }

    public final void a(cnn cnn, aecl.a aVar) {
        akcr.b(cnn, "adUrlType");
        akcr.b(aVar, "adSourcesBehavior");
        ((cnk) this.c.get()).a(cnn, aVar);
    }

    public final void a(cnn cnn, List<ckk> list) {
        akcr.b(cnn, "adUrlType");
        akcr.b(list, "adSources");
        for (ckk a : list) {
            ((cnk) this.c.get()).a(cnn, a);
        }
    }

    public final Map<aecl.a, ckk> b() {
        return b(cnn.SERVE_HOST_AND_PATH_BATCH);
    }

    public final Map<aecl.a, ckk> c() {
        return b(cnn.TRACK_HOST_AND_PATH_V2);
    }
}

package defpackage;

import defpackage.aecl.a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cno */
public final class cno implements cnk {
    private final ajxe a = ajxh.a(a.a);
    private Map<cnn, ajxm<String, List<ckk>>> b = new LinkedHashMap();
    private final Map<cnn, fth> c = ajzm.a(ajxs.a(cnn.INIT_HOST_AND_PATH_V2, cld.INIT_AD_SOURCES), ajxs.a(cnn.SERVE_HOST_AND_PATH_BATCH, cld.SERVE_AD_SOURCES), ajxs.a(cnn.TRACK_HOST_AND_PATH_V2, cld.TRACK_AD_SOURCES), ajxs.a(cnn.BATCH_TRACK_HOST_AND_PATH_V2, cld.BATCH_TRACK_AD_SOURCES));
    private final ajwy<tnj> d;
    private final ajwy<ftl> e;
    private final ajwy<iha> f;
    private final cjt g;

    /* renamed from: cno$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("PreferencesAdSourceDataStore");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cno.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public cno(ajwy<tnj> ajwy, ajwy<ftl> ajwy2, ajwy<iha> ajwy3, cjt cjt) {
        akcr.b(ajwy, "preferencesProvider");
        akcr.b(ajwy2, "configProvider");
        akcr.b(ajwy3, "serializationHelper");
        akcr.b(cjt, "issuesReporter");
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.g = cjt;
    }

    private static int a(List<ckk> list, a aVar) {
        akcr.b(list, "sources");
        akcr.b(aVar, "adSourceBehavior");
        int size = list.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (((ckk) list.get(i2)).a == aVar) {
                i = i2;
            }
        }
        return i;
    }

    private final idd a() {
        return (idd) this.a.b();
    }

    private void a(cnn cnn, List<ckk> list) {
        akcr.b(cnn, "adUrlType");
        akcr.b(list, "adSources");
        if (this.c.containsKey(cnn)) {
            fth b = b(cnn);
            try {
                iha iha = (iha) this.f.get();
                Object[] toArray = list.toArray(new ckk[0]);
                if (toArray != null) {
                    String b2 = iha.b(toArray);
                    tnj.a b3 = ((tnj) this.d.get()).b();
                    b3.a(b, b2);
                    this.b.remove(cnn);
                    b3.b();
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (Exception e) {
                this.g.a(ckt.HIGH, a(), "store_adsource_error", e, false);
                return;
            }
        }
        String str = "unknown_url_type";
        this.g.a(ckt.HIGH, a(), str, new Exception("unknown url type supplied:".concat(String.valueOf(cnn))), false);
    }

    private fth b(cnn cnn) {
        akcr.b(cnn, "adUrlType");
        return (fth) this.c.get(cnn);
    }

    public final List<ckk> a(cnn cnn) {
        akcr.b(cnn, "adUrlType");
        List<ckk> list = null;
        if (this.c.containsKey(cnn)) {
            String j = ((ftl) this.e.get()).j(b(cnn));
            if (this.b.containsKey(cnn)) {
                ajxm ajxm = (ajxm) this.b.get(cnn);
                Object obj = ajxm != null ? (String) ajxm.a : null;
                if (!abps.b((String) obj) && akcr.a(obj, (Object) j)) {
                    ajxm ajxm2 = (ajxm) this.b.get(cnn);
                    return ajxm2 != null ? (List) ajxm2.b : null;
                }
            }
            try {
                ckk[] ckkArr = (ckk[]) ((iha) this.f.get()).a(j, ckk[].class);
                if (ckkArr != null) {
                    List<ckk> i = ajyi.i(ckkArr);
                    if (i != null) {
                        Map map = this.b;
                        if (j == null) {
                            akcr.a();
                        }
                        map.put(cnn, new ajxm(j, i));
                        list = i;
                    }
                }
            } catch (Exception e) {
                this.g.a(ckt.HIGH, a(), "adsource_parse_error", e, false);
            }
            return list;
        }
        this.g.a(ckt.HIGH, a(), "unknown_url_type", new Exception("unknown url type supplied:".concat(String.valueOf(cnn))), false);
        return null;
    }

    public final void a(cnn cnn, a aVar) {
        akcr.b(cnn, "adUrlType");
        akcr.b(aVar, "adSourceBehavior");
        List a = a(cnn);
        Collection collection = a;
        Object obj = (collection == null || collection.isEmpty()) ? 1 : null;
        if (obj == null) {
            if (a == null) {
                akcr.a();
            }
            List h = ajyu.h(collection);
            int a2 = cno.a(a, aVar);
            if (a2 != -1) {
                h.remove(a2);
                a(cnn, h);
            }
        }
    }

    public final void a(cnn cnn, ckk ckk) {
        akcr.b(cnn, "adUrlType");
        akcr.b(ckk, "adSource");
        List a = a(cnn);
        Collection collection = a;
        Object obj = (collection == null || collection.isEmpty()) ? 1 : null;
        if (obj != null) {
            a(cnn, ajyl.a(ckk));
            return;
        }
        if (a == null) {
            akcr.a();
        }
        List h = ajyu.h(collection);
        int a2 = cno.a(a, ckk.a);
        if (a2 != -1) {
            h.remove(a2);
        }
        h.add(ckk);
        a(cnn, h);
    }
}

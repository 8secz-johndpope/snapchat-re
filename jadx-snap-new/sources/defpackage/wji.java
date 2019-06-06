package defpackage;

import java.util.Map;

/* renamed from: wji */
public final class wji implements glu {
    private final wjk a;
    private final ajei b;

    /* renamed from: wji$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public wji(wjk wjk, ajei ajei) {
        akcr.b(wjk, "snapTokenProvider");
        akcr.b(ajei, "clearOnLogout");
        this.a = wjk;
        this.b = ajei;
    }

    public final ryz a(ryz ryz) {
        akcr.b(ryz, "networkRequest");
        Map m = ryz.m();
        Object obj = m != null ? m.get("__xsc_local__snap_token") : null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            return ryz;
        }
        Object i = ryz.i();
        akcr.a(i, "networkRequest.url");
        Object k = ryz.k();
        akcr.a(k, "networkRequest.method");
        Map l = ryz.l();
        if (l != null) {
            sai sai = (sai) ryz.n();
            Map m2 = ryz.m();
            if (m2 != null) {
                Object b = ryz.b();
                akcr.a(b, "networkRequest.type");
                Object c = ryz.c();
                akcr.a(c, "networkRequest.schedulingContexts");
                Object d = ryz.d();
                akcr.a(d, "networkRequest.dependencyCheckers");
                return new wjh(i, k, l, sai, m2, b, c, d, new wjj(str, this.a, this.b), ryz.o());
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }
}

package defpackage;

import java.util.Set;

/* renamed from: gcu */
public final class gcu implements gcw {
    final ftl a;
    private final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: gcu$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ gcu a;

        b(gcu gcu) {
            this.a = gcu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.j(rxp.CUSTOM_FSN_ENDPOINT);
        }
    }

    /* renamed from: gcu$a */
    static final class a extends akcs implements akbk<String> {
        private /* synthetic */ gcu a;

        a(gcu gcu) {
            this.a = gcu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.j(rxp.CUSTOM_AUTH_FSN_ENDPOINT);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gcu.class), "customBase", "getCustomBase()Ljava/lang/String;"), new akdc(akde.a(gcu.class), "customAuthBase", "getCustomAuthBase()Ljava/lang/String;")};
    }

    public gcu(ftl ftl) {
        akcr.b(ftl, "configurationProvider");
        this.a = ftl;
    }

    private final String g() {
        return (String) this.b.b();
    }

    private final String h() {
        return (String) this.c.b();
    }

    public final String a() {
        e();
        return "https://app.snapchat.com";
    }

    public final boolean a(String str) {
        akcr.b(str, "urlHost");
        Object toLowerCase = str.toLowerCase();
        akcr.a(toLowerCase, "(this as java.lang.String).toLowerCase()");
        if (!gcv.b.contains(toLowerCase)) {
            Object obj;
            for (Object obj2 : gcv.c) {
                if (!akcr.a(toLowerCase, obj2)) {
                    if (akgb.c(toLowerCase, ".".concat(String.valueOf(obj2)))) {
                    }
                }
                obj = 1;
            }
            obj = null;
            return obj != null || gcv.a.contains(toLowerCase);
        }
    }

    public final String b() {
        f();
        return "https://auth.snapchat.com";
    }

    public final Set<String> c() {
        return gcv.d;
    }

    public final Set<String> d() {
        return gcv.e;
    }

    public final boolean e() {
        akcr.a(g(), "customBase");
        return false;
    }

    public final boolean f() {
        akcr.a(h(), "customAuthBase");
        return false;
    }
}

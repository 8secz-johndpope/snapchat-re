package defpackage;

/* renamed from: jyl */
public final class jyl implements jwn {
    private final ajei a = new ajei();
    private final ajwy<ilv> b;

    /* renamed from: jyl$a */
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

    public jyl(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "graphene");
        this.b = ajwy;
    }

    public final void a(String str, jwl jwl) {
        akcr.b(str, "feature");
        akcr.b(jwl, "failureReason");
        ((ilv) this.b.get()).c(iot.IMAGE_LOADING.a("attribution", str).a("source", jwl.a.name()).a("success", false), 1);
    }

    public final void a(String str, jwv jwv) {
        akcr.b(str, "feature");
        akcr.b(jwv, "metrics");
        String str2 = "attribution";
        String str3 = "source";
        ((ilv) this.b.get()).c(iot.IMAGE_LOADING.a(str2, str).a(str3, jwv.c.name()).a("success", true), 1);
        ((ilv) this.b.get()).a(iot.IMAGE_LOADING.a(str2, str).a(str3, jwv.c.name()), jwv.d);
    }
}

package defpackage;

/* renamed from: gqr */
public interface gqr {

    /* renamed from: gqr$a */
    public static final class a {
        public static void a(gqr gqr, gqt gqt, Throwable th, idd idd) {
            akcr.b(gqt, "severity");
            akcr.b(th, "throwable");
            akcr.b(idd, "attributedCallsite");
            gqr.a(gqt, th, idd, idd.a());
        }
    }

    void a(gqt gqt, Throwable th, idd idd);

    void a(gqt gqt, Throwable th, idd idd, String str);
}

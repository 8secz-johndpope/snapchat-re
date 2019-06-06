package defpackage;

/* renamed from: acpo */
public final class acpo extends acpp {
    final Throwable a;
    private final String b;

    public acpo(String str) {
        akcr.b(str, "m");
        this(null, str);
    }

    private acpo(Throwable th, String str) {
        super();
        this.a = th;
        if (str == null) {
            th = this.a;
            str = th != null ? th.getMessage() : null;
        }
        this.b = str;
    }
}

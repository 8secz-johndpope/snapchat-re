package defpackage;

/* renamed from: acpk */
public final class acpk extends acpl {
    final String a;
    final Throwable b;

    public acpk(String str) {
        akcr.b(str, "m");
        this(null, str);
    }

    private acpk(Throwable th, String str) {
        super();
        this.b = th;
        if (str == null) {
            th = this.b;
            str = th != null ? th.getMessage() : null;
        }
        this.a = str;
    }
}

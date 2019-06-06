package defpackage;

/* renamed from: atn */
final class atn {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final atn d;

    public atn(Throwable th, atm atm) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = atm.a(th.getStackTrace());
        th = th.getCause();
        this.d = th != null ? new atn(th, atm) : null;
    }
}

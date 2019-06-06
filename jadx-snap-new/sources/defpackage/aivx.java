package defpackage;

/* renamed from: aivx */
public final class aivx extends Exception {
    public final aivw a;
    public final aivl b;
    private final boolean c;

    public aivx(aivw aivw) {
        this(aivw, (byte) 0);
    }

    private aivx(aivw aivw, byte b) {
        this(aivw, 0);
    }

    private aivx(aivw aivw, char c) {
        super(aivw.a(aivw), aivw.o);
        this.a = aivw;
        this.b = null;
        this.c = true;
        fillInStackTrace();
    }

    public final synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }
}

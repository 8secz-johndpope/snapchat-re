package defpackage;

/* renamed from: aivy */
public final class aivy extends RuntimeException {
    public final aivw a;
    public final aivl b;
    private final boolean c;

    public aivy(aivw aivw) {
        this(aivw, null);
    }

    public aivy(aivw aivw, aivl aivl) {
        this(aivw, aivl, (byte) 0);
    }

    private aivy(aivw aivw, aivl aivl, byte b) {
        super(aivw.a(aivw), aivw.o);
        this.a = aivw;
        this.b = aivl;
        this.c = true;
        fillInStackTrace();
    }

    public final aivw a() {
        return this.a;
    }

    public final synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }
}

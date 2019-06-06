package defpackage;

/* renamed from: bla */
public final class bla extends Exception {
    public final int a;
    private int b;

    bla(int i, Throwable th, int i2) {
        super(null, th);
        this.a = i;
        this.b = i2;
    }

    public static bla a(Exception exception, int i) {
        return new bla(1, exception, i);
    }

    static bla a(RuntimeException runtimeException) {
        return new bla(2, runtimeException, -1);
    }
}

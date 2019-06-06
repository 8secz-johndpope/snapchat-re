package defpackage;

/* renamed from: diq */
public final class diq extends Exception {
    private int a;
    private Exception b;
    private String c;

    public diq(int i, Exception exception) {
        this(i, exception, null);
    }

    public diq(int i, Exception exception, String str) {
        super(exception);
        this.a = i;
        this.b = exception;
        this.c = str;
    }
}

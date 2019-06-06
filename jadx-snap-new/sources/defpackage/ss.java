package defpackage;

/* renamed from: ss */
public final class ss extends Exception {
    public int a;

    public ss(String str, int i) {
        super(str);
        this.a = i;
    }

    public ss(String str, int i, Throwable th) {
        super(str, th);
        this.a = i;
    }
}

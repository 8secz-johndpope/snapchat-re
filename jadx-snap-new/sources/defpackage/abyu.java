package defpackage;

/* renamed from: abyu */
public final class abyu extends Exception {
    public abyu() {
        this("Overlay failed to deserialize");
    }

    public abyu(String str) {
        super(str);
    }

    public abyu(String str, Throwable th) {
        super(str, th);
    }
}

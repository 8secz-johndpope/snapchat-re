package defpackage;

/* renamed from: adke */
public class adke extends Exception {
    public adke() {
        this(null, 3);
    }

    public adke(Exception exception) {
        akcr.b(exception, "e");
        super(exception);
    }

    public adke(String str) {
        this(str, 2);
    }

    public adke(String str, Exception exception) {
        super(str, exception);
    }
}

package defpackage;

/* renamed from: akdc */
public final class akdc extends akdb {
    private final akej a;
    private final String b;
    private final String c;

    public akdc(akej akej, String str, String str2) {
        this.a = akej;
        this.b = str;
        this.c = str2;
    }

    public final Object a(Object obj) {
        return a().call(obj);
    }

    public final String getName() {
        return this.b;
    }

    public final akej getOwner() {
        return this.a;
    }

    public final String getSignature() {
        return this.c;
    }
}

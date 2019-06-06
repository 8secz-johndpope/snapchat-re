package defpackage;

/* renamed from: akda */
public final class akda extends akcz {
    private final akej a;
    private final String b;
    private final String c;

    public akda(akej akej, String str, String str2) {
        this.a = akej;
        this.b = str;
        this.c = str2;
    }

    public final Object a() {
        return c().call(new Object[0]);
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

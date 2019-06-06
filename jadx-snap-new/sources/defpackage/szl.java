package defpackage;

/* renamed from: szl */
public final class szl {
    private final String a;
    private volatile String b = "";
    private volatile String c;

    public szl(Object obj) {
        StringBuilder stringBuilder = new StringBuilder("I[");
        stringBuilder.append(System.identityHashCode(obj));
        stringBuilder.append(']');
        this.a = stringBuilder.toString();
        this.c = this.a;
    }

    public szl(String str, Object obj) {
        StringBuilder stringBuilder = new StringBuilder("I[");
        stringBuilder.append(str);
        stringBuilder.append(':');
        stringBuilder.append(System.identityHashCode(obj));
        stringBuilder.append(']');
        this.a = stringBuilder.toString();
        this.c = this.a;
    }

    public final void a() {
        this.b = "";
        this.c = this.a;
    }

    public final String toString() {
        return this.c;
    }
}

package defpackage;

/* renamed from: akxa */
public final class akxa<T> {
    public final akws<T> a;
    public final Throwable b;

    akxa(akws<T> akws, Throwable th) {
        this.a = akws;
        this.b = th;
    }

    public static <T> akxa<T> a(Throwable th) {
        if (th != null) {
            return new akxa(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public final akws<T> a() {
        return this.a;
    }

    public final Throwable b() {
        return this.b;
    }

    public final boolean c() {
        return this.b != null;
    }
}

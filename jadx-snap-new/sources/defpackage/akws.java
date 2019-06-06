package defpackage;

/* renamed from: akws */
public final class akws<T> {
    public final akhv a;
    public final T b;
    public final akhw c;

    akws(akhv akhv, T t, akhw akhw) {
        this.a = akhv;
        this.b = t;
        this.c = akhw;
    }

    public static <T> akws<T> a(T t, akhv akhv) {
        akwv.a((Object) akhv, "rawResponse == null");
        if (akhv.c()) {
            return new akws(akhv, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final akhv a() {
        return this.a;
    }

    public final int b() {
        return this.a.c;
    }

    public final String c() {
        return this.a.d;
    }

    public final akhl d() {
        return this.a.f;
    }

    public final boolean e() {
        return this.a.c();
    }

    public final T f() {
        return this.b;
    }

    public final akhw g() {
        return this.c;
    }

    public final String toString() {
        return this.a.toString();
    }
}

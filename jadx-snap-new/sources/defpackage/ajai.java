package defpackage;

/* renamed from: ajai */
public final class ajai {
    public static final akkg a = akkg.a(":status");
    public static final akkg b = akkg.a(":method");
    public static final akkg c = akkg.a(":path");
    public static final akkg d = akkg.a(":scheme");
    public static final akkg e = akkg.a(":authority");
    public final akkg f;
    public final akkg g;
    final int h;

    static {
        akkg.a(":host");
        akkg.a(":version");
    }

    public ajai(akkg akkg, akkg akkg2) {
        this.f = akkg;
        this.g = akkg2;
        this.h = (akkg.g() + 32) + akkg2.g();
    }

    public ajai(akkg akkg, String str) {
        this(akkg, akkg.a(str));
    }

    public ajai(String str, String str2) {
        this(akkg.a(str), akkg.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajai) {
            ajai ajai = (ajai) obj;
            if (this.f.equals(ajai.f) && this.g.equals(ajai.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.f.a(), this.g.a()});
    }
}

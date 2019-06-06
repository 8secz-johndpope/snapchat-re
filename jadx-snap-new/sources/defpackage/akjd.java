package defpackage;

/* renamed from: akjd */
public final class akjd {
    public static final akkg a = akkg.a(":");
    public static final akkg b = akkg.a(":status");
    public static final akkg c = akkg.a(":method");
    public static final akkg d = akkg.a(":path");
    public static final akkg e = akkg.a(":scheme");
    public static final akkg f = akkg.a(":authority");
    public final akkg g;
    public final akkg h;
    final int i;

    public akjd(akkg akkg, akkg akkg2) {
        this.g = akkg;
        this.h = akkg2;
        this.i = (akkg.g() + 32) + akkg2.g();
    }

    public akjd(akkg akkg, String str) {
        this(akkg, akkg.a(str));
    }

    public akjd(String str, String str2) {
        this(akkg.a(str), akkg.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akjd) {
            akjd akjd = (akjd) obj;
            if (this.g.equals(akjd.g) && this.h.equals(akjd.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return akib.a("%s: %s", this.g.a(), this.h.a());
    }
}

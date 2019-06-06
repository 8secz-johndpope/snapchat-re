package defpackage;

/* renamed from: avl */
public final class avl {
    public static final avl a = new avl(-1, false);
    public static final avl b = new avl(-1, true);
    private final int c;
    private final boolean d;

    static {
        avl avl = new avl(-2, false);
    }

    private avl(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avl)) {
            return false;
        }
        avl avl = (avl) obj;
        return this.c == avl.c && this.d == avl.d;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.c);
        Boolean valueOf2 = Boolean.valueOf(this.d);
        int i = 0;
        int hashCode = valueOf == null ? 0 : valueOf.hashCode();
        if (valueOf2 != null) {
            i = valueOf2.hashCode();
        }
        return auu.a(hashCode, i);
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", new Object[]{Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }
}

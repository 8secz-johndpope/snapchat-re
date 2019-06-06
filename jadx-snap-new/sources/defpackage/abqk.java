package defpackage;

/* renamed from: abqk */
public final class abqk<A, B, C, D> implements Comparable<abqk<A, B, C, D>> {
    private A a;
    private B b;
    private C c;
    private D d;

    private abqk(A a, B b, C c, D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static <A2, B2, C2, D2> abqk<A2, B2, C2, D2> a(A2 a2, B2 b2, C2 c2, D2 d2) {
        return new abqk(a2, b2, c2, d2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        abqk abqk = (abqk) obj;
        return new akmb().a(this.a, abqk.a, null).a(this.b, abqk.b, null).a(this.c, abqk.c, null).a(this.d, abqk.d, null).a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abqk)) {
            return false;
        }
        abqk abqk = (abqk) obj;
        return new akmc().a(this.a, abqk.a).a(this.b, abqk.b).a(this.c, abqk.c).a(this.d, abqk.d).a;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        hashCode ^= obj2 == null ? 0 : obj2.hashCode();
        obj2 = this.c;
        hashCode ^= obj2 == null ? 0 : obj2.hashCode();
        obj2 = this.d;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }
}

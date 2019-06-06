package defpackage;

/* renamed from: je */
public final class je<F, S> {
    public final F a;
    public final S b;

    public je(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public static <A, B> je<A, B> a(A a, B b) {
        return new je(a, b);
    }

    private static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        return je.b(jeVar.a, this.a) && je.b(jeVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Pair{");
        stringBuilder.append(String.valueOf(this.a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

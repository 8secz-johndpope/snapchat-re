package defpackage;

/* renamed from: abxs */
public final class abxs {
    public int a;
    public int b;

    public final void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abxs)) {
            return false;
        }
        abxs abxs = (abxs) obj;
        return abxs.a == this.a && abxs.b == this.b;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MutablePairOfInts{");
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

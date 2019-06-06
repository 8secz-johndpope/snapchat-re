package defpackage;

/* renamed from: ajzd */
public final class ajzd<T> {
    public final int a;
    public final T b;

    public ajzd(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ajzd) {
                ajzd ajzd = (ajzd) obj;
                if ((this.a == ajzd.a ? 1 : null) == null || !akcr.a(this.b, ajzd.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Object obj = this.b;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IndexedValue(index=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

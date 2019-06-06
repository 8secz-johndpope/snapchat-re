package defpackage;

/* renamed from: jzx */
final class jzx {
    final int a;
    final int b;

    public jzx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jzx) {
                jzx jzx = (jzx) obj;
                if ((this.a == jzx.a ? 1 : null) != null) {
                    if ((this.b == jzx.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Size(width=");
        stringBuilder.append(this.a);
        stringBuilder.append(", height=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

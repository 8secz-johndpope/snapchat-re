package defpackage;

/* renamed from: zio */
public final class zio {
    public final int a;
    final int b;

    public /* synthetic */ zio(int i) {
        this(i, i);
    }

    public zio(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zio) {
                zio zio = (zio) obj;
                if ((this.a == zio.a ? 1 : null) != null) {
                    if ((this.b == zio.b ? 1 : null) != null) {
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
        StringBuilder stringBuilder = new StringBuilder("IconResource(startResource=");
        stringBuilder.append(this.a);
        stringBuilder.append(", endResource=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

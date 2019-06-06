package defpackage;

/* renamed from: acmv */
public final class acmv {
    public final boolean a;
    private final boolean b;

    private /* synthetic */ acmv() {
        this(false, false);
    }

    public acmv(boolean z, boolean z2) {
        this.b = z;
        this.a = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acmv) {
                acmv acmv = (acmv) obj;
                if ((this.b == acmv.b ? 1 : null) != null) {
                    if ((this.a == acmv.a ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.a;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapViewHolderOptions(hideMapBeforeLoaded=");
        stringBuilder.append(this.b);
        stringBuilder.append(", textureCleanMode=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

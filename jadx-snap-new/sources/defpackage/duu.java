package defpackage;

/* renamed from: duu */
public final class duu {
    public final ajdx<abyi> a;
    public final aesf b;
    public final boolean c;
    public final boolean d;

    public duu(ajdx<abyi> ajdx, aesf aesf, boolean z, boolean z2) {
        akcr.b(ajdx, "mediaPackage");
        akcr.b(aesf, "mediaType");
        this.a = ajdx;
        this.b = aesf;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof duu) {
                duu duu = (duu) obj;
                if (akcr.a(this.a, duu.a) && akcr.a(this.b, duu.b)) {
                    if ((this.c == duu.c ? 1 : null) != null) {
                        if ((this.d == duu.d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ajdx ajdx = this.a;
        int i = 0;
        int hashCode = (ajdx != null ? ajdx.hashCode() : 0) * 31;
        aesf aesf = this.b;
        if (aesf != null) {
            i = aesf.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.d;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CaptureFinishEvent(mediaPackage=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isMultiSnap=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isSnappable=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

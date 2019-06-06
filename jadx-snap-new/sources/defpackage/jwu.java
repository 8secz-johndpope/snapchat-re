package defpackage;

/* renamed from: jwu */
public final class jwu {
    public final kaz<jwj> a;
    public final int b;

    public /* synthetic */ jwu(kaz kaz) {
        this(kaz, 0);
    }

    public jwu(kaz<jwj> kaz, int i) {
        akcr.b(kaz, "bitmap");
        this.a = kaz;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jwu) {
                jwu jwu = (jwu) obj;
                if (akcr.a(this.a, jwu.a)) {
                    if ((this.b == jwu.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        kaz kaz = this.a;
        return ((kaz != null ? kaz.hashCode() : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaThumbnail(bitmap=");
        stringBuilder.append(this.a);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

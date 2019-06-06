package defpackage;

/* renamed from: san */
public final class san {
    public final sam a;
    public final int b;

    public san(sam sam) {
        this(sam, 0);
    }

    public san(sam sam, int i) {
        this.a = sam;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof san) {
                san san = (san) obj;
                if (akcr.a(this.a, san.a)) {
                    if ((this.b == san.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        sam sam = this.a;
        return ((sam != null ? sam.hashCode() : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestErrorInfo(errorCategory=");
        stringBuilder.append(this.a);
        stringBuilder.append(", errorCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

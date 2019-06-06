package defpackage;

/* renamed from: ijc */
public final class ijc {
    public long a;

    private ijc() {
        this.a = 0;
    }

    public /* synthetic */ ijc(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ijc) {
                if ((this.a == ((ijc) obj).a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GeofilterPreparerDataHolder(numberOfGeofiltersLoaded=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

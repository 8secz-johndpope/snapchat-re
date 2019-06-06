package defpackage;

/* renamed from: ygv */
public final class ygv {
    final String a;
    final boolean b;

    public ygv(String str, boolean z) {
        akcr.b(str, "fileGroupKey");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ygv) {
                ygv ygv = (ygv) obj;
                if (akcr.a(this.a, ygv.a)) {
                    if ((this.b == ygv.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FileGroupCacheUpdate(fileGroupKey=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cacheHit=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

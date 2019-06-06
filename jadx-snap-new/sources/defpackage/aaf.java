package defpackage;

import java.security.MessageDigest;

/* renamed from: aaf */
final class aaf implements zd {
    private final zd b;
    private final zd c;

    aaf(zd zdVar, zd zdVar2) {
        this.b = zdVar;
        this.c = zdVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaf) {
            aaf aaf = (aaf) obj;
            if (this.b.equals(aaf.b) && this.c.equals(aaf.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataCacheKey{sourceKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

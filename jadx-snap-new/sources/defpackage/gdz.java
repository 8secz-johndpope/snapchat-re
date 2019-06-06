package defpackage;

/* renamed from: gdz */
public final class gdz {
    public final long a;
    public final long b;
    public final boolean c;

    public gdz() {
        this(0, 0, false, 7);
    }

    public gdz(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public /* synthetic */ gdz(long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            j = -10000;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        }
        this(j3, j2, (i & 4) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gdz) {
                gdz gdz = (gdz) obj;
                if ((this.a == gdz.a ? 1 : null) != null) {
                    if ((this.b == gdz.b ? 1 : null) != null) {
                        if ((this.c == gdz.c ? 1 : null) != null) {
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
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CacheMetrics(size=");
        stringBuilder.append(this.a);
        stringBuilder.append(", latency=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isCacheHit=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

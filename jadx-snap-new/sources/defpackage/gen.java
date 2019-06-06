package defpackage;

/* renamed from: gen */
public final class gen {
    public final long a;
    public final boolean b;
    public final long c;

    public gen(long j, boolean z, long j2) {
        this.a = j;
        this.b = z;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gen) {
                gen gen = (gen) obj;
                if ((this.a == gen.a ? 1 : null) != null) {
                    if ((this.b == gen.b ? 1 : null) != null) {
                        if ((this.c == gen.c ? 1 : null) != null) {
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
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentTtlInfo(defaultTtlInMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", useServerTtl=");
        stringBuilder.append(this.b);
        stringBuilder.append(", ttlRefreshMillis=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

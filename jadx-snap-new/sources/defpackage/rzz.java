package defpackage;

/* renamed from: rzz */
public final class rzz {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public /* synthetic */ rzz() {
        this(-1, -1, -1, false, -1, -1, -1, -1, -1);
    }

    public rzz(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rzz) {
                rzz rzz = (rzz) obj;
                if ((this.a == rzz.a ? 1 : null) != null) {
                    if ((this.b == rzz.b ? 1 : null) != null) {
                        if ((this.c == rzz.c ? 1 : null) != null) {
                            if ((this.d == rzz.d ? 1 : null) != null) {
                                if ((this.e == rzz.e ? 1 : null) != null) {
                                    if ((this.f == rzz.f ? 1 : null) != null) {
                                        if ((this.g == rzz.g ? 1 : null) != null) {
                                            if ((this.h == rzz.h ? 1 : null) != null) {
                                                if ((this.i == rzz.i ? 1 : null) != null) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
        j2 = this.c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        j2 = this.e;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.g;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.h;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.i;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DetailedRequestTimingInfo(requestTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fsToDnsLookupStart=");
        stringBuilder.append(this.b);
        stringBuilder.append(", dnsLookupTime=");
        stringBuilder.append(this.c);
        stringBuilder.append(", connectionReused=");
        stringBuilder.append(this.d);
        stringBuilder.append(", connectionTime=");
        stringBuilder.append(this.e);
        stringBuilder.append(", secureConnectionTime=");
        stringBuilder.append(this.f);
        stringBuilder.append(", networkTtfb=");
        stringBuilder.append(this.g);
        stringBuilder.append(", networkTtlb=");
        stringBuilder.append(this.h);
        stringBuilder.append(", networkLatency=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

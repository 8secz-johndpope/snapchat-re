package defpackage;

/* renamed from: rws */
public final class rws {
    final long a;
    final ifl b;
    final long c;
    final long d;
    final iex e;
    final boolean f;

    public rws(long j, ifl ifl, long j2, long j3, iex iex, boolean z) {
        akcr.b(ifl, "requestStartTimeStamp");
        akcr.b(iex, "reachability");
        this.a = j;
        this.b = ifl;
        this.c = j2;
        this.d = j3;
        this.e = iex;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rws) {
                rws rws = (rws) obj;
                if ((this.a == rws.a ? 1 : null) != null && akcr.a(this.b, rws.b)) {
                    if ((this.c == rws.c ? 1 : null) != null) {
                        if ((this.d == rws.d ? 1 : null) != null && akcr.a(this.e, rws.e)) {
                            if ((this.f == rws.f ? 1 : null) != null) {
                                return true;
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
        ifl ifl = this.b;
        int i2 = 0;
        i = (i + (ifl != null ? ifl.hashCode() : 0)) * 31;
        long j2 = this.c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        iex iex = this.e;
        if (iex != null) {
            i2 = iex.hashCode();
        }
        i = (i + i2) * 31;
        int i3 = this.f;
        if (i3 != 0) {
            i3 = 1;
        }
        return i + i3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BandwidthAccuracySample(estimationAtStart=");
        stringBuilder.append(this.a);
        stringBuilder.append(", requestStartTimeStamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", totalBytesAtStart=");
        stringBuilder.append(this.c);
        stringBuilder.append(", contentLength=");
        stringBuilder.append(this.d);
        stringBuilder.append(", reachability=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isDownloadSample=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

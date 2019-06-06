package defpackage;

/* renamed from: abyw */
public final class abyw {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final long e;
    private final long f;
    private final long g;

    private abyw(long j, boolean z, boolean z2, String str, long j2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = j2;
        this.f = 0;
        this.g = 0;
    }

    public /* synthetic */ abyw(long j, boolean z, boolean z2, String str, long j2, byte b) {
        this(j, z, z2, str, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abyw) {
                abyw abyw = (abyw) obj;
                if ((this.a == abyw.a ? 1 : null) != null) {
                    if ((this.b == abyw.b ? 1 : null) != null) {
                        if ((this.c == abyw.c ? 1 : null) != null && akcr.a(this.d, abyw.d)) {
                            if ((this.e == abyw.e ? 1 : null) != null) {
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
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        String str = this.d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.e;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CaptionListMetrics(caption=");
        stringBuilder.append(this.a);
        stringBuilder.append(", captionHasStyling=");
        stringBuilder.append(this.b);
        stringBuilder.append(", captionTracking=");
        stringBuilder.append(this.c);
        stringBuilder.append(", captionStyleList=");
        stringBuilder.append(this.d);
        stringBuilder.append(", captionUseCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", captionAddCount=0");
        stringBuilder.append(", captionDeletionCount=0");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

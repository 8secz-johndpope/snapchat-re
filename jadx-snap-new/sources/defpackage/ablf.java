package defpackage;

/* renamed from: ablf */
public final class ablf {
    public final long a;
    public final int b;

    public ablf(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ablf) {
                ablf ablf = (ablf) obj;
                if ((this.a == ablf.a ? 1 : null) != null) {
                    if ((this.b == ablf.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FrameRateMetric(frameDuration=");
        stringBuilder.append(this.a);
        stringBuilder.append(", frameDropCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

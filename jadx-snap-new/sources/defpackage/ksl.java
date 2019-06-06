package defpackage;

/* renamed from: ksl */
public final class ksl {
    final long a;
    private final kqi b;

    public ksl(long j, kqi kqi) {
        akcr.b(kqi, "sessionData");
        this.a = j;
        this.b = kqi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ksl) {
                ksl ksl = (ksl) obj;
                if ((this.a == ksl.a ? 1 : null) == null || !akcr.a(this.b, ksl.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        kqi kqi = this.b;
        return i + (kqi != null ? kqi.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PerformanceMetric(startTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionData=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

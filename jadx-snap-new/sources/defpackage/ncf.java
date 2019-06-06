package defpackage;

/* renamed from: ncf */
public final class ncf {
    public final long a;
    public final float b;
    public final float c;
    private float d = 10.0f;

    public ncf(long j, float f, float f2) {
        this.a = j;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ncf) {
                ncf ncf = (ncf) obj;
                if (!((this.a == ncf.a ? 1 : null) != null && Float.compare(this.b, ncf.b) == 0 && Float.compare(this.c, ncf.c) == 0 && Float.compare(10.0f, 10.0f) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(10.0f);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationRequirements(freshnessThreshold=");
        stringBuilder.append(this.a);
        stringBuilder.append(", proximityThreshold=");
        stringBuilder.append(this.b);
        stringBuilder.append(", accuracyFactor=");
        stringBuilder.append(this.c);
        stringBuilder.append(", inaccuracyFactor=10.0)");
        return stringBuilder.toString();
    }
}

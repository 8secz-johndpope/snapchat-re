package defpackage;

/* renamed from: min */
public final class min {
    public final double a;
    public final double b;
    private final long c;

    /* renamed from: min$a */
    public static final class a implements akbk<min> {
        private long a;
        private double b;
        private double c;

        /* renamed from: a */
        public final min invoke() {
            double d;
            long j = this.a;
            double d2 = 0.0d;
            if (j > 1) {
                double d3 = this.c;
                d = (double) (j - 1);
                Double.isNaN(d);
                d = d3 / d;
            } else {
                d = 0.0d;
            }
            double sqrt = Math.sqrt(d);
            if (this.a > 0) {
                d2 = this.b;
            }
            return new min(d2, sqrt, this.a);
        }

        public final void a(double d) {
            long j = this.a;
            this.a = j + 1;
            if (j == 1) {
                this.b = d;
                this.c = 0.0d;
                return;
            }
            double d2 = this.b;
            double d3 = this.c;
            double d4 = d - d2;
            double d5 = (double) this.a;
            Double.isNaN(d5);
            this.b = d2 + (d4 / d5);
            this.c = d3 + (d4 * (d - this.b));
        }
    }

    public min(double d, double d2, long j) {
        this.a = d;
        this.b = d2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof min) {
                min min = (min) obj;
                if (Double.compare(this.a, min.a) == 0 && Double.compare(this.b, min.b) == 0) {
                    if ((this.c == min.c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        i = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        doubleToLongBits2 = this.c;
        return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Statistic(average=");
        stringBuilder.append(this.a);
        stringBuilder.append(", standardDeviation=");
        stringBuilder.append(this.b);
        stringBuilder.append(", samples=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

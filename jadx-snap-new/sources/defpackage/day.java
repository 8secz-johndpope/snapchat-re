package defpackage;

/* renamed from: day */
public class day extends das<day> {
    public long a;
    public long b;

    private day a(day day) {
        this.a = day.a;
        this.b = day.b;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        day day = (day) das;
        day day2 = (day) das2;
        if (day2 == null) {
            day2 = new day();
        }
        if (day == null) {
            day2.a(this);
        } else {
            day2.b = this.b - day.b;
            day2.a = this.a - day.a;
        }
        return day2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        day day = (day) das;
        day day2 = (day) das2;
        if (day2 == null) {
            day2 = new day();
        }
        if (day == null) {
            day2.a(this);
        } else {
            day2.b = this.b + day.b;
            day2.a = this.a + day.a;
        }
        return day2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            day day = (day) obj;
            return Long.compare(day.b, this.b) == 0 && Long.compare(day.a, this.a) == 0;
        }
    }

    public int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        long doubleToLongBits = Double.doubleToLongBits((double) this.a);
        return (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CpuMetrics{, userCpuJiffies=");
        stringBuilder.append(this.a);
        stringBuilder.append(", systemCpuJiffies=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

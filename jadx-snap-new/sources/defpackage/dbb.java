package defpackage;

import java.util.Objects;

/* renamed from: dbb */
public class dbb extends das<dbb> {
    public long a;
    public long b;
    public long c;
    public long d;

    private dbb a(dbb dbb) {
        this.a = dbb.a;
        this.b = dbb.b;
        this.c = dbb.c;
        this.d = dbb.d;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dbb dbb = (dbb) das;
        dbb dbb2 = (dbb) das2;
        if (dbb2 == null) {
            dbb2 = new dbb();
        }
        if (dbb == null) {
            dbb2.a(this);
        } else {
            dbb2.a = this.a - dbb.a;
            dbb2.b = this.b - dbb.b;
            dbb2.c = this.c - dbb.c;
            dbb2.d = this.d - dbb.d;
        }
        return dbb2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dbb dbb = (dbb) das;
        dbb dbb2 = (dbb) das2;
        if (dbb2 == null) {
            dbb2 = new dbb();
        }
        if (dbb == null) {
            dbb2.a(this);
        } else {
            dbb2.a = this.a + dbb.a;
            dbb2.b = this.b + dbb.b;
            dbb2.c = this.c + dbb.c;
            dbb2.d = this.d + dbb.d;
        }
        return dbb2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            dbb dbb = (dbb) obj;
            return this.a == dbb.a && this.b == dbb.b && this.c == dbb.c && this.d == dbb.d;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationMetrics{locationRequestCountLow=");
        stringBuilder.append(this.a);
        stringBuilder.append(", locationRequestCountMedium=");
        stringBuilder.append(this.b);
        stringBuilder.append(", locationRequestCountHigh=");
        stringBuilder.append(this.c);
        stringBuilder.append(", locationHighPowerUseTimeMs=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

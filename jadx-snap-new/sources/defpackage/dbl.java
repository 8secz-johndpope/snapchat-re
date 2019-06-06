package defpackage;

import java.util.Objects;

/* renamed from: dbl */
public class dbl extends das<dbl> {
    public String a;
    public String b;

    public final /* bridge */ /* synthetic */ das a(das das) {
        dbl dbl = (dbl) das;
        this.a = dbl.a;
        this.b = dbl.b;
        return this;
    }

    public final /* bridge */ /* synthetic */ das a(das das, das das2) {
        return this;
    }

    public final /* bridge */ /* synthetic */ das b(das das, das das2) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dbl dbl = (dbl) obj;
            return Objects.equals(this.a, dbl.a) && Objects.equals(this.b, dbl.b);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PageViewMetrics{mEvents='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", mDominantPage='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

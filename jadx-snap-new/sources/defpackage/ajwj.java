package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajwj */
public final class ajwj<T> {
    public final T a;
    public final long b;
    public final TimeUnit c;

    public ajwj(T t, long j, TimeUnit timeUnit) {
        this.a = t;
        this.b = j;
        this.c = (TimeUnit) ajfv.a((Object) timeUnit, "unit is null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajwj) {
            ajwj ajwj = (ajwj) obj;
            if (ajfv.a(this.a, ajwj.a) && this.b == ajwj.b && ajfv.a(this.c, ajwj.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        long j = this.b;
        return ((hashCode + ((int) (j ^ (j >>> 31)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Timed[time=");
        stringBuilder.append(this.b);
        stringBuilder.append(", unit=");
        stringBuilder.append(this.c);
        stringBuilder.append(", value=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hwq */
public final class hwq {
    public final long a;
    public final TimeUnit b;

    public hwq(long j, TimeUnit timeUnit) {
        akcr.b(timeUnit, "timeUnit");
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hwq) {
                hwq hwq = (hwq) obj;
                if ((this.a == hwq.a ? 1 : null) == null || !akcr.a(this.b, hwq.b)) {
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
        TimeUnit timeUnit = this.b;
        return i + (timeUnit != null ? timeUnit.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InitialDelayConfig(initialDelay=");
        stringBuilder.append(this.a);
        stringBuilder.append(", timeUnit=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

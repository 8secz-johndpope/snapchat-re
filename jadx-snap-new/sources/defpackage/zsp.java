package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zsp */
public final class zsp {
    public static final long a(aenr aenr, long j) {
        akcr.b(aenr, "receiver$0");
        return zsp.a(aenr.o, j);
    }

    public static final long a(Long l, long j) {
        long longValue;
        if (l != null) {
            if ((((Number) l).longValue() > 0 ? 1 : null) == null) {
                l = null;
            }
            if (l != null) {
                longValue = l.longValue();
                return j + TimeUnit.MINUTES.toMillis(longValue);
            }
        }
        longValue = 1440;
        return j + TimeUnit.MINUTES.toMillis(longValue);
    }
}

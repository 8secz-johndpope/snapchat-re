package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.iha.a;

/* renamed from: din */
public final class din {
    final String a;
    SharedPreferences b;
    long c;
    long d;
    long e;
    long f;
    long g;
    private final dio h;
    private final abss i;
    private final dle j;
    private final ilv k;
    private final dje l;
    private long m;
    private String n;

    public din(dio dio, abss abss, dle dle, ilv ilv, String str, dje dje, long j) {
        this.h = dio;
        this.i = abss;
        this.j = dle;
        this.k = ilv;
        this.l = dje;
        this.a = str;
        this.m = j;
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        Object obj = (this.i.b && this.j.b()) ? 1 : null;
        if (obj == null) {
            j -= this.m;
            long d = this.h.d(j);
            j -= d;
            long j2 = 0;
            long e = j > 0 ? this.h.e(j) : 0;
            j -= e;
            if (j > 0) {
                dio dio = this.h;
                j2 = (long) dio.c(dio.b(j));
            }
            e += j2;
            if (!a()) {
                this.g = System.currentTimeMillis();
                this.b.edit().putLong("com.snapchat.android.analytics.framework.firstFailureTs", this.g).apply();
            }
            d = (d + e) + j2;
            String str = "logQ";
            this.k.b(ino.OVERFLOW_TOTAL_EVENTS.a(str, dih.b(this.a)), d);
            this.k.b(ino.OVERFLOW_CRITICAL_EVENT.a(str, dih.b(this.a)), e);
            this.k.b(ino.OVERFLOW_P0_EVENTS.a(str, dih.b(this.a)), j2);
            this.d += d;
            this.e += e;
            this.f += j2;
            this.b.edit().putLong("com.snapchat.android.analytics.framework.overflowedEventCount", this.d).putLong("com.snapchat.android.analytics.framework.overflowedCriticalEventCount", this.e).putLong("com.snapchat.android.analytics.framework.overflowedP0EventCount", this.f).apply();
            return;
        }
        String b = a.a.b(this.h.c().a);
        String format = String.format("Blizzard log-queue overflow.\nqueue name: %s\nblizzard config version: %s\ntop events by count:\n\t%s\ntop event:\n\t%s", new Object[]{this.a, this.l.c(), b, r9.b});
        this.h.d();
        throw new IllegalStateException(format);
    }

    public final void a(Context context) {
        Object[] objArr = new Object[]{"com.snapchat.android.analytics.framework", this.a};
        this.n = String.format("%s.%s", new Object[]{String.format("%s%s", objArr), context.getPackageName()});
        this.b = context.getSharedPreferences(this.n, 0);
        this.c = -1;
        this.d = this.b.getLong("com.snapchat.android.analytics.framework.overflowedEventCount", 0);
        this.e = this.b.getLong("com.snapchat.android.analytics.framework.overflowedCriticalEventCount", 0);
        this.f = this.b.getLong("com.snapchat.android.analytics.framework.overflowedP0EventCount", 0);
        this.g = this.b.getLong("com.snapchat.android.analytics.framework.firstFailureTs", this.c);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.d > 0;
    }
}

package defpackage;

import android.os.SystemClock;
import com.google.common.base.Preconditions;
import defpackage.abln.e;

/* renamed from: abll */
public class abll {
    private final int a;
    public final e c;
    public final long d;
    public Long e;
    public boolean f;

    public abll(abll abll) {
        this(abll.c, abll.d, abll.a);
        this.e = abll.e;
        this.f = abll.f;
    }

    private abll(e eVar, long j, int i) {
        this.c = eVar;
        this.d = j;
        this.a = i;
    }

    public static abll a(e eVar) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        eVar.a();
        zgo.a();
        return new abll(eVar, elapsedRealtimeNanos, -1);
    }

    public abll a() {
        Preconditions.checkArgument(this.f ^ 1, "timer %s closed multiple times", this.c.toString());
        this.e = Long.valueOf(SystemClock.elapsedRealtimeNanos());
        this.c.a();
        zgo.a(this.a);
        this.f = true;
        return this;
    }

    public final long b() {
        return this.d;
    }

    public final Long c() {
        return this.e;
    }

    public final e d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.c == ((abll) obj).c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}

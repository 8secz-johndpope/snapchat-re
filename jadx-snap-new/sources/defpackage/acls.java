package defpackage;

import android.os.SystemClock;

/* renamed from: acls */
public final class acls {
    private final abqo a;
    private boolean b;
    private long c;
    private long d;

    public acls() {
        this(new abqo());
    }

    private acls(abqo abqo) {
        this.a = abqo;
        c();
    }

    private long e() {
        return this.c + (this.b ? f() : 0);
    }

    private long f() {
        return this.d == -1 ? 0 : SystemClock.elapsedRealtime() - this.d;
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.c += f();
            this.d = -1;
        }
    }

    public final void c() {
        this.b = false;
        this.c = 0;
        this.d = -1;
    }

    public final double d() {
        double e = (double) e();
        Double.isNaN(e);
        return e / 1000.0d;
    }
}

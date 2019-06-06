package defpackage;

import android.os.Looper;

/* renamed from: dik */
public final class dik implements dij {
    private diy a = new diy("Blizzard-Log");
    private abss b;

    public dik(abss abss) {
        this.b = abss;
        this.a.start();
    }

    public final ajdw a() {
        this.a.a();
        return new zfg(this.a.a, djb.a.callsite("Blizzard-Log"));
    }

    public final boolean a(Runnable runnable) {
        return a(runnable, 0);
    }

    public final boolean a(Runnable runnable, long j) {
        if (!this.a.isAlive()) {
            return false;
        }
        this.a.a(runnable, j);
        return true;
    }

    public final void b(Runnable runnable) {
        diy diy = this.a;
        diy.a();
        diy.a.removeCallbacks(runnable);
    }

    public final boolean b() {
        return Looper.myLooper() == this.a.getLooper();
    }

    public final void c() {
        if (this.b.c() && !b()) {
            throw new RuntimeException("This should be running on log thread.");
        }
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: eak */
public abstract class eak implements dqk {
    private final ajdw a = zgb.a(dnj.a.callsite(e())).l();
    private final ajwy<dod> b;
    private ajej c = ajfq.INSTANCE;
    private dqj d;

    protected eak(ajwy<dod> ajwy) {
        this.b = ajwy;
    }

    private void a(idd idd, long j, TimeUnit timeUnit, Runnable runnable) {
        this.c.dispose();
        this.c = this.a.a(new -$$Lambda$eak$CjFViqfNg81MiS7oidtlwxWm-QY(this, runnable, idd), j, timeUnit);
    }

    private /* synthetic */ void a(Runnable runnable, idd idd) {
        runnable.run();
        this.c.dispose();
        dqj dqj = this.d;
        if (dqj != null) {
            dqj.a(idd);
        }
    }

    private static /* synthetic */ void f() {
    }

    private /* synthetic */ void g() {
        ((dod) this.b.get()).a();
    }

    public final void a() {
        this.c.dispose();
    }

    public final void a(dqj dqj) {
        this.d = dqj;
    }

    public final void a(idd idd) {
        if (this.d != null && d()) {
            this.d.b(idd);
        }
        a(idd.a("onCameraServicePrepared_delay"), c(), TimeUnit.MILLISECONDS, new -$$Lambda$eak$zQJXb73Ey9OibGwWZ-aZdzFDCKM(this));
    }

    public final void b() {
        this.c.dispose();
    }

    public final void b(idd idd) {
        c();
        a(idd.a("onLastUnsubscribed_delay"), c(), TimeUnit.MILLISECONDS, -$$Lambda$eak$SPOKk5holsWIYnlmGLCu8MCdLdI.INSTANCE);
    }

    /* Access modifiers changed, original: protected */
    public long c() {
        return 5000;
    }

    /* Access modifiers changed, original: protected */
    public boolean d() {
        return true;
    }

    public abstract String e();
}

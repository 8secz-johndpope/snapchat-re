package defpackage;

/* renamed from: ajtl */
public final class ajtl extends ajtc implements Runnable {
    public ajtl(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            this.b = null;
        } catch (Throwable th) {
            this.b = null;
            lazySet(c);
            ajvo.a(th);
        }
    }
}

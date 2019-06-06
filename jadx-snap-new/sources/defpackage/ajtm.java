package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajtm */
public final class ajtm extends ajtc implements Callable<Void> {
    public ajtm(Runnable runnable) {
        super(runnable);
    }

    private Void a() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(c);
            this.b = null;
        }
    }

    public final /* synthetic */ Object call() {
        return a();
    }
}

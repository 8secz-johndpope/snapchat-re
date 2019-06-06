package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zgi */
public abstract class zgi {
    private final zgk<b> a;
    private final String b = getClass().getSimpleName();
    private final AtomicBoolean c = null;

    protected zgi(zgk<b> zgk) {
        this.a = zgk;
    }

    /* Access modifiers changed, original: protected */
    public ajej a() {
        return ajfq.INSTANCE;
    }

    /* Access modifiers changed, original: protected */
    public ajej b() {
        return ajfq.INSTANCE;
    }

    public final void h() {
        this.a.a(b(), b.ON_DESTROY, this.b);
    }

    public final void i() {
        this.a.a(a(), b.ON_PAUSE, this.b);
    }
}

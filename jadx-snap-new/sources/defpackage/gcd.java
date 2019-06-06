package defpackage;

import com.snap.core.db.UpdateProcessorInterceptor;
import com.snap.core.db.UpdatesManager;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: gcd */
public final class gcd extends zgi {
    private final UpdatesManager a;
    private final UpdateProcessorInterceptor b;

    public gcd(UpdatesManager updatesManager, UpdateProcessorInterceptor updateProcessorInterceptor, zgk<b> zgk) {
        super(zgk);
        this.a = updatesManager;
        this.b = updateProcessorInterceptor;
    }

    public final ajej b() {
        this.b.setUpdatesManager(this.a);
        return ajfq.INSTANCE;
    }
}

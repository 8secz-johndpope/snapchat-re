package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: ajte */
final class ajte implements Future<Object> {
    private ajej a;

    ajte(ajej ajej) {
        this.a = ajej;
    }

    public final boolean cancel(boolean z) {
        this.a.dispose();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }
}

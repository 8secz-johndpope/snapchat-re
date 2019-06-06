package defpackage;

import java.util.concurrent.Callable;

/* renamed from: drv */
final class drv implements Callable {
    private final /* synthetic */ akbk a;

    drv(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

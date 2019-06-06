package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ftz */
final class ftz implements Callable {
    private final /* synthetic */ akbk a;

    ftz(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

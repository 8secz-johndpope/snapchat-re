package defpackage;

import java.util.concurrent.Callable;

/* renamed from: muw */
final class muw implements Callable {
    private final /* synthetic */ akbk a;

    muw(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: uer */
final class uer implements Callable {
    private final /* synthetic */ akbk a;

    uer(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

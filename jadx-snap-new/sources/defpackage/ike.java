package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ike */
final class ike implements Callable {
    private final /* synthetic */ akbk a;

    ike(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

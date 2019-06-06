package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qua */
final class qua implements Callable {
    private final /* synthetic */ akbk a;

    qua(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

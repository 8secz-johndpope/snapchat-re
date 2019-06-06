package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qyc */
final class qyc implements Callable {
    private final /* synthetic */ akbk a;

    qyc(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

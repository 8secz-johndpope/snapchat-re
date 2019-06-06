package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dek */
final class dek implements Callable {
    private final /* synthetic */ akbk a;

    dek(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

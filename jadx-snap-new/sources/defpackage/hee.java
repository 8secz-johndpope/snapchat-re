package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hee */
final class hee implements Callable {
    private final /* synthetic */ akbk a;

    hee(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

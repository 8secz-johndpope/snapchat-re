package defpackage;

import java.util.concurrent.Callable;

/* renamed from: tur */
final class tur implements Callable {
    private final /* synthetic */ akbk a;

    tur(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

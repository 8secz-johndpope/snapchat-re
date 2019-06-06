package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gbs */
final class gbs implements Callable {
    private final /* synthetic */ akbk a;

    gbs(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

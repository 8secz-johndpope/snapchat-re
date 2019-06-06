package defpackage;

import java.util.concurrent.Callable;

/* renamed from: uif */
final class uif implements Callable {
    private final /* synthetic */ akbk a;

    uif(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

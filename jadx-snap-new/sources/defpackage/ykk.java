package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ykk */
final class ykk implements Callable {
    private final /* synthetic */ akbk a;

    ykk(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

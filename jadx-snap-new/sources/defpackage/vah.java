package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vah */
final class vah implements Callable {
    private final /* synthetic */ akbk a;

    vah(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

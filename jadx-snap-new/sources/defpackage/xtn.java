package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xtn */
final class xtn implements Callable {
    private final /* synthetic */ akbk a;

    xtn(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xht */
final class xht implements Callable {
    private final /* synthetic */ akbk a;

    xht(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

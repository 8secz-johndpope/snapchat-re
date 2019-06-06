package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wwx */
final class wwx implements Callable {
    private final /* synthetic */ akbk a;

    wwx(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

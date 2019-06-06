package defpackage;

import java.util.concurrent.Callable;

/* renamed from: oju */
final class oju implements Callable {
    private final /* synthetic */ akbk a;

    oju(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

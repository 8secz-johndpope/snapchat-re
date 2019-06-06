package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cli */
final class cli implements Callable {
    private final /* synthetic */ akbk a;

    cli(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hdr */
final class hdr implements Callable {
    private final /* synthetic */ akbk a;

    hdr(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}

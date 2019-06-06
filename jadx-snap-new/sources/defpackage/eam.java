package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eam */
public final class eam extends eak {
    public AtomicBoolean a = new AtomicBoolean(true);
    private final eal b;

    public eam(eal eal, ajwy<dod> ajwy) {
        super(ajwy);
        this.b = eal;
    }

    /* Access modifiers changed, original: protected|final */
    public final long c() {
        return this.b.a.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return this.a.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final String e() {
        return "DefaultCameraOpenCloseStrategy";
    }
}

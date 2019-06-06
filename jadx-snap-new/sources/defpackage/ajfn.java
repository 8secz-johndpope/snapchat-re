package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajfn */
public final class ajfn extends AtomicReference<ajfa> implements ajej {
    public ajfn(ajfa ajfa) {
        super(ajfa);
    }

    public final void dispose() {
        if (get() != null) {
            ajfa ajfa = (ajfa) getAndSet(null);
            if (ajfa != null) {
                try {
                    ajfa.cancel();
                } catch (Exception e) {
                    ajep.a(e);
                    ajvo.a(e);
                }
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}

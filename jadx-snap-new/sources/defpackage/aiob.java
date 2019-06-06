package defpackage;

import com.brightcove.player.event.Event;
import defpackage.ainb.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiob */
final class aiob<T> extends AtomicBoolean implements a, ajej {
    private final ajdq<ainb<T>> a;
    private final ainb<T> b;

    public aiob(ajdq<ainb<T>> ajdq, ainb<? extends T> ainb) {
        akcr.b(ajdq, Event.EMITTER);
        akcr.b(ainb, "query");
        this.a = ajdq;
        this.b = ainb;
    }

    public final void a() {
        this.a.a((Object) this.b);
    }

    public final void dispose() {
        if (compareAndSet(false, true)) {
            ainb ainb = this.b;
            a aVar = this;
            akcr.b(aVar, "listener");
            synchronized (ainb.i) {
                ainb.j.remove(aVar);
                if (ainb.j.isEmpty()) {
                    ainb.k.remove(ainb);
                }
            }
        }
    }

    public final boolean isDisposed() {
        return get();
    }
}

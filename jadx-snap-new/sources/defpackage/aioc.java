package defpackage;

import com.brightcove.player.event.Event;
import defpackage.ainb.a;

/* renamed from: aioc */
final class aioc<T> implements ajdr<ainb<? extends T>> {
    private final ainb<T> a;

    public aioc(ainb<? extends T> ainb) {
        akcr.b(ainb, "query");
        this.a = ainb;
    }

    public final void subscribe(ajdq<ainb<T>> ajdq) {
        akcr.b(ajdq, Event.EMITTER);
        aiob aiob = new aiob(ajdq, this.a);
        ajdq.a((ajej) aiob);
        ainb ainb = this.a;
        a aVar = aiob;
        akcr.b(aVar, "listener");
        synchronized (ainb.i) {
            if (ainb.j.isEmpty()) {
                ainb.k.add(ainb);
            }
            ainb.j.add(aVar);
        }
        ajdq.a((Object) this.a);
    }
}

package defpackage;

import com.brightcove.player.event.Event;
import defpackage.zpq.a;

/* renamed from: zra */
public final class zra implements zpo {
    final a a;
    private final zpp b;

    /* renamed from: zra$a */
    static final class a<T> implements ajdr<T> {
        private /* synthetic */ zra a;
        private /* synthetic */ idd b;

        a(zra zra, idd idd) {
            this.a = zra;
            this.b = idd;
        }

        public final void subscribe(ajdq<zpp> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            if (!ajdq.isDisposed()) {
                ajdq.a(this.a.a.a(this.b));
            }
        }
    }

    public zra(zpp zpp, a aVar) {
        akcr.b(zpp, "unlockablesConnectorApi");
        akcr.b(aVar, "core");
        this.b = zpp;
        this.a = aVar;
    }

    public final ajdp<zpp> a(idd idd) {
        akcr.b(idd, "callsite");
        Object e = ajdp.a((ajdr) new a(this, idd)).e((ajdt) ajdp.b(this.b));
        akcr.a(e, "Observable.create<Unlock…unlockablesConnectorApi))");
        return e;
    }
}

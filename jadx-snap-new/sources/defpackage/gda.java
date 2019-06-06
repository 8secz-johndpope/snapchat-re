package defpackage;

import defpackage.ryx.h;

/* renamed from: gda */
public final class gda implements iey, ifj {
    volatile long a = -1;
    private final ihh b;

    /* renamed from: gda$a */
    static final class a extends akcq implements akbl<iff<h>, ajxw> {
        a(gda gda) {
            super(1, gda);
        }

        public final String getName() {
            return "onResponseStart";
        }

        public final akej getOwner() {
            return akde.a(gda.class);
        }

        public final String getSignature() {
            return "onResponseStart(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gda gda = (gda) this.receiver;
            akcr.b(iff, "event");
            Object a = ((h) iff.a).a.a();
            akcr.a(a, "event.payload.networkResult.response");
            if (a.a() > 0) {
                gda.a = iff.c.b;
            }
            return ajxw.a;
        }
    }

    public gda(ihh ihh) {
        akcr.b(ihh, "clock");
        this.b = ihh;
    }

    public final long a() {
        return this.a;
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "netEventBus");
        ifh.a(ifg, h.class, new a(this));
    }
}

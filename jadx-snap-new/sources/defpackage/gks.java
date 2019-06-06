package defpackage;

import defpackage.ggn.a;
import defpackage.ggn.b;

/* renamed from: gks */
public final class gks implements ifj {
    final ilv a;
    private final gku b;

    /* renamed from: gks$c */
    static final class c extends akcq implements akbl<iff<b>, ajxw> {
        c(gks gks) {
            super(1, gks);
        }

        public final String getName() {
            return "onResolveStarted";
        }

        public final akej getOwner() {
            return akde.a(gks.class);
        }

        public final String getSignature() {
            return "onResolveStarted(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new b((gks) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gks$d */
    static final class d extends akcq implements akbl<iff<a>, ajxw> {
        d(gks gks) {
            super(1, gks);
        }

        public final String getName() {
            return "onResolveEnded";
        }

        public final akej getOwner() {
            return akde.a(gks.class);
        }

        public final String getSignature() {
            return "onResolveEnded(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new a((gks) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gks$b */
    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ gks a;
        private /* synthetic */ iff b;

        b(gks gks, iff iff) {
            this.a = gks;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ggo ggo = ((defpackage.ggn.b) this.b.a).a;
            ilv ilv = this.a.a;
            akcr.b(ggo, "trackingInfo");
            ilv.c(gkt.a(inv.TOTAL_REQUEST_COUNT, ggo), 1);
            return ajxw.a;
        }
    }

    /* renamed from: gks$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ gks a;
        private /* synthetic */ iff b;

        a(gks gks, iff iff) {
            this.a = gks;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ggo ggo = ((defpackage.ggn.a) this.b.a).a;
            if (akcr.a(ggo.h, Boolean.TRUE)) {
                ilv ilv = this.a.a;
                String str = "trackingInfo";
                akcr.b(ggo, str);
                ilv.c(gkt.a(inv.SUCCESS_REQUEST_COUNT, ggo), 1);
                ilv = this.a.a;
                akcr.b(ggo, str);
                ilz a = gkt.a(inv.TOTAL_LATENCY, ggo);
                Long l = ggo.e;
                long j = -1;
                ilv.a(a, l != null ? l.longValue() : -1);
                ilv = this.a.a;
                akcr.b(ggo, str);
                ilz a2 = gkt.a(inv.CONTENT_MANAGER_LATENCY, ggo);
                Long l2 = ggo.f;
                if (l2 != null) {
                    j = l2.longValue();
                }
                ilv.a(a2, j);
            }
            return ajxw.a;
        }
    }

    public gks(ilv ilv, gku gku) {
        akcr.b(ilv, "graphene");
        akcr.b(gku, "contentResolverMetricsTracker");
        this.a = ilv;
        this.b = gku;
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "eventBus");
        gks gks = this;
        ifh.a(ifg, b.class, new c(gks));
        ifh.a(ifg, a.class, new d(gks));
    }
}

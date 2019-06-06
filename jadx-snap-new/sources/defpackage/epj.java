package defpackage;

import com.brightcove.player.event.Event;
import defpackage.dva.c;
import defpackage.dva.d;

/* renamed from: epj */
public final class epj implements dno {
    final ajwy<dus> a;
    final eal b;
    final ajdp<dva> c;
    private final ajxe d;

    /* renamed from: epj$a */
    static final class a extends akcs implements akbk<ajdw> {
        private /* synthetic */ zgb a;

        a(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(dnh.f.callsite("TimeoutControlActivator")).h();
        }
    }

    /* renamed from: epj$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ epj a;

        b(epj epj) {
            this.a = epj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((c) obj, "it");
            return ((dus) this.a.a.get()).a();
        }
    }

    /* renamed from: epj$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ epj a;

        c(epj epj) {
            this.a = epj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final dur dur = (dur) obj;
            akcr.b(dur, Event.CONFIGURATION);
            return this.a.c.b(d.class).p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    d dVar = (d) obj;
                    akcr.b(dVar, "it");
                    return new ajxm(dVar.b, dur);
                }
            });
        }
    }

    /* renamed from: epj$d */
    static final class d<T> implements ajfb<ajxm<? extends String, ? extends dur>> {
        private /* synthetic */ epj a;

        d(epj epj) {
            this.a = epj;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            String str = (String) ajxm.a;
            dur dur = (dur) ajxm.b;
            if (str != null) {
                akcr.b(str, "pageType");
                Long l = (Long) dur.a.get(str);
                this.a.b.a(l != null ? l.longValue() : 5000);
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(epj.class), "scheduler", "getScheduler()Lio/reactivex/Scheduler;");
    }

    public epj(ajwy<dus> ajwy, eal eal, zgb zgb, ajdp<dva> ajdp) {
        akcr.b(ajwy, "configurationFactory");
        akcr.b(eal, "timeout");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdp, "pageVisibilityTransitionObservable");
        this.a = ajwy;
        this.b = eal;
        this.c = ajdp;
        this.d = ajxh.a(new a(zgb));
    }

    public final ajej start() {
        Object f = this.c.b((ajdw) this.d.b()).b(c.class).d().c((ajfc) new b(this)).d((ajfc) new c(this)).f((ajfb) new d(this));
        akcr.a(f, "pageVisibilityTransition…      }\n                }");
        return f;
    }
}

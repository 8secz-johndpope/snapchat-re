package defpackage;

import com.brightcove.player.event.Event;
import defpackage.epb.a;

/* renamed from: epa */
public final class epa implements dno {
    final ajwy<a> a;
    private final zfw b = zgb.a(dnh.f.callsite("SwipeTooltipActivator"));
    private final ajwy<eph> c;

    /* renamed from: epa$a */
    static final class a<T> implements ajfl<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: epa$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ eph a;

        b(eph eph) {
            this.a = eph;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.c;
        }
    }

    /* renamed from: epa$c */
    static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: epa$d */
    static final class d<T, R> implements ajfc<T, ajdn<? extends R>> {
        final /* synthetic */ epa a;

        /* renamed from: epa$d$1 */
        static final class 1<T> implements ajdm<T> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final void a(ajdk<Boolean> ajdk) {
                akcr.b(ajdk, Event.EMITTER);
                ajdk.a(((a) this.a.a.a.get()).a());
            }
        }

        d(epa epa) {
            this.a = epa;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return ajdj.a((ajdm) new 1(this));
        }
    }

    public epa(zgb zgb, ajwy<a> ajwy, ajwy<eph> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "presenterProvider");
        akcr.b(ajwy2, "tooltipSettingsProvider");
        this.a = ajwy;
        this.c = ajwy2;
    }

    public final ajej start() {
        eph eph = (eph) this.c.get();
        Object i = eph.d.b((ajdw) this.b.f()).a((ajfl) a.a).b((ajfc) new b(eph)).a((ajfl) c.a).d().a((ajdw) this.b.l()).a((ajfc) new d(this)).i();
        akcr.a(i, "settings.isFriendsSwipeT…             .subscribe()");
        return i;
    }
}

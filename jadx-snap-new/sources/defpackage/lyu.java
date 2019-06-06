package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.lyx.b;
import defpackage.miw.b.a;
import java.util.concurrent.TimeUnit;

/* renamed from: lyu */
public final class lyu implements ajdu<b, b> {
    final ajxe a = ajxh.a(new c(this));
    final ajxe b = ajxh.a(new b(this));
    final ajxe c = ajxh.a(new d(this));
    final ajdp<Boolean> d;
    final miw e;
    final mhk f;

    /* renamed from: lyu$c */
    static final class c extends akcs implements akbk<ajdp<Boolean>> {
        final /* synthetic */ lyu a;

        /* renamed from: lyu$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                Object obj2 = (Long) ajxm.a;
                obj = (Long) ajxm.b;
                long a = this.a.a.f.a(TimeUnit.MILLISECONDS);
                akcr.a(obj, "lastShownTime");
                long longValue = a - obj.longValue();
                TimeUnit timeUnit = TimeUnit.MINUTES;
                akcr.a(obj2, "intervalInMinutes");
                return ((longValue > timeUnit.toMillis(obj2.longValue()) ? 1 : (longValue == timeUnit.toMillis(obj2.longValue()) ? 0 : -1)) >= 0 ? 1 : null) != null ? this.a.a.e.a().a((mje) mja.LENS_EXPLORER_BADGE_LAST_TIME_SHOWN_MILLIS, a).a().a((ajdt) ajdp.b(Boolean.TRUE)) : ajdp.b(Boolean.FALSE);
            }
        }

        c(lyu lyu) {
            this.a = lyu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = (ajdp) this.a.b.b();
            akcr.a(obj, "badgeShowIntervalMinutes");
            Object obj2 = (ajdp) this.a.c.b();
            akcr.a(obj2, "lastTimeBadgeShown");
            return ajwa.a(obj, obj2).u(new 1(this));
        }
    }

    /* renamed from: lyu$b */
    static final class b extends akcs implements akbk<ajdp<Long>> {
        private /* synthetic */ lyu a;

        b(lyu lyu) {
            this.a = lyu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.a(a.a).e(mja.LENS_EXPLORER_BADGE_SHOW_INTERVAL_MINUTES).c(1);
        }
    }

    /* renamed from: lyu$d */
    static final class d extends akcs implements akbk<ajdp<Long>> {
        private /* synthetic */ lyu a;

        d(lyu lyu) {
            this.a = lyu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.a(a.a).e(mja.LENS_EXPLORER_BADGE_LAST_TIME_SHOWN_MILLIS).c(1);
        }
    }

    /* renamed from: lyu$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lyu a;

        a(lyu lyu) {
            this.a = lyu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (b) obj;
            akcr.b(obj, MapboxEvent.KEY_MODEL);
            return obj instanceof b.b ? ajdp.b((ajdt) (ajdp) this.a.a.b(), (ajdt) this.a.d).p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "it");
                    return new b.b(((b.b) obj).a, bool.booleanValue());
                }
            }) : ajdp.b(obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lyu.class), "isBadgeNotSeenBefore", "isBadgeNotSeenBefore()Lio/reactivex/Observable;"), new akdc(akde.a(lyu.class), "badgeShowIntervalMinutes", "getBadgeShowIntervalMinutes()Lio/reactivex/Observable;"), new akdc(akde.a(lyu.class), "lastTimeBadgeShown", "getLastTimeBadgeShown()Lio/reactivex/Observable;")};
    }

    public lyu(ajdp<Boolean> ajdp, miw miw, mhk mhk) {
        akcr.b(ajdp, "highlightWhen");
        akcr.b(miw, "configurationRepository");
        akcr.b(mhk, "clock");
        this.d = ajdp;
        this.e = miw;
        this.f = mhk;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object u = ajdp.u(new a(this));
        akcr.a(u, "upstream.switchMap { mod…)\n            }\n        }");
        return (ajdt) u;
    }
}

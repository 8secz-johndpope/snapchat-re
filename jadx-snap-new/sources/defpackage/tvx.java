package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: tvx */
public final class tvx implements toe {
    final ajwy<tvy> a;
    private final String b = "LensesPreviewFeatureActivator";
    private final ajwy<ftl> c;

    /* renamed from: tvx$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ tvx a;

        a(tvx tvx) {
            this.a = tvx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Boolean bool = (Boolean) obj;
            akcr.b(bool, "lensesInCarouselEnabled");
            return ajdp.a((ajdr) new ajdr<T>(this) {
                private /* synthetic */ a a;

                public final void subscribe(ajdq<ajej> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    Object obj = bool;
                    akcr.a(obj, "lensesInCarouselEnabled");
                    if (obj.booleanValue() && !ajdq.isDisposed()) {
                        ajdq.a(((tvy) this.a.a.a.get()).e().start());
                    }
                }
            });
        }
    }

    public tvx(ajwy<tvy> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(ajwy, "featurePlugin");
        akcr.b(ajwy2, "configProvider");
        this.a = ajwy;
        this.c = ajwy2;
    }

    public final ajej start() {
        Object l = ((ftl) this.c.get()).b((fth) tum.LENSES_IN_FILTER_CAROUSEL).i().u(new a(this)).l();
        akcr.a(l, "configProvider.get().get…             .subscribe()");
        return l;
    }
}

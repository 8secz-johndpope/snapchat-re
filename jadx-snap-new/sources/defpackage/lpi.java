package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: lpi */
public interface lpi {

    /* renamed from: lpi$b */
    public static final class b implements lpi {
        public static final b a = new b();

        private b() {
        }

        public final ajej a(akbk<Boolean> akbk) {
            akcr.b(akbk, "handler");
            Object a = ajek.a(ajfu.b);
            akcr.a(a, "Disposables.empty()");
            return a;
        }

        public final ajdp<Object> b(akbk<Boolean> akbk) {
            akcr.b(akbk, "handler");
            return a.a(this, akbk);
        }
    }

    /* renamed from: lpi$a */
    public static final class a {

        /* renamed from: lpi$a$a */
        static final class a<T> implements ajdr<T> {
            private /* synthetic */ lpi a;
            private /* synthetic */ akbk b;

            a(lpi lpi, akbk akbk) {
                this.a = lpi;
                this.b = akbk;
            }

            public final void subscribe(ajdq<Object> ajdq) {
                akcr.b(ajdq, Event.EMITTER);
                if (!ajdq.isDisposed()) {
                    ajdq.a(this.a.a(this.b));
                    ajdq.a((Object) ajxw.a);
                }
            }
        }

        public static ajdp<Object> a(lpi lpi, akbk<Boolean> akbk) {
            akcr.b(akbk, "handler");
            Object a = ajdp.a((ajdr) new a(lpi, akbk));
            akcr.a(a, "Observable.create { emit…}\n            }\n        }");
            return a;
        }
    }

    ajej a(akbk<Boolean> akbk);

    ajdp<Object> b(akbk<Boolean> akbk);
}

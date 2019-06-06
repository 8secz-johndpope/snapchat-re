package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: mha */
public interface mha {

    /* renamed from: mha$a */
    public static final class a {

        /* renamed from: mha$a$a */
        static final class a<T> implements ajdr<T> {
            private /* synthetic */ mha a;

            a(mha mha) {
                this.a = mha;
            }

            public final void subscribe(ajdq<Object> ajdq) {
                akcr.b(ajdq, Event.EMITTER);
                if (!ajdq.isDisposed()) {
                    ajdq.a(this.a.a());
                    ajdq.a((Object) ajxw.a);
                }
            }
        }

        public static ajdp<Object> a(mha mha) {
            ajdp a = ajdp.a((ajdr) new a(mha));
            akcr.a((Object) a, "Observable.create<Any> {…}\n            }\n        }");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(mip.a((Object) mha));
            stringBuilder.append("#observe");
            return mip.b(a, stringBuilder.toString());
        }
    }

    /* renamed from: mha$b */
    public static final class b implements mha {
        public static final b a = new b();

        private b() {
        }

        public final ajej a() {
            Object a = ajek.a(ajfu.b);
            akcr.a(a, "Disposables.empty()");
            return a;
        }

        public final ajdp<Object> b() {
            return a.a(this);
        }
    }

    ajej a();

    ajdp<Object> b();
}

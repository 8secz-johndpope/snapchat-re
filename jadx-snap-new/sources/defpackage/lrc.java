package defpackage;

import defpackage.lsa.d;

/* renamed from: lrc */
public final class lrc implements mhi<mha> {
    final lsa a;
    final lpi b;

    /* renamed from: lrc$a */
    public static final class a implements mha {
        final /* synthetic */ lrc a;

        /* renamed from: lrc$a$a */
        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                d dVar = (d) obj;
                akcr.b(dVar, "it");
                return Boolean.valueOf(dVar instanceof defpackage.lsa.d.a);
            }
        }

        /* renamed from: lrc$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ a a;

            /* renamed from: lrc$a$b$1 */
            static final class 1 extends akcs implements akbk<Boolean> {
                private /* synthetic */ b a;

                1(b bVar) {
                    this.a = bVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    this.a.a.a.a.a().accept(defpackage.lsa.a.b.a);
                    return Boolean.FALSE;
                }
            }

            b(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "activated");
                if (bool.booleanValue()) {
                    return this.a.a.b.b(new 1(this));
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "Observable.empty()");
                return obj;
            }
        }

        a(lrc lrc) {
            this.a = lrc;
        }

        public final ajej a() {
            return this.a.a.b().p(a.a).j(ajfu.a).u(new b(this)).l();
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public lrc(lsa lsa, lpi lpi) {
        akcr.b(lsa, "carouselUseCase");
        akcr.b(lpi, "backPressInteractor");
        this.a = lsa;
        this.b = lpi;
    }

    public final /* synthetic */ Object a() {
        return new a(this);
    }
}

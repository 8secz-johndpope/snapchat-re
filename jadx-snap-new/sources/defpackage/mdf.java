package defpackage;

import defpackage.mec.a.b;
import defpackage.mec.c;

/* renamed from: mdf */
public final class mdf implements mhi<mha> {
    final lpi a;
    private final mdu b;

    /* renamed from: mdf$a */
    public static final class a implements mha {
        final /* synthetic */ mdf a;
        final /* synthetic */ mec b;

        /* renamed from: mdf$a$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ a a;

            /* renamed from: mdf$a$a$1 */
            static final class 1 extends akcs implements akbk<Boolean> {
                private /* synthetic */ a a;

                1(a aVar) {
                    this.a = aVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    this.a.a.b.a().accept(b.a);
                    return Boolean.TRUE;
                }
            }

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (c) obj;
                akcr.b(obj, "result");
                if (akcr.a(obj, defpackage.mec.c.a.a)) {
                    return this.a.a.a.b(new 1(this));
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "Observable.empty()");
                return obj;
            }
        }

        a(mdf mdf, mec mec) {
            this.a = mdf;
            this.b = mec;
        }

        public final ajej a() {
            return this.b.b().u(new a(this)).l();
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mdf(mdu mdu, lpi lpi) {
        akcr.b(mdu, "snappablesComponent");
        akcr.b(lpi, "backPressInteractor");
        this.b = mdu;
        this.a = lpi;
    }

    public final /* synthetic */ Object a() {
        return new a(this, this.b.i());
    }
}

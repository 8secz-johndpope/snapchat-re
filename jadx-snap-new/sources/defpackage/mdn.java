package defpackage;

import defpackage.mec.c.b;

/* renamed from: mdn */
public final class mdn implements mhi<mha> {
    final mdu a;
    final ajfb<lwo> b;

    /* renamed from: mdn$a */
    public static final class a implements mha {
        private /* synthetic */ mdn a;

        /* renamed from: mdn$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b;
            }
        }

        /* renamed from: mdn$a$b */
        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.mec.c.b) obj, "it");
                return defpackage.lwo.c.b.a;
            }
        }

        a(mdn mdn) {
            this.a = mdn;
        }

        public final ajej a() {
            Object a = this.a.a.i().b().a((ajfl) a.a).a(b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            a = a.p(b.a).f(this.a.b);
            akcr.a(a, "component.useCase.whenDe…be(captureActionConsumer)");
            return a;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mdn(mdu mdu, ajfb<lwo> ajfb) {
        akcr.b(mdu, "component");
        akcr.b(ajfb, "captureActionConsumer");
        this.a = mdu;
        this.b = ajfb;
    }

    public final /* synthetic */ Object a() {
        return new a(this);
    }
}

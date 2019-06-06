package defpackage;

import defpackage.nay.b.b;
import defpackage.nba.a;

/* renamed from: nai */
public final class nai implements nba {
    final ajws<a> a;
    final ajdp<nau> b;
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: nai$b */
    static final class b extends akcs implements akbk<ajdp<nau>> {
        final /* synthetic */ nai a;

        /* renamed from: nai$b$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((a) obj, "it");
                return this.a.a.b.c(1);
            }
        }

        b(nai nai) {
            this.a = nai;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f().u(new 1(this));
        }
    }

    /* renamed from: nai$a */
    static final class a<T> implements ajfb<defpackage.nba.a> {
        private /* synthetic */ nai a;

        a(nai nai) {
            this.a = nai;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a((Object) (defpackage.nba.a) obj);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nai.class), "results", "getResults()Lio/reactivex/Observable;");
    }

    public nai(nay nay) {
        akcr.b(nay, "userDataRepository");
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Us….Action>().toSerialized()");
        this.a = r;
        this.b = cfc.a(nay.a(b.a));
    }

    public final ajfb<a> a() {
        return new a(this);
    }

    public final ajdp<nau> b() {
        return (ajdp) this.c.b();
    }
}

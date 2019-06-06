package defpackage;

import defpackage.mhu.a;
import java.util.concurrent.TimeUnit;

/* renamed from: mhm */
final class mhm<I> implements mib<I> {
    final ajws<I> a;
    final long b = 0;
    final TimeUnit c;
    final ajdw d;
    private final ajxe e;
    private final ajxe f;
    private final akbk<Boolean> g;

    /* renamed from: mhm$a */
    static final class a extends akcs implements akbk<ajdp<I>> {
        private /* synthetic */ mhm a;

        a(mhm mhm) {
            this.a = mhm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f().c(this.a.b, this.a.c, this.a.d);
        }
    }

    /* renamed from: mhm$b */
    static final class b extends akcs implements akbk<ajfb<I>> {
        final /* synthetic */ mhm a;

        /* renamed from: mhm$b$1 */
        static final class 1<T> implements ajfb<I> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void accept(I i) {
                this.a.a.a.a((Object) i);
            }
        }

        b(mhm mhm) {
            this.a = mhm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new 1(this);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mhm.class), "delayedInputs", "getDelayedInputs()Lio/reactivex/Observable;"), new akdc(akde.a(mhm.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;")};
    }

    public mhm(long j, TimeUnit timeUnit, ajdw ajdw, akbk<Boolean> akbk) {
        akcr.b(timeUnit, "timeUnit");
        akcr.b(ajdw, "scheduler");
        akcr.b(akbk, "predicate");
        this.c = timeUnit;
        this.d = ajdw;
        this.g = akbk;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<I>().toSerialized()");
        this.a = r;
        this.e = ajxh.a(new a(this));
        this.f = ajxh.a(new b(this));
    }

    public final ajfb<I> a() {
        return (ajfb) this.f.b();
    }

    public final ajdp b() {
        return a.a();
    }

    public final /* synthetic */ Object invoke() {
        if (!((Boolean) this.g.invoke()).booleanValue()) {
            return this.a;
        }
        Object obj = (ajdp) this.e.b();
        akcr.a(obj, "delayedInputs");
        return obj;
    }
}

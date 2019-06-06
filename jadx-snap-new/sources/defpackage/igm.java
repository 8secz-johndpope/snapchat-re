package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: igm */
public final class igm<T> implements ajec<T, T> {
    int a;
    final ajdw b;
    final int c;
    final int d;
    final akbl<Throwable, Boolean> e;

    /* renamed from: igm$a */
    static final class a<T, R> implements ajfc<ajde<Throwable>, akuw<?>> {
        final /* synthetic */ igm a;
        final /* synthetic */ AtomicBoolean b;

        /* renamed from: igm$a$2 */
        static final class 2<T, R> implements ajfc<T, akuw<? extends R>> {
            private /* synthetic */ a a;

            2(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str;
                Throwable th = (Throwable) obj;
                akcr.b(th, "throwable");
                if ((this.a.a.c == 0 || this.a.a.a <= this.a.a.c) && ((Boolean) this.a.a.e.invoke(th)).booleanValue()) {
                    long pow = (long) Math.pow(2.0d, (double) this.a.a.a);
                    this.a.a.a = Math.min(this.a.a.a + 1, this.a.a.d);
                    obj = ajde.a(pow, TimeUnit.SECONDS, this.a.a.b);
                    str = "Flowable.timer(delay, TimeUnit.SECONDS, scheduler)";
                } else if (this.a.b.get()) {
                    obj = ajvo.a(ajke.b);
                    str = "Flowable.never<Throwable>()";
                } else {
                    obj = ajde.b(th);
                    str = "Flowable.error(throwable)";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        /* renamed from: igm$a$1 */
        static final class 1<T> implements ajfl<Throwable> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ boolean test(Object obj) {
                akcr.b((Throwable) obj, "it");
                return this.a.a.a <= this.a.a.c + 1;
            }
        }

        a(igm igm, AtomicBoolean atomicBoolean) {
            this.a = igm;
            this.b = atomicBoolean;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajde ajde = (ajde) obj;
            akcr.b(ajde, "it");
            if (this.a.c > 0) {
                Object 1 = new 1(this);
                ajfv.a(1, "predicate is null");
                ajde = ajvo.a(new ajlf(ajde, 1));
                akcr.a((Object) ajde, "errorPublisher.takeWhile… <= numberOfRetries + 1 }");
            }
            return ajde.c((ajfc) new 2(this));
        }
    }

    /* renamed from: igm$b */
    static final class b implements ajev {
        private /* synthetic */ AtomicBoolean a;

        b(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        public final void run() {
            this.a.set(true);
        }
    }

    /* renamed from: igm$1 */
    static final class 1 extends akcs implements akbl<Throwable, Boolean> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    public igm(ajdw ajdw, int i, int i2, akbl<? super Throwable, Boolean> akbl) {
        akcr.b(ajdw, "scheduler");
        akcr.b(akbl, "errorRetryable");
        this.b = ajdw;
        this.c = i;
        this.d = i2;
        this.e = akbl;
        this.a = 1;
    }

    public /* synthetic */ igm(ajdw ajdw, int i, int i2, akbl akbl, int i3) {
        if ((i3 & 2) != 0) {
            i = 5;
        }
        if ((i3 & 4) != 0) {
            i2 = 7;
        }
        if ((i3 & 8) != 0) {
            akbl = 1.a;
        }
        this(ajdw, i, i2, akbl);
    }

    public final ajeb<T> apply(ajdx<T> ajdx) {
        akcr.b(ajdx, "upstream");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object c = ajdx.j(new a(this, atomicBoolean)).c((ajev) new b(atomicBoolean));
        akcr.a(c, "upstream.retryWhen {\n   …posed.set(true)\n        }");
        return (ajeb) c;
    }
}

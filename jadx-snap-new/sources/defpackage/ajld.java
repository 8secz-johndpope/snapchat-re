package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajld */
public final class ajld<T, U> extends ajim<T, T> {
    private akuw<? extends U> c;

    /* renamed from: ajld$a */
    static final class a<T> extends AtomicInteger implements ajdh<T>, akuy {
        final akux<? super T> a;
        final AtomicReference<akuy> b = new AtomicReference();
        final ajul c = new ajul();
        final a d = new a();
        private AtomicLong e = new AtomicLong();

        /* renamed from: ajld$a$a */
        final class a extends AtomicReference<akuy> implements ajdh<Object> {
            a() {
            }

            public final void a() {
                ajui.a(a.this.b);
                akux akux = a.this.a;
                AtomicInteger atomicInteger = a.this;
                ajus.a(akux, atomicInteger, atomicInteger.c);
            }

            public final void a(akuy akuy) {
                ajui.a((AtomicReference) this, akuy, Long.MAX_VALUE);
            }

            public final void a(Object obj) {
                ajui.a((AtomicReference) this);
                a();
            }

            public final void a(Throwable th) {
                ajui.a(a.this.b);
                akux akux = a.this.a;
                AtomicInteger atomicInteger = a.this;
                ajus.a(akux, th, atomicInteger, atomicInteger.c);
            }
        }

        a(akux<? super T> akux) {
            this.a = akux;
        }

        public final void a() {
            ajui.a(this.d);
            ajus.a(this.a, (AtomicInteger) this, this.c);
        }

        public final void a(long j) {
            ajui.a(this.b, this.e, j);
        }

        public final void a(akuy akuy) {
            ajui.a(this.b, this.e, akuy);
        }

        public final void a(T t) {
            ajus.a(this.a, (Object) t, (AtomicInteger) this, this.c);
        }

        public final void a(Throwable th) {
            ajui.a(this.d);
            ajus.a(this.a, th, (AtomicInteger) this, this.c);
        }

        public final void b() {
            ajui.a(this.b);
            ajui.a(this.d);
        }
    }

    public ajld(ajde<T> ajde, akuw<? extends U> akuw) {
        super(ajde);
        this.c = akuw;
    }

    public final void a_(akux<? super T> akux) {
        ajdh aVar = new a(akux);
        akux.a((akuy) aVar);
        this.c.a(aVar.d);
        this.b.a(aVar);
    }
}

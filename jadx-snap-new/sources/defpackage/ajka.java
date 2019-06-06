package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajka */
public final class ajka extends ajde<Long> {
    private ajdw b;
    private long c;
    private long d;
    private TimeUnit e;

    /* renamed from: ajka$a */
    static final class a extends AtomicLong implements akuy, Runnable {
        private akux<? super Long> a;
        private long b;
        private AtomicReference<ajej> c = new AtomicReference();

        a(akux<? super Long> akux) {
            this.a = akux;
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a((AtomicLong) this, j);
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this.c, ajej);
        }

        public final void b() {
            ajfp.a(this.c);
        }

        public final void run() {
            if (this.c.get() != ajfp.DISPOSED) {
                akux akux;
                if (get() != 0) {
                    akux = this.a;
                    long j = this.b;
                    this.b = j + 1;
                    akux.a(Long.valueOf(j));
                    ajum.c(this, 1);
                    return;
                }
                akux = this.a;
                StringBuilder stringBuilder = new StringBuilder("Can't deliver value ");
                stringBuilder.append(this.b);
                stringBuilder.append(" due to lack of requests");
                akux.a(new ajeq(stringBuilder.toString()));
                ajfp.a(this.c);
            }
        }
    }

    public ajka(long j, long j2, TimeUnit timeUnit, ajdw ajdw) {
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.b = ajdw;
    }

    public final void a_(akux<? super Long> akux) {
        akuy aVar = new a(akux);
        akux.a(aVar);
        ajdw ajdw = this.b;
        if (ajdw instanceof ajtq) {
            ajej b = ajdw.b();
            aVar.a(b);
            b.a(aVar, this.c, this.d, this.e);
            return;
        }
        aVar.a(ajdw.a(aVar, this.c, this.d, this.e));
    }
}

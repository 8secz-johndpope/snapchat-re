package defpackage;

/* renamed from: adco */
public final class adco {
    final long a;
    final a b;
    Runnable c;
    boolean d = true;
    long e;

    /* renamed from: adco$a */
    public interface a {
        void a(Runnable runnable, long j);
    }

    /* renamed from: adco$b */
    class b implements Runnable {
        private final Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        public final void run() {
            Runnable runnable;
            this.a.run();
            synchronized (adco.this) {
                runnable = adco.this.c;
                if (runnable == null) {
                    adco.this.d = true;
                    adco.this.e = System.currentTimeMillis();
                } else {
                    adco.this.c = null;
                }
            }
            if (runnable != null) {
                adco.this.b.a(new b(runnable), adco.this.a);
            }
        }
    }

    public adco(long j, a aVar) {
        this.a = j;
        this.b = aVar;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.d) {
            this.d = false;
            this.b.a(new b(runnable), this.a - (System.currentTimeMillis() - this.e));
            return;
        }
        this.c = runnable;
    }
}

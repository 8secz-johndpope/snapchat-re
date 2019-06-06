package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zfi */
// Some kind of scheduler
final class zfi extends ajdw {
    private Executor a;
    private idd b;

    /* renamed from: zfi$a */
    public static final class a extends c implements Runnable {
        private Executor a;
        private idd b;
        private ajsz<Runnable> c;
        private volatile boolean d;
        private AtomicInteger e = new AtomicInteger();
        private ajei f = new ajei();

        /* renamed from: zfi$a$a */
        static final class a extends AtomicBoolean implements ajej, Runnable {
            private Runnable a;

            a(Runnable runnable) {
                this.a = runnable;
            }

            public final void dispose() {
                lazySet(true);
            }

            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: zfi$a$b */
        final class b implements Runnable {
            private final ajft a;
            private final Runnable b;

            b(ajft ajft, Runnable runnable) {
                this.a = ajft;
                this.b = runnable;
            }

            public final void run() {
                ajfp.c(this.a, a.this.a(this.b));
            }
        }

        public a(Executor executor, idd idd) {
            this.a = executor;
            this.b = idd;
            this.c = new ajsz();
        }

        public final ajej a(Runnable runnable) {
            if (this.d) {
                return ajfq.INSTANCE;
            }
            a aVar = new a(ajvo.a(zfj.a(this.b, runnable)));
            this.c.offer(aVar);
            if (this.e.getAndIncrement() == 0) {
                try {
                    this.a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.d = true;
                    this.c.clear();
                    ajvo.a(e);
                    return ajfq.INSTANCE;
                }
            }
            return aVar;
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return a(runnable);
            }
            if (this.d) {
                return ajfq.INSTANCE;
            }
            ajft ajft = new ajft();
            ajft ajft2 = new ajft(ajft);
            ajej ajtn = new ajtn(new b(ajft2, ajvo.a(zfj.a(this.b, runnable))), this.f);
            this.f.a(ajtn);
            try {
                ajtn.a(((ScheduledExecutorService) this.a).schedule(ajtn, j, timeUnit));
                ajfp.c(ajft, ajtn);
                return ajft2;
            } catch (RejectedExecutionException e) {
                this.d = true;
                ajvo.a(e);
                return ajfq.INSTANCE;
            }
        }

        public final void dispose() {
            if (!this.d) {
                this.d = true;
                this.f.dispose();
                if (this.e.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.d;
        }

        /* JADX WARNING: Missing block: B:12:0x0020, code skipped:
            if (r3.d == false) goto L_0x0026;
     */
        /* JADX WARNING: Missing block: B:13:0x0022, code skipped:
            r0.clear();
     */
        /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            return;
     */
        /* JADX WARNING: Missing block: B:15:0x0026, code skipped:
            r1 = r3.e.addAndGet(-r1);
     */
        /* JADX WARNING: Missing block: B:16:0x002d, code skipped:
            if (r1 != 0) goto L_0x0003;
     */
        /* JADX WARNING: Missing block: B:17:0x002f, code skipped:
            return;
     */
        public final void run() {
            /*
            r3 = this;
            r0 = r3.c;
            r1 = 1;
        L_0x0003:
            r2 = r3.d;
            if (r2 == 0) goto L_0x000b;
        L_0x0007:
            r0.clear();
            return;
        L_0x000b:
            r2 = r0.poll();
            r2 = (java.lang.Runnable) r2;
            if (r2 == 0) goto L_0x001e;
        L_0x0013:
            r2.run();
            r2 = r3.d;
            if (r2 == 0) goto L_0x000b;
        L_0x001a:
            r0.clear();
            return;
        L_0x001e:
            r2 = r3.d;
            if (r2 == 0) goto L_0x0026;
        L_0x0022:
            r0.clear();
            return;
        L_0x0026:
            r2 = r3.e;
            r1 = -r1;
            r1 = r2.addAndGet(r1);
            if (r1 != 0) goto L_0x0003;
        L_0x002f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zfi$a.run():void");
        }
    }

    zfi(Executor executor, idd idd) {
        this.a = executor;
        this.b = idd;
    }

    public final ajej a(Runnable runnable) {
        try {
            ajtm ajtm = new ajtm(ajvo.a(zfj.a(this.b, runnable)));
            ajtm.a(((ExecutorService) this.a).submit(ajtm));
            return ajtm;
        } catch (RejectedExecutionException e) {
            ajvo.a(e);
            return ajfq.INSTANCE;
        }
    }

    public final ajej a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        try {
            ajtl ajtl = new ajtl(ajvo.a(zfj.a(this.b, runnable)));
            ajtl.a(((ScheduledExecutorService) this.a).scheduleAtFixedRate(ajtl, j, j2, timeUnit));
            return ajtl;
        } catch (RejectedExecutionException e) {
            ajvo.a(e);
            return ajfq.INSTANCE;
        }
    }

    public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            ajtm ajtm = new ajtm(ajvo.a(zfj.a(this.b, runnable)));
            ajtm.a(((ScheduledExecutorService) this.a).schedule(ajtm, j, timeUnit));
            return ajtm;
        } catch (RejectedExecutionException e) {
            ajvo.a(e);
            return ajfq.INSTANCE;
        }
    }

    public final c b() {
        return new a(this.a, this.b);
    }
}

package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;

/* renamed from: ajeg */
final class ajeg extends ajdw {
    private final Handler a;
    private final boolean b = false;

    /* renamed from: ajeg$a */
    static final class a extends c {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        a(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        @SuppressLint({"NewApi"})
        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.c) {
                return ajfq.INSTANCE;
            } else {
                b bVar = new b(this.a, ajvo.a(runnable));
                Message obtain = Message.obtain(this.a, bVar);
                obtain.obj = this;
                if (this.b) {
                    obtain.setAsynchronous(true);
                }
                this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.c) {
                    return bVar;
                }
                this.a.removeCallbacks(bVar);
                return ajfq.INSTANCE;
            }
        }

        public final void dispose() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        public final boolean isDisposed() {
            return this.c;
        }
    }

    /* renamed from: ajeg$b */
    static final class b implements ajej, Runnable {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public final void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        public final boolean isDisposed() {
            return this.c;
        }

        public final void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                ajvo.a(th);
            }
        }
    }

    ajeg(Handler handler) {
        this.a = handler;
    }

    public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            b bVar = new b(this.a, ajvo.a(runnable));
            this.a.postDelayed(bVar, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final c b() {
        return new a(this.a, false);
    }
}

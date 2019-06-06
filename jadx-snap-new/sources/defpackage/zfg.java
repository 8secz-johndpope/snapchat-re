package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;

/* renamed from: zfg */
public final class zfg extends zfr {
    private static final Supplier<Boolean> e = Suppliers.memoize(-$$Lambda$zfg$J-x3kwBzA7PSsoiTgxP0I_rrKBo.INSTANCE);
    private final Handler a;
    private final boolean b;
    private final idd d;

    /* renamed from: zfg$b */
    static final class b implements ajej, Runnable {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        private static void a(Throwable th) {
            ajvo.a(th);
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }

        public final void dispose() {
            this.c = true;
            this.a.removeCallbacks(this);
        }

        public final boolean isDisposed() {
            return this.c;
        }

        public final void run() {
            try {
                this.b.run();
            } catch (InternalError e) {
                b.a(e);
            } catch (Throwable th) {
                b.a(new IllegalStateException("Fatal Exception thrown on Scheduler.", th));
            }
        }
    }

    /* renamed from: zfg$a */
    static final class a extends c {
        private final Handler a;
        private final boolean b;
        private final idd c;
        private volatile boolean d;

        a(Handler handler, boolean z, idd idd) {
            this.a = handler;
            this.b = z;
            this.c = idd;
        }

        public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.d) {
                return ajfq.INSTANCE;
            } else {
                b bVar = new b(this.a, ajvo.a(zfj.a(this.c, runnable)));
                Message obtain = Message.obtain(this.a, bVar);
                obtain.obj = this;
                if (this.b) {
                    obtain.setAsynchronous(true);
                }
                this.a.sendMessageDelayed(obtain, Math.max(0, timeUnit.toMillis(j)));
                if (!this.d) {
                    return bVar;
                }
                this.a.removeCallbacks(bVar);
                return ajfq.INSTANCE;
            }
        }

        public final void dispose() {
            this.d = true;
            this.a.removeCallbacksAndMessages(this);
        }

        public final boolean isDisposed() {
            return this.d;
        }
    }

    public zfg(Handler handler, idd idd) {
        this(handler, ((Boolean) e.get()).booleanValue(), idd);
    }

    private zfg(Handler handler, boolean z, idd idd) {
        this.a = handler;
        this.b = z;
        this.d = idd;
    }

    private static /* synthetic */ Boolean d() {
        boolean z = VERSION.SDK_INT >= 16;
        if (z && VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                z = false;
            }
            obtain.recycle();
        }
        return Boolean.valueOf(z);
    }

    public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            b bVar = new b(this.a, ajvo.a(zfj.a(this.d, runnable)));
            this.a.postDelayed(bVar, Math.max(0, timeUnit.toMillis(j)));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final Looper a() {
        return this.a.getLooper();
    }

    public final c b() {
        return new a(this.a, this.b, this.d);
    }
}

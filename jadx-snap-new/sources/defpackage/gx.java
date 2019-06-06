package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: gx */
// AsyncTaskLoader
public abstract class gx<D> extends hb<D> {
    volatile a a;
    volatile a b;
    long c;
    private final Executor l;

    /* renamed from: gx$a */
    final class a extends hd<Void, Void, D> implements Runnable {
        boolean a;
        private final CountDownLatch f = new CountDownLatch(1);

        a() {
        }

        private D b() {
            try {
                return gx.this.d();
            } catch (il e) {
                if (this.d.get()) {
                    return null;
                }
                throw e;
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object a() {
            return b();
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(D d) {
            try {
                gx gxVar = gx.this;
                if (gxVar.a != this) {
                    gxVar.a(this, d);
                } else if (gxVar.h) {
                    gxVar.a(d);
                } else {
                    gxVar.k = false;
                    gxVar.c = SystemClock.uptimeMillis();
                    gxVar.a = null;
                    gxVar.b(d);
                }
                this.f.countDown();
            } catch (Throwable th) {
                this.f.countDown();
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void b(D d) {
            try {
                gx.this.a(this, d);
            } finally {
                this.f.countDown();
            }
        }

        public final void run() {
            this.a = false;
            gx.this.c();
        }
    }

    public gx(Context context) {
        this(context, hd.b);
    }

    private gx(Context context, Executor executor) {
        super(context);
        this.c = -10000;
        this.l = executor;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        super.a();
        j();
        this.a = new a();
        c();
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar, D d) {
        a(d);
        if (this.b == aVar) {
            if (this.k) {
                n();
            }
            this.c = SystemClock.uptimeMillis();
            this.b = null;
            c();
        }
    }

    public void a(D d) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(str2);
            printWriter.println(this.a.a);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.b);
            printWriter.print(str2);
            printWriter.println(this.b.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        if (this.a == null) {
            return false;
        }
        if (!this.g) {
            this.j = true;
        }
        Handler handler = null;
        if (this.b != null) {
            if (this.a.a) {
                this.a.a = false;
                handler.removeCallbacks(this.a);
            }
            this.a = handler;
            return false;
        } else if (this.a.a) {
            this.a.a = false;
            handler.removeCallbacks(this.a);
            this.a = handler;
            return false;
        } else {
            a aVar = this.a;
            aVar.d.set(true);
            boolean cancel = aVar.c.cancel(false);
            if (cancel) {
                this.b = this.a;
                e();
            }
            this.a = handler;
            return cancel;
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (this.b == null && this.a != null) {
            if (this.a.a) {
                this.a.a = false;
                Handler handler = null;
                handler.removeCallbacks(this.a);
            }
            this.a.a(this.l);
        }
    }

    public abstract D d();

    public void e() {
    }
}

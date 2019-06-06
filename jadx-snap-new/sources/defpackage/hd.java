package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hd */
abstract class hd<Params, Progress, Result> {
    private static final ThreadFactory a = new 1();
    public static final Executor b;
    private static final BlockingQueue<Runnable> f = new LinkedBlockingQueue(10);
    private static b g;
    private static volatile Executor h;
    final FutureTask<Result> c = new FutureTask<Result>(this.i) {
        /* Access modifiers changed, original: protected|final */
        public final void done() {
            String str = "An error occurred while executing doInBackground()";
            try {
                hd.this.c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(str, e2.getCause());
            } catch (CancellationException unused) {
                hd.this.c(null);
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException(str, th);
            }
        }
    };
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    private final d<Params, Result> i = new 2();
    private volatile int j = 1;

    /* renamed from: hd$d */
    static abstract class d<Params, Result> implements Callable<Result> {
        Params[] a;

        d() {
        }
    }

    /* renamed from: hd$b */
    static class b extends Handler {
        b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what == 1) {
                aVar.a.e(aVar.b[0]);
            }
        }
    }

    /* renamed from: hd$1 */
    static class 1 implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        1() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("ModernAsyncTask #");
            stringBuilder.append(this.a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: hd$2 */
    class 2 extends d<Params, Result> {
        2() {
        }

        public final Result call() {
            hd.this.e.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = hd.this.a();
                Binder.flushPendingCommands();
                hd.this.d(obj);
                return obj;
            } catch (Throwable th) {
                hd.this.d(obj);
            }
        }
    }

    /* renamed from: hd$a */
    static class a<Data> {
        final hd a;
        final Data[] b;

        a(hd hdVar, Data... dataArr) {
            this.a = hdVar;
            this.b = dataArr;
        }
    }

    /* renamed from: hd$4 */
    static /* synthetic */ class 4 {
        static final /* synthetic */ int[] a = new int[c.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.hd.c.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x000e }
            r1 = 1;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x000e }
        L_0x000e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0013 }
            r1 = 2;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x0013 }
        L_0x0013:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hd$4.<clinit>():void");
        }
    }

    /* renamed from: hd$c */
    public enum c {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f, a);
        b = threadPoolExecutor;
        h = threadPoolExecutor;
    }

    hd() {
    }

    private static Handler b() {
        b bVar;
        synchronized (hd.class) {
            if (g == null) {
                g = new b();
            }
            bVar = g;
        }
        return bVar;
    }

    public final hd<Params, Progress, Result> a(Executor executor) {
        if (this.j != 1) {
            int i = 4.a[this.j - 1];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.j = 2;
        this.i.a = null;
        executor.execute(this.c);
        return this;
    }

    public abstract Result a();

    /* Access modifiers changed, original: protected */
    public void a(Result result) {
    }

    /* Access modifiers changed, original: protected */
    public void b(Result result) {
    }

    /* Access modifiers changed, original: final */
    public final void c(Result result) {
        if (!this.e.get()) {
            d(result);
        }
    }

    /* Access modifiers changed, original: final */
    public final Result d(Result result) {
        hd.b().obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* Access modifiers changed, original: final */
    public final void e(Result result) {
        if (this.d.get()) {
            b(result);
        } else {
            a((Object) result);
        }
        this.j = 3;
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
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

/* renamed from: airs */
public abstract class airs<Params, Progress, Result> {
    public static final Executor a = new ThreadPoolExecutor(f, g, 1, TimeUnit.SECONDS, i, h);
    private static final int e;
    private static final int f;
    private static final int g = ((e << 1) + 1);
    private static final ThreadFactory h = new 1();
    private static final BlockingQueue<Runnable> i = new LinkedBlockingQueue(128);
    private static Executor j = new c();
    private static final b k = new b();
    private static volatile Executor l = j;
    volatile int b = 1;
    protected final AtomicBoolean c = new AtomicBoolean();
    final AtomicBoolean d = new AtomicBoolean();
    private final e<Params, Result> m = new 2();
    private final FutureTask<Result> n = new FutureTask<Result>(this.m) {
        /* Access modifiers changed, original: protected|final */
        public final void done() {
            try {
                airs.a(airs.this, get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                airs.a(airs.this, null);
            }
        }
    };

    /* renamed from: airs$b */
    static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what == 1) {
                airs.a(aVar.a);
            }
        }
    }

    /* renamed from: airs$1 */
    static class 1 implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        1() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("AsyncTask #");
            stringBuilder.append(this.a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: airs$c */
    static class c implements Executor {
        private LinkedList<Runnable> a;
        private Runnable b;

        private c() {
            this.a = new LinkedList();
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* Access modifiers changed, original: protected|final|declared_synchronized */
        public final synchronized void a() {
            Runnable runnable = (Runnable) this.a.poll();
            this.b = runnable;
            if (runnable != null) {
                airs.a.execute(this.b);
            }
        }

        public final synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        c.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }
    }

    /* renamed from: airs$2 */
    class 2 extends e<Params, Result> {
        2() {
            super();
        }

        public final Result call() {
            airs.this.d.set(true);
            Process.setThreadPriority(10);
            airs airs = airs.this;
            return airs.a_(airs.e());
        }
    }

    /* renamed from: airs$e */
    static abstract class e<Params, Result> implements Callable<Result> {
        Params[] a;

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }
    }

    /* renamed from: airs$a */
    static class a<Data> {
        final airs a;
        final Data[] b;

        a(airs airs, Data... dataArr) {
            this.a = airs;
            this.b = dataArr;
        }
    }

    /* renamed from: airs$4 */
    static /* synthetic */ class 4 {
        static final /* synthetic */ int[] a = new int[d.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.airs.d.a();
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.airs$4.<clinit>():void");
        }
    }

    /* renamed from: airs$d */
    public enum d {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        e = availableProcessors;
        f = availableProcessors + 1;
    }

    static /* synthetic */ void a(airs airs) {
        if (airs.c.get()) {
            airs.d();
        } else {
            airs.c();
        }
        airs.b = 3;
    }

    public final airs<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.b != 1) {
            int i = 4.a[this.b - 1];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.b = 2;
        b();
        this.m.a = paramsArr;
        executor.execute(this.n);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final Result a_(Result result) {
        k.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public void c() {
    }

    /* Access modifiers changed, original: protected */
    public void d() {
    }

    public abstract Result e();

    public final boolean f() {
        this.c.set(true);
        return this.n.cancel(true);
    }
}

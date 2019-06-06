package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: akol */
public abstract class akol<Params, Progress, Result> {
    static final int a = Math.max(2, Math.min(h - 1, 4));
    static final int b = ((h << 1) + 1);
    static final ThreadFactory c = new 1();
    static final BlockingQueue<Runnable> d = new ArrayBlockingQueue(128);
    public static final Executor e = new b();
    private static final int h = Runtime.getRuntime().availableProcessors();
    private static volatile Executor i = new d();
    public final FutureTask<Result> f;
    public final AtomicBoolean g;
    private final AtomicBoolean j;
    private final Handler k;

    /* renamed from: akol$1 */
    class 1 implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        1() {
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("AsyncTask #");
            stringBuilder.append(this.a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: akol$a */
    static class a<Data> {
        private akol a;
        private Data[] b;

        a(akol akol, Data... dataArr) {
            this.a = akol;
            this.b = dataArr;
        }
    }

    /* renamed from: akol$b */
    public static class b extends ThreadPoolExecutor {
        b() {
            this(akol.a, akol.b, TimeUnit.SECONDS, akol.d, akol.c);
        }

        private b(int i, int i2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
            super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
            allowCoreThreadTimeOut(true);
        }

        private static String a(Runnable runnable) {
            Class cls = runnable.getClass();
            try {
                if (cls == c.class) {
                    cls = ((c) runnable).a.getClass();
                } else if (cls.getEnclosingClass() == AsyncTask.class) {
                    Field declaredField = cls.getDeclaredField("this$0");
                    declaredField.setAccessible(true);
                    cls = declaredField.get(runnable).getClass();
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            return cls.getName();
        }

        private static String a(Map<String, Integer> map) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    stringBuilder.append((String) entry.getKey());
                    stringBuilder.append(' ');
                }
            }
            return stringBuilder.length() == 0 ? "NO CLASSES FOUND" : stringBuilder.toString();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0057 in {2, 8, 9, 10, 12} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void execute(java.lang.Runnable r8) {
            /*
            r7 = this;
            super.execute(r8);	 Catch:{ RejectedExecutionException -> 0x0004 }
            return;
            r8 = move-exception;
            r0 = new java.util.HashMap;
            r0.<init>();
            r1 = r7.getQueue();
            r2 = 0;
            r3 = new java.lang.Runnable[r2];
            r1 = r1.toArray(r3);
            r1 = (java.lang.Runnable[]) r1;
            r3 = r1.length;
            r4 = 0;
            if (r4 >= r3) goto L_0x003f;
            r5 = r1[r4];
            r5 = defpackage.akol.b.a(r5);
            r6 = r0.containsKey(r5);
            if (r6 == 0) goto L_0x0032;
            r6 = r0.get(r5);
            r6 = (java.lang.Integer) r6;
            r6 = r6.intValue();
            goto L_0x0033;
            r6 = 0;
            r6 = r6 + 1;
            r6 = java.lang.Integer.valueOf(r6);
            r0.put(r5, r6);
            r4 = r4 + 1;
            goto L_0x0019;
            r1 = new java.util.concurrent.RejectedExecutionException;
            r2 = new java.lang.StringBuilder;
            r3 = "Prominent classes in AsyncTask: ";
            r2.<init>(r3);
            r0 = defpackage.akol.b.a(r0);
            r2.append(r0);
            r0 = r2.toString();
            r1.<init>(r0, r8);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akol$b.execute(java.lang.Runnable):void");
        }
    }

    /* renamed from: akol$c */
    class c extends FutureTask<Result> {
        final /* synthetic */ akol a;

        /* Access modifiers changed, original: protected */
        public void done() {
            try {
                akol.a(this.a, get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                akol.a(this.a, null);
            }
        }
    }

    /* renamed from: akol$d */
    static class d implements Executor {
        private ArrayDeque<Runnable> a;
        private Runnable b;

        private d() {
            this.a = new ArrayDeque();
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* Access modifiers changed, original: protected|final|declared_synchronized */
        public final synchronized void a() {
            Runnable runnable = (Runnable) this.a.poll();
            this.b = runnable;
            if (runnable != null) {
                akol.e.execute(this.b);
            }
        }

        public final synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        d.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }
    }

    /* renamed from: akol$e */
    static class e implements RejectedExecutionHandler {
        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            akol.e.execute(runnable);
        }
    }

    static {
        e eVar = new e();
    }

    static /* synthetic */ void a(akol akol, Object obj) {
        if (!akol.j.get()) {
            akol.k.obtainMessage(1, new a(akol, obj)).sendToTarget();
        }
    }
}

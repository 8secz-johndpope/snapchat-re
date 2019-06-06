package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.opencv.imgproc.Imgproc;

/* renamed from: zgd */
// SnapScheduling
public final class zgd {
	public static final ThreadLocal<idd> a = new ThreadLocal();
	static final int b;
	public static final ide c = new ide("DefaultSchedulers", idi.APP_PLATFORM) {
		};
	public static final AtomicReference<aipn<zfq>> d = new AtomicReference();
	public static final Supplier<zfl> e = Suppliers.memoize(-$$Lambda$zgd$_R-z0txf_jQjv_F4cRHN4cS1XBw.INSTANCE);
	static final Supplier<ScheduledThreadPoolExecutor> f = Suppliers.memoize(-$$Lambda$zgd$l4GdDvBJNkYpebjMOooMetZIr0E.INSTANCE);
	static final Supplier<ScheduledThreadPoolExecutor> g = Suppliers.memoize(-$$Lambda$zgd$DWWa-IMoWG2uyITiDBNG10U6r2Q.INSTANCE);
	static final Supplier<ScheduledThreadPoolExecutor> h = Suppliers.memoize(-$$Lambda$zgd$ImQ6dRQoiCrzoPrMSFBUV4H8g5o.INSTANCE);
	static final Supplier<ajdw> i = Suppliers.memoize(-$$Lambda$zgd$P8TEczPODTvPg8A6CPVAvjckm9w.INSTANCE);
	static final Supplier<ScheduledThreadPoolExecutor> j = Suppliers.memoize(-$$Lambda$zgd$f9LewQpx-tY2dWGJs3df85UvEq0.INSTANCE);
	static final Supplier<ScheduledThreadPoolExecutor> k = Suppliers.memoize(-$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ.INSTANCE);
	static final Supplier<Handler> l = Suppliers.memoize(-$$Lambda$zgd$4iPL18EHNl090mM6glhx8oxzm3s.INSTANCE); // SHARED_HANDLER
	static final Supplier<Handler> m = Suppliers.memoize(-$$Lambda$zgd$6QTqnTVkoJP0MgNVfzT_I6FP6qI.INSTANCE);
	static final Supplier<zfp> n = Suppliers.memoize(-$$Lambda$zgd$7emlAWOvo-bwoJampJZHDSwyC68.INSTANCE);
	static final Supplier<zfp> o = Suppliers.memoize(-$$Lambda$zgd$Py3s6WLZrFOYd3UDbvrnY6bxpkU.INSTANCE);
	static final Supplier<zfp> p = Suppliers.memoize(-$$Lambda$zgd$e4WT9TlxdbVZ5LCx30WlzTPPx3g.INSTANCE);
	static final Supplier<zfp> q = Suppliers.memoize(-$$Lambda$zgd$n_C2oN7V4G3KnumLJga7dNOZV9I.INSTANCE);
	public static final Supplier<zfp> r = Suppliers.memoize(-$$Lambda$zgd$Vq-iV3k1GY-Lez8HP-DDGuEEzjI.INSTANCE);
	static final Supplier<zfk> s = Suppliers.memoize(-$$Lambda$zgd$ds-pXaRsjRMXYN9Qmd7kBQijJwk.INSTANCE);
	private static int t;
	private static int u;
	private static int v;
	private static final AtomicBoolean w = new AtomicBoolean(false);
	private static Supplier<ScheduledThreadPoolExecutor> x = Suppliers.memoize(-$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk.INSTANCE);

	/* renamed from: zgd$3 */
	static class 3 extends Thread {
		private final Object a;
		private volatile Looper b;
		private /* synthetic */ int c = -3;

		3(String str, long j, int i) {
			super(null, null, str, j);
			this.a = new Object();
		}

		private /* synthetic */ void b() {
			super.start();
		}

		/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
		    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x002f in {11, 13, 16, 19} preds:[]
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
		final android.os.Looper a() {
			/*
			  r2 = this;
			  r2.start();
			  r0 = r2.a;
			  monitor-enter(r0);
			  r1 = r2.isAlive();	 Catch:{ all -> 0x002c }
			  if (r1 == 0) goto L_0x0028;	 Catch:{ all -> 0x002c }
			  r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002c }
			  r1 = r1.isInterrupted();	 Catch:{ all -> 0x002c }
			  if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x002c }
			  r1 = r2.b;	 Catch:{ all -> 0x002c }
			  if (r1 != 0) goto L_0x0028;
			  r1 = r2.a;	 Catch:{ InterruptedException -> 0x0020 }
			  r1.wait();	 Catch:{ InterruptedException -> 0x0020 }
			  goto L_0x0006;
			  L_0x0020:
			  r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002c }
			  r1.interrupt();	 Catch:{ all -> 0x002c }
			  goto L_0x0006;	 Catch:{ all -> 0x002c }
			  r1 = r2.b;	 Catch:{ all -> 0x002c }
			  monitor-exit(r0);	 Catch:{ all -> 0x002c }
			  return r1;	 Catch:{ all -> 0x002c }
			  r1 = move-exception;	 Catch:{ all -> 0x002c }
			  monitor-exit(r0);	 Catch:{ all -> 0x002c }
			  throw r1;
			  return;
			*/
			throw new UnsupportedOperationException("Method not decompiled: defpackage.zgd$3.a():android.os.Looper");
		}

		public final void run() {
			Looper.prepare();
			synchronized (this.a) {
				this.b = Looper.myLooper();
				this.a.notifyAll();
			}
			Process.setThreadPriority(this.c);
			Looper.loop();
		}

		public final synchronized void start() {
			zgd.a(new -$$Lambda$zgd$3$WXbvUfPzCaKxF49iLzZZcyYKLLU(this));
		}
	}

	static {
		int i = (VERSION.SDK_INT >= 21 || zgd.b()) ? 0 : Imgproc.FLOODFILL_FIXED_RANGE;
		b = i;
		i = Runtime.getRuntime().availableProcessors();
		if (i >= 8) {
			t = 6;
			v = 4;
			u = 6;
		} else {
			if (i >= 6) {
				t = 4;
				v = 3;
			} else if (i >= 4) {
				t = 4;
				v = 2;
			} else {
				t = 2;
				v = 2;
				u = 4;
			}
			u = 5;
		}
	}

	public static Looper a(String str) {
		try {
			in.a("startNewThreadWithLooper");
			Looper a = new 3(str, (long) b, -3).a();
			return a;
		} finally {
			in.a();
		}
	}

	private static ScheduledThreadPoolExecutor a(int i, ThreadFactory threadFactory) {
		return new ScheduledThreadPoolExecutor(i, threadFactory) {
			/* Access modifiers changed, original: protected|final */
			public final void afterExecute(Runnable runnable, Throwable th) {
				super.afterExecute(runnable, th);
			}

			/* Access modifiers changed, original: protected|final */
			public final void beforeExecute(Thread thread, Runnable runnable) {
				super.beforeExecute(thread, runnable);
			}
		};
	}

	private static ThreadFactory a(String str, int i) {
		return new zff(str, i);
	}

	public static void a() {
		if (w.compareAndSet(false, true)) {
			zfy zfy = new zfy("global");
			zfw a = zfy.a(c.callsite("scheduler"));
			ajee.a = new -$$Lambda$zgd$Fi5tPxs83wCPXKXedF3XZ7oinFU(a);
			ajvo.b = new -$$Lambda$zgd$erYX3Lg6n1zYCNmXjxPScDOALXA(a);
			ajvo.d = new -$$Lambda$zgd$IfPITDXR-nnaYRlRLPUll8VxqJM(a);
			ajvo.c = -$$Lambda$zgd$HIRD9GtP5pW3407Hm34cg30CTOk.INSTANCE;
			if (ajwh.b != a.b()) {
				throw new IllegalStateException("Schedulers not initialized in time!");
			}
		}
	}

	public static void a(ajfb<? super Throwable> ajfb) {
		ajvo.a = new -$$Lambda$zgd$tTWrnvhKyxJnwulErf4Za_Inmdg(ajfb, ajvo.a);
	}

	private static /* synthetic */ void a(ajfb ajfb, ajfb ajfb2, Throwable th) {
		try {
			ajfb.accept(th);
		} catch (Exception e) {
			if (ajfb2 != null) {
				ajfb2.accept(e);
				return;
			}
			throw e;
		}
	}

	public static void a(idd idd) {
		if (idd == null) {
			a.remove();
		} else {
			a.set(idd);
		}
	}

	public static void a(Runnable runnable) {
		try {
			runnable.run();
		} catch (InternalError e) {
			if ("Thread starting during runtime shutdown".equals(e.getMessage())) {
				Log.d("SnapScheduling", "Thread start encountered an exception during JVM shutdown", e);
				return;
			}
			throw e;
		}
	}

	private static zfp b(String str) {
		return new zfp(str, (long) b);
	}

	private static boolean b() {
		Object property = System.getProperty("java.vm.version");
		if (!(property == null || property.isEmpty())) {
			String[] split = property.split("\\.");
			if (split.length > 0) {
				try {
					property = Integer.parseInt(split[0]);
					return property >= 2;
				} catch (NumberFormatException e) {
					Log.e("SnapScheduling", "Failed to parse vm version from: ".concat(String.valueOf(property)), e);
				}
			}
		}
		return false;
	}

	private static /* synthetic */ zfp d() {
		zfp b = zgd.b("df-db-writer");
		b.getClass();
		zgd.a(new -$$Lambda$iDqxjEqrq_J0hjTyXJZaTT8rMzo(b));
		return b;
	}

	private static /* synthetic */ zfp e() {
		zfp b = zgd.b("sticker-db-writer");
		b.getClass();
		zgd.a(new -$$Lambda$iDqxjEqrq_J0hjTyXJZaTT8rMzo(b));
		return b;
	}

	private static /* synthetic */ zfp f() {
		zfp b = zgd.b("mem-db-writer");
		b.getClass();
		zgd.a(new -$$Lambda$iDqxjEqrq_J0hjTyXJZaTT8rMzo(b));
		return b;
	}

	private static /* synthetic */ zfp g() {
		zfp b = zgd.b("platform-db-writer");
		b.getClass();
		zgd.a(new -$$Lambda$iDqxjEqrq_J0hjTyXJZaTT8rMzo(b));
		return b;
	}

	private static /* synthetic */ zfp h() {
		zfp b = zgd.b("db writer");
		b.getClass();
		zgd.a(new -$$Lambda$iDqxjEqrq_J0hjTyXJZaTT8rMzo(b));
		return b;
	}

	private static /* synthetic */ Handler i() {
		HandlerThread handlerThread = new HandlerThread("LocationHand", 10);
		handlerThread.getClass();
		zgd.a(new -$$Lambda$UvMLIrSGXSmtHfdoFQCXvCU1eMw(handlerThread));
		return new Handler(handlerThread.getLooper());
	}

	private static /* synthetic */ Handler j() {
		HandlerThread handlerThread = new HandlerThread("QSHand", 10);
		handlerThread.getClass();
		zgd.a(new -$$Lambda$UvMLIrSGXSmtHfdoFQCXvCU1eMw(handlerThread));
		return new Handler(handlerThread.getLooper());
	}

	private static /* synthetic */ ScheduledThreadPoolExecutor o() {
		ScheduledThreadPoolExecutor a = zgd.a(u, zgd.a("IO", 10));
		a.setKeepAliveTime(1, TimeUnit.MINUTES);
		a.allowCoreThreadTimeOut(true);
		return a;
	}
}

package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zff */
public final class zff implements ThreadFactory {
	final int a;
	private final AtomicInteger b = new AtomicInteger(0);
	private final String c; // name

	/* renamed from: zff$a */
	public static final class a extends Thread {
		private /* synthetic */ zff a;
		private /* synthetic */ Runnable b;

		/* renamed from: zff$a$a */
		static final class a implements Runnable {
			private /* synthetic */ a a;

			a(a aVar) {
				this.a = aVar;
			}

			public final void run() {
				super.start();
			}
		}

		a(zff zff, Runnable runnable, ThreadGroup threadGroup, long j) {
			this.a = zff;
			this.b = runnable;
			super(null, null, threadGroup, j);
		}

		public final void run() {
			Process.setThreadPriority(this.a.a);
			Runnable runnable = this.b;
			if (runnable != null) {
				runnable.run();
			}
		}

		public final synchronized void start() {
			zgd.a((Runnable) new a(this));
		}
	}

	public zff(String str, int i) {
		akcr.b(str, "name");
		this.c = str;
		this.a = i;
	}

	public final Thread newThread(Runnable runnable) {
		try {
			in.a("newThread");
			Object obj = Locale.US;
			akcr.a(obj, "Locale.US");
			Object format = String.format(obj, "%s-%d", Arrays.copyOf(new Object[]{this.c, Integer.valueOf(this.b.getAndIncrement())}, 2));
			akcr.a(format, "java.lang.String.format(locale, format, *args)");
			Thread aVar = new a(this, runnable, format, (long) zgd.b);
			return aVar;
		} finally {
			in.a();
		}
	}
}

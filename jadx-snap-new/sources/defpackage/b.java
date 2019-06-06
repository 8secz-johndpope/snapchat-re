package defpackage;

import java.util.concurrent.Executor;

/* renamed from: b */
public class b extends d {
	private static volatile b b;
	public d a = this.c;
	private d c = new c();

	/* renamed from: b$1 */
	static class 1 implements Executor {
		1() {
		}

		public final void execute(Runnable runnable) {
			b.a().b(runnable);
		}
	}

	/* renamed from: b$2 */
	static class 2 implements Executor {
		2() {
		}

		public final void execute(Runnable runnable) {
			b.a().a(runnable);
		}
	}

	static {
		1 1 = new 1();
		2 2 = new 2();
	}

	private b() {
	}

	public static b a() {
		if (b != null) {
			return b;
		}
		synchronized (b.class) {
			if (b == null) {
				b = new b();
			}
		}
		return b;
	}

	public final void a(Runnable runnable) {
		this.a.a(runnable);
	}

	public final void b(Runnable runnable) {
		this.a.b(runnable);
	}

	public final boolean b() {
		return this.a.b();
	}
}

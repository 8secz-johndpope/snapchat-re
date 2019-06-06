package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajvo */
// RxJavaPlugins
public final class ajvo {
	public static volatile ajfb<? super Throwable> a;
	public static volatile ajfc<? super Callable<ajdw>, ? extends ajdw> b;
	public static volatile ajfc<? super Callable<ajdw>, ? extends ajdw> c;
	public static volatile ajfc<? super Callable<ajdw>, ? extends ajdw> d;
	public static volatile ajfc<? super ajde, ? extends ajde> e;
	public static volatile ajfc<? super ajeu, ? extends ajeu> f;
	public static volatile ajfc<? super ajdp, ? extends ajdp> g;
	public static volatile ajfc<? super ajva, ? extends ajva> h;
	public static volatile ajfc<? super ajdj, ? extends ajdj> i;
	public static volatile ajfc<? super ajdx, ? extends ajdx> j;
	public static volatile ajfc<? super ajcx, ? extends ajcx> k;
	public static volatile ajfc<? super ajvn, ? extends ajvn> l;
	public static volatile ajex<? super ajde, ? super akux, ? extends akux> m;
	public static volatile ajex<? super ajdj, ? super ajdl, ? extends ajdl> n;
	public static volatile ajex<? super ajdp, ? super ajdv, ? extends ajdv> o;
	public static volatile ajex<? super ajdx, ? super ajdz, ? extends ajdz> p;
	public static volatile ajex<? super ajcx, ? super ajcz, ? extends ajcz> q;

	private ajvo() {
		throw new IllegalStateException("No instances!");
	}

	public static ajcx a(ajcx ajcx) {
		ajfc ajfc = k;
		return ajfc != null ? (ajcx) ajvo.a(ajfc, (Object) ajcx) : ajcx;
	}

	public static ajcz a(ajcx ajcx, ajcz ajcz) {
		ajex ajex = q;
		return ajex != null ? (ajcz) ajvo.a(ajex, ajcx, ajcz) : ajcz;
	}

	public static <T> ajde<T> a(ajde<T> ajde) {
		ajfc ajfc = e;
		return ajfc != null ? (ajde) ajvo.a(ajfc, (Object) ajde) : ajde;
	}

	public static <T> ajdj<T> a(ajdj<T> ajdj) {
		ajfc ajfc = i;
		return ajfc != null ? (ajdj) ajvo.a(ajfc, (Object) ajdj) : ajdj;
	}

	public static <T> ajdl<? super T> a(ajdj<T> ajdj, ajdl<? super T> ajdl) {
		ajex ajex = n;
		return ajex != null ? (ajdl) ajvo.a(ajex, ajdj, ajdl) : ajdl;
	}

	/**
	 * Calls the associated hook function.
	 * @param <T> the value type
	 * @param source the hook's input value
	 * @return the value returned by the hook
	 */
	// onAssembly
	public static <T> ajdp<T> a(ajdp<T> ajdp) {
		ajfc ajfc = g; // Function<? super Observable, ? extends Observable> f = onObservableAssembly
		return ajfc != null ? (ajdp) ajvo.a(ajfc, (Object) ajdp) : ajdp;
	}

	public static <T> ajdv<? super T> a(ajdp<T> ajdp, ajdv<? super T> ajdv) {
		ajex ajex = o;
		return ajex != null ? (ajdv) ajvo.a(ajex, ajdp, ajdv) : ajdv;
	}

	public static ajdw a(ajfc<? super Callable<ajdw>, ? extends ajdw> ajfc, Callable<ajdw> callable) {
		return (ajdw) ajfv.a(ajvo.a((ajfc) ajfc, (Object) callable), "Scheduler Callable result can't be null");
	}

	/**
	 * Wraps the call to the Scheduler creation callable in try-catch and propagates thrown
	 * checked exceptions as RuntimeException and enforces that result is not null.
	 * @param s the {@link Callable} which returns a {@link Scheduler}, not null (not verified). Cannot return null
	 * @return the result of the callable call, not null
	 * @throws NullPointerException if the callable parameter returns null
	 */
	public static ajdw a(Callable<ajdw> callable) {
		try {
			return (ajdw) ajfv.a(callable.call(), "Scheduler Callable result can't be null");
		} catch (Throwable th) {
			RuntimeException a = ajur.a(th);
		}
	}

	public static <T> ajdx<T> a(ajdx<T> ajdx) {
		ajfc ajfc = j;
		return ajfc != null ? (ajdx) ajvo.a(ajfc, (Object) ajdx) : ajdx;
	}

	public static <T> ajdz<? super T> a(ajdx<T> ajdx, ajdz<? super T> ajdz) {
		ajex ajex = p;
		return ajex != null ? (ajdz) ajvo.a(ajex, ajdx, ajdz) : ajdz;
	}

	public static <T> ajeu<T> a(ajeu<T> ajeu) {
		ajfc ajfc = f;
		return ajfc != null ? (ajeu) ajvo.a(ajfc, (Object) ajeu) : ajeu;
	}

	public static <T> ajva<T> a(ajva<T> ajva) {
		ajfc ajfc = h;
		return ajfc != null ? (ajva) ajvo.a(ajfc, (Object) ajva) : ajva;
	}

	public static <T> akux<? super T> a(ajde<T> ajde, akux<? super T> akux) {
		ajex ajex = m;
		return ajex != null ? (akux) ajvo.a(ajex, ajde, akux) : akux;
	}

	private static <T, U, R> R a(ajex<T, U, R> ajex, T t, U u) {
		try {
			return ajex.apply(t, u);
		} catch (Throwable th) {
			RuntimeException a = ajur.a(th);
		}
	}

	private static <T, R> R a(ajfc<T, R> ajfc, T t) {
		try {
			return ajfc.apply(t);
		} catch (Throwable th) {
			RuntimeException a = ajur.a(th);
		}
	}

	public static Runnable a(Runnable runnable) {
		ajfv.a((Object) runnable, "run is null");
		return runnable;
	}

	public static void a(Throwable th) {
		Object th2;
		ajfb ajfb = a;
		if (th2 == null) {
			th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
		} else if (!ajvo.b(th2)) {
			th2 = new ajet(th2);
		}
		if (ajfb != null) {
			try {
				ajfb.accept(th2);
				return;
			} catch (Throwable th3) {
				th3.printStackTrace();
				ajvo.c(th3);
			}
		}
		th2.printStackTrace();
		ajvo.c(th2);
	}

	private static boolean b(Throwable th) {
		return (th instanceof ajer) || (th instanceof ajeq) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof ajeo);
	}

	private static void c(Throwable th) {
		Thread currentThread = Thread.currentThread();
		currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
	}
}

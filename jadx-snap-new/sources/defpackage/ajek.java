package defpackage;

/* renamed from: ajek */
// io.reactivex.disposables.Disposables
public final class ajek {
	/**
	 * Construct a Disposable by wrapping a Action that is
	 * executed exactly once when the Disposable is disposed.
	 * @param run the Action to wrap
	 * @return the new Disposable instance
	 */
	// fromAction
	public static ajej a(ajev ajev) {
		ajfv.a((Object) ajev, "run is null");
		return new ajeh(ajev);
	}

	/**
	 * Construct a Disposable by wrapping a Runnable that is
	 * executed exactly once when the Disposable is disposed.
	 * @param run the Runnable to wrap
	 * @return the new Disposable instance
	 */
	// fromRunnable
	public static ajej a(Runnable runnable) {
		ajfv.a((Object) runnable, "run is null");
		return new ajem(runnable);
	}
}

package defpackage;

/* renamed from: ajej */
// Disposable
public interface ajej {
	/**
	 * Atomically mark the container as {@link #isDisposed() disposed}, clear it and then
	 * dispose all the previously contained Disposables. From there on the container cannot
	 * be reused, as {@link #add(Disposable)} and {@link #addAll(Collection)} methods
	 * will immediately return {@literal false}.
	 */
	void dispose();

	/**
	 * Indicates if the container has already been disposed.
	 * <p>Note that if that is the case, attempts to add new disposable to it via
	 * {@link #add(Disposable)} and {@link #addAll(Collection)} will be rejected.
	 *
	 * @return true if the container has been disposed, false otherwise.
	 */
	boolean isDisposed();
}

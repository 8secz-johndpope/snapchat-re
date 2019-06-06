package defpackage;

/* renamed from: aiqb */
/**
 * A {@link Lazy} and {@link Provider} implementation that memoizes the value returned from a
 * delegate using the double-check idiom described in Item 71 of <i>Effective Java 2</i>.
 */
// dagger.internal.DoubleCheck
public final class aiqb<T> implements aipn<T>, ajwy<T> {
	private static final Object a = new Object(); // UNINITIALIZED
	// whether assertions should be enabled
	private static /* synthetic */ boolean d = (aiqb.class.desiredAssertionStatus() ^ 1);
	private volatile ajwy<T> b; // provider
	private volatile Object c = a; // instance

	private aiqb(ajwy<T> ajwy) {
		if (d || ajwy != null) { // assert ajwy != null
			this.b = ajwy;
			return;
		}
		throw new AssertionError();
	}

	public static <P extends ajwy<T>, T> ajwy<T> a(P p) {
		aiqf.a(p);
		return p instanceof aiqb ? p : new aiqb(p);
	}

	/**
	 * Checks to see if creating the new instance has resulted in a recursive call. If it has, and the
	 * new instance is the same as the current instance, return the instance. However, if the new
	 * instance differs from the current instance, an {@link IllegalStateException} is thrown.
	 */
	// arg1 = currentInstance
	// arg2 = newInstance
	// reentrantCheck
	public static Object a(Object obj, Object obj2) {
		Object obj3 = (obj == a || (obj instanceof aiqe)) ? null : 1; // isReentrant
		if (obj3 == null || obj == obj2) {
			return obj2;
		}
		StringBuilder stringBuilder = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
		stringBuilder.append(obj);
		stringBuilder.append(" & ");
		stringBuilder.append(obj2);
		stringBuilder.append(". This is likely due to a circular dependency.");
		throw new IllegalStateException(stringBuilder.toString());
	}

	public static <P extends ajwy<T>, T> aipn<T> b(P p) {
		return p instanceof aipn ? (aipn) p : new aiqb((ajwy) aiqf.a(p));
	}

	public final T get() {
		T t = this.c;
		if (t == a) {
			synchronized (this) {
				t = this.c;
				if (t == a) {
					t = this.b.get();
					this.c = aiqb.a(this.c, t);
					this.b = null;
				}
			}
		}
		return t;
	}
}

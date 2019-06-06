package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajur */
// ExceptionHelper
public final class ajur {
	public static final Throwable a = new a();

	/* renamed from: ajur$a */
	static final class a extends Throwable {
		a() {
			super("No further exceptions");
		}

		public final Throwable fillInStackTrace() {
			return this;
		}
	}

	// wrapOrThrow
	public static RuntimeException a(Throwable th) {
		if (!(th instanceof Error)) {
			return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
		} else {
			throw ((Error) th);
		}
	}

	public static String a(long j, TimeUnit timeUnit) {
		StringBuilder stringBuilder = new StringBuilder("The source did not signal an event for ");
		stringBuilder.append(j);
		stringBuilder.append(" ");
		stringBuilder.append(timeUnit.toString().toLowerCase());
		stringBuilder.append(" and has been terminated.");
		return stringBuilder.toString();
	}

	public static <T> Throwable a(AtomicReference<Throwable> atomicReference) {
		Throwable th = (Throwable) atomicReference.get();
		Throwable th2 = a;
		return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
	}

	public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
		Throwable th2;
		Object obj;
		do {
			th2 = (Throwable) atomicReference.get();
			if (th2 == a) {
				return false;
			}
			if (th2 == null) {
				obj = th;
			} else {
				obj = new ajeo(th2, th);
			}
		} while (!atomicReference.compareAndSet(th2, obj));
		return true;
	}

	public static <E extends Throwable> Exception b(Throwable th) {
		if (th instanceof Exception) {
			return (Exception) th;
		}
		throw th;
	}
}

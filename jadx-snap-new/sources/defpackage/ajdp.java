package defpackage;

import com.looksery.sdk.listener.AnalyticsListener;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ajdp */
/**
 * The Observable class is the non-backpressured, optionally multi-valued base reactive class that
 * offers factory methods, intermediate operators and the ability to consume synchronous
 * and/or asynchronous reactive dataflows.
 * <p>
 * Many operators in the class accept {@code ObservableSource}(s), the base reactive interface
 * for such non-backpressured flows, which {@code Observable} itself implements as well.
 * <p>
 * The Observable's operators, by default, run with a buffer size of 128 elements (see {@link Flowable#bufferSize()},
 * that can be overridden globally via the system parameter {@code rx2.buffer-size}. Most operators, however, have
 * overloads that allow setting their internal buffer size explicitly.
 * <p>
 * The documentation for this class makes use of marble diagrams. The following legend explains these diagrams:
 * <p>
 * <img width="640" height="317" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/legend.png" alt="">
 * <p>
 * The design of this class was derived from the
 * <a href="https://github.com/reactive-streams/reactive-streams-jvm">Reactive-Streams design and specification</a>
 * by removing any backpressure-related infrastructure and implementation detail, replacing the
 * {@code org.reactivestreams.Subscription} with {@link Disposable} as the primary means to dispose of
 * a flow.
 * <p>
 * The {@code Observable} follows the protocol
 * <pre><code>
 *      onSubscribe onNext* (onError | onComplete)?
 * </code></pre>
 * where
 * the stream can be disposed through the {@code Disposable} instance provided to consumers through
 * {@code Observer.onSubscribe}.
 * <p>
 * Unlike the {@code Observable} of version 1.x, {@link #subscribe(Observer)} does not allow external disposal
 * of a subscription and the {@code Observer} instance is expected to expose such capability.
 * <p>Example:
 * <pre><code>
 * Disposable d = Observable.just("Hello world!")
 *     .delay(1, TimeUnit.SECONDS)
 *     .subscribeWith(new DisposableObserver&lt;String&gt;() {
 *         &#64;Override public void onStart() {
 *             System.out.println("Start!");
 *         }
 *         &#64;Override public void onNext(String t) {
 *             System.out.println(t);
 *         }
 *         &#64;Override public void onError(Throwable t) {
 *             t.printStackTrace();
 *         }
 *         &#64;Override public void onComplete() {
 *             System.out.println("Done!");
 *         }
 *     });
 *
 * Thread.sleep(500);
 * // the sequence can now be disposed via dispose()
 * d.dispose();
 * </code></pre>
 *
 * @param <T>
 *            the type of the items emitted by the Observable
 * @see Flowable
 * @see io.reactivex.observers.DisposableObserver
 */
// Observable
public abstract class ajdp<T> implements ajdt<T> {

	/* renamed from: ajdp$1 */
	static /* synthetic */ class 1 {
		static final /* synthetic */ int[] a = new int[ajcw.values().length];

		/* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
		/* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
		/* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
		/* JADX WARNING: Failed to process nested try/catch */
		/* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
		/* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
		static {
			/*
			  r0 = defpackage.ajcw.values();
			  r0 = r0.length;
			  r0 = new int[r0];
			  a = r0;
			  r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
			  r1 = defpackage.ajcw.DROP;	 Catch:{ NoSuchFieldError -> 0x0014 }
			  r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
			  r2 = 1;
			  r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
			  L_0x0014:
			  r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
			  r1 = defpackage.ajcw.LATEST;	 Catch:{ NoSuchFieldError -> 0x001f }
			  r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
			  r2 = 2;
			  r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
			  L_0x001f:
			  r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
			  r1 = defpackage.ajcw.MISSING;	 Catch:{ NoSuchFieldError -> 0x002a }
			  r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
			  r2 = 3;
			  r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
			  L_0x002a:
			  r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
			  r1 = defpackage.ajcw.ERROR;	 Catch:{ NoSuchFieldError -> 0x0035 }
			  r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
			  r2 = 4;
			  r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
			  L_0x0035:
			  return;
			*/
			throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdp$1.<clinit>():void");
		}
	}

	public static ajdp<Integer> a(int i, int i2) {
		if (i2 < 0) {
			throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(i2)));
		} else if (i2 == 0) {
			return ajvo.a(ajot.a);
		} else {
			if (i2 == 1) {
				return ajdp.b(Integer.valueOf(i));
			}
			if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
				return ajvo.a(new ajqa(i, i2));
			}
			throw new IllegalArgumentException("Integer overflow");
		}
	}

	public static ajdp<Long> a(long j, long j2, TimeUnit timeUnit) {
		return ajdp.a(j, j2, timeUnit, ajwh.b);
	}

	public static ajdp<Long> a(long j, long j2, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajpn(Math.max(0, j), Math.max(0, j2), timeUnit, ajdw));
	}

	public static ajdp<Long> a(long j, TimeUnit timeUnit) {
		return ajdp.a(j, j, timeUnit, ajwh.b);
	}

	public static ajdp<Long> a(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajrf(Math.max(j, 0), timeUnit, ajdw));
	}

	/**
	 * Provides an API (via a cold Observable) that bridges the reactive world with the callback-style world.
	 * <p>
	 * Example:
	 * <pre><code>
	 * Observable.&lt;Event&gt;create(emitter -&gt; {
	 *     Callback listener = new Callback() {
	 *         &#64;Override
	 *         public void onEvent(Event e) {
	 *             emitter.onNext(e);
	 *             if (e.isLast()) {
	 *                 emitter.onComplete();
	 *             }
	 *         }
	 *
	 *         &#64;Override
	 *         public void onFailure(Exception e) {
	 *             emitter.onError(e);
	 *         }
	 *     };
	 *
	 *     AutoCloseable c = api.someMethod(listener);
	 *
	 *     emitter.setCancellable(c::close);
	 *
	 * });
	 * </code></pre>
	 * <p>
	 * <img width="640" height="200" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/create.png" alt="">
	 * <p>
	 * You should call the ObservableEmitter's onNext, onError and onComplete methods in a serialized fashion. The
	 * rest of its methods are thread-safe.
	 * <dl>
	 *  <dt><b>Scheduler:</b></dt>
	 *  <dd>{@code create} does not operate by default on a particular {@link Scheduler}.</dd>
	 * </dl>
	 *
	 * @param <T> the element type
	 * @param source the emitter that is called when an Observer subscribes to the returned {@code Observable}
	 * @return the new Observable instance
	 * @see ObservableOnSubscribe
	 * @see ObservableEmitter
	 * @see Cancellable
	 */
	// create
	public static <T> ajdp<T> a(ajdr<T> ajdr) {
		ajfv.a((Object) ajdr, "source is null");
		return ajvo.a(new ajod(ajdr)); // RxJavaPlugins.onAssembly(new ObservableCreate<T>(source));
	}

	public static <T> ajdp<T> a(ajdt<T> ajdt) {
		ajfv.a((Object) ajdt, "source is null");
		ajfv.a((Object) ajdt, "onSubscribe is null");
		if (!(ajdt instanceof ajdp)) {
			return ajvo.a(new ajpg(ajdt));
		}
		throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
	}

	public static <T> ajdp<T> a(ajdt<? extends ajdt<? extends T>> ajdt, int i) {
		ajfv.a((Object) ajdt, "sources is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajqv(ajdt, ajfu.a, i));
	}

	public static <T> ajdp<T> a(ajdt<? extends T> ajdt, ajdt<? extends T> ajdt2) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		return ajdp.b(ajdt, ajdt2);
	}

	public static <T> ajdp<T> a(ajdt<? extends T> ajdt, ajdt<? extends T> ajdt2, ajdt<? extends T> ajdt3) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		return ajdp.a(ajdt, ajdt2, ajdt3).a(ajfu.a, false, 3);
	}

	public static <T> ajdp<T> a(ajdt<? extends T> ajdt, ajdt<? extends T> ajdt2, ajdt<? extends T> ajdt3, ajdt<? extends T> ajdt4) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		return ajdp.a(ajdt, ajdt2, ajdt3, ajdt4).a(ajfu.a, false, 4);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajdt<? extends T5> ajdt5, ajdt<? extends T6> ajdt6, ajdt<? extends T7> ajdt7, ajdt<? extends T8> ajdt8, ajdt<? extends T9> ajdt9, ajfj<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> ajfj) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		ajfv.a((Object) ajdt5, "source5 is null");
		ajfv.a((Object) ajdt6, "source6 is null");
		ajfv.a((Object) ajdt7, "source7 is null");
		ajfv.a((Object) ajdt8, "source8 is null");
		ajfv.a((Object) ajdt9, "source9 is null");
		return ajdp.b(ajfu.a((ajfj) ajfj), ajde.a, ajdt, ajdt2, ajdt3, ajdt4, ajdt5, ajdt6, ajdt7, ajdt8, ajdt9);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajdt<? extends T5> ajdt5, ajdt<? extends T6> ajdt6, ajdt<? extends T7> ajdt7, ajdt<? extends T8> ajdt8, ajfi<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> ajfi) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		ajfv.a((Object) ajdt5, "source5 is null");
		ajfv.a((Object) ajdt6, "source6 is null");
		ajfv.a((Object) ajdt7, "source7 is null");
		ajfv.a((Object) ajdt8, "source8 is null");
		return ajdp.b(ajfu.a((ajfi) ajfi), ajde.a, ajdt, ajdt2, ajdt3, ajdt4, ajdt5, ajdt6, ajdt7, ajdt8);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajdt<? extends T5> ajdt5, ajdt<? extends T6> ajdt6, ajdt<? extends T7> ajdt7, ajfh<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> ajfh) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		ajfv.a((Object) ajdt5, "source5 is null");
		ajfv.a((Object) ajdt6, "source6 is null");
		ajfv.a((Object) ajdt7, "source7 is null");
		return ajdp.b(ajfu.a((ajfh) ajfh), ajde.a, ajdt, ajdt2, ajdt3, ajdt4, ajdt5, ajdt6, ajdt7);
	}

	public static <T1, T2, T3, T4, T5, T6, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajdt<? extends T5> ajdt5, ajdt<? extends T6> ajdt6, ajfg<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> ajfg) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		ajfv.a((Object) ajdt5, "source5 is null");
		ajfv.a((Object) ajdt6, "source6 is null");
		return ajdp.b(ajfu.a((ajfg) ajfg), ajde.a, ajdt, ajdt2, ajdt3, ajdt4, ajdt5, ajdt6);
	}

	public static <T1, T2, T3, T4, T5, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajdt<? extends T5> ajdt5, ajff<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> ajff) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		ajfv.a((Object) ajdt5, "source5 is null");
		return ajdp.b(ajfu.a((ajff) ajff), ajde.a, ajdt, ajdt2, ajdt3, ajdt4, ajdt5);
	}

	public static <T1, T2, T3, T4, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajdt<? extends T4> ajdt4, ajfe<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> ajfe) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		ajfv.a((Object) ajdt4, "source4 is null");
		return ajdp.b(ajfu.a((ajfe) ajfe), ajde.a, ajdt, ajdt2, ajdt3, ajdt4);
	}

	public static <T1, T2, T3, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajfd<? super T1, ? super T2, ? super T3, ? extends R> ajfd) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		return ajdp.b(ajfu.a((ajfd) ajfd), ajde.a, ajdt, ajdt2, ajdt3);
	}

	public static <T1, T2, R> ajdp<R> a(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajex<? super T1, ? super T2, ? extends R> ajex) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		return ajdp.b(ajfu.a((ajex) ajex), ajde.a, ajdt, ajdt2);
	}

	private <B, U extends Collection<? super T>> ajdp<U> a(ajdt<B> ajdt, Callable<U> callable) {
		ajfv.a((Object) ajdt, "boundary is null");
		ajfv.a((Object) callable, "bufferSupplier is null");
		return ajvo.a(new ajnv(this, ajdt, callable));
	}

	private ajdp<T> a(ajdw ajdw, int i) {
		ajfv.a((Object) ajdw, "scheduler is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajpv(this, ajdw, i));
	}

	private ajdp<T> a(ajfb<? super ajej> ajfb, ajev ajev) {
		ajfv.a((Object) ajfb, "onSubscribe is null");
		ajfv.a((Object) ajev, "onDispose is null");
		return ajvo.a(new ajop(this, ajfb, ajev));
	}

	private <R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(Integer.MAX_VALUE, "maxConcurrency");
		ajfv.a(i, "prefetch");
		return ajvo.a(new ajoc(this, ajfc, 1, i));
	}

	private <R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i, boolean z) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "prefetch");
		if (this instanceof ajgd) {
			Object call = ((ajgd) this).call();
			return call == null ? ajvo.a(ajot.a) : ajqk.a(call, ajfc);
		} else {
			return ajvo.a(new ajob(this, ajfc, i, z ? 3 : 2));
		}
	}

	public static <T, R> ajdp<R> a(ajfc<? super Object[], ? extends R> ajfc, int i, ajdt<? extends T>... ajdtArr) {
		if (ajdtArr.length == 0) {
			return ajvo.a(ajot.a);
		}
		ajfv.a((Object) ajfc, "zipper is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajrm(ajdtArr, null, ajfc, i));
	}

	private <U, R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends U>> ajfc, ajex<? super T, ? super U, ? extends R> ajex, int i, int i2) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a((Object) ajex, "combiner is null");
		return a(ajpm.a(ajfc, ajex), false, i, i2);
	}

	private <K, V> ajdp<ajvb<K, V>> a(ajfc<? super T, ? extends K> ajfc, ajfc<? super T, ? extends V> ajfc2, int i) {
		ajfv.a((Object) ajfc, "keySelector is null");
		ajfv.a((Object) ajfc2, "valueSelector is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajpi(this, ajfc, ajfc2, i));
	}

	private <R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends R>> ajfc, boolean z, int i) {
		return a((ajfc) ajfc, z, i, ajde.a);
	}

	public static <T> ajdp<T> a(akuw<? extends T> akuw) {
		ajfv.a((Object) akuw, "publisher is null");
		return ajvo.a(new ajpf(akuw));
	}

	public static <T> ajdp<T> a(Iterable<? extends ajdt<? extends T>> iterable) {
		ajfv.a((Object) iterable, "sources is null");
		return ajdp.b((Iterable) iterable).a(ajfu.a, ajde.a, false);
	}

	public static <T, R> ajdp<R> a(Iterable<? extends ajdt<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc) {
		return ajdp.a((Iterable) iterable, (ajfc) ajfc, ajde.a);
	}

	private static <T, R> ajdp<R> a(Iterable<? extends ajdt<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc, int i) {
		ajfv.a((Object) iterable, "sources is null");
		ajfv.a((Object) ajfc, "combiner is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajoa(null, iterable, ajfc, i << 1));
	}

	public static <T> ajdp<T> a(T t, T t2) {
		ajfv.a((Object) t, "The first item is null");
		ajfv.a((Object) t2, "The second item is null");
		return ajdp.a(t, t2);
	}

	public static <T> ajdp<T> a(Callable<? extends ajdt<? extends T>> callable) {
		ajfv.a((Object) callable, "supplier is null");
		return ajvo.a(new ajog(callable));
	}

	private <R> ajdp<R> a(Callable<R> callable, ajex<R, ? super T, R> ajex) {
		ajfv.a((Object) callable, "seedSupplier is null");
		ajfv.a((Object) ajex, "accumulator is null");
		return ajvo.a(new ajqm(this, callable, ajex));
	}

	private ajdp<ajwj<T>> a(TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajrc(this, timeUnit, ajdw));
	}

	public static <T> ajdp<T> a(ajdt<? extends T>... ajdtArr) {
		ajfv.a((Object) ajdtArr, "sources is null");
		return ajvo.a(new ajnq(ajdtArr));
	}

	public static <T> ajdp<T> a(T... tArr) {
		ajfv.a((Object) tArr, "items is null");
		return tArr.length == 0 ? ajvo.a(ajot.a) : tArr.length == 1 ? ajdp.b(tArr[0]) : ajvo.a(new ajpc(tArr));
	}

	private <U> ajdx<U> a(Callable<? extends U> callable, ajew<? super U, ? super T> ajew) {
		ajfv.a((Object) callable, "initialValueSupplier is null");
		ajfv.a((Object) ajew, "collector is null");
		return ajvo.a(new ajnz(this, callable, ajew));
	}

	private ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajfb<? super ajej> ajfb3) {
		ajfv.a((Object) ajfb, "onNext is null");
		ajfv.a((Object) ajfb2, "onError is null");
		ajfv.a((Object) ajev, "onComplete is null");
		ajfv.a((Object) ajfb3, "onSubscribe is null");
		ajdv ajgv = new ajgv(ajfb, ajfb2, ajev, ajfb3);
		a(ajgv);
		return ajgv;
	}

	public static ajdp<Long> b(long j, TimeUnit timeUnit) {
		return ajdp.a(j, timeUnit, ajwh.b);
	}

	public static <T> ajdp<T> b(ajdt<? extends T> ajdt, ajdt<? extends T> ajdt2) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		return ajdp.a(ajdt, ajdt2).a(ajfu.a, false, 2);
	}

	public static <T1, T2, T3, R> ajdp<R> b(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajdt<? extends T3> ajdt3, ajfd<? super T1, ? super T2, ? super T3, ? extends R> ajfd) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		ajfv.a((Object) ajdt3, "source3 is null");
		return ajdp.a(ajfu.a((ajfd) ajfd), ajde.a, ajdt, ajdt2, ajdt3);
	}

	public static <T1, T2, R> ajdp<R> b(ajdt<? extends T1> ajdt, ajdt<? extends T2> ajdt2, ajex<? super T1, ? super T2, ? extends R> ajex) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		return ajdp.a(ajfu.a((ajex) ajex), ajde.a, ajdt, ajdt2);
	}

	private <U, V> ajdp<T> b(ajdt<U> ajdt, ajfc<? super T, ? extends ajdt<V>> ajfc) {
		ajfv.a((Object) ajfc, "itemTimeoutIndicator is null");
		return ajvo.a(new ajrd(this, ajdt, ajfc));
	}

	private <R> ajdp<R> b(ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "bufferSize");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajqv(this, ajfc, i));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajot.a) : ajqk.a(call, ajfc);
	}

	private static <T, R> ajdp<R> b(ajfc<? super Object[], ? extends R> ajfc, int i, ajdt<? extends T>... ajdtArr) {
		ajfv.a((Object) ajdtArr, "sources is null");
		if (ajdtArr.length == 0) {
			return ajvo.a(ajot.a);
		}
		ajfv.a((Object) ajfc, "combiner is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajoa(ajdtArr, null, ajfc, i << 1));
	}

	/**
	 * Converts an {@link Iterable} sequence into an ObservableSource that emits the items in the sequence.
	 * <p>
	 * <img width="640" height="186" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/fromIterable.png" alt="">
	 * <dl>
	 *  <dt><b>Scheduler:</b></dt>
	 *  <dd>{@code fromIterable} does not operate by default on a particular {@link Scheduler}.</dd>
	 * </dl>
	 *
	 * @param source
	 *            the source {@link Iterable} sequence
	 * @param <T>
	 *            the type of items in the {@link Iterable} sequence and the type of items to be emitted by the
	 *            resulting ObservableSource
	 * @return an Observable that emits each item in the source {@link Iterable} sequence
	 * @see <a href="http://reactivex.io/documentation/operators/from.html">ReactiveX operators documentation: From</a>
	 */
	// fromIterable
	public static <T> ajdp<T> b(Iterable<? extends T> iterable) {
		ajfv.a((Object) iterable, "source is null");
		return ajvo.a(new ajpe(iterable));
	}

	public static <T> ajdp<T> b(T t) {
		ajfv.a((Object) t, "The item is null");
		return ajvo.a(new ajpo(t));
	}

	public static <T> ajdp<T> b(Throwable th) {
		ajfv.a((Object) th, "e is null");
		return ajdp.c(ajfu.a((Object) th));
	}

	public static <T> ajdp<T> b(Callable<? extends T> callable) {
		ajfv.a((Object) callable, "supplier is null");
		return ajvo.a(new ajpd(callable));
	}

	public static <T> ajdp<T> b(ajdt<? extends T>... ajdtArr) {
		return ajdtArr.length == 0 ? ajvo.a(ajot.a) : ajdtArr.length == 1 ? ajdp.k(ajdtArr[0]) : ajvo.a(new ajob(ajdp.a((Object[]) ajdtArr), ajfu.a, ajde.a, 2));
	}

	public static <T> ajdp<T> c(ajdt<? extends T> ajdt, ajdt<? extends T> ajdt2) {
		ajfv.a((Object) ajdt, "source1 is null");
		ajfv.a((Object) ajdt2, "source2 is null");
		return ajdp.a(ajdt, ajdt2).a(ajfu.a, true, 2);
	}

	public static <T> ajdp<T> c(Iterable<? extends ajdt<? extends T>> iterable) {
		return ajdp.b((Iterable) iterable).k(ajfu.a);
	}

	private static <T> ajdp<T> c(Callable<? extends Throwable> callable) {
		ajfv.a((Object) callable, "errorSupplier is null");
		return ajvo.a(new ajou(callable));
	}

	private ajdp<T> g(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajoh(this, j, timeUnit, ajdw));
	}

	private ajdp<T> h(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajqj(this, j, timeUnit, ajdw));
	}

	private static <T> ajdp<T> k(ajdt<T> ajdt) {
		ajfv.a((Object) ajdt, "source is null");
		return ajdt instanceof ajdp ? ajvo.a((ajdp) ajdt) : ajvo.a(new ajpg(ajdt));
	}

	public final ajcx a(ajfc<? super T, ? extends ajdb> ajfc, boolean z) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajoy(this, ajfc, z));
	}

	public final ajde<T> a(ajcw ajcw) {
		ajjx ajjx = new ajjx(this);
		int i = 1.a[ajcw.ordinal()];
		return i != 1 ? i != 2 ? i != 3 ? i != 4 ? ajjx.d() : ajvo.a(new ajki(ajjx)) : ajjx : ajjx.f() : ajjx.e();
	}

	public final ajdj<T> a(ajex<T, T, T> ajex) {
		ajfv.a((Object) ajex, "reducer is null");
		return ajvo.a(new ajqb(this, ajex));
	}

	public final ajdp<T> a(long j) {
		if (j >= 0) {
			return j == 0 ? ajvo.a(ajot.a) : ajvo.a(new ajqe(this, j));
		} else {
			throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
		}
	}

	public final ajdp<T> a(long j, TimeUnit timeUnit, ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return a(j, timeUnit, (ajdt) ajdt, ajwh.b);
	}

	public final ajdp<T> a(long j, TimeUnit timeUnit, ajdt<? extends T> ajdt, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "timeUnit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajre(this, j, timeUnit, ajdw, ajdt));
	}

	public final ajdp<List<T>> a(long j, TimeUnit timeUnit, ajdw ajdw, int i) {
		return a(j, timeUnit, ajdw, i, ajuk.INSTANCE);
	}

	public final <U extends Collection<? super T>> ajdp<U> a(long j, TimeUnit timeUnit, ajdw ajdw, int i, Callable<U> callable) {
		TimeUnit timeUnit2 = timeUnit;
		ajfv.a((Object) timeUnit, "unit is null");
		ajdw ajdw2 = ajdw;
		ajfv.a((Object) ajdw, "scheduler is null");
		Object obj = callable;
		ajfv.a(obj, "bufferSupplier is null");
		int i2 = i;
		ajfv.a(i2, AnalyticsListener.ANALYTICS_COUNT_KEY);
		return ajvo.a(new ajnw(this, j, j, timeUnit2, ajdw2, obj, i2));
	}

	public final ajdp<T> a(ajdb ajdb) {
		ajfv.a((Object) ajdb, "other is null");
		return ajvo.a(new ajps(this, ajdb));
	}

	public final <R> ajdp<R> a(ajds<? extends R, ? super T> ajds) {
		ajfv.a((Object) ajds, "onLift is null");
		return ajvo.a(new ajpq(this, ajds));
	}

	public final <U, R> ajdp<R> a(ajdt<? extends U> ajdt, ajex<? super T, ? super U, ? extends R> ajex) {
		ajfv.a((Object) ajdt, "other is null");
		ajfv.a((Object) ajex, "combiner is null");
		return ajvo.a(new ajrk(this, ajex, ajdt));
	}

	public final <U, V> ajdp<T> a(ajdt<U> ajdt, ajfc<? super T, ? extends ajdt<V>> ajfc) {
		ajfv.a((Object) ajdt, "firstTimeoutIndicator is null");
		return b((ajdt) ajdt, (ajfc) ajfc);
	}

	public final <R> ajdp<R> a(ajdu<? super T, ? extends R> ajdu) {
		return ajdp.k(((ajdu) ajfv.a((Object) ajdu, "composer is null")).apply(this));
	}

	/**
	 * Modifies an ObservableSource to perform its emissions and notifications on a specified {@link Scheduler},
	 * asynchronously with an unbounded buffer with {@link Flowable#bufferSize()} "island size".
	 *
	 * <p>Note that onError notifications will cut ahead of onNext notifications on the emission thread if Scheduler is truly
	 * asynchronous. If strict event ordering is required, consider using the {@link #observeOn(Scheduler, boolean)} overload.
	 * <p>
	 * <img width="640" height="308" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/observeOn.png" alt="">
	 * <dl>
	 *  <dt><b>Scheduler:</b></dt>
	 *  <dd>You specify which {@link Scheduler} this operator will use.</dd>
	 * </dl>
	 * <p>"Island size" indicates how large chunks the unbounded buffer allocates to store the excess elements waiting to be consumed
	 * on the other side of the asynchronous boundary.
	 *
	 * @param scheduler
	 *            the {@link Scheduler} to notify {@link Observer}s on
	 * @return the source ObservableSource modified so that its {@link Observer}s are notified on the specified
	 *         {@link Scheduler}
	 * @see <a href="http://reactivex.io/documentation/operators/observeon.html">ReactiveX operators documentation: ObserveOn</a>
	 * @see <a href="http://www.grahamlea.com/2014/07/rxjava-threading-examples/">RxJava Threading Examples</a>
	 * @see #subscribeOn
	 * @see #observeOn(Scheduler, boolean)
	 * @see #observeOn(Scheduler, boolean, int)
	 */
	// observeOn
	public final ajdp<T> a(ajdw ajdw) {
		return a(ajdw,
			 ajde.a); // Flowable.BUFFER_SIZE
	}

	public final ajdp<T> a(ajev ajev) {
		ajfv.a((Object) ajev, "onFinally is null");
		return ajvo.a(new ajon(this, ajev));
	}

	public final ajdp<T> a(ajey<? super T, ? super T> ajey) {
		ajfv.a((Object) ajey, "comparer is null");
		return ajvo.a(new ajol(this, ajfu.a, ajey));
	}

	public final ajdp<T> a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
		ajfv.a((Object) ajfb, "onNext is null");
		ajfv.a((Object) ajfb2, "onError is null");
		ajfv.a((Object) ajev, "onComplete is null");
		ajfv.a((Object) ajev2, "onAfterTerminate is null");
		return ajvo.a(new ajoo(this, ajfb, ajfb2, ajev, ajev2));
	}

	public final <R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "prefetch");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajob(this, ajfc, 2, 1));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajot.a) : ajqk.a(call, ajfc);
	}

	public final <U, R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends U>> ajfc, ajex<? super T, ? super U, ? extends R> ajex) {
		int i = ajde.a;
		return a((ajfc) ajfc, (ajex) ajex, i, i);
	}

	public final <K> ajdp<T> a(ajfc<? super T, K> ajfc, Callable<? extends Collection<? super K>> callable) {
		ajfv.a((Object) ajfc, "keySelector is null");
		ajfv.a((Object) callable, "collectionSupplier is null");
		return ajvo.a(new ajok(this, ajfc, callable));
	}

	public final <R> ajdp<R> a(ajfc<? super T, ? extends ajdt<? extends R>> ajfc, boolean z, int i, int i2) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "maxConcurrency");
		ajfv.a(i2, "bufferSize");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajow(this, ajfc, z, i, i2));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajot.a) : ajqk.a(call, ajfc);
	}

	public final ajdp<T> a(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "predicate is null");
		return ajvo.a(new ajov(this, ajfl));
	}

	public final <U> ajdp<U> a(Class<U> cls) {
		ajfv.a((Object) cls, "clazz is null");
		return p(ajfu.a((Class) cls));
	}

	public final <R> ajdp<R> a(ajdt<?>[] ajdtArr, ajfc<? super Object[], R> ajfc) {
		ajfv.a((Object) ajdtArr, "others is null");
		ajfv.a((Object) ajfc, "combiner is null");
		return ajvo.a(new ajrl(this, ajdtArr, ajfc));
	}

	public final ajdx<List<T>> a(int i) {
		ajfv.a(i, "capacityHint");
		return ajvo.a(new ajrh(this, i));
	}

	public final <K, V> ajdx<Map<K, V>> a(ajfc<? super T, ? extends K> ajfc, ajfc<? super T, ? extends V> ajfc2) {
		ajfv.a((Object) ajfc, "keySelector is null");
		ajfv.a((Object) ajfc2, "valueSelector is null");
		return a(ajut.INSTANCE, ajfu.a(ajfc, ajfc2));
	}

	public final <U> ajdx<U> a(U u, ajew<? super U, ? super T> ajew) {
		ajfv.a((Object) u, "initialValue is null");
		return a(ajfu.a((Object) u), (ajew) ajew);
	}

	public final <R> ajdx<R> a(R r, ajex<R, ? super T, R> ajex) {
		ajfv.a((Object) r, "seed is null");
		ajfv.a((Object) ajex, "reducer is null");
		return ajvo.a(new ajqc(this, r, ajex));
	}

	public final ajdx<List<T>> a(Comparator<? super T> comparator) {
		ajfv.a((Object) comparator, "comparator is null");
		return a(16).f(ajfu.a((Comparator) comparator));
	}

	public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2) {
		return a((ajfb) ajfb, (ajfb) ajfb2, ajfu.c, ajfu.d);
	}

	public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev) {
		return a((ajfb) ajfb, (ajfb) ajfb2, ajev, ajfu.d);
	}

	public final void a(ajdv<? super T> ajdv) {
		ajfv.a((Object) ajdv, "observer is null");
		try {
			Object a = ajvo.a(this, (ajdv) ajdv);
			ajfv.a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
			a_(a);
		} catch (NullPointerException e) {
			throw e;
		} catch (Throwable th) {
			ajep.a(th);
			ajvo.a(th);
			new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
		}
	}

	public abstract void a_(ajdv<? super T> ajdv);

	public final ajdp<T> b(long j) {
		return j <= 0 ? ajvo.a(this) : ajvo.a(new ajqq(this, j));
	}

	public final ajdp<T> b(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajof(this, j, timeUnit, ajdw));
	}

	public final <B> ajdp<List<T>> b(ajdt<B> ajdt) {
		return a((ajdt) ajdt, ajuk.INSTANCE);
	}

	public final <U, R> ajdp<R> b(ajdt<? extends U> ajdt, ajex<? super T, ? super U, ? extends R> ajex) {
		ajfv.a((Object) ajdt, "other is null");
		return ajdp.b((ajdt) this, (ajdt) ajdt, (ajex) ajex);
	}

	public final ajdp<T> b(ajdw ajdw) {
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajqt(this, ajdw));
	}

	public final ajdp<T> b(ajev ajev) {
		return a(ajfu.d, ajev);
	}

	public final ajdp<T> b(ajex<T, T, T> ajex) {
		ajfv.a((Object) ajex, "accumulator is null");
		return ajvo.a(new ajql(this, ajex));
	}

	public final ajdp<T> b(ajfb<? super T> ajfb) {
		ajfv.a((Object) ajfb, "onAfterNext is null");
		return ajvo.a(new ajom(this, ajfb));
	}

	public final <R> ajdp<R> b(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
		return a((ajfc) ajfc, ajde.a, true);
	}

	public final ajdp<T> b(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "predicate is null");
		return ajvo.a(new ajqs(this, ajfl));
	}

	public final <U> ajdp<U> b(Class<U> cls) {
		ajfv.a((Object) cls, "clazz is null");
		return a(ajfu.b((Class) cls)).a((Class) cls);
	}

	public final <R> ajdp<R> b(R r, ajex<R, ? super T, R> ajex) {
		ajfv.a((Object) r, "seed is null");
		return a(ajfu.a((Object) r), (ajex) ajex);
	}

	public final T b() {
		ajdv ajgl = new ajgl();
		a(ajgl);
		Object b = ajgl.b();
		if (b != null) {
			return b;
		}
		throw new NoSuchElementException();
	}

	public final ajdp<T> c() {
		ajfv.a(16, "initialCapacity");
		return ajvo.a(new ajnx(this));
	}

	public final ajdp<T> c(long j) {
		if (j >= 0) {
			return ajvo.a(new ajqw(this, j));
		}
		throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j)));
	}

	public final ajdp<List<T>> c(long j, TimeUnit timeUnit) {
		return a(j, timeUnit, ajwh.b, Integer.MAX_VALUE);
	}

	public final ajdp<T> c(long j, TimeUnit timeUnit, ajdw ajdw) {
		return g(j, timeUnit, ajdw);
	}

	public final ajdp<T> c(ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajdp.a((ajdt) this, (ajdt) ajdt);
	}

	public final ajdp<T> c(ajdw ajdw) {
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajri(this, ajdw));
	}

	public final ajdp<T> c(ajev ajev) {
		ajfb ajfb = ajfu.d;
		return a(ajfb, ajfb, ajev, ajfu.c);
	}

	public final ajdp<T> c(ajfb<? super Throwable> ajfb) {
		ajfb ajfb2 = ajfu.d;
		ajev ajev = ajfu.c;
		return a(ajfb2, (ajfb) ajfb, ajev, ajev);
	}

	public final <R> ajdp<R> c(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
		return a((ajfc) ajfc, ajde.a);
	}

	public final ajdp<T> c(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "predicate is null");
		return ajvo.a(new ajqy(this, ajfl));
	}

	public final ajdp<T> c(T t) {
		ajfv.a((Object) t, "defaultItem is null");
		return i(ajdp.b((Object) t));
	}

	public final <E extends ajdv<? super T>> E c(E e) {
		a((ajdv) e);
		return e;
	}

	public final ajcx d(ajfc<? super T, ? extends ajdb> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "capacityHint");
		return ajvo.a(new ajnh(this, ajfc, 1));
	}

	public final ajdj<T> d() {
		return ajvo.a(new ajor(this));
	}

	public final ajdp<T> d(long j, TimeUnit timeUnit) {
		return b(j, timeUnit, ajwh.b);
	}

	public final ajdp<T> d(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajra(this, j, timeUnit, ajdw));
	}

	public final <U> ajdp<T> d(ajdt<U> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajvo.a(new ajoi(this, ajdt));
	}

	public final ajdp<T> d(ajev ajev) {
		ajfv.a((Object) ajev, "onTerminate is null");
		return a(ajfu.d, ajfu.a(ajev), ajev, ajfu.c);
	}

	public final ajdp<T> d(ajfb<? super T> ajfb) {
		ajfb ajfb2 = ajfu.d;
		ajev ajev = ajfu.c;
		return a((ajfb) ajfb, ajfb2, ajev, ajev);
	}

	public final ajdp<T> d(Iterable<? extends T> iterable) {
		return ajdp.b(ajdp.b((Iterable) iterable), this);
	}

	public final ajdx<T> d(T t) {
		ajfv.a((Object) t, "defaultItem is null");
		return ajvo.a(new ajos(this, t));
	}

	public final ajcx e(ajfc<? super T, ? extends ajdb> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "prefetch");
		return ajvo.a(new ajnh(this, ajfc, 3));
	}

	public final ajdp<T> e(long j, TimeUnit timeUnit) {
		return g(j, timeUnit, ajwh.b);
	}

	public final ajdp<T> e(long j, TimeUnit timeUnit, ajdw ajdw) {
		return h(j, timeUnit, ajdw);
	}

	public final ajdp<T> e(ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajdp.b((ajdt) this, (ajdt) ajdt);
	}

	public final ajdp<T> e(ajfb<? super ajej> ajfb) {
		return a((ajfb) ajfb, ajfu.c);
	}

	public final ajdx<T> e() {
		return ajvo.a(new ajos(this, null));
	}

	public final ajdx<T> e(T t) {
		ajfv.a((Object) t, "defaultItem is null");
		return ajvo.a(new ajpp(this, t));
	}

	public final ajdp<T> f() {
		return ajvo.a(new ajpj(this));
	}

	public final ajdp<T> f(long j, TimeUnit timeUnit) {
		return h(j, timeUnit, ajwh.b);
	}

	public final ajdp<T> f(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajrb(this, j, timeUnit, ajdw, false));
	}

	public final ajdp<T> f(ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "next is null");
		return q(ajfu.b((Object) ajdt));
	}

	public final <R> ajdp<R> f(ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "prefetch");
		return ajvo.a(new ajni(this, ajfc, 1));
	}

	public final ajdp<T> f(T t) {
		ajfv.a((Object) t, "item is null");
		return r(ajfu.b((Object) t));
	}

	public final ajej f(ajfb<? super T> ajfb) {
		return a((ajfb) ajfb, ajfu.e, ajfu.c, ajfu.d);
	}

	public final ajcx g() {
		return ajvo.a(new ajpl(this));
	}

	public final ajdp<T> g(long j, TimeUnit timeUnit) {
		return d(j, timeUnit, ajwh.b);
	}

	public final <U> ajdp<T> g(ajdt<U> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajvo.a(new ajqr(this, ajdt));
	}

	public final <R> ajdp<R> g(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "prefetch");
		return ajvo.a(new ajnj(this, ajfc, 1));
	}

	public final ajdx<T> g(T t) {
		ajfv.a((Object) t, "defaultItem is null");
		return ajvo.a(new ajqp(this, t));
	}

	public final ajdp<T> h(ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajdp.b(ajdt, this);
	}

	public final <U> ajdp<T> h(ajfc<? super T, ? extends ajdt<U>> ajfc) {
		ajfv.a((Object) ajfc, "debounceSelector is null");
		return ajvo.a(new ajoe(this, ajfc));
	}

	public final ajdp<T> h(T t) {
		ajfv.a((Object) t, "item is null");
		return ajdp.b(ajdp.b((Object) t), this);
	}

	public final ajdx<T> h() {
		return ajvo.a(new ajpp(this, null));
	}

	public final ajdp<T> i(ajdt<? extends T> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajvo.a(new ajqu(this, ajdt));
	}

	public final <U> ajdp<T> i(ajfc<? super T, ? extends ajdt<U>> ajfc) {
		ajfv.a((Object) ajfc, "itemDelay is null");
		return k(ajpm.a(ajfc));
	}

	public final ajva<T> i() {
		ajfv.a(1, "bufferSize");
		return ajqg.b(this, 1);
	}

	public final ajdp<T> j() {
		return ajvo.a(new ajqn(this));
	}

	public final <U> ajdp<T> j(ajdt<U> ajdt) {
		ajfv.a((Object) ajdt, "other is null");
		return ajvo.a(new ajqx(this, ajdt));
	}

	public final <K> ajdp<T> j(ajfc<? super T, K> ajfc) {
		ajfv.a((Object) ajfc, "keySelector is null");
		return ajvo.a(new ajol(this, ajfc, ajfv.a));
	}

	public final <R> ajdp<R> k(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
		return a((ajfc) ajfc, false, Integer.MAX_VALUE);
	}

	public final ajdx<T> k() {
		return ajvo.a(new ajqp(this, null));
	}

	public final <U> ajdp<U> l(ajfc<? super T, ? extends Iterable<? extends U>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajpb(this, ajfc));
	}

	/**
	 * Subscribes to an ObservableSource and ignores {@code onNext} and {@code onComplete} emissions.
	 * <p>
	 * If the Observable emits an error, it is wrapped into an
	 * {@link io.reactivex.exceptions.OnErrorNotImplementedException OnErrorNotImplementedException}
	 * and routed to the RxJavaPlugins.onError handler.
	 * <dl>
	 *  <dt><b>Scheduler:</b></dt>
	 *  <dd>{@code subscribe} does not operate by default on a particular {@link Scheduler}.</dd>
	 * </dl>
	 *
	 * @return a {@link Disposable} reference with which the caller can stop receiving items before
	 *         the ObservableSource has finished sending them
	 * @see <a href="http://reactivex.io/documentation/operators/subscribe.html">ReactiveX operators documentation: Subscribe</a>
	 */
	// subscribe
	public final ajej l() {
		return a(ajfu.d, ajfu.e, ajfu.c, ajfu.d);
	}

	public final ajdp<ajwj<T>> m() {
		return a(TimeUnit.MILLISECONDS, ajwh.b);
	}

	public final <R> ajdp<R> m(ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajoz(this, ajfc));
	}

	public final <R> ajdp<R> n(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajpa(this, ajfc));
	}

	public final <K> ajdp<ajvb<K, T>> o(ajfc<? super T, ? extends K> ajfc) {
		return a((ajfc) ajfc, ajfu.a, ajde.a);
	}

	/**
	 * Returns an Observable that concatenate each item emitted by the source ObservableSource with the values in an
	 * Iterable corresponding to that item that is generated by a selector.
	 * <p>
	 * <img width="640" height="275" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/concatMapIterable.o.png" alt="">
	 *
	 * <dl>
	 *  <dt><b>Scheduler:</b></dt>
	 *  <dd>{@code concatMapIterable} does not operate by default on a particular {@link Scheduler}.</dd>
	 * </dl>
	 *
	 * @param <U>
	 *            the type of item emitted by the resulting ObservableSource
	 * @param mapper
	 *            a function that returns an Iterable sequence of values for when given an item emitted by the
	 *            source ObservableSource
	 * @return an Observable that emits the results of concatenating the items emitted by the source ObservableSource with
	 *         the values in the Iterables corresponding to those items, as generated by {@code collectionSelector}
	 * @see <a href="http://reactivex.io/documentation/operators/flatmap.html">ReactiveX operators documentation: FlatMap</a>
	 */
	// concatMapIterable
	public final <R> ajdp<R> p(ajfc<? super T, ? extends R> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajpr(this, ajfc));
	}

	public final ajdp<T> q(ajfc<? super Throwable, ? extends ajdt<? extends T>> ajfc) {
		ajfv.a((Object) ajfc, "resumeFunction is null");
		return ajvo.a(new ajpw(this, ajfc));
	}

	public final ajdp<T> r(ajfc<? super Throwable, ? extends T> ajfc) {
		ajfv.a((Object) ajfc, "valueSupplier is null");
		return ajvo.a(new ajpx(this, ajfc));
	}

	public final <R> ajdp<R> s(ajfc<? super ajdp<T>, ? extends ajdt<R>> ajfc) {
		ajfv.a((Object) ajfc, "selector is null");
		return ajvo.a(new ajpz(this, ajfc));
	}

	public final ajdp<T> t(ajfc<? super ajdp<Object>, ? extends ajdt<?>> ajfc) {
		ajfv.a((Object) ajfc, "handler is null");
		return ajvo.a(new ajqf(this, ajfc));
	}

	public final <R> ajdp<R> u(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
		return b((ajfc) ajfc, ajde.a);
	}

	public final ajcx v(ajfc<? super T, ? extends ajdb> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajnk(this, ajfc));
	}

	public final <R> ajdp<R> w(ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajnl(this, ajfc));
	}

	public final <R> ajdp<R> x(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajnm(this, ajfc));
	}

	public final <R> R y(ajfc<? super ajdp<T>, R> ajfc) {
		try {
			return ((ajfc) ajfv.a((Object) ajfc, "converter is null")).apply(this);
		} catch (Throwable th) {
			ajep.a(th);
			RuntimeException a = ajur.a(th);
		}
	}
}

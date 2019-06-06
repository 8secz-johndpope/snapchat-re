package defpackage;

import defpackage.ajjz.a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajde */
/**
 * The Flowable class that implements the Reactive-Streams Pattern and offers factory methods,
 * intermediate operators and the ability to consume reactive dataflows.
 * <p>
 * Reactive-Streams operates with {@code Publisher}s which {@code Flowable} extends. Many operators
 * therefore accept general {@code Publisher}s directly and allow direct interoperation with other
 * Reactive-Streams implementations.
 * <p>
 * The Flowable hosts the default buffer size of 128 elements for operators, accessible via {@link #bufferSize()},
 * that can be overridden globally via the system parameter {@code rx2.buffer-size}. Most operators, however, have
 * overloads that allow setting their internal buffer size explicitly.
 * <p>
 * The documentation for this class makes use of marble diagrams. The following legend explains these diagrams:
 * <p>
 * <img width="640" height="317" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/legend.png" alt="">
 * <p>
 * For more information see the <a href="http://reactivex.io/documentation/Publisher.html">ReactiveX
 * documentation</a>.
 *
 * @param <T>
 *            the type of the items emitted by the Flowable
 */
// Flowable
public abstract class ajde<T> implements akuw<T> {
	public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue()); // BUFFER_SIZE

	public static ajde<Long> a(long j, long j2, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajka(Math.max(0, j), Math.max(0, j2), timeUnit, ajdw));
	}

	public static ajde<Long> a(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajlg(Math.max(0, j), timeUnit, ajdw));
	}

	public static <T> ajde<T> a(ajdg<T> ajdg, ajcw ajcw) {
		ajfv.a((Object) ajdg, "source is null");
		ajfv.a((Object) ajcw, "mode is null");
		return ajvo.a(new ajiy(ajdg, ajcw));
	}

	private ajde<T> a(ajdw ajdw, boolean z) {
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajkz(this, ajdw, z));
	}

	private static <T, R> ajde<R> a(ajfc<? super Object[], ? extends R> ajfc, akuw<? extends T>... akuwArr) {
		int i = a;
		ajfv.a((Object) akuwArr, "sources is null");
		if (akuwArr.length == 0) {
			return ajvo.a(ajjl.b);
		}
		ajfv.a((Object) ajfc, "combiner is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajiu((akuw[]) akuwArr, (ajfc) ajfc, i));
	}

	public static <T> ajde<T> a(akuw<? extends T> akuw) {
		if (akuw instanceof ajde) {
			return ajvo.a((ajde) akuw);
		}
		ajfv.a((Object) akuw, "publisher is null");
		return ajvo.a(new ajjy(akuw));
	}

	private static <T> ajde<T> a(akuw<? extends T> akuw, akuw<? extends T> akuw2) {
		ajfv.a((Object) akuw, "source1 is null");
		ajfv.a((Object) akuw2, "source2 is null");
		return ajde.a(akuw, akuw2).a(ajfu.a, 2, a);
	}

	public static <T1, T2, R> ajde<R> a(akuw<? extends T1> akuw, akuw<? extends T2> akuw2, ajex<? super T1, ? super T2, ? extends R> ajex) {
		ajfv.a((Object) akuw, "source1 is null");
		ajfv.a((Object) akuw2, "source2 is null");
		return ajde.a(ajfu.a((ajex) ajex), akuw, akuw2);
	}

	public static <T1, T2, T3, R> ajde<R> a(akuw<? extends T1> akuw, akuw<? extends T2> akuw2, akuw<? extends T3> akuw3, ajfd<? super T1, ? super T2, ? super T3, ? extends R> ajfd) {
		ajfv.a((Object) akuw, "source1 is null");
		ajfv.a((Object) akuw2, "source2 is null");
		ajfv.a((Object) akuw3, "source3 is null");
		return ajde.a(ajfu.a((ajfd) ajfd), akuw, akuw2, akuw3);
	}

	public static <T> ajde<T> a(Iterable<? extends T> iterable) {
		ajfv.a((Object) iterable, "source is null");
		return ajvo.a(new ajjw(iterable));
	}

	public static <T, R> ajde<R> a(Iterable<? extends akuw<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc) {
		return ajde.a((Iterable) iterable, (ajfc) ajfc, a);
	}

	private static <T, R> ajde<R> a(Iterable<? extends akuw<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc, int i) {
		ajfv.a((Object) iterable, "sources is null");
		ajfv.a((Object) ajfc, "combiner is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajiu((Iterable) iterable, (ajfc) ajfc, i));
	}

	public static <T> ajde<T> a(Callable<? extends akuw<? extends T>> callable) {
		ajfv.a((Object) callable, "supplier is null");
		return ajvo.a(new ajja(callable));
	}

	public static <T> ajde<T> a(akuw<? extends T>... akuwArr) {
		return ajvo.a(new ajiv(akuwArr));
	}

	public static <T> ajde<T> a(T... tArr) {
		ajfv.a((Object) tArr, "items is null");
		return tArr.length == 0 ? ajvo.a(ajjl.b) : tArr.length == 1 ? ajde.b(tArr[0]) : ajvo.a(new ajju(tArr));
	}

	private ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajfb<? super akuy> ajfb3) {
		ajfv.a((Object) ajfb, "onNext is null");
		ajfv.a((Object) ajfb2, "onError is null");
		ajfv.a((Object) ajev, "onComplete is null");
		ajfv.a((Object) ajfb3, "onSubscribe is null");
		ajdh ajtt = new ajtt(ajfb, ajfb2, ajev, ajfb3);
		a(ajtt);
		return ajtt;
	}

	private <R> ajde<R> b(ajfc<? super T, ? extends akuw<? extends R>> ajfc, int i) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "bufferSize");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajlb(this, ajfc, i));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajjl.b) : ajkv.a(call, ajfc);
	}

	private <U> ajde<U> b(Class<U> cls) {
		ajfv.a((Object) cls, "clazz is null");
		return d(ajfu.a((Class) cls));
	}

	public static <T> ajde<T> b(T t) {
		ajfv.a((Object) t, "item is null");
		return ajvo.a(new ajkb(t));
	}

	public static <T> ajde<T> b(Throwable th) {
		ajfv.a((Object) th, "throwable is null");
		return ajde.c(ajfu.a((Object) th));
	}

	public static <T> ajde<T> b(Callable<? extends T> callable) {
		ajfv.a((Object) callable, "supplier is null");
		return ajvo.a(new ajjv(callable));
	}

	private static <T> ajde<T> c(Callable<? extends Throwable> callable) {
		ajfv.a((Object) callable, "errorSupplier is null");
		return ajvo.a(new ajjm(callable));
	}

	private ajde<T> d(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajjb(this, Math.max(0, j), timeUnit, ajdw));
	}

	public final ajde<T> a(long j) {
		return a(j, ajfu.g);
	}

	public final ajde<T> a(long j, ajfl<? super Throwable> ajfl) {
		if (j >= 0) {
			ajfv.a((Object) ajfl, "predicate is null");
			return ajvo.a(new ajks(this, j, ajfl));
		}
		throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
	}

	public final ajde<T> a(long j, TimeUnit timeUnit) {
		return b(j, timeUnit, ajwh.b);
	}

	public final <R> ajde<R> a(ajdi<? super T, ? extends R> ajdi) {
		return ajde.a(((ajdi) ajfv.a((Object) ajdi, "composer is null")).a(this));
	}

	public final ajde<T> a(ajdw ajdw) {
		return a(ajdw, a);
	}

	public final ajde<T> a(ajdw ajdw, int i) {
		ajfv.a((Object) ajdw, "scheduler is null");
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajkf(this, ajdw, i));
	}

	public final ajde<T> a(ajev ajev) {
		ajfv.a((Object) ajev, "onFinally is null");
		return ajvo.a(new ajjf(this, ajev));
	}

	public final ajde<T> a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
		ajfv.a((Object) ajfb, "onNext is null");
		ajfv.a((Object) ajfb2, "onError is null");
		ajfv.a((Object) ajev, "onComplete is null");
		ajfv.a((Object) ajev2, "onAfterTerminate is null");
		return ajvo.a(new ajjg(this, ajfb, ajfb2, ajev, ajev2));
	}

	public final <R> ajde<R> a(ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(2, "prefetch");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajiw(this, ajfc, 1));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajjl.b) : ajkv.a(call, ajfc);
	}

	public final <R> ajde<R> a(ajfc<? super T, ? extends ajeb<? extends R>> ajfc, int i) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "maxConcurrency");
		return ajvo.a(new ajjt(this, ajfc, i));
	}

	public final <R> ajde<R> a(ajfc<? super T, ? extends akuw<? extends R>> ajfc, int i, int i2) {
		ajfv.a((Object) ajfc, "mapper is null");
		ajfv.a(i, "maxConcurrency");
		ajfv.a(i2, "bufferSize");
		if (!(this instanceof ajgd)) {
			return ajvo.a(new ajjo(this, ajfc, false, i, i2));
		}
		Object call = ((ajgd) this).call();
		return call == null ? ajvo.a(ajjl.b) : ajkv.a(call, ajfc);
	}

	public final <U> ajde<U> a(Class<U> cls) {
		ajfv.a((Object) cls, "clazz is null");
		return b(ajfu.b((Class) cls)).b((Class) cls);
	}

	public final ajdx<Boolean> a(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "predicate is null");
		return ajvo.a(new ajip(this, ajfl));
	}

	public final <R> ajdx<R> a(R r, ajex<R, ? super T, R> ajex) {
		ajfv.a((Object) r, "seed is null");
		ajfv.a((Object) ajex, "reducer is null");
		return ajvo.a(new ajkn(this, r, ajex));
	}

	public final <U> ajdx<U> a(Callable<? extends U> callable, ajew<? super U, ? super T> ajew) {
		ajfv.a((Object) callable, "initialItemSupplier is null");
		ajfv.a((Object) ajew, "collector is null");
		return ajvo.a(new ajit(this, callable, ajew));
	}

	public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2) {
		return a((ajfb) ajfb, (ajfb) ajfb2, ajfu.c, a.INSTANCE);
	}

	public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev) {
		return a((ajfb) ajfb, (ajfb) ajfb2, ajev, a.INSTANCE);
	}

	public final void a(ajdh<? super T> ajdh) {
		ajfv.a((Object) ajdh, "s is null");
		try {
			Object a = ajvo.a(this, (akux) ajdh);
			ajfv.a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
			a_(a);
		} catch (NullPointerException e) {
			throw e;
		} catch (Throwable th) {
			ajep.a(th);
			ajvo.a(th);
			new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
		}
	}

	public final void a(akux<? super T> akux) {
		if (akux instanceof ajdh) {
			a((ajdh) akux);
			return;
		}
		ajfv.a((Object) akux, "s is null");
		a(new ajub(akux));
	}

	public abstract void a_(akux<? super T> akux);

	public final ajde<T> b(long j, TimeUnit timeUnit, ajdw ajdw) {
		ajfv.a((Object) timeUnit, "unit is null");
		ajfv.a((Object) ajdw, "scheduler is null");
		return ajvo.a(new ajiz(this, j, timeUnit, ajdw));
	}

	public final ajde<T> b(ajdw ajdw) {
		ajfv.a((Object) ajdw, "scheduler is null");
		return a(ajdw, !(this instanceof ajiy));
	}

	public final ajde<T> b(ajfb<? super T> ajfb) {
		ajfv.a((Object) ajfb, "onAfterNext is null");
		return ajvo.a(new ajje(this, ajfb));
	}

	public final <K> ajde<T> b(ajfc<? super T, K> ajfc) {
		ajfv.a((Object) ajfc, "keySelector is null");
		return ajvo.a(new ajjd(this, ajfc, ajfv.a));
	}

	public final ajde<T> b(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "predicate is null");
		return ajvo.a(new ajjn(this, ajfl));
	}

	public final ajde<T> b(akuw<? extends T> akuw) {
		ajfv.a((Object) akuw, "other is null");
		return ajde.a((akuw) this, (akuw) akuw);
	}

	public final ajdj<T> b() {
		return ajvo.a(new ajjj(this));
	}

	public final ajde<T> c(long j, TimeUnit timeUnit, ajdw ajdw) {
		return d(j, timeUnit, ajdw);
	}

	public final ajde<T> c(ajfb<? super Throwable> ajfb) {
		ajfb ajfb2 = ajfu.d;
		ajev ajev = ajfu.c;
		return a(ajfb2, (ajfb) ajfb, ajev, ajev);
	}

	public final <R> ajde<R> c(ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
		int i = a;
		return a((ajfc) ajfc, i, i);
	}

	public final ajde<T> c(ajfl<? super T> ajfl) {
		ajfv.a((Object) ajfl, "stopPredicate is null");
		return ajvo.a(new ajle(this, ajfl));
	}

	public final ajde<T> c(akuw<? extends T> akuw) {
		ajfv.a((Object) akuw, "other is null");
		return ajde.a(akuw, this);
	}

	public final ajde<T> c(T t) {
		ajfv.a((Object) t, "item is null");
		return ajde.a(ajde.b((Object) t), this);
	}

	public final ajdx<T> c() {
		return ajvo.a(new ajjk(this, null));
	}

	public final ajde<T> d() {
		int i = a;
		ajfv.a(i, "bufferSize");
		return ajvo.a(new ajkg(this, i, ajfu.c));
	}

	public final ajde<T> d(ajfb<? super T> ajfb) {
		ajfb ajfb2 = ajfu.d;
		ajev ajev = ajfu.c;
		return a((ajfb) ajfb, ajfb2, ajev, ajev);
	}

	public final <R> ajde<R> d(ajfc<? super T, ? extends R> ajfc) {
		ajfv.a((Object) ajfc, "mapper is null");
		return ajvo.a(new ajkc(this, ajfc));
	}

	public final <U> ajde<T> d(akuw<U> akuw) {
		ajfv.a((Object) akuw, "other is null");
		return ajvo.a(new ajld(this, akuw));
	}

	public final ajde<T> e() {
		return ajvo.a(new ajkh(this));
	}

	public final ajde<T> e(ajfc<? super Throwable, ? extends T> ajfc) {
		ajfv.a((Object) ajfc, "valueSupplier is null");
		return ajvo.a(new ajkl(this, ajfc));
	}

	public final ajej e(ajfb<? super T> ajfb) {
		return a((ajfb) ajfb, ajfu.e, ajfu.c, a.INSTANCE);
	}

	public final ajde<T> f() {
		return ajvo.a(new ajkj(this));
	}

	public final ajde<T> f(ajfc<? super ajde<Object>, ? extends akuw<?>> ajfc) {
		ajfv.a((Object) ajfc, "handler is null");
		return ajvo.a(new ajkq(this, ajfc));
	}

	public final ajde<T> g(ajfc<? super ajde<Throwable>, ? extends akuw<?>> ajfc) {
		ajfv.a((Object) ajfc, "handler is null");
		return ajvo.a(new ajkt(this, ajfc));
	}

	public final ajeu<T> g() {
		int i = a;
		ajfv.a(i, "bufferSize");
		AtomicReference atomicReference = new AtomicReference();
		return ajvo.a(new ajkm(new ajkm.a(atomicReference, i), this, atomicReference, i));
	}

	public final ajde<T> h() {
		return ajvo.a(new ajlc(this));
	}

	public final <R> ajde<R> h(ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
		return b(ajfc, a);
	}

	public final ajdx<List<T>> i() {
		return ajvo.a(new ajli(this));
	}

	public final ajdp<T> j() {
		return ajvo.a(new ajpf(this));
	}
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: ajfu */
// Functions
public final class ajfu {
	public static final ajfc<Object, Object> a = new u();
	public static final Runnable b = new p();
	public static final ajev c = new m();
	public static final ajfb<Object> d = new n();
	public static final ajfb<Throwable> e = new aa();
	public static final ajfk f = new o();
	public static final ajfl<Object> g = new ac();
	public static final Comparator<Object> h = new y();

	/* renamed from: ajfu$u */
	static final class u implements ajfc<Object, Object> {
		u() {
		}

		public final Object apply(Object obj) {
			return obj;
		}

		public final String toString() {
			return "IdentityFunction";
		}
	}

	/* renamed from: ajfu$p */
	static final class p implements Runnable {
		p() {
		}

		public final void run() {
		}

		public final String toString() {
			return "EmptyRunnable";
		}
	}

	/* renamed from: ajfu$m */
	static final class m implements ajev {
		m() {
		}

		public final void run() {
		}

		public final String toString() {
			return "EmptyAction";
		}
	}

	/* renamed from: ajfu$n */
	static final class n implements ajfb<Object> {
		n() {
		}

		public final void accept(Object obj) {
		}

		public final String toString() {
			return "EmptyConsumer";
		}
	}

	/* renamed from: ajfu$r */
	static final class r implements ajfb<Throwable> {
		r() {
		}

		public final /* synthetic */ void accept(Object obj) {
			ajvo.a((Throwable) obj);
		}
	}

	/* renamed from: ajfu$aa */
	static final class aa implements ajfb<Throwable> {
		aa() {
		}

		public final /* synthetic */ void accept(Object obj) {
			ajvo.a(new ajer((Throwable) obj));
		}
	}

	/* renamed from: ajfu$o */
	static final class o implements ajfk {
		o() {
		}
	}

	/* renamed from: ajfu$ac */
	static final class ac implements ajfl<Object> {
		ac() {
		}

		public final boolean test(Object obj) {
			return true;
		}
	}

	/* renamed from: ajfu$s */
	static final class s implements ajfl<Object> {
		s() {
		}

		public final boolean test(Object obj) {
			return false;
		}
	}

	/* renamed from: ajfu$z */
	static final class z implements Callable<Object> {
		z() {
		}

		public final Object call() {
			return null;
		}
	}

	/* renamed from: ajfu$y */
	static final class y implements Comparator<Object> {
		y() {
		}

		public final int compare(Object obj, Object obj2) {
			return ((Comparable) obj).compareTo(obj2);
		}
	}

	/* renamed from: ajfu$x */
	static final class x implements ajfb<akuy> {
		x() {
		}

		public final /* synthetic */ void accept(Object obj) {
			((akuy) obj).a(Long.MAX_VALUE);
		}
	}

	/* renamed from: ajfu$a */
	static final class a<T> implements ajfb<T> {
		private ajev a;

		a(ajev ajev) {
			this.a = ajev;
		}

		public final void accept(T t) {
			this.a.run();
		}
	}

	/* renamed from: ajfu$v */
	static final class v<T, U> implements ajfc<T, U>, Callable<U> {
		private U a;

		v(U u) {
			this.a = u;
		}

		public final U apply(T t) {
			return this.a;
		}

		public final U call() {
			return this.a;
		}
	}

	/* renamed from: ajfu$b */
	static final class b<T1, T2, R> implements ajfc<Object[], R> {
		private ajex<? super T1, ? super T2, ? extends R> a;

		b(ajex<? super T1, ? super T2, ? extends R> ajex) {
			this.a = ajex;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 2) {
				return this.a.apply(objArr[0], objArr[1]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 2 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$l */
	static final class l<T, U> implements ajfl<T> {
		private Class<U> a;

		l(Class<U> cls) {
			this.a = cls;
		}

		public final boolean test(T t) {
			return this.a.isInstance(t);
		}
	}

	/* renamed from: ajfu$k */
	static final class k<T, U> implements ajfc<T, U> {
		private Class<U> a;

		k(Class<U> cls) {
			this.a = cls;
		}

		public final U apply(T t) {
			return this.a.cast(t);
		}
	}

	/* renamed from: ajfu$c */
	static final class c<T1, T2, T3, R> implements ajfc<Object[], R> {
		private ajfd<T1, T2, T3, R> a;

		c(ajfd<T1, T2, T3, R> ajfd) {
			this.a = ajfd;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 3) {
				return this.a.apply(objArr[0], objArr[1], objArr[2]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 3 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$d */
	static final class d<T1, T2, T3, T4, R> implements ajfc<Object[], R> {
		private ajfe<T1, T2, T3, T4, R> a;

		d(ajfe<T1, T2, T3, T4, R> ajfe) {
			this.a = ajfe;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 4) {
				return this.a.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 4 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$i */
	static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements ajfc<Object[], R> {
		private ajfj<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> a;

		i(ajfj<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ajfj) {
			this.a = ajfj;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 9) {
				return this.a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 9 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$g */
	static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements ajfc<Object[], R> {
		private ajfh<T1, T2, T3, T4, T5, T6, T7, R> a;

		g(ajfh<T1, T2, T3, T4, T5, T6, T7, R> ajfh) {
			this.a = ajfh;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 7) {
				return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 7 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$e */
	static final class e<T1, T2, T3, T4, T5, R> implements ajfc<Object[], R> {
		private final ajff<T1, T2, T3, T4, T5, R> a;

		e(ajff<T1, T2, T3, T4, T5, R> ajff) {
			this.a = ajff;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 5) {
				return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 5 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$j */
	public static final class j<T> implements Callable<List<T>> {
		private int a;

		public j(int i) {
			this.a = i;
		}

		public final /* synthetic */ Object call() {
			return new ArrayList(this.a);
		}
	}

	/* renamed from: ajfu$f */
	static final class f<T1, T2, T3, T4, T5, T6, R> implements ajfc<Object[], R> {
		private ajfg<T1, T2, T3, T4, T5, T6, R> a;

		f(ajfg<T1, T2, T3, T4, T5, T6, R> ajfg) {
			this.a = ajfg;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 6) {
				return this.a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 6 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$t */
	public enum t implements Callable<Set<Object>> {
		;

		private t(String str) {
		}
	}

	/* renamed from: ajfu$ab */
	static final class ab<K, V, T> implements ajew<Map<K, V>, T> {
		private final ajfc<? super T, ? extends V> a;
		private final ajfc<? super T, ? extends K> b;

		ab(ajfc<? super T, ? extends V> ajfc, ajfc<? super T, ? extends K> ajfc2) {
			this.a = ajfc;
			this.b = ajfc2;
		}

		public final /* synthetic */ void accept(Object obj, Object obj2) {
			((Map) obj).put(this.b.apply(obj2), this.a.apply(obj2));
		}
	}

	/* renamed from: ajfu$h */
	static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements ajfc<Object[], R> {
		private ajfi<T1, T2, T3, T4, T5, T6, T7, T8, R> a;

		h(ajfi<T1, T2, T3, T4, T5, T6, T7, T8, R> ajfi) {
			this.a = ajfi;
		}

		public final /* synthetic */ Object apply(Object obj) {
			Object[] objArr = (Object[]) obj;
			if (objArr.length == 8) {
				return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
			}
			StringBuilder stringBuilder = new StringBuilder("Array of size 8 expected but got ");
			stringBuilder.append(objArr.length);
			throw new IllegalArgumentException(stringBuilder.toString());
		}
	}

	/* renamed from: ajfu$q */
	public static final class q<T> implements ajfl<T> {
		private T a;

		public q(T t) {
			this.a = t;
		}

		public final boolean test(T t) {
			return ajfv.a((Object) t, this.a);
		}
	}

	/* renamed from: ajfu$w */
	static final class w<T> implements ajfc<List<T>, List<T>> {
		private Comparator<? super T> a;

		w(Comparator<? super T> comparator) {
			this.a = comparator;
		}

		public final /* synthetic */ Object apply(Object obj) {
			List list = (List) obj;
			Collections.sort(list, this.a);
			return list;
		}
	}

	static {
		r rVar = new r();
		s sVar = new s();
		z zVar = new z();
		x xVar = new x();
	}

	public static <T, K, V> ajew<Map<K, V>, T> a(ajfc<? super T, ? extends K> ajfc, ajfc<? super T, ? extends V> ajfc2) {
		return new ab(ajfc2, ajfc);
	}

	public static <T> ajfb<T> a(ajev ajev) {
		return new a(ajev);
	}

	public static <T1, T2, R> ajfc<Object[], R> a(ajex<? super T1, ? super T2, ? extends R> ajex) {
		ajfv.a((Object) ajex, "f is null");
		return new b(ajex);
	}

	public static <T1, T2, T3, R> ajfc<Object[], R> a(ajfd<T1, T2, T3, R> ajfd) {
		ajfv.a((Object) ajfd, "f is null");
		return new c(ajfd);
	}

	public static <T1, T2, T3, T4, R> ajfc<Object[], R> a(ajfe<T1, T2, T3, T4, R> ajfe) {
		ajfv.a((Object) ajfe, "f is null");
		return new d(ajfe);
	}

	public static <T1, T2, T3, T4, T5, R> ajfc<Object[], R> a(ajff<T1, T2, T3, T4, T5, R> ajff) {
		ajfv.a((Object) ajff, "f is null");
		return new e(ajff);
	}

	public static <T1, T2, T3, T4, T5, T6, R> ajfc<Object[], R> a(ajfg<T1, T2, T3, T4, T5, T6, R> ajfg) {
		ajfv.a((Object) ajfg, "f is null");
		return new f(ajfg);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, R> ajfc<Object[], R> a(ajfh<T1, T2, T3, T4, T5, T6, T7, R> ajfh) {
		ajfv.a((Object) ajfh, "f is null");
		return new g(ajfh);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, R> ajfc<Object[], R> a(ajfi<T1, T2, T3, T4, T5, T6, T7, T8, R> ajfi) {
		ajfv.a((Object) ajfi, "f is null");
		return new h(ajfi);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ajfc<Object[], R> a(ajfj<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ajfj) {
		ajfv.a((Object) ajfj, "f is null");
		return new i(ajfj);
	}

	public static <T, U> ajfc<T, U> a(Class<U> cls) {
		return new k(cls);
	}

	public static <T> ajfc<List<T>, List<T>> a(Comparator<? super T> comparator) {
		return new w(comparator);
	}

	public static <T> Callable<T> a(T t) {
		return new v(t);
	}

	public static <T, U> ajfc<T, U> b(U u) {
		return new v(u);
	}

	public static <T, U> ajfl<T> b(Class<U> cls) {
		return new l(cls);
	}
}

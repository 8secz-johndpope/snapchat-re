package defpackage;

/* renamed from: ajfv */
// ObjectHelper
public final class ajfv {
	public static final ajey<Object, Object> a = new a();

	/* renamed from: ajfv$a */
	static final class a implements ajey<Object, Object> {
		a() {
		}

		public final boolean test(Object obj, Object obj2) {
			return ajfv.a(obj, obj2);
		}
	}

	private ajfv() {
		throw new IllegalStateException("No instances!");
	}

	public static int a(int i, String str) {
		if (i > 0) {
			return i;
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);
		stringBuilder.append(" > 0 required but it was ");
		stringBuilder.append(i);
		throw new IllegalArgumentException(stringBuilder.toString());
	}

	public static int a(long j, long j2) {
		return j < j2 ? -1 : j > j2 ? 1 : 0;
	}

	// Null check
	public static <T> T a(T t, String str) {
		if (t != null) {
			return t;
		}
		throw new NullPointerException(str);
	}

	public static boolean a(Object obj, Object obj2) {
		return obj == obj2 || (obj != null && obj.equals(obj2));
	}
}

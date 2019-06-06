// Exception handling class

package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: akcr */
public class akcr {
	private akcr() {
	}

	public static int a(int i, int i2) {
		return i < i2 ? -1 : i == i2 ? 0 : 1;
	}

	public static String a(String str, Object obj) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);
		stringBuilder.append(obj);
		return stringBuilder.toString();
	}

	private static <T extends Throwable> T a(T t) {
		return akcr.a((Throwable) t, akcr.class.getName());
	}

	static <T extends Throwable> T a(T t, String str) {
		StackTraceElement[] stackTrace = t.getStackTrace();
		int length = stackTrace.length;
		int i = -1;
		for (int i2 = 0; i2 < length; i2++) {
			if (str.equals(stackTrace[i2].getClassName())) {
				i = i2;
			}
		}
		List subList = Arrays.asList(stackTrace).subList(i + 1, length);
		t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
		return t;
	}

	public static void a() {
		throw ((ajxd) akcr.a(new ajxd()));
	}

	public static void a(Object obj, String str) {
		if (obj == null) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(str);
			stringBuilder.append(" must not be null");
			throw ((IllegalStateException) akcr.a(new IllegalStateException(stringBuilder.toString())));
		}
	}

	// Throw RuntimeException that a lateinit property is uninitialized
	public static void a(String str) {
		StringBuilder stringBuilder = new StringBuilder("lateinit property ");
		stringBuilder.append(str);
		stringBuilder.append(" has not been initialized");
		akcr.b(stringBuilder.toString());
	}

	public static boolean a(float f, Float f2) {
		return f2 != null && f == f2.floatValue();
	}

	public static boolean a(Double d, double d2) {
		return d != null && d.doubleValue() == d2;
	}

	public static boolean a(Float f, float f2) {
		return f != null && f.floatValue() == f2;
	}

	// Safe equality check
	public static boolean a(Object obj, Object obj2) {
		return obj == null ? obj2 == null : obj.equals(obj2);
	}

	// Null check
	public static void b(Object obj, String str) {
		if (obj == null) {
			akcr.c(str);
		}
	}

	// throw(str)
	private static void b(String str) {
		// ajxv inherits RuntimeException
		throw ((ajxv) akcr.a(new ajxv(str)));
	}

	private static void c(String str) {
		StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
		String className = stackTraceElement.getClassName();
		String methodName = stackTraceElement.getMethodName();
		StringBuilder stringBuilder = new StringBuilder("Parameter specified as non-null is null: method ");
		stringBuilder.append(className);
		stringBuilder.append(".");
		stringBuilder.append(methodName);
		stringBuilder.append(", parameter ");
		stringBuilder.append(str);
		throw ((IllegalArgumentException) akcr.a(new IllegalArgumentException(stringBuilder.toString())));
	}
}

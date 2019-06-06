package defpackage;

/* renamed from: akde */
// Reflection
public final class akde {
	public static akei a(Class cls) {
		return new akcm(cls);
	}

	public static akej a(Class cls, String str) {
		return new akcw(cls, str);
	}

	// renderLambdaToString
	public static String a(akcp akcp) {
		String obj = akcp.getClass().getGenericInterfaces()[0].toString();
		return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
	}
}

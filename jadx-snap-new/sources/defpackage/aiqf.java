package defpackage;

/* renamed from: aiqf */
// dagger.internal.Preconditions
public final class aiqf {
	// checkNotNull
	public static <T> T a(T t) {
		if (t != null) {
			return t;
		}
		throw new NullPointerException();
	}

	// checkNotNull
	public static <T> T a(T t, String str) {
		if (t != null) {
			return t;
		}
		throw new NullPointerException(str);
	}

	// checkNotNull
	public static <T> T a(T t, String str, Object obj) {
		if (t != null) {
			return t;
		}
		String str2 = "%s";
		if (!str.contains(str2)) {
			throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
		} else if (str.indexOf(str2) == str.lastIndexOf(str2)) {
			throw new NullPointerException(str.replace(str2, obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
		} else {
			throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
		}
	}
}

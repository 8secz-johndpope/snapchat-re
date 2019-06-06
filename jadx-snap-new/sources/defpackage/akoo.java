package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: akoo */
public final class akoo {
    private static String a(String str) {
        String str2 = "cr_";
        if (str.startsWith(str2)) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        StringBuilder stringBuilder = new StringBuilder(str2);
        stringBuilder.append(str.substring(i, str.length()));
        return stringBuilder.toString();
    }

    private static String a(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    private static Throwable a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        return !(obj instanceof Throwable) ? null : (Throwable) obj;
    }

    public static void a(String str, String str2, Object... objArr) {
        str2 = akoo.a(str2, objArr);
        Throwable a = akoo.a(objArr);
        if (a != null) {
            Log.i(akoo.a(str), str2, a);
        } else {
            Log.i(akoo.a(str), str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        str2 = akoo.a(str2, objArr);
        Throwable a = akoo.a(objArr);
        if (a != null) {
            Log.w(akoo.a(str), str2, a);
        } else {
            Log.w(akoo.a(str), str2);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        str2 = akoo.a(str2, objArr);
        Throwable a = akoo.a(objArr);
        if (a != null) {
            Log.e(akoo.a(str), str2, a);
        } else {
            Log.e(akoo.a(str), str2);
        }
    }
}

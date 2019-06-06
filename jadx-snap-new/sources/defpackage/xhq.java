package defpackage;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: xhq */
public final class xhq {
    private static boolean a;
    private static final Pattern b = Pattern.compile("\\$\\d+$");
    private static a c = null;

    /* renamed from: xhq$a */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, Throwable th);
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str);
            }
            Log.e(b, str);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str, th);
            }
            Log.e(b, str, th);
        }
    }

    public static void a(a aVar) {
        c = aVar;
    }

    public static void a(boolean z) {
        a = z;
    }

    public static boolean a() {
        return a;
    }

    private static String b() {
        String className = Thread.currentThread().getStackTrace()[4].getClassName();
        Matcher matcher = b.matcher(className);
        if (matcher != null && matcher.find()) {
            className = matcher.replaceAll("");
        }
        return className.substring(className.lastIndexOf(46) + 1);
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str);
            }
            Log.w(b, str);
        }
    }

    public static void c(String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str);
            }
            Log.i(b, str);
        }
    }

    public static void d(String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str);
            }
            Log.d(b, str);
        }
    }

    public static void e(String str, Object... objArr) {
        if (a) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            String b = xhq.b();
            a aVar = c;
            if (aVar != null) {
                aVar.a(b, str);
            }
            Log.v(b, str);
        }
    }
}

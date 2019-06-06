package defpackage;

import android.util.Log;

/* renamed from: abpe */
public class abpe {
    public static void a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-ERROR");
    }

    public static void a(String str, Throwable th, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-ERROR");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append("\n");
        stringBuilder2.append(Log.getStackTraceString(th));
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
    }

    public static void b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("-ERROR");
    }
}

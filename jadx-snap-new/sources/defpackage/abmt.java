package defpackage;

import android.util.Log;
import java.io.IOException;

/* renamed from: abmt */
public final class abmt {
    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        th = abmt.d(th);
        StringBuilder stringBuilder = new StringBuilder("{exception:{");
        stringBuilder.append(th.getClass().getName());
        stringBuilder.append("}, msg:{");
        stringBuilder.append(th.getMessage());
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public static String b(Throwable th) {
        return th == null ? null : Log.getStackTraceString(th);
    }

    public static boolean c(Throwable th) {
        return (th instanceof IOException) && th.getMessage() != null && th.getMessage().contains("ENOSPC");
    }

    private static Throwable d(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }
}

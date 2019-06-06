package defpackage;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: akpj */
public final class akpj {
    private static final Method a;
    private static final Method b;

    static {
        try {
            a = TrafficStats.class.getMethod("setThreadStatsUid", new Class[]{Integer.TYPE});
            b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get TrafficStats methods", e);
        }
    }

    public static void a() {
        String str = "TrafficStats.clearThreadStatsUid failed";
        try {
            b.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(str, e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(str, e2);
        }
    }

    public static void a(int i) {
        String str = "TrafficStats.setThreadStatsUid failed";
        try {
            a.invoke(null, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(str, e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(str, e2);
        }
    }
}

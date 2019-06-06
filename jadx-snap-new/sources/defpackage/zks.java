package defpackage;

import com.snap.ui.view.TakeSnapButton;
import java.util.Calendar;

/* renamed from: zks */
public final class zks {
    static {
        zks zks = new zks();
    }

    private zks() {
    }

    private static int a(long j) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        Calendar instance3 = Calendar.getInstance();
        instance3.set(instance.get(1), instance2.get(2), instance2.get(5), 0, 0, 0);
        return ((instance.get(1) - instance2.get(1)) - 1) + instance.after(instance3);
    }

    public static boolean a(Long l, int i) {
        return (l != null ? zks.a(((Number) l).longValue()) : 39) < 40 ? i < 10 : i < TakeSnapButton.LONG_PRESS_TIME;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: abxv */
public final class abxv {
    static {
        abxv abxv = new abxv();
    }

    private abxv() {
    }

    public static Vibrator a(Context context) {
        akcr.b(context, "context");
        try {
            Object systemService = context.getSystemService("vibrator");
            if (!(systemService instanceof Vibrator)) {
                systemService = null;
            }
            return (Vibrator) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Context context, long j) {
        akcr.b(context, "context");
        abxv.a(abxv.a(context), j);
    }

    public static void a(Vibrator vibrator, long j) {
        if (vibrator != null) {
            try {
                if (VERSION.SDK_INT < 26) {
                    vibrator.vibrate(j);
                } else {
                    vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
                }
            } catch (Throwable unused) {
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.provider.Settings.Global;

/* renamed from: abtw */
public final class abtw {
    private static volatile boolean a;

    private static boolean a() {
        abss a = abss.a();
        return a.c() || a.n();
    }

    private static boolean a(float f) {
        return Math.abs(f) < 0.001f;
    }

    public static boolean a(Context context) {
        return abtw.a() ? abtw.a(Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)) : false;
    }
}

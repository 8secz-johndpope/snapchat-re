package defpackage;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: in */
public final class in {
    public static void a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}

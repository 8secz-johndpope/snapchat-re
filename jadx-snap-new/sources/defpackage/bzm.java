package defpackage;

import android.os.Trace;

/* renamed from: bzm */
public final class bzm {
    public static void a() {
        if (bzo.a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (bzo.a >= 18) {
            Trace.beginSection(str);
        }
    }
}

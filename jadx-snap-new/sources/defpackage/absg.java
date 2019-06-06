package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: absg */
final class absg {
    final boolean a;
    private final absf b;

    absg() {
        this(absg.b(), absg.b() ? new absd() : null);
    }

    private absg(boolean z, absf absf) {
        this.a = z;
        this.b = absf;
    }

    private static boolean b() {
        return VERSION.SDK_INT >= 24 && Build.BRAND.toLowerCase(Locale.US).equals("oneplus");
    }

    public final boolean a() {
        if (this.a) {
            absf absf = this.b;
            if (absf != null && absf.a()) {
                return true;
            }
        }
        return false;
    }
}

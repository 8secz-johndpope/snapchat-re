package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: alsu */
public final class alsu {
    public static alss a(Context context, alst alst) {
        int i = VERSION.SDK_INT;
        alss alsp = i < 5 ? new alsp(context) : i < 8 ? new alsq(context) : new alsr(context);
        alsp.a(alst);
        return alsp;
    }
}

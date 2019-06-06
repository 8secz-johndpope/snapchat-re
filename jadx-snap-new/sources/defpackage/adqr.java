package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: adqr */
public final class adqr {
    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }
}

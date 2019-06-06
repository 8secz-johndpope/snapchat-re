package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.crashlytics.android.CrashlyticsInitProvider.a;

/* renamed from: aqs */
public final class aqs implements a {
    public final boolean a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (!(bundle == null || bundle.getBoolean("firebase_crashlytics_collection_enabled", true))) {
                return false;
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }
}

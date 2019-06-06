package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: airl */
public final class airl {
    public static boolean a(Context context) {
        if (airf.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        Object obj;
        Object obj2 = airf.a(context, "google_app_id", "string") != 0 ? 1 : null;
        aird aird = new aird();
        if (TextUtils.isEmpty(aird.b(context))) {
            aird = new aird();
            if (TextUtils.isEmpty(aird.c(context))) {
                obj = null;
                return obj2 == null && obj == null;
            }
        }
        obj = 1;
        if (obj2 == null) {
        }
    }
}

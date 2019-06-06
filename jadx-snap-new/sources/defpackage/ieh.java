package defpackage;

import android.provider.Settings.Secure;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: ieh */
public final class ieh {
    public static String a() {
        return String.valueOf(Secure.getString(AppContext.get().getContentResolver(), "android_id").hashCode() % 1000000);
    }
}

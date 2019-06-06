package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: aird */
public final class aird {
    public static String a(Context context) {
        CharSequence b = aird.b(context);
        if (TextUtils.isEmpty(b)) {
            b = aird.c(context);
        }
        String str = "Fabric";
        if (TextUtils.isEmpty(b)) {
            airl airl = new airl();
            int a = airf.a(context, "google_app_id", "string");
            if (a != 0) {
                aiqj.a().a(str, "Generating Crashlytics ApiKey from google_app_id in Strings");
                b = airf.a(context.getResources().getString(a), "SHA-256").substring(0, 40);
            } else {
                b = null;
            }
        }
        if (TextUtils.isEmpty(b)) {
            String str2 = "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
            if (aiqj.b() || airf.d(context)) {
                throw new IllegalArgumentException(str2);
            }
            aiqj.a().e(str, str2);
        }
        return b;
    }

    protected static String b(Context context) {
        Object e;
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    aiqj.a().a(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                aiqj.a().a(str, "Falling back to Crashlytics key lookup from Manifest");
                str2 = bundle.getString("com.crashlytics.ApiKey");
                return str2;
            } catch (Exception e2) {
                e = e2;
                str2 = string;
                aiqj.a().a(str, "Caught non-fatal exception while retrieving apiKey: ".concat(String.valueOf(e)));
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    protected static String c(Context context) {
        String str = "string";
        int a = airf.a(context, "io.fabric.ApiKey", str);
        if (a == 0) {
            aiqj.a().a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = airf.a(context, "com.crashlytics.ApiKey", str);
        }
        return a != 0 ? context.getResources().getString(a) : null;
    }
}

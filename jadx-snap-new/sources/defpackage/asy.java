package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: asy */
final class asy implements ato {
    private final Context a;
    private final String b;

    public asy(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final String a() {
        try {
            Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.b, 128).metaData;
            return bundle != null ? bundle.getString("io.fabric.unity.crashlytics.version") : null;
        } catch (Exception unused) {
            return null;
        }
    }
}

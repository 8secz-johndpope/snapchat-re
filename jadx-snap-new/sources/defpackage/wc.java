package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: wc */
public final class wc {
    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("BraintreeApi", 0);
    }
}

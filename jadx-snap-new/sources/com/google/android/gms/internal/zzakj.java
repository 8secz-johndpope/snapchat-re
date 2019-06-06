package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class zzakj implements Callable<String> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ Context zzdhv;

    zzakj(zzaki zzaki, Context context, Context context2) {
        this.zzdhv = context;
        this.val$context = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        String str = "admob_user_agent";
        int i = 0;
        if (this.zzdhv != null) {
            zzahw.v("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzdhv.getSharedPreferences(str, 0);
        } else {
            zzahw.v("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences(str, 0);
            i = 1;
        }
        str = "user_agent";
        Object string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            zzahw.v("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (i != 0) {
                sharedPreferences.edit().putString(str, string).apply();
                zzahw.v("Persisting user agent.");
            }
        }
        return string;
    }
}

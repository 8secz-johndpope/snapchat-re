package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.zzs;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzb {
    private SharedPreferences zzang;

    public zzb(Context context) {
        try {
            context = zzs.getRemoteContext(context);
            this.zzang = context == null ? null : context.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.zzang = null;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.zzang == null ? false : this.zzang.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* Access modifiers changed, original: final */
    public final float getFloat(String str, float f) {
        try {
            return this.zzang == null ? MapboxConstants.MINIMUM_ZOOM : this.zzang.getFloat(str, MapboxConstants.MINIMUM_ZOOM);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return MapboxConstants.MINIMUM_ZOOM;
        }
    }

    /* Access modifiers changed, original: final */
    public final String getString(String str, String str2) {
        try {
            return this.zzang == null ? str2 : this.zzang.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}

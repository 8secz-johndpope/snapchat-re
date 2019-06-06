package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import org.json.JSONObject;

@zzabh
public abstract class zzny<T> {
    private final int zzbkq;
    private final String zzbkr;
    private final T zzbks;

    private zzny(int i, String str, T t) {
        this.zzbkq = i;
        this.zzbkr = str;
        this.zzbks = t;
        zzlc.zzin().zza(this);
    }

    /* synthetic */ zzny(int i, String str, Object obj, zznz zznz) {
        this(i, str, obj);
    }

    public static zzny<String> zza(int i, String str) {
        zzny zza = zza(i, str, null);
        zzlc.zzin().zzb(zza);
        return zza;
    }

    public static zzny<Float> zza(int i, String str, float f) {
        return new zzoc(i, str, Float.valueOf(MapboxConstants.MINIMUM_ZOOM));
    }

    public static zzny<Integer> zza(int i, String str, int i2) {
        return new zzoa(i, str, Integer.valueOf(i2));
    }

    public static zzny<Long> zza(int i, String str, long j) {
        return new zzob(i, str, Long.valueOf(j));
    }

    public static zzny<Boolean> zza(int i, String str, Boolean bool) {
        return new zznz(i, str, bool);
    }

    public static zzny<String> zza(int i, String str, String str2) {
        return new zzod(i, str, str2);
    }

    public static zzny<String> zzb(int i, String str) {
        zzny zza = zza(i, str, null);
        zzlc.zzin().zzc(zza);
        return zza;
    }

    public final String getKey() {
        return this.zzbkr;
    }

    public final int getSource() {
        return this.zzbkq;
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract void zza(Editor editor, T t);

    public abstract T zzb(JSONObject jSONObject);

    public final T zzje() {
        return this.zzbks;
    }
}

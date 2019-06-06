package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import com.samsung.android.sdk.camera.SCamera;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzaji {
    private final Object mLock = new Object();
    private String zzdgh;
    private String zzdgi;
    private boolean zzdgj;
    private String zzdgk;

    public zzaji() {
        String str = "";
        this.zzdgh = str;
        this.zzdgi = str;
        this.zzdgj = false;
        this.zzdgk = str;
    }

    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzaij.zzdfn.post(new zzajj(this, context, str, z, z2));
        } else {
            zzaky.zzcy("Can not create dialog without Activity Context");
        }
    }

    private final String zzaw(Context context) {
        String str;
        synchronized (this.mLock) {
            if (TextUtils.isEmpty(this.zzdgh)) {
                zzbt.zzel();
                this.zzdgh = zzaij.zzm(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.zzdgh)) {
                    zzbt.zzel();
                    this.zzdgh = zzaij.zzrc();
                    zzbt.zzel();
                    zzaij.zzf(context, "debug_signals_id.txt", this.zzdgh);
                }
            }
            str = this.zzdgh;
        }
        return str;
    }

    private final Uri zzc(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzaw(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final boolean zzh(Context context, String str, String str2) {
        String zzj = zzj(context, zzc(context, (String) zzlc.zzio().zzd(zzoi.zzbuu), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzj)) {
            zzaky.zzby("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzj.trim());
            zzj = jSONObject.optString("gct");
            this.zzdgk = jSONObject.optString("status");
            synchronized (this.mLock) {
                this.zzdgi = zzj;
            }
            return true;
        } catch (JSONException e) {
            zzaky.zzc("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final boolean zzi(Context context, String str, String str2) {
        String zzj = zzj(context, zzc(context, (String) zzlc.zzio().zzd(zzoi.zzbuv), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzj)) {
            zzaky.zzby("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = SCamera.CAMERA_ID_FRONT.equals(new JSONObject(zzj.trim()).optString("debug_mode"));
            synchronized (this.mLock) {
                this.zzdgj = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzaky.zzc("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private static String zzj(Context context, String str, String str2) {
        Throwable e;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzbt.zzel().zzl(context, str2));
        zzalt zzb = new zzajr(context).zzb(str, hashMap);
        try {
            return (String) zzb.get((long) ((Integer) zzlc.zzio().zzd(zzoi.zzbux)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str3 = "Timeout while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(str3);
                zzaky.zzb(str, e);
                zzb.cancel(true);
                return null;
            }
            str = str3.concat(str);
            zzaky.zzb(str, e);
            zzb.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str3 = "Interrupted while retriving a response from: ";
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(str3);
                zzaky.zzb(str, e);
                zzb.cancel(true);
                return null;
            }
            str = str3.concat(str);
            zzaky.zzb(str, e);
            zzb.cancel(true);
            return null;
        } catch (Exception e4) {
            str2 = "Error retriving a response from: ";
            str = String.valueOf(str);
            zzaky.zzb(str.length() != 0 ? str2.concat(str) : new String(str2), e4);
            return null;
        }
    }

    private final void zzk(Context context, String str, String str2) {
        zzbt.zzel();
        zzaij.zza(context, zzc(context, (String) zzlc.zzio().zzd(zzoi.zzbut), str, str2));
    }

    public final void zza(Context context, String str, String str2, String str3) {
        boolean zzrr = zzrr();
        if (zzi(context, str, str2)) {
            if (!(zzrr || TextUtils.isEmpty(str3))) {
                zzb(context, str2, str3, str);
            }
            zzaky.zzby("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzk(context, str, str2);
    }

    public final void zzb(Context context, String str, String str2, String str3) {
        Builder buildUpon = zzc(context, (String) zzlc.zzio().zzd(zzoi.zzbuw), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzbt.zzel();
        zzaij.zze(context, str, buildUpon.build().toString());
    }

    public final void zzg(Context context, String str, String str2) {
        if (zzh(context, str, str2)) {
            if ("2".equals(this.zzdgk)) {
                zzaky.zzby("Creative is not pushed for this device.");
                zza(context, "There was no creative pushed from DFP to the device.", false, false);
                return;
            }
            if (SCamera.CAMERA_ID_FRONT.equals(this.zzdgk)) {
                zzaky.zzby("The app is not linked for creative preview.");
                zzk(context, str, str2);
                return;
            }
            if ("0".equals(this.zzdgk)) {
                zzaky.zzby("Device is linked for in app preview.");
                zza(context, "The device is successfully linked for creative preview.", false, true);
            }
            return;
        }
        zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }

    public final String zzrq() {
        String str;
        synchronized (this.mLock) {
            str = this.zzdgi;
        }
        return str;
    }

    public final boolean zzrr() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdgj;
        }
        return z;
    }
}

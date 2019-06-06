package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

@zzabh
public class zzks {
    private final Object mLock = new Object();
    private zzmb zzbih;
    private final zzkj zzbii;
    private final zzki zzbij;
    private final zznc zzbik;
    private final zzso zzbil;
    private final zzafg zzbim;
    private final zzyp zzbin;
    private final zzsp zzbio;

    abstract class zza<T> {
        zza() {
        }

        public abstract T zza(zzmb zzmb);

        public abstract T zzif();

        /* Access modifiers changed, original: protected|final */
        public final T zzig() {
            zzmb zza = zzks.this.zzie();
            if (zza == null) {
                zzaky.zzcz("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return zza(zza);
            } catch (RemoteException e) {
                zzaky.zzc("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final T zzih() {
            try {
                return zzif();
            } catch (RemoteException e) {
                zzaky.zzc("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public zzks(zzkj zzkj, zzki zzki, zznc zznc, zzso zzso, zzafg zzafg, zzyp zzyp, zzsp zzsp) {
        this.zzbii = zzkj;
        this.zzbij = zzki;
        this.zzbik = zznc;
        this.zzbil = zzso;
        this.zzbim = zzafg;
        this.zzbin = zzyp;
        this.zzbio = zzsp;
    }

    static <T> T zza(Context context, boolean z, zza<T> zza) {
        if (!z) {
            zzlc.zzij();
            if (!zzako.zzbb(context)) {
                zzaky.zzby("Google Play Services is not available");
                z = true;
            }
        }
        zzlc.zzij();
        int zzbd = zzako.zzbd(context);
        zzlc.zzij();
        if (zzbd > zzako.zzbc(context)) {
            z = true;
        }
        Object zzig;
        if (z) {
            zzig = zza.zzig();
            return zzig == null ? zza.zzih() : zzig;
        } else {
            zzig = zza.zzih();
            return zzig == null ? zza.zzig() : zzig;
        }
    }

    private static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzlc.zzij().zza(context, null, "gmob-apps", bundle, true);
    }

    private static zzmb zzid() {
        try {
            Object newInstance = zzks.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return zzmc.asInterface((IBinder) newInstance);
            }
            zzaky.zzcz("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e) {
            zzaky.zzc("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    private final zzmb zzie() {
        zzmb zzmb;
        synchronized (this.mLock) {
            if (this.zzbih == null) {
                this.zzbih = zzid();
            }
            zzmb = this.zzbih;
        }
        return zzmb;
    }

    public final zzlo zzb(Context context, String str, zzwf zzwf) {
        return (zzlo) zza(context, false, new zzkw(this, context, str, zzwf));
    }

    public final zzyq zzb(Activity activity) {
        Intent intent = activity.getIntent();
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        boolean z = false;
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            zzaky.e("useClientJar flag not found in activity intent extras.");
        }
        return (zzyq) zza((Context) activity, z, new zzlb(this, activity));
    }
}

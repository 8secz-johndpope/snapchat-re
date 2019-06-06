package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzmd extends zzev implements zzmb {
    zzmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzlo createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzwf zzwf, int i) {
        zzlo zzlo;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(i);
        Parcel zza = zza(3, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlo = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzlo = queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new zzlq(readStrongBinder);
        }
        zza.recycle();
        return zzlo;
    }

    public final zzyq createAdOverlay(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        Parcel zza = zza(8, zzbc);
        zzyq zzv = zzyr.zzv(zza.readStrongBinder());
        zza.recycle();
        return zzv;
    }

    public final zzlt createBannerAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i) {
        zzlt zzlt;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(i);
        Parcel zza = zza(1, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlt = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzlt = queryLocalInterface instanceof zzlt ? (zzlt) queryLocalInterface : new zzlv(readStrongBinder);
        }
        zza.recycle();
        return zzlt;
    }

    public final zzza createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        Parcel zza = zza(7, zzbc);
        zzza zzx = zzzb.zzx(zza.readStrongBinder());
        zza.recycle();
        return zzx;
    }

    public final zzlt createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i) {
        zzlt zzlt;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(i);
        Parcel zza = zza(2, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlt = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzlt = queryLocalInterface instanceof zzlt ? (zzlt) queryLocalInterface : new zzlv(readStrongBinder);
        }
        zza.recycle();
        return zzlt;
    }

    public final zzqw createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (IInterface) iObjectWrapper2);
        Parcel zza = zza(5, zzbc);
        zzqw zzl = zzqx.zzl(zza.readStrongBinder());
        zza.recycle();
        return zzl;
    }

    public final zzrb createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (IInterface) iObjectWrapper2);
        zzex.zza(zzbc, (IInterface) iObjectWrapper3);
        Parcel zza = zza(11, zzbc);
        zzrb zzm = zzrc.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    public final zzaex createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzwf zzwf, int i) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(i);
        Parcel zza = zza(6, zzbc);
        zzaex zzz = zzaey.zzz(zza.readStrongBinder());
        zza.recycle();
        return zzz;
    }

    public final zzlt createSearchAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, int i) {
        zzlt zzlt;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzbc.writeString(str);
        zzbc.writeInt(i);
        Parcel zza = zza(10, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlt = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzlt = queryLocalInterface instanceof zzlt ? (zzlt) queryLocalInterface : new zzlv(readStrongBinder);
        }
        zza.recycle();
        return zzlt;
    }

    public final zzmh getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        zzmh zzmh;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        Parcel zza = zza(4, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzmh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzmh = queryLocalInterface instanceof zzmh ? (zzmh) queryLocalInterface : new zzmj(readStrongBinder);
        }
        zza.recycle();
        return zzmh;
    }

    public final zzmh getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        zzmh zzmh;
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeInt(i);
        Parcel zza = zza(9, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzmh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzmh = queryLocalInterface instanceof zzmh ? (zzmh) queryLocalInterface : new zzmj(readStrongBinder);
        }
        zza.recycle();
        return zzmh;
    }
}

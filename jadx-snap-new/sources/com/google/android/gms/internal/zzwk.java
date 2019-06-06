package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.util.List;

public final class zzwk extends zzev implements zzwi {
    zzwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void destroy() {
        zzb(5, zzbc());
    }

    public final Bundle getInterstitialAdapterInfo() {
        Parcel zza = zza(18, zzbc());
        Bundle bundle = (Bundle) zzex.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final zzmm getVideoController() {
        Parcel zza = zza(26, zzbc());
        zzmm zzh = zzmn.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    public final IObjectWrapper getView() {
        Parcel zza = zza(2, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final boolean isInitialized() {
        Parcel zza = zza(13, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void pause() {
        zzb(8, zzbc());
    }

    public final void resume() {
        zzb(9, zzbc());
    }

    public final void setImmersiveMode(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(25, zzbc);
    }

    public final void showInterstitial() {
        zzb(4, zzbc());
    }

    public final void showVideo() {
        zzb(12, zzbc());
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzafz zzafz, List<String> list) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (IInterface) zzafz);
        zzbc.writeStringList(list);
        zzb(23, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzafz zzafz, String str2) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzafz);
        zzbc.writeString(str2);
        zzb(10, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, zzwl zzwl) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwl);
        zzb(3, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzex.zza(zzbc, (IInterface) zzwl);
        zzb(7, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzkk zzkk, String str, String str2, zzwl zzwl, zzqh zzqh, List<String> list) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzex.zza(zzbc, (IInterface) zzwl);
        zzex.zza(zzbc, (Parcelable) zzqh);
        zzbc.writeStringList(list);
        zzb(14, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, zzwl zzwl) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwl);
        zzb(1, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzko zzko, zzkk zzkk, String str, String str2, zzwl zzwl) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzex.zza(zzbc, (IInterface) zzwl);
        zzb(6, zzbc);
    }

    public final void zza(zzkk zzkk, String str, String str2) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzb(20, zzbc);
    }

    public final void zzc(zzkk zzkk, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeString(str);
        zzb(11, zzbc);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(21, zzbc);
    }

    public final zzwr zzmp() {
        zzwr zzwr;
        Parcel zza = zza(15, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzwr = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzwr = queryLocalInterface instanceof zzwr ? (zzwr) queryLocalInterface : new zzwt(readStrongBinder);
        }
        zza.recycle();
        return zzwr;
    }

    public final zzwu zzmq() {
        zzwu zzwu;
        Parcel zza = zza(16, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzwu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzwu = queryLocalInterface instanceof zzwu ? (zzwu) queryLocalInterface : new zzww(readStrongBinder);
        }
        zza.recycle();
        return zzwu;
    }

    public final Bundle zzmr() {
        Parcel zza = zza(17, zzbc());
        Bundle bundle = (Bundle) zzex.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final Bundle zzms() {
        Parcel zza = zza(19, zzbc());
        Bundle bundle = (Bundle) zzex.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final boolean zzmt() {
        Parcel zza = zza(22, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final zzro zzmu() {
        Parcel zza = zza(24, zzbc());
        zzro zzn = zzrp.zzn(zza.readStrongBinder());
        zza.recycle();
        return zzn;
    }

    public final zzwx zzmv() {
        zzwx zzwx;
        Parcel zza = zza(27, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzwx = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzwx = queryLocalInterface instanceof zzwx ? (zzwx) queryLocalInterface : new zzwz(readStrongBinder);
        }
        zza.recycle();
        return zzwx;
    }
}

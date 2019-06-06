package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public final class zzlv extends zzev implements zzlt {
    zzlv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void destroy() {
        zzb(2, zzbc());
    }

    public final String getAdUnitId() {
        Parcel zza = zza(31, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() {
        Parcel zza = zza(18, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzmm getVideoController() {
        zzmm zzmm;
        Parcel zza = zza(26, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzmm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzmm = queryLocalInterface instanceof zzmm ? (zzmm) queryLocalInterface : new zzmo(readStrongBinder);
        }
        zza.recycle();
        return zzmm;
    }

    public final boolean isLoading() {
        Parcel zza = zza(23, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final boolean isReady() {
        Parcel zza = zza(3, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void pause() {
        zzb(5, zzbc());
    }

    public final void resume() {
        zzb(6, zzbc());
    }

    public final void setImmersiveMode(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(34, zzbc);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(22, zzbc);
    }

    public final void setUserId(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzb(25, zzbc);
    }

    public final void showInterstitial() {
        zzb(9, zzbc());
    }

    public final void stopLoading() {
        zzb(10, zzbc());
    }

    public final void zza(zzafc zzafc) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzafc);
        zzb(24, zzbc);
    }

    public final void zza(zzko zzko) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzko);
        zzb(13, zzbc);
    }

    public final void zza(zzlf zzlf) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzlf);
        zzb(20, zzbc);
    }

    public final void zza(zzli zzli) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzli);
        zzb(7, zzbc);
    }

    public final void zza(zzly zzly) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzly);
        zzb(8, zzbc);
    }

    public final void zza(zzme zzme) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzme);
        zzb(21, zzbc);
    }

    public final void zza(zzms zzms) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzms);
        zzb(30, zzbc);
    }

    public final void zza(zzns zzns) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzns);
        zzb(29, zzbc);
    }

    public final void zza(zzpb zzpb) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzpb);
        zzb(19, zzbc);
    }

    public final void zza(zzyx zzyx) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzyx);
        zzb(14, zzbc);
    }

    public final void zza(zzzd zzzd, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzzd);
        zzbc.writeString(str);
        zzb(15, zzbc);
    }

    public final boolean zzb(zzkk zzkk) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzkk);
        Parcel zza = zza(4, zzbc);
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final IObjectWrapper zzbp() {
        Parcel zza = zza(1, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final zzko zzbq() {
        Parcel zza = zza(12, zzbc());
        zzko zzko = (zzko) zzex.zza(zza, zzko.CREATOR);
        zza.recycle();
        return zzko;
    }

    public final void zzbs() {
        zzb(11, zzbc());
    }

    public final zzly zzcc() {
        zzly zzly;
        Parcel zza = zza(32, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzly = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzly = queryLocalInterface instanceof zzly ? (zzly) queryLocalInterface : new zzma(readStrongBinder);
        }
        zza.recycle();
        return zzly;
    }

    public final zzli zzcd() {
        zzli zzli;
        Parcel zza = zza(33, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzli = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzli = queryLocalInterface instanceof zzli ? (zzli) queryLocalInterface : new zzlk(readStrongBinder);
        }
        zza.recycle();
        return zzli;
    }

    public final String zzco() {
        Parcel zza = zza(35, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}

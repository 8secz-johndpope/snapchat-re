package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.util.ArrayList;
import java.util.List;

public final class zzrm extends zzev implements zzrk {
    zzrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final void destroy() {
        zzb(10, zzbc());
    }

    public final String getAdvertiser() {
        Parcel zza = zza(8, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getBody() {
        Parcel zza = zza(5, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final String getCallToAction() {
        Parcel zza = zza(7, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final Bundle getExtras() {
        Parcel zza = zza(9, zzbc());
        Bundle bundle = (Bundle) zzex.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    public final String getHeadline() {
        Parcel zza = zza(3, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final List getImages() {
        Parcel zza = zza(4, zzbc());
        ArrayList zzb = zzex.zzb(zza);
        zza.recycle();
        return zzb;
    }

    public final String getMediationAdapterClassName() {
        Parcel zza = zza(17, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzmm getVideoController() {
        Parcel zza = zza(11, zzbc());
        zzmm zzh = zzmn.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    public final void performClick(Bundle bundle) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) bundle);
        zzb(12, zzbc);
    }

    public final boolean recordImpression(Bundle bundle) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) bundle);
        Parcel zza = zza(13, zzbc);
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void reportTouchEvent(Bundle bundle) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) bundle);
        zzb(14, zzbc);
    }

    public final IObjectWrapper zzkd() {
        Parcel zza = zza(2, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final IObjectWrapper zzkh() {
        Parcel zza = zza(16, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final zzqo zzki() {
        zzqo zzqo;
        Parcel zza = zza(15, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzqo = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzqo = queryLocalInterface instanceof zzqo ? (zzqo) queryLocalInterface : new zzqq(readStrongBinder);
        }
        zza.recycle();
        return zzqo;
    }

    public final zzqs zzkj() {
        zzqs zzqs;
        Parcel zza = zza(6, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzqs = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzqs = queryLocalInterface instanceof zzqs ? (zzqs) queryLocalInterface : new zzqu(readStrongBinder);
        }
        zza.recycle();
        return zzqs;
    }
}

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;
import java.util.ArrayList;
import java.util.List;

public final class zzrq extends zzev implements zzro {
    zzrq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final void destroy() {
        zzb(8, zzbc());
    }

    public final List<String> getAvailableAssetNames() {
        Parcel zza = zza(3, zzbc());
        ArrayList createStringArrayList = zza.createStringArrayList();
        zza.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() {
        Parcel zza = zza(4, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzmm getVideoController() {
        Parcel zza = zza(7, zzbc());
        zzmm zzh = zzmn.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    public final void performClick(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzb(5, zzbc);
    }

    public final void recordImpression() {
        zzb(6, zzbc());
    }

    public final String zzap(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(1, zzbc);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final zzqs zzaq(String str) {
        zzqs zzqs;
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(2, zzbc);
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

    public final boolean zzf(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        Parcel zza = zza(10, zzbc);
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final IObjectWrapper zzkd() {
        Parcel zza = zza(11, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final IObjectWrapper zzkk() {
        Parcel zza = zza(9, zzbc());
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }
}

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class zzlq extends zzev implements zzlo {
    zzlq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) publisherAdViewOptions);
        zzb(9, zzbc);
    }

    public final void zza(zzqh zzqh) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzqh);
        zzb(6, zzbc);
    }

    public final void zza(zzrs zzrs) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzrs);
        zzb(3, zzbc);
    }

    public final void zza(zzrv zzrv) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzrv);
        zzb(4, zzbc);
    }

    public final void zza(zzse zzse, zzko zzko) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzse);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzb(8, zzbc);
    }

    public final void zza(zzsh zzsh) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzsh);
        zzb(10, zzbc);
    }

    public final void zza(String str, zzsb zzsb, zzry zzry) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzsb);
        zzex.zza(zzbc, (IInterface) zzry);
        zzb(5, zzbc);
    }

    public final void zzb(zzli zzli) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzli);
        zzb(2, zzbc);
    }

    public final void zzb(zzme zzme) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzme);
        zzb(7, zzbc);
    }

    public final zzll zzdi() {
        zzll zzll;
        Parcel zza = zza(1, zzbc());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzll = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzll = queryLocalInterface instanceof zzll ? (zzll) queryLocalInterface : new zzln(readStrongBinder);
        }
        zza.recycle();
        return zzll;
    }
}

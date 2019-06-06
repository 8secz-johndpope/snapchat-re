package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzacp extends zzev implements zzacn {
    zzacp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zza(zzacf zzacf, zzacq zzacq) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzacf);
        zzex.zza(zzbc, (IInterface) zzacq);
        zzb(2, zzbc);
    }

    public final void zza(zzacy zzacy, zzact zzact) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzacy);
        zzex.zza(zzbc, (IInterface) zzact);
        zzb(4, zzbc);
    }

    public final zzacj zzb(zzacf zzacf) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzacf);
        Parcel zza = zza(1, zzbc);
        zzacj zzacj = (zzacj) zzex.zza(zza, zzacj.CREATOR);
        zza.recycle();
        return zzacj;
    }
}

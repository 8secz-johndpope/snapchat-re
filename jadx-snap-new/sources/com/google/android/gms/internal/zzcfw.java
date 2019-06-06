package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzs;

public final class zzcfw extends zzbgl {
    public static final Creator<zzcfw> CREATOR = new zzcfx();
    private int zzitp;
    private zzcfu zzitq;
    private zzr zzitr;
    private zzcgr zzits;

    zzcfw(int i, zzcfu zzcfu, IBinder iBinder, IBinder iBinder2) {
        this.zzitp = i;
        this.zzitq = zzcfu;
        zzcgr zzcgr = null;
        this.zzitr = iBinder == null ? null : zzs.zzbd(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzcgr = queryLocalInterface instanceof zzcgr ? (zzcgr) queryLocalInterface : new zzcgt(iBinder2);
        }
        this.zzits = zzcgr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.zzitp);
        zzbgo.zza(parcel, 2, this.zzitq, i, false);
        zzr zzr = this.zzitr;
        IBinder iBinder = null;
        zzbgo.zza(parcel, 3, zzr == null ? null : zzr.asBinder(), false);
        zzcgr zzcgr = this.zzits;
        if (zzcgr != null) {
            iBinder = zzcgr.asBinder();
        }
        zzbgo.zza(parcel, 4, iBinder, false);
        zzbgo.zzai(parcel, zze);
    }
}

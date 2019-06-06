package com.google.android.gms.internal;

import android.os.Parcel;

@zzabh
public final class zznq extends zzko {
    public zznq(zzko zzko) {
        super(zzko.zzbia, zzko.height, zzko.heightPixels, zzko.zzbib, zzko.width, zzko.widthPixels, zzko.zzbic, zzko.zzbid, zzko.zzbie, zzko.zzbif);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzbia, false);
        zzbgo.zzc(parcel, 3, this.height);
        zzbgo.zzc(parcel, 6, this.width);
        zzbgo.zzai(parcel, i);
    }
}

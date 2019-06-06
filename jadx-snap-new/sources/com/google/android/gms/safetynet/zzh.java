package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;

public final class zzh extends zzbgl {
    public static final Creator<zzh> CREATOR = new zzi();
    private int zzkkb;
    private boolean zzkkc;

    public zzh(int i, boolean z) {
        this.zzkkb = i;
        this.zzkkc = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 2, this.zzkkb);
        zzbgo.zza(parcel, 3, this.zzkkc);
        zzbgo.zzai(parcel, i);
    }
}

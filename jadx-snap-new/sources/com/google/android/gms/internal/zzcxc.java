package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

public abstract class zzcxc extends zzew implements zzcxb {
    public zzcxc() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            zza((Status) zzex.zza(parcel, Status.CREATOR), (zza) zzex.zza(parcel, zza.CREATOR));
        } else if (i == 2) {
            zzld(parcel.readString());
        } else if (i == 3) {
            zza((Status) zzex.zza(parcel, Status.CREATOR), (SafeBrowsingData) zzex.zza(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            zzb((Status) zzex.zza(parcel, Status.CREATOR), zzex.zza(parcel));
        } else if (i == 6) {
            zza((Status) zzex.zza(parcel, Status.CREATOR), (zzf) zzex.zza(parcel, zzf.CREATOR));
        } else if (i == 8) {
            zza((Status) zzex.zza(parcel, Status.CREATOR), (zzd) zzex.zza(parcel, zzd.CREATOR));
        } else if (i == 15) {
            zza((Status) zzex.zza(parcel, Status.CREATOR), (zzh) zzex.zza(parcel, zzh.CREATOR));
        } else if (i == 10) {
            zzc((Status) zzex.zza(parcel, Status.CREATOR), zzex.zza(parcel));
        } else if (i != 11) {
            return false;
        } else {
            zzao((Status) zzex.zza(parcel, Status.CREATOR));
        }
        return true;
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzbgm;

public final class zzbu implements Creator<zzbt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = iBinder;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = zzbgm.zzr(parcel, readInt);
            } else if (i2 == 3) {
                connectionResult = (ConnectionResult) zzbgm.zza(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 == 4) {
                z = zzbgm.zzc(parcel, readInt);
            } else if (i2 != 5) {
                zzbgm.zzb(parcel, readInt);
            } else {
                z2 = zzbgm.zzc(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzbt(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbt[i];
    }
}

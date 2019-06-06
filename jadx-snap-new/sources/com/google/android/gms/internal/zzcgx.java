package com.google.android.gms.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsRequest;

public final class zzcgx extends zzev implements zzcgw {
    zzcgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void zza(zzcfw zzcfw) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzcfw);
        zzb(75, zzbc);
    }

    public final void zza(zzchn zzchn) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzchn);
        zzb(59, zzbc);
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzcgy zzcgy, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) locationSettingsRequest);
        zzex.zza(zzbc, (IInterface) zzcgy);
        zzbc.writeString(str);
        zzb(63, zzbc);
    }

    public final void zzbo(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(12, zzbc);
    }

    public final Location zzim(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(21, zzbc);
        Location location = (Location) zzex.zza(zza, Location.CREATOR);
        zza.recycle();
        return location;
    }
}

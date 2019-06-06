package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzaco extends zzew implements zzacn {
    public zzaco() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            zzacq zzacq = null;
            IBinder readStrongBinder;
            IInterface queryLocalInterface;
            if (i == 2) {
                zzacf zzacf = (zzacf) zzex.zza(parcel, zzacf.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    zzacq = queryLocalInterface instanceof zzacq ? (zzacq) queryLocalInterface : new zzacs(readStrongBinder);
                }
                zza(zzacf, zzacq);
            } else if (i != 4) {
                return false;
            } else {
                zzact zzacu;
                zzacy zzacy = (zzacy) zzex.zza(parcel, zzacy.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzacu = queryLocalInterface instanceof zzact ? (zzact) queryLocalInterface : new zzacu(readStrongBinder);
                }
                zza(zzacy, zzacu);
            }
            parcel2.writeNoException();
        } else {
            zzacj zzb = zzb((zzacf) zzex.zza(parcel, zzacf.CREATOR));
            parcel2.writeNoException();
            zzex.zzb(parcel2, zzb);
        }
        return true;
    }
}

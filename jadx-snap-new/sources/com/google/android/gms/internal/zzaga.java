package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzaga extends zzew implements zzafz {
    public zzaga() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzafz zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzafz ? (zzafz) queryLocalInterface : new zzagb(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzm(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(zza.zzaq(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzn(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 4:
                zzo(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 5:
                zzp(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 6:
                zzq(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 7:
                zza(zza.zzaq(parcel.readStrongBinder()), (zzagd) zzex.zza(parcel, zzagd.CREATOR));
                break;
            case 8:
                zzr(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(zza.zzaq(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzs(zza.zzaq(parcel.readStrongBinder()));
                break;
            case 11:
                zzt(zza.zzaq(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

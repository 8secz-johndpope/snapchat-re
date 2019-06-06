package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzaey extends zzew implements zzaex {
    public zzaey() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static zzaex zzz(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof zzaex ? (zzaex) queryLocalInterface : new zzaez(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            zza((zzafi) zzex.zza(parcel, zzafi.CREATOR));
        } else if (i == 2) {
            show();
        } else if (i == 3) {
            zzafc zzafc;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzafc = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                zzafc = queryLocalInterface instanceof zzafc ? (zzafc) queryLocalInterface : new zzafe(readStrongBinder);
            }
            zza(zzafc);
        } else if (i != 34) {
            switch (i) {
                case 5:
                    boolean isLoaded = isLoaded();
                    parcel2.writeNoException();
                    zzex.zza(parcel2, isLoaded);
                    break;
                case 6:
                    pause();
                    break;
                case 7:
                    resume();
                    break;
                case 8:
                    destroy();
                    break;
                case 9:
                    zzb(zza.zzaq(parcel.readStrongBinder()));
                    break;
                case 10:
                    zzc(zza.zzaq(parcel.readStrongBinder()));
                    break;
                case 11:
                    zzd(zza.zzaq(parcel.readStrongBinder()));
                    break;
                case 12:
                    String mediationAdapterClassName = getMediationAdapterClassName();
                    parcel2.writeNoException();
                    parcel2.writeString(mediationAdapterClassName);
                    break;
                case 13:
                    setUserId(parcel.readString());
                    break;
                default:
                    return false;
            }
        } else {
            setImmersiveMode(zzex.zza(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}

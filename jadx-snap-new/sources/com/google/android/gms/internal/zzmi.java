package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzmi extends zzew implements zzmh {
    public zzmi() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                initialize();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzu(parcel.readString());
                break;
            case 4:
                setAppMuted(zzex.zza(parcel));
                break;
            case 5:
                zzb(zza.zzaq(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zza(parcel.readString(), zza.zzaq(parcel.readStrongBinder()));
                break;
            case 7:
                float zzdp = zzdp();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdp);
                break;
            case 8:
                boolean zzdq = zzdq();
                parcel2.writeNoException();
                zzex.zza(parcel2, zzdq);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

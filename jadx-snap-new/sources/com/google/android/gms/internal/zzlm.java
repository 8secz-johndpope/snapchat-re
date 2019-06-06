package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class zzlm extends zzew implements zzll {
    public zzlm() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            String mediationAdapterClassName;
            if (i == 2) {
                mediationAdapterClassName = getMediationAdapterClassName();
            } else if (i == 3) {
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzex.zza(parcel2, isLoading);
                return true;
            } else if (i == 4) {
                mediationAdapterClassName = zzco();
            } else if (i != 5) {
                return false;
            } else {
                zza((zzkk) zzex.zza(parcel, zzkk.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
            return true;
        }
        zzd((zzkk) zzex.zza(parcel, zzkk.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

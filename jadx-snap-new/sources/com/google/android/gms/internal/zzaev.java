package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class zzaev extends zzew implements zzaeu {
    public zzaev() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            i = getAmount();
            parcel2.writeNoException();
            parcel2.writeInt(i);
        }
        return true;
    }
}

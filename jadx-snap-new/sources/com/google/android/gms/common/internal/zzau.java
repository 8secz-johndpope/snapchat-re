package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzex;

public abstract class zzau extends zzew implements zzat {
    public zzau() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            IInterface zzahg = zzahg();
            parcel2.writeNoException();
            zzex.zza(parcel2, zzahg);
        } else if (i != 2) {
            return false;
        } else {
            i = zzahh();
            parcel2.writeNoException();
            parcel2.writeInt(i);
        }
        return true;
    }
}

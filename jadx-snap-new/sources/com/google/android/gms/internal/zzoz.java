package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzoz extends zzew implements zzoy {
    public zzoz() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String zzjs;
        if (i == 1) {
            zzjs = zzjs();
        } else if (i != 2) {
            if (i == 3) {
                zze(zza.zzaq(parcel.readStrongBinder()));
            } else if (i == 4) {
                recordClick();
            } else if (i != 5) {
                return false;
            } else {
                recordImpression();
            }
            parcel2.writeNoException();
            return true;
        } else {
            zzjs = getContent();
        }
        parcel2.writeNoException();
        parcel2.writeString(zzjs);
        return true;
    }
}

package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzi implements Creator<LandmarkParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        float f = MapboxConstants.MINIMUM_ZOOM;
        int i = 0;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i3 == 2) {
                f = zzbgm.zzl(parcel, readInt);
            } else if (i3 == 3) {
                f2 = zzbgm.zzl(parcel, readInt);
            } else if (i3 != 4) {
                zzbgm.zzb(parcel, readInt);
            } else {
                i2 = zzbgm.zzg(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new LandmarkParcel(i, f, f2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}

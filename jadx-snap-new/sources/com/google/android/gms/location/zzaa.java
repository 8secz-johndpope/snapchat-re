package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;

public final class zzaa implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        zzaj[] zzajArr = null;
        int i = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = zzbgm.zzg(parcel, readInt);
            } else if (i4 == 2) {
                i3 = zzbgm.zzg(parcel, readInt);
            } else if (i4 == 3) {
                j = zzbgm.zzi(parcel, readInt);
            } else if (i4 == 4) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i4 != 5) {
                zzbgm.zzb(parcel, readInt);
            } else {
                zzajArr = (zzaj[]) zzbgm.zzb(parcel, readInt, zzaj.CREATOR);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new LocationAvailability(i, i2, i3, j, zzajArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}

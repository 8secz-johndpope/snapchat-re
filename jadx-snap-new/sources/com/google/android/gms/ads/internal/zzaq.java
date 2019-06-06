package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzaq implements Creator<zzap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = MapboxConstants.MINIMUM_ZOOM;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = zzbgm.zzc(parcel, readInt);
                    break;
                case 3:
                    z2 = zzbgm.zzc(parcel, readInt);
                    break;
                case 4:
                    str = zzbgm.zzq(parcel, readInt);
                    break;
                case 5:
                    z3 = zzbgm.zzc(parcel, readInt);
                    break;
                case 6:
                    f = zzbgm.zzl(parcel, readInt);
                    break;
                case 7:
                    i = zzbgm.zzg(parcel, readInt);
                    break;
                case 8:
                    z4 = zzbgm.zzc(parcel, readInt);
                    break;
                case 9:
                    z5 = zzbgm.zzc(parcel, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzap(z, z2, str, z3, f, i, z4, z5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzap[i];
    }
}

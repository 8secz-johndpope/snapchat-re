package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.Arrays;

public final class LocationAvailability extends zzbgl implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new zzaa();
    @Deprecated
    private int zzisb;
    @Deprecated
    private int zzisc;
    private long zzisd;
    private int zzise;
    private zzaj[] zzisf;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.zzise = i;
        this.zzisb = i2;
        this.zzisc = i3;
        this.zzisd = j;
        this.zzisf = zzajArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.zzisb == locationAvailability.zzisb && this.zzisc == locationAvailability.zzisc && this.zzisd == locationAvailability.zzisd && this.zzise == locationAvailability.zzise && Arrays.equals(this.zzisf, locationAvailability.zzisf);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzise), Integer.valueOf(this.zzisb), Integer.valueOf(this.zzisc), Long.valueOf(this.zzisd), this.zzisf});
    }

    public final boolean isLocationAvailable() {
        return this.zzise < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
    }

    public final String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("LocationAvailability[isLocationAvailable: ");
        stringBuilder.append(isLocationAvailable);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.zzisb);
        zzbgo.zzc(parcel, 2, this.zzisc);
        zzbgo.zza(parcel, 3, this.zzisd);
        zzbgo.zzc(parcel, 4, this.zzise);
        zzbgo.zza(parcel, 5, this.zzisf, i, false);
        zzbgo.zzai(parcel, zze);
    }
}

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends zzbgl implements ReflectedParcelable {
    public static final Creator<LocationResult> CREATOR = new zzac();
    static final List<Location> zzisl = Collections.emptyList();
    private final List<Location> zzism;

    LocationResult(List<Location> list) {
        this.zzism = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.zzism.size() != this.zzism.size()) {
            return false;
        }
        Iterator it = this.zzism.iterator();
        for (Location time : locationResult.zzism) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final List<Location> getLocations() {
        return this.zzism;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.zzism) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzism);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("LocationResult[locations: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, getLocations(), false);
        zzbgo.zzai(parcel, i);
    }
}

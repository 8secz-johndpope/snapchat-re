package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

public final class zzj extends zzbgl {
    public static final Creator<zzj> CREATOR = new zzk();
    private boolean zzirh;
    private long zziri;
    private float zzirj;
    private long zzirk;
    private int zzirl;

    public zzj() {
        this(true, 50, MapboxConstants.MINIMUM_ZOOM, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.zzirh = z;
        this.zziri = j;
        this.zzirj = f;
        this.zzirk = j2;
        this.zzirl = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.zzirh == zzj.zzirh && this.zziri == zzj.zziri && Float.compare(this.zzirj, zzj.zzirj) == 0 && this.zzirk == zzj.zzirk && this.zzirl == zzj.zzirl;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zzirh), Long.valueOf(this.zziri), Float.valueOf(this.zzirj), Long.valueOf(this.zzirk), Integer.valueOf(this.zzirl)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceOrientationRequest[mShouldUseMag=");
        stringBuilder.append(this.zzirh);
        stringBuilder.append(" mMinimumSamplingPeriodMs=");
        stringBuilder.append(this.zziri);
        stringBuilder.append(" mSmallestAngleChangeRadians=");
        stringBuilder.append(this.zzirj);
        long j = this.zzirk;
        if (j != Long.MAX_VALUE) {
            j -= SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j);
            stringBuilder.append("ms");
        }
        if (this.zzirl != Integer.MAX_VALUE) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.zzirl);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, this.zzirh);
        zzbgo.zza(parcel, 2, this.zziri);
        zzbgo.zza(parcel, 3, this.zzirj);
        zzbgo.zza(parcel, 4, this.zzirk);
        zzbgo.zzc(parcel, 5, this.zzirl);
        zzbgo.zzai(parcel, i);
    }
}

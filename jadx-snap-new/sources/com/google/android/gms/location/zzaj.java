package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import java.util.Arrays;

public final class zzaj extends zzbgl {
    public static final Creator<zzaj> CREATOR = new zzak();
    private int zzitb;
    private int zzitc;
    private long zzitd;
    private long zzite;

    zzaj(int i, int i2, long j, long j2) {
        this.zzitb = i;
        this.zzitc = i2;
        this.zzitd = j;
        this.zzite = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.zzitb == zzaj.zzitb && this.zzitc == zzaj.zzitc && this.zzitd == zzaj.zzitd && this.zzite == zzaj.zzite;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzitc), Integer.valueOf(this.zzitb), Long.valueOf(this.zzite), Long.valueOf(this.zzitd)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkLocationStatus:");
        stringBuilder.append(" Wifi status: ");
        stringBuilder.append(this.zzitb);
        stringBuilder.append(" Cell status: ");
        stringBuilder.append(this.zzitc);
        stringBuilder.append(" elapsed time NS: ");
        stringBuilder.append(this.zzite);
        stringBuilder.append(" system time ms: ");
        stringBuilder.append(this.zzitd);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.zzitb);
        zzbgo.zzc(parcel, 2, this.zzitc);
        zzbgo.zza(parcel, 3, this.zzitd);
        zzbgo.zza(parcel, 4, this.zzite);
        zzbgo.zzai(parcel, i);
    }
}

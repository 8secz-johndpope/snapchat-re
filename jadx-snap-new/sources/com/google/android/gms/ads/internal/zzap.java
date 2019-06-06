package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;

@zzabh
public final class zzap extends zzbgl {
    public static final Creator<zzap> CREATOR = new zzaq();
    public final boolean zzaqp;
    public final boolean zzaqq;
    private String zzaqr;
    public final boolean zzaqs;
    public final float zzaqt;
    public final int zzaqu;
    public final boolean zzaqv;
    public final boolean zzaqw;

    zzap(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5) {
        this.zzaqp = z;
        this.zzaqq = z2;
        this.zzaqr = str;
        this.zzaqs = z3;
        this.zzaqt = f;
        this.zzaqu = i;
        this.zzaqv = z4;
        this.zzaqw = z5;
    }

    public zzap(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5) {
        this(z, z2, null, z3, f, i, z4, z5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzaqp);
        zzbgo.zza(parcel, 3, this.zzaqq);
        zzbgo.zza(parcel, 4, this.zzaqr, false);
        zzbgo.zza(parcel, 5, this.zzaqs);
        zzbgo.zza(parcel, 6, this.zzaqt);
        zzbgo.zzc(parcel, 7, this.zzaqu);
        zzbgo.zza(parcel, 8, this.zzaqv);
        zzbgo.zza(parcel, 9, this.zzaqw);
        zzbgo.zzai(parcel, i);
    }
}

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;

@zzabh
public final class zzno extends zzbgl {
    public static final Creator<zzno> CREATOR = new zznp();
    public final String zzbkm;

    public zzno(SearchAdRequest searchAdRequest) {
        this.zzbkm = searchAdRequest.getQuery();
    }

    zzno(String str) {
        this.zzbkm = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 15, this.zzbkm, false);
        zzbgo.zzai(parcel, i);
    }
}

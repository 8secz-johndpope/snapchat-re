package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;
import java.util.Map.Entry;

@zzabh
public final class zzsy extends zzbgl {
    public static final Creator<zzsy> CREATOR = new zzsz();
    private String url;
    private String[] zzccx;
    private String[] zzccy;

    zzsy(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzccx = strArr;
        this.zzccy = strArr2;
    }

    public static zzsy zzh(zzr zzr) {
        Map headers = zzr.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : headers.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzsy(zzr.getUrl(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, this.url, false);
        zzbgo.zza(parcel, 2, this.zzccx, false);
        zzbgo.zza(parcel, 3, this.zzccy, false);
        zzbgo.zzai(parcel, i);
    }
}

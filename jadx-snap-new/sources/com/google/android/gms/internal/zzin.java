package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbt;
import com.samsung.android.sdk.camera.SCamera;
import java.util.List;

@zzabh
public final class zzin extends zzbgl {
    public static final Creator<zzin> CREATOR = new zzio();
    public final String url;
    private long zzbba;
    private String zzbbb;
    private String zzbbc;
    private String zzbbd;
    private Bundle zzbbe;
    private boolean zzbbf;
    private long zzbbg;

    zzin(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbba = j;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        this.zzbbb = str2;
        if (str3 == null) {
            str3 = str;
        }
        this.zzbbc = str3;
        if (str4 != null) {
            str = str4;
        }
        this.zzbbd = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzbbe = bundle;
        this.zzbbf = z;
        this.zzbbg = j2;
    }

    public static zzin zzab(String str) {
        return zzd(Uri.parse(str));
    }

    public static zzin zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Expected 2 path parts for namespace and id, found :");
                stringBuilder.append(size);
                zzaky.zzcz(stringBuilder.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = SCamera.CAMERA_ID_FRONT.equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : zzbt.zzen().zzg(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzin(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzaky.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.url, false);
        zzbgo.zza(parcel, 3, this.zzbba);
        zzbgo.zza(parcel, 4, this.zzbbb, false);
        zzbgo.zza(parcel, 5, this.zzbbc, false);
        zzbgo.zza(parcel, 6, this.zzbbd, false);
        zzbgo.zza(parcel, 7, this.zzbbe, false);
        zzbgo.zza(parcel, 8, this.zzbbf);
        zzbgo.zza(parcel, 9, this.zzbbg);
        zzbgo.zzai(parcel, i);
    }
}

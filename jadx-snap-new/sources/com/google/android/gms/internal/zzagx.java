package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzagx {
    public static Uri zzb(Uri uri, Context context) {
        if (!zzbt.zzfh().zzv(context)) {
            return uri;
        }
        String str = "fbs_aeid";
        if (!TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri;
        }
        String zzz = zzbt.zzfh().zzz(context);
        uri = zzb(uri.toString(), str, zzz);
        zzbt.zzfh().zze(context, zzz);
        return uri;
    }

    private static Uri zzb(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        indexOf++;
        StringBuilder stringBuilder = new StringBuilder(str.substring(0, indexOf));
        stringBuilder.append(str2);
        stringBuilder.append("=");
        stringBuilder.append(str3);
        stringBuilder.append("&");
        stringBuilder.append(str.substring(indexOf));
        return Uri.parse(stringBuilder.toString());
    }

    public static String zzb(String str, Context context) {
        if (zzbt.zzfh().zzq(context) && !TextUtils.isEmpty(str)) {
            String zzz = zzbt.zzfh().zzz(context);
            if (zzz == null) {
                return str;
            }
            String str2;
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzboo)).booleanValue()) {
                str2 = (String) zzlc.zzio().zzd(zzoi.zzbop);
                if (str.contains(str2)) {
                    if (zzbt.zzel().zzcl(str)) {
                        zzbt.zzfh().zze(context, zzz);
                        return str.replace(str2, zzz);
                    } else if (zzbt.zzel().zzcm(str)) {
                        zzbt.zzfh().zzf(context, zzz);
                        return str.replace(str2, zzz);
                    }
                }
            }
            str2 = "fbs_aeid";
            if (!str.contains(str2)) {
                if (zzbt.zzel().zzcl(str)) {
                    zzbt.zzfh().zze(context, zzz);
                    return zzb(str, str2, zzz).toString();
                } else if (zzbt.zzel().zzcm(str)) {
                    zzbt.zzfh().zzf(context, zzz);
                    str = zzb(str, str2, zzz).toString();
                }
            }
        }
        return str;
    }
}

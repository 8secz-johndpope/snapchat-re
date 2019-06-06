package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import com.samsung.android.sdk.camera.SCamera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzabh
public final class zzvy {
    private static String zza(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> zza(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zza(Context context, String str, zzahd zzahd, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? SCamera.CAMERA_ID_FRONT : "0";
            for (String zza : list) {
                String str4 = "@gw_seqnum@";
                str4 = "@gw_adnetstatus@";
                String zza2 = zza(zza(zza(zza(zza(zza(zza(zza2, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", zzahd.zzdcj.zzcib), "@gw_sdkver@", str), "@gw_sessid@", zzlc.zzil()), str4, zzahd.zzcry), str4, zzahd.zzdck);
                if (zzahd.zzcje != null) {
                    zza2 = zza(zza(zza2, "@gw_adnetid@", zzahd.zzcje.zzchc), "@gw_allocid@", zzahd.zzcje.zzche);
                }
                zza2 = zzagx.zzb(zza2, context);
                zzbt.zzel();
                zzaij.zze(context, str, zza2);
            }
        }
    }

    public static void zza(Context context, String str, List<String> list, String str2, zzagd zzagd) {
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(str2) && zzaks.isEnabled()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long currentTimeMillis = zzbt.zzes().currentTimeMillis();
            for (String zza : list) {
                String str3 = "@gw_tmstmp@";
                String zza2 = zza(zza(zza2, "@gw_rwd_userid@", Uri.encode(str2)), str3, Long.toString(currentTimeMillis));
                if (zzagd != null) {
                    str3 = "@gw_rwd_amt@";
                    zza2 = zza(zza(zza2, "@gw_rwd_itm@", Uri.encode(zzagd.type)), str3, Integer.toString(zzagd.zzdax));
                }
                zzbt.zzel();
                zzaij.zze(context, str, zza2);
            }
        }
    }

    public static boolean zza(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}

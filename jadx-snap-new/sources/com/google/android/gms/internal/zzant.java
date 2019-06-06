package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

@zzabh
public final class zzant implements zzt<zzann> {
    private boolean zzdok;

    private static int zza(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            zzlc.zzij();
            i = zzako.zza(context, Integer.parseInt(str2));
            return i;
        } catch (NumberFormatException unused) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
            stringBuilder.append("Could not parse ");
            stringBuilder.append(str);
            stringBuilder.append(" in a video GMSG: ");
            stringBuilder.append(str2);
            zzaky.zzcz(stringBuilder.toString());
            return i;
        }
    }

    private static void zza(zzanb zzanb, Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzaky.zzcz(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }
}

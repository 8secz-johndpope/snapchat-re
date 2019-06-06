package com.google.android.gms.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzadx {
    private int mOrientation = -1;
    private zzacl zzaoq;
    private String zzbxx;
    private boolean zzciv = false;
    private final zzacf zzcjk;
    private List<String> zzcpa;
    private String zzcwq;
    private String zzcwr;
    private List<String> zzcws;
    private String zzcwt;
    private String zzcwu;
    private String zzcwv;
    private List<String> zzcww;
    private long zzcwx = -1;
    private boolean zzcwy = false;
    private final long zzcwz = -1;
    private long zzcxa = -1;
    private boolean zzcxb = false;
    private boolean zzcxc = false;
    private boolean zzcxd = false;
    private boolean zzcxe = true;
    private boolean zzcxf = true;
    private String zzcxg = "";
    private boolean zzcxh = false;
    private zzagd zzcxi;
    private List<String> zzcxj;
    private List<String> zzcxk;
    private boolean zzcxl = false;
    private boolean zzcxm = false;
    private String zzcxn;
    private List<String> zzcxo;
    private boolean zzcxp;
    private String zzcxq;
    private zzagn zzcxr;
    private boolean zzcxs;
    private boolean zzcxt;

    public zzadx(zzacf zzacf, String str) {
        this.zzcwr = str;
        this.zzcjk = zzacf;
    }

    private static String zza(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    private static long zzb(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            Object obj = (String) list.get(0);
            try {
                obj = Float.parseFloat(obj);
                return (long) (obj * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(obj).length());
                stringBuilder.append("Could not parse float from ");
                stringBuilder.append(str);
                stringBuilder.append(" header: ");
                stringBuilder.append(obj);
                zzaky.zzcz(stringBuilder.toString());
            }
        }
        return -1;
    }

    private static List<String> zzc(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private static boolean zzd(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? false : Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    public final zzacj zza(long j, boolean z) {
        zzacf zzacf = this.zzcjk;
        String str = this.zzcwr;
        String str2 = this.zzbxx;
        List list = this.zzcws;
        List list2 = this.zzcww;
        long j2 = this.zzcwx;
        boolean z2 = this.zzcwy;
        List list3 = this.zzcpa;
        long j3 = this.zzcxa;
        int i = this.mOrientation;
        String str3 = this.zzcwq;
        String str4 = this.zzcwu;
        String str5 = this.zzcwv;
        String str6 = str4;
        boolean z3 = this.zzcxb;
        boolean z4 = this.zzcxc;
        boolean z5 = this.zzcxd;
        boolean z6 = this.zzcxe;
        String str7 = this.zzcxg;
        boolean z7 = this.zzcxh;
        boolean z8 = this.zzciv;
        zzagd zzagd = this.zzcxi;
        List list4 = this.zzcxj;
        List list5 = this.zzcxk;
        boolean z9 = this.zzcxl;
        zzacl zzacl = this.zzaoq;
        boolean z10 = this.zzcxm;
        String str8 = this.zzcxn;
        List list6 = this.zzcxo;
        boolean z11 = this.zzcxp;
        String str9 = this.zzcxq;
        zzagn zzagn = this.zzcxr;
        String str10 = this.zzcwt;
        boolean z12 = this.zzcxf;
        boolean z13 = this.zzcxt;
        boolean z14 = z12;
        List list7 = list6;
        boolean z15 = z11;
        list6 = list5;
        z11 = z9;
        z8 = z5;
        String str11 = str7;
        return new zzacj(zzacf, str, str2, list, list2, j2, z2, -1, list3, j3, i, str3, j, str6, str5, z3, z4, z8, z6, false, str11, z7, z8, zzagd, list4, list6, z11, zzacl, z10, str8, list7, z15, str9, zzagn, str10, z14, this.zzcxs, z13, z ? 2 : 1);
    }

    public final void zza(String str, Map<String, List<String>> map, String str2) {
        this.zzbxx = str2;
        zzo(map);
    }

    public final void zzo(Map<String, List<String>> map) {
        String str;
        this.zzcwq = zza((Map) map, "X-Afma-Ad-Size");
        this.zzcxq = zza((Map) map, "X-Afma-Ad-Slot-Size");
        List zzc = zzc(map, "X-Afma-Click-Tracking-Urls");
        if (zzc != null) {
            this.zzcws = zzc;
        }
        this.zzcwt = zza((Map) map, "X-Afma-Debug-Signals");
        zzc = (List) map.get("X-Afma-Debug-Dialog");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcwu = (String) zzc.get(0);
        }
        zzc = zzc(map, "X-Afma-Tracking-Urls");
        if (zzc != null) {
            this.zzcww = zzc;
        }
        long zzb = zzb(map, "X-Afma-Interstitial-Timeout");
        if (zzb != -1) {
            this.zzcwx = zzb;
        }
        this.zzcwy |= zzd(map, "X-Afma-Mediation");
        zzc = zzc(map, "X-Afma-Manual-Tracking-Urls");
        if (zzc != null) {
            this.zzcpa = zzc;
        }
        zzb = zzb(map, "X-Afma-Refresh-Rate");
        if (zzb != -1) {
            this.zzcxa = zzb;
        }
        zzc = (List) map.get("X-Afma-Orientation");
        if (!(zzc == null || zzc.isEmpty())) {
            int zzrh;
            str = (String) zzc.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                zzrh = zzbt.zzen().zzrh();
            } else if ("landscape".equalsIgnoreCase(str)) {
                zzrh = zzbt.zzen().zzrg();
            }
            this.mOrientation = zzrh;
        }
        this.zzcwv = zza((Map) map, "X-Afma-ActiveView");
        zzc = (List) map.get("X-Afma-Use-HTTPS");
        if (!(zzc == null || zzc.isEmpty())) {
            this.zzcxd = Boolean.valueOf((String) zzc.get(0)).booleanValue();
        }
        this.zzcxb |= zzd(map, "X-Afma-Custom-Rendering-Allowed");
        str = "X-Afma-Ad-Format";
        this.zzcxc = "native".equals(zza((Map) map, str));
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(list == null || list.isEmpty())) {
            this.zzcxe = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
        list = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (!(list == null || list.isEmpty())) {
            this.zzcxf = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
        list = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(list == null || list.isEmpty())) {
            this.zzcxg = (String) list.get(0);
        }
        String zza = zza((Map) map, "X-Afma-Fluid");
        if (zza != null && zza.equals("height")) {
            this.zzcxh = true;
        }
        this.zzciv = "native_express".equals(zza((Map) map, str));
        this.zzcxi = zzagd.zzbu(zza((Map) map, "X-Afma-Rewards"));
        if (this.zzcxj == null) {
            this.zzcxj = zzc(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.zzcxk == null) {
            this.zzcxk = zzc(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.zzcxl |= zzd(map, "X-Afma-Use-Displayed-Impression");
        this.zzcxm |= zzd(map, "X-Afma-Auto-Collect-Location");
        this.zzcxn = zza((Map) map, "Set-Cookie");
        str = zza((Map) map, "X-Afma-Auto-Protection-Configuration");
        if (str == null || TextUtils.isEmpty(str)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.zzcwu)) {
                buildUpon.appendQueryParameter("debugDialog", this.zzcwu);
            }
            boolean booleanValue = ((Boolean) zzlc.zzio().zzd(zzoi.zzbll)).booleanValue();
            String[] strArr = new String[1];
            str = buildUpon.toString();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
            stringBuilder.append(str);
            stringBuilder.append("&navigationURL={NAVIGATION_URL}");
            strArr[0] = stringBuilder.toString();
            this.zzaoq = new zzacl(booleanValue, Arrays.asList(strArr));
        } else {
            try {
                this.zzaoq = zzacl.zzk(new JSONObject(str));
            } catch (JSONException e) {
                zzaky.zzc("Error parsing configuration JSON", e);
                this.zzaoq = new zzacl();
            }
        }
        zzc = zzc(map, "X-Afma-Remote-Ping-Urls");
        if (zzc != null) {
            this.zzcxo = zzc;
        }
        str = zza((Map) map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzcxr = zzagn.zzn(new JSONObject(str));
            } catch (JSONException e2) {
                zzaky.zzc("Error parsing safe browsing header", e2);
            }
        }
        this.zzcxp |= zzd(map, "X-Afma-Render-In-Browser");
        str = zza((Map) map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzcxs = new JSONObject(str).getBoolean("never_pool");
            } catch (JSONException e22) {
                zzaky.zzc("Error parsing interstitial pool header", e22);
            }
        }
        this.zzcxt = zzd(map, "X-Afma-Custom-Close-Blocked");
    }
}

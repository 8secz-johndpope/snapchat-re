package com.google.android.gms.internal;

import android.location.Location;
import com.brightcove.player.media.CuePointFields;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@zzabh
public final class zzads {
    private static final SimpleDateFormat zzcwi = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARNING: Removed duplicated region for block: B:69:0x014e A:{Catch:{ JSONException -> 0x0239 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0145 A:{Catch:{ JSONException -> 0x0239 }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A:{Catch:{ JSONException -> 0x0239 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A:{Catch:{ JSONException -> 0x0239 }} */
    public static com.google.android.gms.internal.zzacj zza(android.content.Context r50, com.google.android.gms.internal.zzacf r51, java.lang.String r52) {
        /*
        r0 = r51;
        r1 = "interstitial_timeout";
        r9 = "";
        r15 = 0;
        r10 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0239 }
        r2 = r52;
        r10.<init>(r2);	 Catch:{ JSONException -> 0x0239 }
        r2 = "ad_base_url";
        r11 = 0;
        r2 = r10.optString(r2, r11);	 Catch:{ JSONException -> 0x0239 }
        r3 = "ad_url";
        r4 = r10.optString(r3, r11);	 Catch:{ JSONException -> 0x0239 }
        r3 = "ad_size";
        r13 = r10.optString(r3, r11);	 Catch:{ JSONException -> 0x0239 }
        r3 = "ad_slot_size";
        r40 = r10.optString(r3, r13);	 Catch:{ JSONException -> 0x0239 }
        r12 = 1;
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r3 = r0.zzcsb;	 Catch:{ JSONException -> 0x0239 }
        if (r3 == 0) goto L_0x0031;
    L_0x002e:
        r24 = 1;
        goto L_0x0033;
    L_0x0031:
        r24 = 0;
    L_0x0033:
        r3 = "ad_json";
        r3 = r10.optString(r3, r11);	 Catch:{ JSONException -> 0x0239 }
        if (r3 != 0) goto L_0x0041;
    L_0x003b:
        r3 = "ad_html";
        r3 = r10.optString(r3, r11);	 Catch:{ JSONException -> 0x0239 }
    L_0x0041:
        if (r3 != 0) goto L_0x0049;
    L_0x0043:
        r3 = "body";
        r3 = r10.optString(r3, r11);	 Catch:{ JSONException -> 0x0239 }
    L_0x0049:
        if (r3 != 0) goto L_0x0057;
    L_0x004b:
        r5 = "ads";
        r5 = r10.has(r5);	 Catch:{ JSONException -> 0x0239 }
        if (r5 == 0) goto L_0x0057;
    L_0x0053:
        r3 = r10.toString();	 Catch:{ JSONException -> 0x0239 }
    L_0x0057:
        r5 = "debug_dialog";
        r19 = r10.optString(r5, r11);	 Catch:{ JSONException -> 0x0239 }
        r5 = "debug_signals";
        r42 = r10.optString(r5, r11);	 Catch:{ JSONException -> 0x0239 }
        r5 = r10.has(r1);	 Catch:{ JSONException -> 0x0239 }
        r7 = -1;
        if (r5 == 0) goto L_0x007a;
    L_0x006b:
        r5 = r10.getDouble(r1);	 Catch:{ JSONException -> 0x0239 }
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r5 = r5 * r16;
        r5 = (long) r5;	 Catch:{ JSONException -> 0x0239 }
        r16 = r5;
        goto L_0x007c;
    L_0x007a:
        r16 = r7;
    L_0x007c:
        r1 = "orientation";
        r1 = r10.optString(r1, r11);	 Catch:{ JSONException -> 0x0239 }
        r5 = "portrait";
        r5 = r5.equals(r1);	 Catch:{ JSONException -> 0x0239 }
        r14 = -1;
        if (r5 == 0) goto L_0x0096;
    L_0x008b:
        r1 = com.google.android.gms.ads.internal.zzbt.zzen();	 Catch:{ JSONException -> 0x0239 }
        r1 = r1.zzrh();	 Catch:{ JSONException -> 0x0239 }
    L_0x0093:
        r18 = r1;
        goto L_0x00a9;
    L_0x0096:
        r5 = "landscape";
        r1 = r5.equals(r1);	 Catch:{ JSONException -> 0x0239 }
        if (r1 == 0) goto L_0x00a7;
    L_0x009e:
        r1 = com.google.android.gms.ads.internal.zzbt.zzen();	 Catch:{ JSONException -> 0x0239 }
        r1 = r1.zzrg();	 Catch:{ JSONException -> 0x0239 }
        goto L_0x0093;
    L_0x00a7:
        r18 = -1;
    L_0x00a9:
        r1 = android.text.TextUtils.isEmpty(r3);	 Catch:{ JSONException -> 0x0239 }
        if (r1 == 0) goto L_0x00d5;
    L_0x00af:
        r1 = android.text.TextUtils.isEmpty(r4);	 Catch:{ JSONException -> 0x0239 }
        if (r1 != 0) goto L_0x00d5;
    L_0x00b5:
        r1 = r0.zzatz;	 Catch:{ JSONException -> 0x0239 }
        r3 = r1.zzcu;	 Catch:{ JSONException -> 0x0239 }
        r5 = 0;
        r6 = 0;
        r20 = 0;
        r21 = 0;
        r1 = r51;
        r2 = r50;
        r7 = r20;
        r8 = r21;
        r1 = com.google.android.gms.internal.zzadn.zza(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ JSONException -> 0x0239 }
        r2 = r1.zzcno;	 Catch:{ JSONException -> 0x0239 }
        r3 = r1.body;	 Catch:{ JSONException -> 0x0239 }
        r4 = r1.zzcts;	 Catch:{ JSONException -> 0x0239 }
        r20 = r4;
        r4 = r3;
        goto L_0x00d9;
    L_0x00d5:
        r4 = r3;
        r1 = r11;
        r20 = -1;
    L_0x00d9:
        r3 = r2;
        if (r4 != 0) goto L_0x00e2;
    L_0x00dc:
        r0 = new com.google.android.gms.internal.zzacj;	 Catch:{ JSONException -> 0x0239 }
        r0.<init>(r15);	 Catch:{ JSONException -> 0x0239 }
        return r0;
    L_0x00e2:
        r2 = "click_urls";
        r2 = r10.optJSONArray(r2);	 Catch:{ JSONException -> 0x0239 }
        if (r1 != 0) goto L_0x00ec;
    L_0x00ea:
        r5 = r11;
        goto L_0x00ee;
    L_0x00ec:
        r5 = r1.zzchw;	 Catch:{ JSONException -> 0x0239 }
    L_0x00ee:
        if (r2 == 0) goto L_0x00f5;
    L_0x00f0:
        r2 = zza(r2, r5);	 Catch:{ JSONException -> 0x0239 }
        r5 = r2;
    L_0x00f5:
        r2 = "impression_urls";
        r2 = r10.optJSONArray(r2);	 Catch:{ JSONException -> 0x0239 }
        if (r1 != 0) goto L_0x00ff;
    L_0x00fd:
        r6 = r11;
        goto L_0x0101;
    L_0x00ff:
        r6 = r1.zzchx;	 Catch:{ JSONException -> 0x0239 }
    L_0x0101:
        if (r2 == 0) goto L_0x0108;
    L_0x0103:
        r2 = zza(r2, r6);	 Catch:{ JSONException -> 0x0239 }
        r6 = r2;
    L_0x0108:
        r2 = "manual_impression_urls";
        r2 = r10.optJSONArray(r2);	 Catch:{ JSONException -> 0x0239 }
        if (r1 != 0) goto L_0x0112;
    L_0x0110:
        r7 = r11;
        goto L_0x0114;
    L_0x0112:
        r7 = r1.zzctq;	 Catch:{ JSONException -> 0x0239 }
    L_0x0114:
        if (r2 == 0) goto L_0x011d;
    L_0x0116:
        r2 = zza(r2, r7);	 Catch:{ JSONException -> 0x0239 }
        r22 = r2;
        goto L_0x011f;
    L_0x011d:
        r22 = r7;
    L_0x011f:
        if (r1 == 0) goto L_0x0135;
    L_0x0121:
        r2 = r1.orientation;	 Catch:{ JSONException -> 0x0239 }
        if (r2 == r14) goto L_0x0129;
    L_0x0125:
        r2 = r1.orientation;	 Catch:{ JSONException -> 0x0239 }
        r18 = r2;
    L_0x0129:
        r7 = r1.zzctn;	 Catch:{ JSONException -> 0x0239 }
        r25 = 0;
        r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1));
        if (r2 <= 0) goto L_0x0135;
    L_0x0131:
        r1 = r1.zzctn;	 Catch:{ JSONException -> 0x0239 }
        r7 = r1;
        goto L_0x0137;
    L_0x0135:
        r7 = r16;
    L_0x0137:
        r1 = "active_view";
        r23 = r10.optString(r1);	 Catch:{ JSONException -> 0x0239 }
        r1 = "ad_is_javascript";
        r25 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        if (r25 == 0) goto L_0x014e;
    L_0x0145:
        r1 = "ad_passback_url";
        r1 = r10.optString(r1, r11);	 Catch:{ JSONException -> 0x0239 }
        r26 = r1;
        goto L_0x0150;
    L_0x014e:
        r26 = r11;
    L_0x0150:
        r1 = "mediation";
        r14 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        r1 = "custom_render_allowed";
        r27 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        r1 = "content_url_opted_out";
        r28 = r10.optBoolean(r1, r12);	 Catch:{ JSONException -> 0x0239 }
        r1 = "content_vertical_opted_out";
        r43 = r10.optBoolean(r1, r12);	 Catch:{ JSONException -> 0x0239 }
        r1 = "prefetch";
        r29 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        r1 = "refresh_interval_milliseconds";
        r11 = -1;
        r16 = r10.optLong(r1, r11);	 Catch:{ JSONException -> 0x0239 }
        r1 = "mediation_config_cache_time_milliseconds";
        r11 = r10.optLong(r1, r11);	 Catch:{ JSONException -> 0x0239 }
        r1 = "gws_query_id";
        r30 = r10.optString(r1, r9);	 Catch:{ JSONException -> 0x0239 }
        r1 = "height";
        r2 = "fluid";
        r2 = r10.optString(r2, r9);	 Catch:{ JSONException -> 0x0239 }
        r31 = r1.equals(r2);	 Catch:{ JSONException -> 0x0239 }
        r1 = "native_express";
        r32 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        r1 = "video_start_urls";
        r1 = r10.optJSONArray(r1);	 Catch:{ JSONException -> 0x0239 }
        r2 = 0;
        r33 = zza(r1, r2);	 Catch:{ JSONException -> 0x0239 }
        r1 = "video_complete_urls";
        r1 = r10.optJSONArray(r1);	 Catch:{ JSONException -> 0x0239 }
        r34 = zza(r1, r2);	 Catch:{ JSONException -> 0x0239 }
        r1 = "rewards";
        r1 = r10.optJSONArray(r1);	 Catch:{ JSONException -> 0x0239 }
        r35 = com.google.android.gms.internal.zzagd.zza(r1);	 Catch:{ JSONException -> 0x0239 }
        r1 = "use_displayed_impression";
        r36 = r10.optBoolean(r1, r15);	 Catch:{ JSONException -> 0x0239 }
        r1 = "auto_protection_configuration";
        r1 = r10.optJSONObject(r1);	 Catch:{ JSONException -> 0x0239 }
        r37 = com.google.android.gms.internal.zzacl.zzk(r1);	 Catch:{ JSONException -> 0x0239 }
        r1 = "set_cookie";
        r38 = r10.optString(r1, r9);	 Catch:{ JSONException -> 0x0239 }
        r1 = "remote_ping_urls";
        r1 = r10.optJSONArray(r1);	 Catch:{ JSONException -> 0x0239 }
        r2 = 0;
        r39 = zza(r1, r2);	 Catch:{ JSONException -> 0x0239 }
        r1 = "safe_browsing";
        r1 = r10.optJSONObject(r1);	 Catch:{ JSONException -> 0x0239 }
        r41 = com.google.android.gms.internal.zzagn.zzn(r1);	 Catch:{ JSONException -> 0x0239 }
        r1 = "render_in_browser";
        r2 = r0.zzcia;	 Catch:{ JSONException -> 0x0239 }
        r44 = r10.optBoolean(r1, r2);	 Catch:{ JSONException -> 0x0239 }
        r1 = "custom_close_blocked";
        r45 = r10.optBoolean(r1);	 Catch:{ JSONException -> 0x0239 }
        r47 = new com.google.android.gms.internal.zzacj;	 Catch:{ JSONException -> 0x0239 }
        r10 = r0.zzcsd;	 Catch:{ JSONException -> 0x0239 }
        r9 = r0.zzcsr;	 Catch:{ JSONException -> 0x0239 }
        r2 = r0.zzctd;	 Catch:{ JSONException -> 0x0239 }
        r46 = 0;
        r1 = r47;
        r48 = r2;
        r2 = r51;
        r0 = r9;
        r9 = r14;
        r49 = r10;
        r10 = r11;
        r12 = r22;
        r22 = r13;
        r13 = r16;
        r15 = r18;
        r16 = r22;
        r17 = r20;
        r20 = r25;
        r21 = r26;
        r22 = r23;
        r23 = r27;
        r25 = r49;
        r26 = r28;
        r27 = r29;
        r28 = r30;
        r29 = r31;
        r30 = r32;
        r31 = r35;
        r32 = r33;
        r33 = r34;
        r34 = r36;
        r35 = r37;
        r36 = r0;
        r37 = r38;
        r38 = r39;
        r39 = r44;
        r44 = r48;
        r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);	 Catch:{ JSONException -> 0x0239 }
        return r47;
    L_0x0239:
        r0 = move-exception;
        r1 = "Could not parse the inline ad response: ";
        r0 = r0.getMessage();
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x024f;
    L_0x024a:
        r0 = r1.concat(r0);
        goto L_0x0254;
    L_0x024f:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x0254:
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = new com.google.android.gms.internal.zzacj;
        r1 = 0;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzads.zza(android.content.Context, com.google.android.gms.internal.zzacf, java.lang.String):com.google.android.gms.internal.zzacj");
    }

    private static List<String> zza(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        List list2;
        if (list2 == null) {
            list2 = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list2.add(jSONArray.getString(i));
        }
        return list2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0252 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x025f A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0272 A:{SYNTHETIC, Splitter:B:142:0x0272} */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x07f5 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x07f2 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05ee A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x060b A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0639 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0617 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x065d A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0689 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06ab A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x06bc A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06e2 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x06fa A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0709 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0734 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07ac A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07d6 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x080e A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0838 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0819 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0841 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x084e A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0881 A:{Catch:{ JSONException -> 0x08d3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x08a5 A:{Catch:{ JSONException -> 0x08d3 }} */
    public static org.json.JSONObject zza(android.content.Context r22, com.google.android.gms.internal.zzadl r23) {
        /*
        r1 = r23;
        r2 = r1.zzcvm;
        r3 = r1.zzbhd;
        r4 = r1.zzcvn;
        r5 = r1.zzcsc;
        r6 = r1.zzcvo;
        r8 = new java.util.HashMap;	 Catch:{ JSONException -> 0x08d3 }
        r8.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r9 = "extra_caps";
        r10 = com.google.android.gms.internal.zzoi.zzbsd;	 Catch:{ JSONException -> 0x08d3 }
        r11 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r10 = r11.zzd(r10);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r9, r10);	 Catch:{ JSONException -> 0x08d3 }
        r9 = r1.zzcsj;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.size();	 Catch:{ JSONException -> 0x08d3 }
        r10 = ",";
        if (r9 <= 0) goto L_0x0035;
    L_0x002a:
        r9 = "eid";
        r11 = r1.zzcsj;	 Catch:{ JSONException -> 0x08d3 }
        r11 = android.text.TextUtils.join(r10, r11);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0035:
        r9 = r2.zzcru;	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x0040;
    L_0x0039:
        r9 = "ad_pos";
        r11 = r2.zzcru;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0040:
        r9 = r2.zzcrv;	 Catch:{ JSONException -> 0x08d3 }
        r11 = com.google.android.gms.internal.zzahr.zzqi();	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x004d;
    L_0x0048:
        r12 = "abf";
        r8.put(r12, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x004d:
        r11 = r9.zzbgv;	 Catch:{ JSONException -> 0x08d3 }
        r13 = -1;
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 == 0) goto L_0x0067;
    L_0x0055:
        r11 = "cust_age";
        r12 = zzcwi;	 Catch:{ JSONException -> 0x08d3 }
        r15 = new java.util.Date;	 Catch:{ JSONException -> 0x08d3 }
        r13 = r9.zzbgv;	 Catch:{ JSONException -> 0x08d3 }
        r15.<init>(r13);	 Catch:{ JSONException -> 0x08d3 }
        r12 = r12.format(r15);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r12);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0067:
        r11 = r9.extras;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x0072;
    L_0x006b:
        r11 = "extras";
        r12 = r9.extras;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r12);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0072:
        r11 = r9.zzbgw;	 Catch:{ JSONException -> 0x08d3 }
        r12 = -1;
        if (r11 == r12) goto L_0x0082;
    L_0x0077:
        r11 = "cust_gender";
        r13 = r9.zzbgw;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r13);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0082:
        r11 = r9.zzbgx;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x008d;
    L_0x0086:
        r11 = "kw";
        r13 = r9.zzbgx;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r13);	 Catch:{ JSONException -> 0x08d3 }
    L_0x008d:
        r11 = r9.zzbgz;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == r12) goto L_0x009c;
    L_0x0091:
        r11 = "tag_for_child_directed_treatment";
        r13 = r9.zzbgz;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r13);	 Catch:{ JSONException -> 0x08d3 }
    L_0x009c:
        r11 = r9.zzbgy;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x00bf;
    L_0x00a0:
        r11 = com.google.android.gms.internal.zzoi.zzbvu;	 Catch:{ JSONException -> 0x08d3 }
        r13 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r11 = r13.zzd(r11);	 Catch:{ JSONException -> 0x08d3 }
        r11 = (java.lang.Boolean) r11;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r11.booleanValue();	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x00ba;
    L_0x00b2:
        r11 = "test_request";
        r13 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
    L_0x00b6:
        r8.put(r11, r13);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x00bf;
    L_0x00ba:
        r11 = "adtest";
        r13 = "on";
        goto L_0x00b6;
    L_0x00bf:
        r11 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r13 = 2;
        r14 = 1;
        if (r11 < r13) goto L_0x00e1;
    L_0x00c5:
        r11 = r9.zzbha;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x00d2;
    L_0x00c9:
        r11 = "d_imp_hdr";
        r15 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r15);	 Catch:{ JSONException -> 0x08d3 }
    L_0x00d2:
        r11 = r9.zzbhb;	 Catch:{ JSONException -> 0x08d3 }
        r11 = android.text.TextUtils.isEmpty(r11);	 Catch:{ JSONException -> 0x08d3 }
        if (r11 != 0) goto L_0x00e1;
    L_0x00da:
        r11 = "ppid";
        r15 = r9.zzbhb;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r15);	 Catch:{ JSONException -> 0x08d3 }
    L_0x00e1:
        r11 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r15 = 3;
        if (r11 < r15) goto L_0x00f1;
    L_0x00e6:
        r11 = r9.zzbhe;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x00f1;
    L_0x00ea:
        r11 = "url";
        r15 = r9.zzbhe;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r15);	 Catch:{ JSONException -> 0x08d3 }
    L_0x00f1:
        r11 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r15 = 5;
        if (r11 < r15) goto L_0x0117;
    L_0x00f6:
        r11 = r9.zzbhg;	 Catch:{ JSONException -> 0x08d3 }
        if (r11 == 0) goto L_0x0101;
    L_0x00fa:
        r11 = "custom_targeting";
        r7 = r9.zzbhg;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r11, r7);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0101:
        r7 = r9.zzbhh;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x010c;
    L_0x0105:
        r7 = "category_exclusions";
        r11 = r9.zzbhh;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x010c:
        r7 = r9.zzbhi;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x0117;
    L_0x0110:
        r7 = "request_agent";
        r11 = r9.zzbhi;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0117:
        r7 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r11 = 6;
        if (r7 < r11) goto L_0x0127;
    L_0x011c:
        r7 = r9.zzbhj;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x0127;
    L_0x0120:
        r7 = "request_pkg";
        r11 = r9.zzbhj;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0127:
        r7 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r11 = 7;
        if (r7 < r11) goto L_0x0137;
    L_0x012c:
        r7 = "is_designed_for_families";
        r9 = r9.zzbhk;	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Boolean.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0137:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbic;	 Catch:{ JSONException -> 0x08d3 }
        r9 = "height";
        r11 = "fluid";
        r15 = "format";
        if (r7 != 0) goto L_0x0154;
    L_0x0143:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbia;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r15, r7);	 Catch:{ JSONException -> 0x08d3 }
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbie;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x0186;
    L_0x0150:
        r8.put(r11, r9);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0186;
    L_0x0154:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbic;	 Catch:{ JSONException -> 0x08d3 }
        r14 = r7.length;	 Catch:{ JSONException -> 0x08d3 }
        r13 = 0;
        r19 = 0;
        r20 = 0;
    L_0x015e:
        if (r13 >= r14) goto L_0x0186;
    L_0x0160:
        r12 = r7[r13];	 Catch:{ JSONException -> 0x08d3 }
        r21 = r7;
        r7 = r12.zzbie;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 != 0) goto L_0x0171;
    L_0x0168:
        if (r19 != 0) goto L_0x0171;
    L_0x016a:
        r7 = r12.zzbia;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r15, r7);	 Catch:{ JSONException -> 0x08d3 }
        r19 = 1;
    L_0x0171:
        r7 = r12.zzbie;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x017c;
    L_0x0175:
        if (r20 != 0) goto L_0x017c;
    L_0x0177:
        r8.put(r11, r9);	 Catch:{ JSONException -> 0x08d3 }
        r20 = 1;
    L_0x017c:
        if (r19 == 0) goto L_0x0180;
    L_0x017e:
        if (r20 != 0) goto L_0x0186;
    L_0x0180:
        r13 = r13 + 1;
        r7 = r21;
        r12 = -1;
        goto L_0x015e;
    L_0x0186:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.width;	 Catch:{ JSONException -> 0x08d3 }
        r9 = -1;
        if (r7 != r9) goto L_0x0194;
    L_0x018d:
        r7 = "smart_w";
        r9 = "full";
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0194:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.height;	 Catch:{ JSONException -> 0x08d3 }
        r9 = -2;
        if (r7 != r9) goto L_0x01a2;
    L_0x019b:
        r7 = "smart_h";
        r11 = "auto";
        r8.put(r7, r11);	 Catch:{ JSONException -> 0x08d3 }
    L_0x01a2:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbic;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x0216;
    L_0x01a8:
        r7 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x08d3 }
        r7.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r11 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r11.zzbic;	 Catch:{ JSONException -> 0x08d3 }
        r12 = r11.length;	 Catch:{ JSONException -> 0x08d3 }
        r13 = 0;
        r14 = 0;
    L_0x01b4:
        if (r13 >= r12) goto L_0x01fc;
    L_0x01b6:
        r15 = r11[r13];	 Catch:{ JSONException -> 0x08d3 }
        r9 = r15.zzbie;	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x01c0;
    L_0x01bc:
        r20 = r11;
        r14 = 1;
        goto L_0x01f6;
    L_0x01c0:
        r9 = r7.length();	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x01cb;
    L_0x01c6:
        r9 = "|";
        r7.append(r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x01cb:
        r9 = r15.width;	 Catch:{ JSONException -> 0x08d3 }
        r20 = r11;
        r11 = -1;
        if (r9 != r11) goto L_0x01da;
    L_0x01d2:
        r9 = r15.widthPixels;	 Catch:{ JSONException -> 0x08d3 }
        r9 = (float) r9;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r4.zzaxz;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9 / r11;
        r9 = (int) r9;	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x01dc;
    L_0x01da:
        r9 = r15.width;	 Catch:{ JSONException -> 0x08d3 }
    L_0x01dc:
        r7.append(r9);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "x";
        r7.append(r9);	 Catch:{ JSONException -> 0x08d3 }
        r9 = r15.height;	 Catch:{ JSONException -> 0x08d3 }
        r11 = -2;
        if (r9 != r11) goto L_0x01f1;
    L_0x01e9:
        r9 = r15.heightPixels;	 Catch:{ JSONException -> 0x08d3 }
        r9 = (float) r9;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r4.zzaxz;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9 / r11;
        r9 = (int) r9;	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x01f3;
    L_0x01f1:
        r9 = r15.height;	 Catch:{ JSONException -> 0x08d3 }
    L_0x01f3:
        r7.append(r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x01f6:
        r13 = r13 + 1;
        r11 = r20;
        r9 = -2;
        goto L_0x01b4;
    L_0x01fc:
        if (r14 == 0) goto L_0x0211;
    L_0x01fe:
        r9 = r7.length();	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x020b;
    L_0x0204:
        r9 = "|";
        r11 = 0;
        r7.insert(r11, r9);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x020c;
    L_0x020b:
        r11 = 0;
    L_0x020c:
        r9 = "320x50";
        r7.insert(r11, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0211:
        r9 = "sz";
        r8.put(r9, r7);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0216:
        r7 = r2.zzcsb;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x0286;
    L_0x021a:
        r7 = "native_version";
        r9 = r2.zzcsb;	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "native_templates";
        r9 = r2.zzauy;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "native_image_orientation";
        r9 = r2.zzauq;	 Catch:{ JSONException -> 0x08d3 }
        if (r9 != 0) goto L_0x0235;
    L_0x0232:
        r9 = "any";
        goto L_0x0247;
    L_0x0235:
        r9 = r9.zzbzk;	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x0232;
    L_0x0239:
        r11 = 1;
        if (r9 == r11) goto L_0x0245;
    L_0x023c:
        r11 = 2;
        if (r9 == r11) goto L_0x0242;
    L_0x023f:
        r9 = "not_set";
        goto L_0x0247;
    L_0x0242:
        r9 = "landscape";
        goto L_0x0247;
    L_0x0245:
        r9 = "portrait";
    L_0x0247:
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = r2.zzcsk;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.isEmpty();	 Catch:{ JSONException -> 0x08d3 }
        if (r7 != 0) goto L_0x0259;
    L_0x0252:
        r7 = "native_custom_templates";
        r9 = r2.zzcsk;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0259:
        r7 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r9 = 24;
        if (r7 < r9) goto L_0x026a;
    L_0x025f:
        r7 = "max_num_ads";
        r9 = r2.zzctg;	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x026a:
        r7 = r2.zzcte;	 Catch:{ JSONException -> 0x08d3 }
        r7 = android.text.TextUtils.isEmpty(r7);	 Catch:{ JSONException -> 0x08d3 }
        if (r7 != 0) goto L_0x0286;
    L_0x0272:
        r7 = "native_advanced_settings";
        r9 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x027f }
        r11 = r2.zzcte;	 Catch:{ JSONException -> 0x027f }
        r9.<init>(r11);	 Catch:{ JSONException -> 0x027f }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x027f }
        goto L_0x0286;
    L_0x027f:
        r0 = move-exception;
        r7 = r0;
        r9 = "Problem creating json from native advanced settings";
        com.google.android.gms.internal.zzaky.zzc(r9, r7);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0286:
        r7 = r2.zzauu;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x02bf;
    L_0x028a:
        r7 = r2.zzauu;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.size();	 Catch:{ JSONException -> 0x08d3 }
        if (r7 <= 0) goto L_0x02bf;
    L_0x0292:
        r7 = r2.zzauu;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.iterator();	 Catch:{ JSONException -> 0x08d3 }
    L_0x0298:
        r9 = r7.hasNext();	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x02bf;
    L_0x029e:
        r9 = r7.next();	 Catch:{ JSONException -> 0x08d3 }
        r9 = (java.lang.Integer) r9;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r9.intValue();	 Catch:{ JSONException -> 0x08d3 }
        r12 = 2;
        if (r11 != r12) goto L_0x02b3;
    L_0x02ab:
        r9 = "iba";
        r11 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
    L_0x02af:
        r8.put(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0298;
    L_0x02b3:
        r9 = r9.intValue();	 Catch:{ JSONException -> 0x08d3 }
        r11 = 1;
        if (r9 != r11) goto L_0x0298;
    L_0x02ba:
        r9 = "ina";
        r11 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x02af;
    L_0x02bf:
        r7 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.zzbif;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x02cc;
    L_0x02c5:
        r7 = "ene";
        r9 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x02cc:
        r7 = com.google.android.gms.internal.zzoi.zzbos;	 Catch:{ JSONException -> 0x08d3 }
        r9 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r7 = r9.zzd(r7);	 Catch:{ JSONException -> 0x08d3 }
        r7 = (java.lang.Boolean) r7;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r7.booleanValue();	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x02e5;
    L_0x02de:
        r7 = "xsrve";
        r9 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x02e5:
        r7 = r2.zzaus;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x02fd;
    L_0x02e9:
        r7 = "is_icon_ad";
        r9 = java.lang.Boolean.TRUE;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "icon_ad_expansion_behavior";
        r9 = r2.zzaus;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.zzbjh;	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x02fd:
        r7 = "slotname";
        r9 = r2.zzatx;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "pn";
        r9 = r2.applicationInfo;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.packageName;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = r2.zzcrw;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x031e;
    L_0x0311:
        r7 = "vc";
        r9 = r2.zzcrw;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
    L_0x031e:
        r7 = "ms";
        r9 = r1.zzcrx;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "seq_num";
        r9 = r2.zzcry;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "session_id";
        r9 = r2.zzcrz;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "js";
        r9 = r2.zzatz;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.zzcu;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = r1.zzcvj;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r2.zzcsw;	 Catch:{ JSONException -> 0x08d3 }
        r11 = r1.zzcvi;	 Catch:{ JSONException -> 0x08d3 }
        r12 = "am";
        r13 = r4.zzcyb;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r13);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "cog";
        r13 = r4.zzcyc;	 Catch:{ JSONException -> 0x08d3 }
        r13 = zzu(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r13);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "coh";
        r13 = r4.zzcyd;	 Catch:{ JSONException -> 0x08d3 }
        r13 = zzu(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r13);	 Catch:{ JSONException -> 0x08d3 }
        r12 = r4.zzcye;	 Catch:{ JSONException -> 0x08d3 }
        r12 = android.text.TextUtils.isEmpty(r12);	 Catch:{ JSONException -> 0x08d3 }
        if (r12 != 0) goto L_0x0372;
    L_0x036b:
        r12 = "carrier";
        r13 = r4.zzcye;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r13);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0372:
        r12 = "gl";
        r13 = r4.zzcyf;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r13);	 Catch:{ JSONException -> 0x08d3 }
        r12 = r4.zzcyg;	 Catch:{ JSONException -> 0x08d3 }
        if (r12 == 0) goto L_0x0387;
    L_0x037d:
        r12 = "simulator";
        r13 = 1;
        r14 = java.lang.Integer.valueOf(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0387:
        r12 = r4.zzcyh;	 Catch:{ JSONException -> 0x08d3 }
        if (r12 == 0) goto L_0x0396;
    L_0x038b:
        r12 = "is_sidewinder";
        r13 = 1;
        r14 = java.lang.Integer.valueOf(r13);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0397;
    L_0x0396:
        r13 = 1;
    L_0x0397:
        r12 = "ma";
        r14 = r4.zzcyi;	 Catch:{ JSONException -> 0x08d3 }
        r14 = zzu(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "sp";
        r14 = r4.zzcyj;	 Catch:{ JSONException -> 0x08d3 }
        r14 = zzu(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "hl";
        r14 = r4.zzcyk;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = r4.zzcyl;	 Catch:{ JSONException -> 0x08d3 }
        r12 = android.text.TextUtils.isEmpty(r12);	 Catch:{ JSONException -> 0x08d3 }
        if (r12 != 0) goto L_0x03c3;
    L_0x03bc:
        r12 = "mv";
        r14 = r4.zzcyl;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
    L_0x03c3:
        r12 = "muv";
        r14 = r4.zzcyn;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = r4.zzcyo;	 Catch:{ JSONException -> 0x08d3 }
        r14 = -2;
        if (r12 == r14) goto L_0x03de;
    L_0x03d3:
        r12 = "cnt";
        r14 = r4.zzcyo;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
    L_0x03de:
        r12 = "gnt";
        r14 = r4.zzcyp;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "pt";
        r14 = r4.zzcyq;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "rm";
        r14 = r4.zzcyr;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = "riv";
        r14 = r4.zzcys;	 Catch:{ JSONException -> 0x08d3 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r12, r14);	 Catch:{ JSONException -> 0x08d3 }
        r12 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r12.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r14 = "build_build";
        r15 = r4.zzcyx;	 Catch:{ JSONException -> 0x08d3 }
        r12.putString(r14, r15);	 Catch:{ JSONException -> 0x08d3 }
        r14 = "build_device";
        r15 = r4.zzcyy;	 Catch:{ JSONException -> 0x08d3 }
        r12.putString(r14, r15);	 Catch:{ JSONException -> 0x08d3 }
        r14 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r14.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r15 = "is_charging";
        r13 = r4.zzcyu;	 Catch:{ JSONException -> 0x08d3 }
        r14.putBoolean(r15, r13);	 Catch:{ JSONException -> 0x08d3 }
        r13 = "battery_level";
        r15 = r5;
        r19 = r6;
        r5 = r4.zzcyt;	 Catch:{ JSONException -> 0x08d3 }
        r14.putDouble(r13, r5);	 Catch:{ JSONException -> 0x08d3 }
        r5 = "battery";
        r12.putBundle(r5, r14);	 Catch:{ JSONException -> 0x08d3 }
        r5 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r5.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r6 = "active_network_state";
        r13 = r4.zzcyw;	 Catch:{ JSONException -> 0x08d3 }
        r5.putInt(r6, r13);	 Catch:{ JSONException -> 0x08d3 }
        r6 = "active_network_metered";
        r13 = r4.zzcyv;	 Catch:{ JSONException -> 0x08d3 }
        r5.putBoolean(r6, r13);	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x046f;
    L_0x044d:
        r6 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r6.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r13 = "predicted_latency_micros";
        r14 = r7.zzczh;	 Catch:{ JSONException -> 0x08d3 }
        r6.putInt(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = "predicted_down_throughput_bps";
        r20 = r15;
        r14 = r7.zzczi;	 Catch:{ JSONException -> 0x08d3 }
        r6.putLong(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = "predicted_up_throughput_bps";
        r14 = r7.zzczj;	 Catch:{ JSONException -> 0x08d3 }
        r6.putLong(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "predictions";
        r5.putBundle(r7, r6);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0471;
    L_0x046f:
        r20 = r15;
    L_0x0471:
        r6 = "network";
        r12.putBundle(r6, r5);	 Catch:{ JSONException -> 0x08d3 }
        r5 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r5.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r6 = "is_browser_custom_tabs_capable";
        r7 = r4.zzcyz;	 Catch:{ JSONException -> 0x08d3 }
        r5.putBoolean(r6, r7);	 Catch:{ JSONException -> 0x08d3 }
        r6 = "browser";
        r12.putBundle(r6, r5);	 Catch:{ JSONException -> 0x08d3 }
        if (r9 == 0) goto L_0x0540;
    L_0x0489:
        r5 = "android_mem_info";
        r6 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r6.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r7 = "runtime_free";
        r13 = "runtime_free_memory";
        r14 = -1;
        r16 = r9.getLong(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Long.toString(r16);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r7, r13);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "runtime_max";
        r13 = "runtime_max_memory";
        r16 = r9.getLong(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Long.toString(r16);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r7, r13);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "runtime_total";
        r13 = "runtime_total_memory";
        r13 = r9.getLong(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Long.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r7, r13);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "web_view_count";
        r13 = "web_view_count";
        r14 = 0;
        r13 = r9.getInt(r13, r14);	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r7, r13);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "debug_memory_info";
        r7 = r9.getParcelable(r7);	 Catch:{ JSONException -> 0x08d3 }
        r7 = (android.os.Debug.MemoryInfo) r7;	 Catch:{ JSONException -> 0x08d3 }
        if (r7 == 0) goto L_0x053c;
    L_0x04d9:
        r9 = "debug_info_dalvik_private_dirty";
        r13 = r7.dalvikPrivateDirty;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_dalvik_pss";
        r13 = r7.dalvikPss;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_dalvik_shared_dirty";
        r13 = r7.dalvikSharedDirty;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_native_private_dirty";
        r13 = r7.nativePrivateDirty;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_native_pss";
        r13 = r7.nativePss;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_native_shared_dirty";
        r13 = r7.nativeSharedDirty;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_other_private_dirty";
        r13 = r7.otherPrivateDirty;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_other_pss";
        r13 = r7.otherPss;	 Catch:{ JSONException -> 0x08d3 }
        r13 = java.lang.Integer.toString(r13);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r13);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "debug_info_other_shared_dirty";
        r7 = r7.otherSharedDirty;	 Catch:{ JSONException -> 0x08d3 }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r9, r7);	 Catch:{ JSONException -> 0x08d3 }
    L_0x053c:
        r12.putBundle(r5, r6);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0541;
    L_0x0540:
        r14 = 0;
    L_0x0541:
        r5 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r5.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r6 = "parental_controls";
        r5.putBundle(r6, r11);	 Catch:{ JSONException -> 0x08d3 }
        r6 = r4.zzcym;	 Catch:{ JSONException -> 0x08d3 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ JSONException -> 0x08d3 }
        if (r6 != 0) goto L_0x055a;
    L_0x0553:
        r6 = "package_version";
        r7 = r4.zzcym;	 Catch:{ JSONException -> 0x08d3 }
        r5.putString(r6, r7);	 Catch:{ JSONException -> 0x08d3 }
    L_0x055a:
        r6 = "play_store";
        r12.putBundle(r6, r5);	 Catch:{ JSONException -> 0x08d3 }
        r5 = "device";
        r8.put(r5, r12);	 Catch:{ JSONException -> 0x08d3 }
        r5 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r5.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r6 = "doritos";
        r7 = r1.zzcvk;	 Catch:{ JSONException -> 0x08d3 }
        r5.putString(r6, r7);	 Catch:{ JSONException -> 0x08d3 }
        r6 = com.google.android.gms.internal.zzoi.zzbpd;	 Catch:{ JSONException -> 0x08d3 }
        r7 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r6 = r7.zzd(r6);	 Catch:{ JSONException -> 0x08d3 }
        r6 = (java.lang.Boolean) r6;	 Catch:{ JSONException -> 0x08d3 }
        r6 = r6.booleanValue();	 Catch:{ JSONException -> 0x08d3 }
        if (r6 == 0) goto L_0x05be;
    L_0x0582:
        r6 = r1.zzcvl;	 Catch:{ JSONException -> 0x08d3 }
        if (r6 == 0) goto L_0x0593;
    L_0x0586:
        r6 = r1.zzcvl;	 Catch:{ JSONException -> 0x08d3 }
        r7 = r6.getId();	 Catch:{ JSONException -> 0x08d3 }
        r6 = r1.zzcvl;	 Catch:{ JSONException -> 0x08d3 }
        r13 = r6.isLimitAdTrackingEnabled();	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0595;
    L_0x0593:
        r7 = 0;
        r13 = 0;
    L_0x0595:
        r6 = android.text.TextUtils.isEmpty(r7);	 Catch:{ JSONException -> 0x08d3 }
        if (r6 != 0) goto L_0x05ad;
    L_0x059b:
        r6 = "rdid";
        r5.putString(r6, r7);	 Catch:{ JSONException -> 0x08d3 }
        r6 = "is_lat";
        r5.putBoolean(r6, r13);	 Catch:{ JSONException -> 0x08d3 }
        r6 = "idtype";
        r7 = "adid";
    L_0x05a9:
        r5.putString(r6, r7);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x05be;
    L_0x05ad:
        com.google.android.gms.internal.zzlc.zzij();	 Catch:{ JSONException -> 0x08d3 }
        r6 = com.google.android.gms.internal.zzako.zzba(r22);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "pdid";
        r5.putString(r7, r6);	 Catch:{ JSONException -> 0x08d3 }
        r6 = "pdidtype";
        r7 = "ssaid";
        goto L_0x05a9;
    L_0x05be:
        r6 = "pii";
        r8.put(r6, r5);	 Catch:{ JSONException -> 0x08d3 }
        r5 = "platform";
        r6 = android.os.Build.MANUFACTURER;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r5, r6);	 Catch:{ JSONException -> 0x08d3 }
        r5 = "submodel";
        r6 = android.os.Build.MODEL;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r5, r6);	 Catch:{ JSONException -> 0x08d3 }
        if (r3 == 0) goto L_0x05d7;
    L_0x05d3:
        zza(r8, r3);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x05e9;
    L_0x05d7:
        r3 = r2.zzcrv;	 Catch:{ JSONException -> 0x08d3 }
        r3 = r3.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 2;
        if (r3 < r5) goto L_0x05e9;
    L_0x05de:
        r3 = r2.zzcrv;	 Catch:{ JSONException -> 0x08d3 }
        r3 = r3.zzbhd;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 == 0) goto L_0x05e9;
    L_0x05e4:
        r3 = r2.zzcrv;	 Catch:{ JSONException -> 0x08d3 }
        r3 = r3.zzbhd;	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x05d3;
    L_0x05e9:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 2;
        if (r3 < r5) goto L_0x05f5;
    L_0x05ee:
        r3 = "quality_signals";
        r5 = r2.zzcsa;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x05f5:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 4;
        if (r3 < r5) goto L_0x0609;
    L_0x05fa:
        r3 = r2.zzcsd;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 == 0) goto L_0x0609;
    L_0x05fe:
        r3 = "forceHttps";
        r5 = r2.zzcsd;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0609:
        if (r20 == 0) goto L_0x0612;
    L_0x060b:
        r3 = "content_info";
        r5 = r20;
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0612:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 5;
        if (r3 < r5) goto L_0x0639;
    L_0x0617:
        r3 = "u_sd";
        r4 = r2.zzaxz;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Float.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "sh";
        r4 = r2.zzcsf;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "sw";
        r4 = r2.zzcse;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0635:
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0658;
    L_0x0639:
        r3 = "u_sd";
        r5 = r4.zzaxz;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "sh";
        r5 = r4.zzcsf;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "sw";
        r4 = r4.zzcse;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x0635;
    L_0x0658:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r4 = 6;
        if (r3 < r4) goto L_0x0684;
    L_0x065d:
        r3 = r2.zzcsg;	 Catch:{ JSONException -> 0x08d3 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r3 != 0) goto L_0x0679;
    L_0x0665:
        r3 = "view_hierarchy";
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0672 }
        r5 = r2.zzcsg;	 Catch:{ JSONException -> 0x0672 }
        r4.<init>(r5);	 Catch:{ JSONException -> 0x0672 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x0672 }
        goto L_0x0679;
    L_0x0672:
        r0 = move-exception;
        r3 = r0;
        r4 = "Problem serializing view hierarchy to JSON";
        com.google.android.gms.internal.zzaky.zzc(r4, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0679:
        r3 = "correlation_id";
        r4 = r2.zzcsh;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0684:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r4 = 7;
        if (r3 < r4) goto L_0x0690;
    L_0x0689:
        r3 = "request_id";
        r4 = r2.zzcsi;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0690:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r4 = 12;
        if (r3 < r4) goto L_0x06a5;
    L_0x0696:
        r3 = r2.zzcsm;	 Catch:{ JSONException -> 0x08d3 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r3 != 0) goto L_0x06a5;
    L_0x069e:
        r3 = "anchor";
        r4 = r2.zzcsm;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x06a5:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r4 = 13;
        if (r3 < r4) goto L_0x06b6;
    L_0x06ab:
        r3 = "android_app_volume";
        r4 = r2.zzcsn;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Float.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x06b6:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r4 = 18;
        if (r3 < r4) goto L_0x06c7;
    L_0x06bc:
        r3 = "android_app_muted";
        r5 = r2.zzcst;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x06c7:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 14;
        if (r3 < r5) goto L_0x06dc;
    L_0x06cd:
        r3 = r2.zzcso;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 <= 0) goto L_0x06dc;
    L_0x06d1:
        r3 = "target_api";
        r5 = r2.zzcso;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x06dc:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 15;
        if (r3 < r5) goto L_0x06f4;
    L_0x06e2:
        r3 = "scroll_index";
        r5 = r2.zzcsp;	 Catch:{ JSONException -> 0x08d3 }
        r9 = -1;
        if (r5 != r9) goto L_0x06ea;
    L_0x06e9:
        goto L_0x06ed;
    L_0x06ea:
        r12 = r2.zzcsp;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r12;
    L_0x06ed:
        r5 = java.lang.Integer.valueOf(r9);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x06f4:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r5 = 16;
        if (r3 < r5) goto L_0x0705;
    L_0x06fa:
        r3 = "_activity_context";
        r5 = r2.zzcsq;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0705:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 < r4) goto L_0x0730;
    L_0x0709:
        r3 = r2.zzcsu;	 Catch:{ JSONException -> 0x08d3 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r3 != 0) goto L_0x0725;
    L_0x0711:
        r3 = "app_settings";
        r5 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x071e }
        r6 = r2.zzcsu;	 Catch:{ JSONException -> 0x071e }
        r5.<init>(r6);	 Catch:{ JSONException -> 0x071e }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x071e }
        goto L_0x0725;
    L_0x071e:
        r0 = move-exception;
        r3 = r0;
        r5 = "Problem creating json from app settings";
        com.google.android.gms.internal.zzaky.zzc(r5, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0725:
        r3 = "render_in_browser";
        r5 = r2.zzcia;	 Catch:{ JSONException -> 0x08d3 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r5);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0730:
        r3 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 < r4) goto L_0x073f;
    L_0x0734:
        r3 = "android_num_video_cache_tasks";
        r4 = r2.zzcsv;	 Catch:{ JSONException -> 0x08d3 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r3, r4);	 Catch:{ JSONException -> 0x08d3 }
    L_0x073f:
        r3 = r2.zzatz;	 Catch:{ JSONException -> 0x08d3 }
        r4 = r2.zzcth;	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.zzcvp;	 Catch:{ JSONException -> 0x08d3 }
        r5 = r2.zzctj;	 Catch:{ JSONException -> 0x08d3 }
        r6 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r6.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r7 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r7.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r9 = "cl";
        r11 = "190237664";
        r7.putString(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "rapid_rc";
        r11 = "dev";
        r7.putString(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "rapid_rollup";
        r11 = "HEAD";
        r7.putString(r9, r11);	 Catch:{ JSONException -> 0x08d3 }
        r9 = "build_meta";
        r6.putBundle(r9, r7);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "mf";
        r9 = com.google.android.gms.internal.zzoi.zzbsf;	 Catch:{ JSONException -> 0x08d3 }
        r11 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r9 = r11.zzd(r9);	 Catch:{ JSONException -> 0x08d3 }
        r9 = (java.lang.Boolean) r9;	 Catch:{ JSONException -> 0x08d3 }
        r9 = r9.booleanValue();	 Catch:{ JSONException -> 0x08d3 }
        r9 = java.lang.Boolean.toString(r9);	 Catch:{ JSONException -> 0x08d3 }
        r6.putString(r7, r9);	 Catch:{ JSONException -> 0x08d3 }
        r7 = "instant_app";
        r6.putBoolean(r7, r4);	 Catch:{ JSONException -> 0x08d3 }
        r4 = "lite";
        r3 = r3.zzdjc;	 Catch:{ JSONException -> 0x08d3 }
        r6.putBoolean(r4, r3);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "local_service";
        r6.putBoolean(r3, r1);	 Catch:{ JSONException -> 0x08d3 }
        r1 = "is_privileged_process";
        r6.putBoolean(r1, r5);	 Catch:{ JSONException -> 0x08d3 }
        r1 = "sdk_env";
        r8.put(r1, r6);	 Catch:{ JSONException -> 0x08d3 }
        r1 = "cache_state";
        r3 = r19;
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
        r1 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r3 = 19;
        if (r1 < r3) goto L_0x07b3;
    L_0x07ac:
        r1 = "gct";
        r3 = r2.zzcsx;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x07b3:
        r1 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r3 = 21;
        if (r1 < r3) goto L_0x07c4;
    L_0x07b9:
        r1 = r2.zzcsy;	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x07c4;
    L_0x07bd:
        r1 = "de";
        r3 = "1";
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x07c4:
        r1 = com.google.android.gms.internal.zzoi.zzbpr;	 Catch:{ JSONException -> 0x08d3 }
        r3 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r1 = r3.zzd(r1);	 Catch:{ JSONException -> 0x08d3 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.booleanValue();	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x080a;
    L_0x07d6:
        r1 = r2.zzaud;	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.zzbia;	 Catch:{ JSONException -> 0x08d3 }
        r3 = "interstitial_mb";
        r3 = r1.equals(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r3 != 0) goto L_0x07ed;
    L_0x07e2:
        r3 = "reward_mb";
        r1 = r1.equals(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x07eb;
    L_0x07ea:
        goto L_0x07ed;
    L_0x07eb:
        r1 = 0;
        goto L_0x07ee;
    L_0x07ed:
        r1 = 1;
    L_0x07ee:
        r3 = r2.zzcsz;	 Catch:{ JSONException -> 0x08d3 }
        if (r3 == 0) goto L_0x07f5;
    L_0x07f2:
        r18 = 1;
        goto L_0x07f7;
    L_0x07f5:
        r18 = 0;
    L_0x07f7:
        if (r1 == 0) goto L_0x080a;
    L_0x07f9:
        if (r18 == 0) goto L_0x080a;
    L_0x07fb:
        r1 = new android.os.Bundle;	 Catch:{ JSONException -> 0x08d3 }
        r1.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r4 = "interstitial_pool";
        r1.putBundle(r4, r3);	 Catch:{ JSONException -> 0x08d3 }
        r3 = "counters";
        r8.put(r3, r1);	 Catch:{ JSONException -> 0x08d3 }
    L_0x080a:
        r1 = r2.zzcta;	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x0815;
    L_0x080e:
        r1 = "gmp_app_id";
        r3 = r2.zzcta;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0815:
        r1 = r2.zzctb;	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x0838;
    L_0x0819:
        r1 = "TIME_OUT";
        r3 = r2.zzctb;	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.equals(r3);	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x0833;
    L_0x0823:
        r1 = "sai_timeout";
        r3 = com.google.android.gms.internal.zzoi.zzboq;	 Catch:{ JSONException -> 0x08d3 }
        r4 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r3 = r4.zzd(r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x082f:
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x083d;
    L_0x0833:
        r1 = "fbs_aiid";
        r3 = r2.zzctb;	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x082f;
    L_0x0838:
        r1 = "fbs_aiid";
        r3 = "";
        goto L_0x082f;
    L_0x083d:
        r1 = r2.zzctc;	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x0848;
    L_0x0841:
        r1 = "fbs_aeid";
        r3 = r2.zzctc;	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r1, r3);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0848:
        r1 = r2.versionCode;	 Catch:{ JSONException -> 0x08d3 }
        r3 = 24;
        if (r1 < r3) goto L_0x0859;
    L_0x084e:
        r1 = "disable_ml";
        r2 = r2.zzcti;	 Catch:{ JSONException -> 0x08d3 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x08d3 }
        r8.put(r1, r2);	 Catch:{ JSONException -> 0x08d3 }
    L_0x0859:
        r1 = com.google.android.gms.internal.zzoi.zzbml;	 Catch:{ JSONException -> 0x08d3 }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r1 = r2.zzd(r1);	 Catch:{ JSONException -> 0x08d3 }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x08d3 }
        if (r1 == 0) goto L_0x089e;
    L_0x0867:
        r2 = r1.isEmpty();	 Catch:{ JSONException -> 0x08d3 }
        if (r2 != 0) goto L_0x089e;
    L_0x086d:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ JSONException -> 0x08d3 }
        r3 = com.google.android.gms.internal.zzoi.zzbmm;	 Catch:{ JSONException -> 0x08d3 }
        r4 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ JSONException -> 0x08d3 }
        r3 = r4.zzd(r3);	 Catch:{ JSONException -> 0x08d3 }
        r3 = (java.lang.Integer) r3;	 Catch:{ JSONException -> 0x08d3 }
        r3 = r3.intValue();	 Catch:{ JSONException -> 0x08d3 }
        if (r2 < r3) goto L_0x089e;
    L_0x0881:
        r2 = new java.util.HashMap;	 Catch:{ JSONException -> 0x08d3 }
        r2.<init>();	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.split(r10);	 Catch:{ JSONException -> 0x08d3 }
        r3 = r1.length;	 Catch:{ JSONException -> 0x08d3 }
    L_0x088b:
        if (r14 >= r3) goto L_0x0899;
    L_0x088d:
        r4 = r1[r14];	 Catch:{ JSONException -> 0x08d3 }
        r5 = com.google.android.gms.internal.zzakm.zzct(r4);	 Catch:{ JSONException -> 0x08d3 }
        r2.put(r4, r5);	 Catch:{ JSONException -> 0x08d3 }
        r14 = r14 + 1;
        goto L_0x088b;
    L_0x0899:
        r1 = "video_decoders";
        r8.put(r1, r2);	 Catch:{ JSONException -> 0x08d3 }
    L_0x089e:
        r1 = 2;
        r2 = com.google.android.gms.internal.zzaky.zzae(r1);	 Catch:{ JSONException -> 0x08d3 }
        if (r2 == 0) goto L_0x08ca;
    L_0x08a5:
        r2 = com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ JSONException -> 0x08d3 }
        r2 = r2.zzq(r8);	 Catch:{ JSONException -> 0x08d3 }
        r1 = r2.toString(r1);	 Catch:{ JSONException -> 0x08d3 }
        r2 = "Ad Request JSON: ";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ JSONException -> 0x08d3 }
        r3 = r1.length();	 Catch:{ JSONException -> 0x08d3 }
        if (r3 == 0) goto L_0x08c2;
    L_0x08bd:
        r1 = r2.concat(r1);	 Catch:{ JSONException -> 0x08d3 }
        goto L_0x08c7;
    L_0x08c2:
        r1 = new java.lang.String;	 Catch:{ JSONException -> 0x08d3 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x08d3 }
    L_0x08c7:
        com.google.android.gms.internal.zzahw.v(r1);	 Catch:{ JSONException -> 0x08d3 }
    L_0x08ca:
        r1 = com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ JSONException -> 0x08d3 }
        r1 = r1.zzq(r8);	 Catch:{ JSONException -> 0x08d3 }
        return r1;
    L_0x08d3:
        r0 = move-exception;
        r1 = r0;
        r2 = "Problem serializing ad request to JSON: ";
        r1 = r1.getMessage();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x08ea;
    L_0x08e5:
        r1 = r2.concat(r1);
        goto L_0x08ef;
    L_0x08ea:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x08ef:
        com.google.android.gms.internal.zzaky.zzcz(r1);
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzads.zza(android.content.Context, com.google.android.gms.internal.zzadl):org.json.JSONObject");
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put(CuePointFields.TIME, valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    public static org.json.JSONObject zzb(com.google.android.gms.internal.zzacj r7) {
        /*
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r7.zzcno;
        if (r1 == 0) goto L_0x0010;
    L_0x0009:
        r1 = r7.zzcno;
        r2 = "ad_base_url";
        r0.put(r2, r1);
    L_0x0010:
        r1 = r7.zzctr;
        if (r1 == 0) goto L_0x001b;
    L_0x0014:
        r1 = r7.zzctr;
        r2 = "ad_size";
        r0.put(r2, r1);
    L_0x001b:
        r1 = r7.zzbid;
        r2 = "native";
        r0.put(r2, r1);
        r1 = r7.zzbid;
        if (r1 == 0) goto L_0x002b;
    L_0x0026:
        r1 = r7.body;
        r2 = "ad_json";
        goto L_0x002f;
    L_0x002b:
        r1 = r7.body;
        r2 = "ad_html";
    L_0x002f:
        r0.put(r2, r1);
        r1 = r7.zzctt;
        if (r1 == 0) goto L_0x003d;
    L_0x0036:
        r1 = r7.zzctt;
        r2 = "debug_dialog";
        r0.put(r2, r1);
    L_0x003d:
        r1 = r7.zzcuj;
        if (r1 == 0) goto L_0x0048;
    L_0x0041:
        r1 = r7.zzcuj;
        r2 = "debug_signals";
        r0.put(r2, r1);
    L_0x0048:
        r1 = r7.zzctn;
        r3 = -1;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x0061;
    L_0x0050:
        r1 = r7.zzctn;
        r1 = (double) r1;
        r5 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r1);
        r1 = r1 / r5;
        r5 = "interstitial_timeout";
        r0.put(r5, r1);
    L_0x0061:
        r1 = r7.orientation;
        r2 = com.google.android.gms.ads.internal.zzbt.zzen();
        r2 = r2.zzrh();
        r5 = "orientation";
        if (r1 != r2) goto L_0x0075;
    L_0x006f:
        r1 = "portrait";
    L_0x0071:
        r0.put(r5, r1);
        goto L_0x0084;
    L_0x0075:
        r1 = r7.orientation;
        r2 = com.google.android.gms.ads.internal.zzbt.zzen();
        r2 = r2.zzrg();
        if (r1 != r2) goto L_0x0084;
    L_0x0081:
        r1 = "landscape";
        goto L_0x0071;
    L_0x0084:
        r1 = r7.zzchw;
        if (r1 == 0) goto L_0x0093;
    L_0x0088:
        r1 = r7.zzchw;
        r1 = zzp(r1);
        r2 = "click_urls";
        r0.put(r2, r1);
    L_0x0093:
        r1 = r7.zzchx;
        if (r1 == 0) goto L_0x00a2;
    L_0x0097:
        r1 = r7.zzchx;
        r1 = zzp(r1);
        r2 = "impression_urls";
        r0.put(r2, r1);
    L_0x00a2:
        r1 = r7.zzctq;
        if (r1 == 0) goto L_0x00b1;
    L_0x00a6:
        r1 = r7.zzctq;
        r1 = zzp(r1);
        r2 = "manual_impression_urls";
        r0.put(r2, r1);
    L_0x00b1:
        r1 = r7.zzctw;
        if (r1 == 0) goto L_0x00bc;
    L_0x00b5:
        r1 = r7.zzctw;
        r2 = "active_view";
        r0.put(r2, r1);
    L_0x00bc:
        r1 = r7.zzctu;
        r2 = "ad_is_javascript";
        r0.put(r2, r1);
        r1 = r7.zzctv;
        if (r1 == 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r7.zzctv;
        r2 = "ad_passback_url";
        r0.put(r2, r1);
    L_0x00ce:
        r1 = r7.zzcto;
        r2 = "mediation";
        r0.put(r2, r1);
        r1 = r7.zzctx;
        r2 = "custom_render_allowed";
        r0.put(r2, r1);
        r1 = r7.zzcty;
        r2 = "content_url_opted_out";
        r0.put(r2, r1);
        r1 = r7.zzcuk;
        r2 = "content_vertical_opted_out";
        r0.put(r2, r1);
        r1 = r7.zzctz;
        r2 = "prefetch";
        r0.put(r2, r1);
        r1 = r7.zzcic;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x00fe;
    L_0x00f7:
        r1 = r7.zzcic;
        r5 = "refresh_interval_milliseconds";
        r0.put(r5, r1);
    L_0x00fe:
        r1 = r7.zzctp;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x010b;
    L_0x0104:
        r1 = r7.zzctp;
        r3 = "mediation_config_cache_time_milliseconds";
        r0.put(r3, r1);
    L_0x010b:
        r1 = r7.zzbdl;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x011a;
    L_0x0113:
        r1 = r7.zzbdl;
        r2 = "gws_query_id";
        r0.put(r2, r1);
    L_0x011a:
        r1 = r7.zzbie;
        if (r1 == 0) goto L_0x0121;
    L_0x011e:
        r1 = "height";
        goto L_0x0123;
    L_0x0121:
        r1 = "";
    L_0x0123:
        r2 = "fluid";
        r0.put(r2, r1);
        r1 = r7.zzbif;
        r2 = "native_express";
        r0.put(r2, r1);
        r1 = r7.zzcud;
        if (r1 == 0) goto L_0x013e;
    L_0x0133:
        r1 = r7.zzcud;
        r1 = zzp(r1);
        r2 = "video_start_urls";
        r0.put(r2, r1);
    L_0x013e:
        r1 = r7.zzcue;
        if (r1 == 0) goto L_0x014d;
    L_0x0142:
        r1 = r7.zzcue;
        r1 = zzp(r1);
        r2 = "video_complete_urls";
        r0.put(r2, r1);
    L_0x014d:
        r1 = r7.zzcuc;
        if (r1 == 0) goto L_0x0173;
    L_0x0151:
        r1 = r7.zzcuc;
        r2 = new org.json.JSONObject;
        r2.<init>();
        r3 = r1.type;
        r4 = "rb_type";
        r2.put(r4, r3);
        r1 = r1.zzdax;
        r3 = "rb_amount";
        r2.put(r3, r1);
        r1 = new org.json.JSONArray;
        r1.<init>();
        r1.put(r2);
        r2 = "rewards";
        r0.put(r2, r1);
    L_0x0173:
        r1 = r7.zzcuf;
        r2 = "use_displayed_impression";
        r0.put(r2, r1);
        r1 = r7.zzcug;
        r2 = "auto_protection_configuration";
        r0.put(r2, r1);
        r7 = r7.zzcia;
        r1 = "render_in_browser";
        r0.put(r1, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzads.zzb(com.google.android.gms.internal.zzacj):org.json.JSONObject");
    }

    private static JSONArray zzp(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    private static Integer zzu(boolean z) {
        return Integer.valueOf(z);
    }
}

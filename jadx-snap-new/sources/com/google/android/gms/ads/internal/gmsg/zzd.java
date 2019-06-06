package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzann;
import com.google.android.gms.internal.zzant;
import com.google.android.gms.internal.zzanu;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzapa;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.ppy;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.imgproc.Imgproc;

@zzabh
public final class zzd {
    private static zzt<Object> zzcbd = new zzj();
    public static final zzt<zzaof> zzcbe = zze.zzcbw;
    public static final zzt<zzaof> zzcbf = zzf.zzcbw;
    public static final zzt<zzaof> zzcbg = zzg.zzcbw;
    public static final zzt<zzaof> zzcbh = new zzl();
    public static final zzt<zzaof> zzcbi = new zzm();
    public static final zzt<zzaof> zzcbj = zzh.zzcbw;
    public static final zzt<Object> zzcbk = new zzn();
    public static final zzt<zzaof> zzcbl = new zzo();
    public static final zzt<zzaof> zzcbm = zzi.zzcbw;
    public static final zzt<zzaof> zzcbn = new zzp();
    public static final zzt<zzaof> zzcbo = new zzq();
    public static final zzt<zzann> zzcbp = new zzant();
    public static final zzt<zzann> zzcbq = new zzanu();
    public static final zzt<zzaof> zzcbr = new zzc();
    public static final zzad zzcbs = new zzad();
    public static final zzt<zzaof> zzcbt = new zzr();
    public static final zzt<zzaof> zzcbu = new zzs();
    public static final zzt<zzaof> zzcbv = new zzk();

    static final /* synthetic */ void zzb(zzapa zzapa, Map map) {
        String str;
        Throwable th;
        String str2 = "openableIntents";
        PackageManager packageManager = zzapa.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(UnlockablesModel.DATA)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString(Tags.CAPTION);
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                Throwable th2 = e;
                                str = "Error parsing the url: ";
                                optString7 = String.valueOf(optString7);
                                zzaky.zzb(optString7.length() != 0 ? str.concat(optString7) : new String(str), th2);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, Imgproc.FLOODFILL_FIXED_RANGE) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            th = e2;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e22) {
                        th = e22;
                        str = "Error parsing the intent data.";
                        zzaky.zzb(str, th);
                    }
                }
                ((zza) zzapa).zza(str2, jSONObject);
            } catch (JSONException unused) {
                ((zza) zzapa).zza(str2, new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zza) zzapa).zza(str2, new JSONObject());
        }
    }

    static final /* synthetic */ void zzc(zzapa zzapa, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzaky.zzcz("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(ppy.b);
        Map hashMap = new HashMap();
        PackageManager packageManager = zzapa.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), Imgproc.FLOODFILL_FIXED_RANGE) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zza) zzapa).zza("openableURLs", hashMap);
    }
}

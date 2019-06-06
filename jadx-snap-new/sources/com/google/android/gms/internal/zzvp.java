package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import com.snap.core.db.record.UnlockablesModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzabh
public final class zzvp {
    public final String zzchb;
    public final String zzchc;
    public final List<String> zzchd;
    public final String zzche;
    public final String zzchf;
    public final List<String> zzchg;
    public final List<String> zzchh;
    public final List<String> zzchi;
    public final List<String> zzchj;
    public final String zzchk;
    public final List<String> zzchl;
    public final List<String> zzchm;
    public final List<String> zzchn;
    public final String zzcho;
    public final String zzchp;
    public final String zzchq;
    public final List<String> zzchr;
    public final String zzchs;
    private String zzcht;
    public final long zzchu;

    public zzvp(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, String str5, String str6, List<String> list5, List<String> list6, List<String> list7, String str7, String str8, String str9, List<String> list8, String str10, List<String> list9, String str11, long j) {
        this.zzchb = str;
        this.zzchc = null;
        this.zzchd = list;
        this.zzche = null;
        this.zzchf = null;
        this.zzchg = list2;
        this.zzchh = list3;
        this.zzchi = list4;
        this.zzchk = str5;
        this.zzchl = list5;
        this.zzchm = list6;
        this.zzchn = list7;
        this.zzcho = null;
        this.zzchp = null;
        this.zzchq = null;
        this.zzchr = null;
        this.zzchs = null;
        this.zzchj = list9;
        this.zzcht = null;
        this.zzchu = -1;
    }

    public zzvp(JSONObject jSONObject) {
        List zza;
        this.zzchc = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzchd = Collections.unmodifiableList(arrayList);
        this.zzche = jSONObject.optString("allocation_id", null);
        zzbt.zzfd();
        this.zzchg = zzvy.zza(jSONObject, "clickurl");
        zzbt.zzfd();
        this.zzchh = zzvy.zza(jSONObject, "imp_urls");
        zzbt.zzfd();
        this.zzchj = zzvy.zza(jSONObject, "fill_urls");
        zzbt.zzfd();
        this.zzchl = zzvy.zza(jSONObject, "video_start_urls");
        zzbt.zzfd();
        this.zzchn = zzvy.zza(jSONObject, "video_complete_urls");
        zzbt.zzfd();
        List zza2 = zzvy.zza(jSONObject, "video_reward_urls");
        if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbos)).booleanValue()) {
            zza2 = this.zzchn;
        }
        this.zzchm = zza2;
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbt.zzfd();
            zza = zzvy.zza(optJSONObject, "manual_impression_urls");
        } else {
            zza = null;
        }
        this.zzchi = zza;
        this.zzchb = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject(UnlockablesModel.DATA);
        this.zzchk = optJSONObject != null ? optJSONObject.toString() : null;
        this.zzchf = optJSONObject != null ? optJSONObject.optString("class_name") : null;
        this.zzcho = jSONObject.optString("html_template", null);
        this.zzchp = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.zzchq = optJSONObject != null ? optJSONObject.toString() : null;
        zzbt.zzfd();
        this.zzchr = zzvy.zza(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        this.zzchs = optJSONObject != null ? optJSONObject.toString() : null;
        this.zzcht = jSONObject.optString("response_type", null);
        this.zzchu = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    public final boolean zzmg() {
        return "banner".equalsIgnoreCase(this.zzcht);
    }

    public final boolean zzmh() {
        return "native".equalsIgnoreCase(this.zzcht);
    }
}

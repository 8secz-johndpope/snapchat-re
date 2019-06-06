package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzabh
public final class zzvq {
    public final long zzchu;
    public final List<zzvp> zzchv;
    public final List<String> zzchw;
    public final List<String> zzchx;
    public final List<String> zzchy;
    public final List<String> zzchz;
    public final boolean zzcia;
    public final String zzcib;
    public final long zzcic;
    public final String zzcid;
    public final int zzcie;
    public final int zzcif;
    public final long zzcig;
    public final boolean zzcih;
    public final boolean zzcii;
    public final boolean zzcij;
    public int zzcik;
    public int zzcil;
    public boolean zzcim;

    public zzvq(String str) {
        this(new JSONObject(str));
    }

    public zzvq(List<zzvp> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.zzchv = list;
        this.zzchu = j;
        this.zzchw = list2;
        this.zzchx = list3;
        this.zzchy = list4;
        this.zzchz = list5;
        this.zzcia = z;
        this.zzcib = str;
        this.zzcic = -1;
        this.zzcik = 0;
        this.zzcil = 1;
        this.zzcid = null;
        this.zzcie = 0;
        this.zzcif = -1;
        this.zzcig = -1;
        this.zzcih = false;
        this.zzcii = false;
        this.zzcij = false;
        this.zzcim = false;
    }

    public zzvq(JSONObject jSONObject) {
        if (zzaky.zzae(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzahw.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            zzvp zzvp = new zzvp(jSONArray.getJSONObject(i2));
            if (zzvp.zzmg()) {
                this.zzcim = true;
            }
            arrayList.add(zzvp);
            if (i < 0 && zza(zzvp)) {
                i = i2;
            }
        }
        this.zzcik = i;
        this.zzcil = jSONArray.length();
        this.zzchv = Collections.unmodifiableList(arrayList);
        this.zzcib = jSONObject.optString("qdata");
        this.zzcif = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.zzcig = jSONObject.optLong("timeout_ms", -1);
        jSONObject = jSONObject.optJSONObject("settings");
        if (jSONObject != null) {
            this.zzchu = jSONObject.optLong("ad_network_timeout_millis", -1);
            zzbt.zzfd();
            this.zzchw = zzvy.zza(jSONObject, "click_urls");
            zzbt.zzfd();
            this.zzchx = zzvy.zza(jSONObject, "imp_urls");
            zzbt.zzfd();
            this.zzchy = zzvy.zza(jSONObject, "nofill_urls");
            zzbt.zzfd();
            this.zzchz = zzvy.zza(jSONObject, "remote_ping_urls");
            this.zzcia = jSONObject.optBoolean("render_in_browser", false);
            long optLong = jSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.zzcic = j;
            zzagd zza = zzagd.zza(jSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzcid = null;
                this.zzcie = 0;
            } else {
                this.zzcid = zza.type;
                this.zzcie = zza.zzdax;
            }
            this.zzcih = jSONObject.optBoolean("use_displayed_impression", false);
            this.zzcii = jSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.zzcij = jSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.zzchu = -1;
        this.zzchw = null;
        this.zzchx = null;
        this.zzchy = null;
        this.zzchz = null;
        this.zzcic = -1;
        this.zzcid = null;
        this.zzcie = 0;
        this.zzcih = false;
        this.zzcia = false;
        this.zzcii = false;
        this.zzcij = false;
    }

    private static boolean zza(zzvp zzvp) {
        for (String equals : zzvp.zzchd) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}

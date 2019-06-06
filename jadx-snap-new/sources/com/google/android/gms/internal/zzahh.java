package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzahh {
    private String mAppId;
    private final long zzddi;
    private final List<String> zzddj = new ArrayList();
    private final List<String> zzddk = new ArrayList();
    private final Map<String, zzvq> zzddl = new HashMap();
    private String zzddm;
    private boolean zzddn = false;

    public zzahh(String str, long j) {
        this.zzddm = str;
        this.zzddi = j;
        zzca(str);
    }

    private final void zzca(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = 0;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.zzddn = false;
                    zzaky.zzcz("App settings could not be fetched successfully.");
                    return;
                }
                this.zzddn = true;
                this.mAppId = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzddk.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    jSONObject2 = jSONObject2.optJSONObject("mediation_config");
                                    if (jSONObject2 != null) {
                                        this.zzddl.put(optString2, new zzvq(jSONObject2));
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
                zzo(jSONObject);
            } catch (JSONException e) {
                zzaky.zzc("Exception occurred while processing app setting json", e);
                zzbt.zzep().zza(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    private final void zzo(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.zzddj.add(optJSONArray.optString(i));
            }
        }
    }

    public final String getAppId() {
        return this.mAppId;
    }

    public final long zzpq() {
        return this.zzddi;
    }

    public final boolean zzpr() {
        return this.zzddn;
    }

    public final String zzps() {
        return this.zzddm;
    }

    public final Map<String, zzvq> zzpt() {
        return this.zzddl;
    }
}

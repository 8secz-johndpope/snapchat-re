package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

@zzabh
public final class zzagn extends zzbgl {
    public static final Creator<zzagn> CREATOR = new zzago();
    public final String zzdbn;
    public final String zzdbo;
    public final boolean zzdbp;
    public final boolean zzdbq;
    public final List<String> zzdbr;
    public final boolean zzdbs;
    public final boolean zzdbt;

    public zzagn(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4) {
        this.zzdbn = str;
        this.zzdbo = str2;
        this.zzdbp = z;
        this.zzdbq = z2;
        this.zzdbr = list;
        this.zzdbs = z3;
        this.zzdbt = z4;
    }

    public static zzagn zzn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "";
        String optString = jSONObject.optString("click_string", str);
        String optString2 = jSONObject.optString("report_url", str);
        boolean optBoolean = jSONObject.optBoolean("rendered_ad_enabled", false);
        boolean optBoolean2 = jSONObject.optBoolean("non_malicious_reporting_enabled", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("allowed_headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString3 = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString3)) {
                arrayList.add(optString3.toLowerCase(Locale.ENGLISH));
            }
        }
        return new zzagn(optString, optString2, optBoolean, optBoolean2, arrayList, jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzdbn, false);
        zzbgo.zza(parcel, 3, this.zzdbo, false);
        zzbgo.zza(parcel, 4, this.zzdbp);
        zzbgo.zza(parcel, 5, this.zzdbq);
        zzbgo.zzb(parcel, 6, this.zzdbr, false);
        zzbgo.zza(parcel, 7, this.zzdbs);
        zzbgo.zza(parcel, 8, this.zzdbt);
        zzbgo.zzai(parcel, i);
    }
}

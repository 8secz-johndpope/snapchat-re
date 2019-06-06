package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzacl extends zzbgl {
    public static final Creator<zzacl> CREATOR = new zzacm();
    public final boolean zzcun;
    public final List<String> zzcuo;

    public zzacl() {
        this(false, Collections.emptyList());
    }

    public zzacl(boolean z, List<String> list) {
        this.zzcun = z;
        this.zzcuo = list;
    }

    public static zzacl zzk(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzacl();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    zzaky.zzc("Error grabbing url from json.", e);
                }
            }
        }
        return new zzacl(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcun);
        zzbgo.zzb(parcel, 3, this.zzcuo, false);
        zzbgo.zzai(parcel, i);
    }
}

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.zzbg;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@zzabh
public final class zzagd extends zzbgl {
    public static final Creator<zzagd> CREATOR = new zzage();
    public final String type;
    public final int zzdax;

    public zzagd(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzagd(String str, int i) {
        this.type = str;
        this.zzdax = i;
    }

    public static zzagd zza(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray.length() == 0) ? null : new zzagd(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public static zzagd zzbu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return zza(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzagd)) {
            zzagd zzagd = (zzagd) obj;
            if (zzbg.equal(this.type, zzagd.type) && zzbg.equal(Integer.valueOf(this.zzdax), Integer.valueOf(zzagd.zzdax))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.type, Integer.valueOf(this.zzdax)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.type, false);
        zzbgo.zzc(parcel, 3, this.zzdax);
        zzbgo.zzai(parcel, i);
    }
}

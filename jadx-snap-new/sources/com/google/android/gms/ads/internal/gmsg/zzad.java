package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzaky;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzad implements zzt<Object> {
    private final Object mLock = new Object();
    private final Map<String, zzae> zzccv = new HashMap();

    public final void zza(Object obj, Map<String, String> map) {
        Object obj2;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        Object obj3 = (String) map.get("fail_reason");
        String str3 = (String) map.get("fail_stack");
        String str4 = (String) map.get("result");
        if (TextUtils.isEmpty(str3)) {
            obj3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str3)) {
            obj2 = "";
        } else {
            String str5 = "\n";
            str3 = String.valueOf(str3);
            obj2 = str3.length() != 0 ? str5.concat(str3) : new String(str5);
        }
        synchronized (this.mLock) {
            zzae zzae = (zzae) this.zzccv.remove(str);
            if (zzae == null) {
                str4 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                zzaky.zzcz(str.length() != 0 ? str4.concat(str) : new String(str4));
                return;
            } else if (!TextUtils.isEmpty(str2)) {
                str = String.valueOf(obj3);
                str4 = String.valueOf(obj2);
                zzae.zzau(str4.length() != 0 ? str.concat(str4) : new String(str));
                return;
            } else if (str4 == null) {
                zzae.zzd(null);
                return;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    if (zzahw.zzqk()) {
                        str4 = "Result GMSG: ";
                        str2 = String.valueOf(jSONObject.toString(2));
                        zzahw.v(str2.length() != 0 ? str4.concat(str2) : new String(str4));
                    }
                    zzae.zzd(jSONObject);
                } catch (JSONException e) {
                    zzae.zzau(e.getMessage());
                }
            }
        }
    }

    public final void zza(String str, zzae zzae) {
        synchronized (this.mLock) {
            this.zzccv.put(str, zzae);
        }
    }
}

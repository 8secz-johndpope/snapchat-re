package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzaky;
import java.util.Map;

final class zzn implements zzt<Object> {
    zzn() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf((String) map.get("string"));
        String str = "Received log message: ";
        zzaky.zzcy(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}

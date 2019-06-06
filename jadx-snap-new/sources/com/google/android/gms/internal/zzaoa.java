package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class zzaoa implements Runnable {
    private /* synthetic */ String zzcrd;
    private /* synthetic */ String zzdoq;
    private /* synthetic */ int zzdos;
    private /* synthetic */ zzany zzdou;

    zzaoa(zzany zzany, String str, String str2, int i) {
        this.zzdou = zzany;
        this.zzcrd = str;
        this.zzdoq = str2;
        this.zzdos = i;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zzcrd);
        hashMap.put("cachedSrc", this.zzdoq);
        hashMap.put("totalBytes", Integer.toString(this.zzdos));
        this.zzdou.zza("onPrecacheEvent", hashMap);
    }
}

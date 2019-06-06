package com.google.android.gms.internal;

import com.samsung.android.sdk.camera.SCamera;
import java.util.HashMap;
import java.util.Map;

final class zzanz implements Runnable {
    private /* synthetic */ String zzcrd;
    private /* synthetic */ String zzdoq;
    private /* synthetic */ int zzdor;
    private /* synthetic */ int zzdos;
    private /* synthetic */ boolean zzdot = false;
    private /* synthetic */ zzany zzdou;

    zzanz(zzany zzany, String str, String str2, int i, int i2, boolean z) {
        this.zzdou = zzany;
        this.zzcrd = str;
        this.zzdoq = str2;
        this.zzdor = i;
        this.zzdos = i2;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zzcrd);
        hashMap.put("cachedSrc", this.zzdoq);
        hashMap.put("bytesLoaded", Integer.toString(this.zzdor));
        hashMap.put("totalBytes", Integer.toString(this.zzdos));
        hashMap.put("cacheReady", this.zzdot ? SCamera.CAMERA_ID_FRONT : "0");
        this.zzdou.zza("onPrecacheEvent", hashMap);
    }
}

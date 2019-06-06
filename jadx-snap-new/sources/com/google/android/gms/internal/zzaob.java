package com.google.android.gms.internal;

import android.text.TextUtils;
import com.brightcove.player.media.ErrorFields;
import java.util.HashMap;
import java.util.Map;

final class zzaob implements Runnable {
    private /* synthetic */ String val$message;
    private /* synthetic */ String zzcrd;
    private /* synthetic */ String zzdoq;
    private /* synthetic */ zzany zzdou;
    private /* synthetic */ String zzdov;

    zzaob(zzany zzany, String str, String str2, String str3, String str4) {
        this.zzdou = zzany;
        this.zzcrd = str;
        this.zzdoq = str2;
        this.zzdov = str3;
        this.val$message = str4;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.zzcrd);
        if (!TextUtils.isEmpty(this.zzdoq)) {
            hashMap.put("cachedSrc", this.zzdoq);
        }
        hashMap.put("type", zzany.zzdd(this.zzdov));
        hashMap.put("reason", this.zzdov);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put(ErrorFields.MESSAGE, this.val$message);
        }
        this.zzdou.zza("onPrecacheEvent", hashMap);
    }
}

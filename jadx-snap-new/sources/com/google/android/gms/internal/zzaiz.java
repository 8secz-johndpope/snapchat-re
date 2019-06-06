package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbt;

@TargetApi(21)
public final class zzaiz extends zzaiy {
    public final CookieManager zzau(Context context) {
        if (zzaip.zzrk()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaky.zzb("Failed to obtain CookieManager.", th);
            zzbt.zzep().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final zzaog zzc(zzaof zzaof, boolean z) {
        return new zzapn(zzaof, z);
    }

    public final int zzrl() {
        return 16974374;
    }
}

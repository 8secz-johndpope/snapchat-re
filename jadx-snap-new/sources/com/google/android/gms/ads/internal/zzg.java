package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import java.util.concurrent.Callable;

final class zzg implements Callable<String> {
    private /* synthetic */ zzd zzanx;

    zzg(zzd zzd) {
        this.zzanx = zzd;
    }

    public final /* synthetic */ Object call() {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbtz)).booleanValue()) {
            CookieManager zzau = zzbt.zzen().zzau(this.zzanx.zzanm.zzaiq);
            if (zzau != null) {
                return zzau.getCookie("googleads.g.doubleclick.net");
            }
        }
        return "";
    }
}

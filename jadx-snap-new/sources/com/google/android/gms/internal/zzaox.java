package com.google.android.gms.internal;

import android.annotation.TargetApi;

@zzabh
@TargetApi(17)
public final class zzaox<WebViewT extends zzapa & zzapr & zzapt> {
    private final zzaoz zzdsa;
    private final WebViewT zzdsb;

    private zzaox(WebViewT webViewT, zzaoz zzaoz) {
        this.zzdsa = zzaoz;
        this.zzdsb = webViewT;
    }

    public static zzaox<zzaof> zzl(zzaof zzaof) {
        return new zzaox(zzaof, new zzaoy(zzaof));
    }
}

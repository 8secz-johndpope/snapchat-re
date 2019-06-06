package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzabh
@TargetApi(11)
public final class zzapk extends zzapm {
    public zzapk(zzaof zzaof, boolean z) {
        super(zzaof, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, null);
    }
}

package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class zzho implements Runnable {
    final /* synthetic */ zzhm zzazp;
    private ValueCallback<String> zzazq = new zzhp(this);
    final /* synthetic */ zzhg zzazr;
    final /* synthetic */ WebView zzazs;
    final /* synthetic */ boolean zzazt;

    zzho(zzhm zzhm, zzhg zzhg, WebView webView, boolean z) {
        this.zzazp = zzhm;
        this.zzazr = zzhg;
        this.zzazs = webView;
        this.zzazt = z;
    }

    public final void run() {
        if (this.zzazs.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzazs.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzazq);
            } catch (Throwable unused) {
                this.zzazq.onReceiveValue("");
            }
        }
    }
}

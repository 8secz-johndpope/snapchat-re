package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public class zzaqh extends WebView {
    private final zzapz zzdsu;

    public zzaqh(zzapz zzapz) {
        super(zzapz);
        this.zzdsu = zzapz;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbt.zzen().zza(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzaky.zzb("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            zzbt.zzep().zza(e, "CoreWebView.loadUrl");
            zzaky.zzc("Could not call loadUrl. ", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public void zzdj(String str) {
        zzaqi.zza(this, str);
    }

    /* Access modifiers changed, original: protected|final */
    public final zzapz zzvo() {
        return this.zzdsu;
    }
}

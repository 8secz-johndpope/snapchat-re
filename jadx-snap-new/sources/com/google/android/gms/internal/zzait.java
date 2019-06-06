package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class zzait implements Callable<Boolean> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ WebSettings zzdfx;

    zzait(zzais zzais, Context context, WebSettings webSettings) {
        this.val$context = context;
        this.zzdfx = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.val$context.getCacheDir() != null) {
            this.zzdfx.setAppCachePath(this.val$context.getCacheDir().getAbsolutePath());
            this.zzdfx.setAppCacheMaxSize(0);
            this.zzdfx.setAppCacheEnabled(true);
        }
        this.zzdfx.setDatabasePath(this.val$context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.zzdfx.setDatabaseEnabled(true);
        this.zzdfx.setDomStorageEnabled(true);
        this.zzdfx.setDisplayZoomControls(false);
        this.zzdfx.setBuiltInZoomControls(true);
        this.zzdfx.setSupportZoom(true);
        this.zzdfx.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}

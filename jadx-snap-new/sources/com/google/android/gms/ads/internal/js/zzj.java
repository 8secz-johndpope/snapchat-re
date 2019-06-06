package com.google.android.gms.ads.internal.js;

final class zzj implements Runnable {
    private /* synthetic */ zze zzcfc;
    private /* synthetic */ String zzcfe;

    zzj(zze zze, String str) {
        this.zzcfc = zze;
        this.zzcfe = str;
    }

    public final void run() {
        this.zzcfc.zzcct.loadUrl(this.zzcfe);
    }
}

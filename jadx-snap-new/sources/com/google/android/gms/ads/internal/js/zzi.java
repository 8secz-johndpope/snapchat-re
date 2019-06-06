package com.google.android.gms.ads.internal.js;

final class zzi implements Runnable {
    private /* synthetic */ zze zzcfc;
    private /* synthetic */ String zzcfd;

    zzi(zze zze, String str) {
        this.zzcfc = zze;
        this.zzcfd = str;
    }

    public final void run() {
        this.zzcfc.zzcct.loadData(this.zzcfd, "text/html", "UTF-8");
    }
}

package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class zzajj implements Runnable {
    final /* synthetic */ Context val$context;
    private /* synthetic */ String zzdgl;
    private /* synthetic */ boolean zzdgm;
    private /* synthetic */ boolean zzdgn;

    zzajj(zzaji zzaji, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzdgl = str;
        this.zzdgm = z;
        this.zzdgn = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.val$context);
        builder.setMessage(this.zzdgl);
        builder.setTitle(this.zzdgm ? "Error" : "Info");
        String str = "Dismiss";
        if (this.zzdgn) {
            builder.setNeutralButton(str, null);
        } else {
            builder.setPositiveButton("Learn More", new zzajk(this));
            builder.setNegativeButton(str, null);
        }
        builder.create().show();
    }
}

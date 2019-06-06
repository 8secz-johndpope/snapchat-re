package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbt;

final class zzaje implements OnClickListener {
    private /* synthetic */ zzajc zzdgf;
    private /* synthetic */ String zzdgg;

    zzaje(zzajc zzajc, String str) {
        this.zzdgf = zzajc;
        this.zzdgg = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbt.zzel();
        zzaij.zza(this.zzdgf.mContext, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.zzdgg), "Share via"));
    }
}

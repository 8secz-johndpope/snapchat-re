package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;

final class zzaim implements zzakr {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzdfw;

    zzaim(zzaij zzaij, Context context, String str) {
        this.val$context = context;
        this.zzdfw = str;
    }

    public final void zzcp(String str) {
        zzbt.zzel();
        zzaij.zze(this.val$context, this.zzdfw, str);
    }
}

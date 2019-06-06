package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

final class zzo implements OnClickListener {
    private /* synthetic */ zzl zzaoc;
    private /* synthetic */ zzw zzaod;

    zzo(zzl zzl, zzw zzw) {
        this.zzaoc = zzl;
        this.zzaod = zzw;
    }

    public final void onClick(View view) {
        this.zzaod.recordClick();
        if (this.zzaoc.zzaoa != null) {
            this.zzaoc.zzaoa.zzpg();
        }
    }
}

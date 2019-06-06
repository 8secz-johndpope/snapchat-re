package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzajg implements Runnable {
    private /* synthetic */ zzajc zzdgf;

    zzajg(zzajc zzajc) {
        this.zzdgf = zzajc;
    }

    public final void run() {
        zzbt.zzev().zzg(this.zzdgf.mContext, this.zzdgf.zzapp, this.zzdgf.zzavp);
    }
}

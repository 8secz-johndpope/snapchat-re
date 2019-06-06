package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzajh implements Runnable {
    private /* synthetic */ zzajc zzdgf;

    zzajh(zzajc zzajc) {
        this.zzdgf = zzajc;
    }

    public final void run() {
        zzbt.zzev().zza(this.zzdgf.mContext, this.zzdgf.zzapp, this.zzdgf.zzavp, this.zzdgf.zzcwt);
    }
}

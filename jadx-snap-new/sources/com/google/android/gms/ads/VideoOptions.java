package com.google.android.gms.ads;

import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzns;

@zzabh
public final class VideoOptions {
    private final boolean zzamc;
    private final boolean zzamd;
    private final boolean zzame;

    public VideoOptions(zzns zzns) {
        this.zzamc = zzns.zzbkn;
        this.zzamd = zzns.zzbko;
        this.zzame = zzns.zzbkp;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzame;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzamd;
    }

    public final boolean getStartMuted() {
        return this.zzamc;
    }
}

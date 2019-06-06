package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class zzqb {
    private final WeakReference<zzaof> zzbzc;
    private String zzbzd;

    public zzqb(zzaof zzaof) {
        this.zzbzc = new WeakReference(zzaof);
    }

    public final void zza(zzaan zzaan) {
        zzaan.zza("/loadHtml", new zzqc(this, zzaan));
        zzaan.zza("/showOverlay", new zzqe(this, zzaan));
        zzaan.zza("/hideOverlay", new zzqf(this, zzaan));
        zzaof zzaof = (zzaof) this.zzbzc.get();
        if (zzaof != null) {
            zzaof.zzua().zza("/sendMessageToSdk", new zzqg(this, zzaan));
        }
    }
}

package com.google.android.gms.internal;

@zzabh
public abstract class zzahs implements zzajb<zzalt> {
    private volatile Thread zzdeq;
    private boolean zzder = false;
    private final Runnable zzy = new zzaht(this);

    public zzahs(boolean z) {
    }

    public final void cancel() {
        onStop();
        if (this.zzdeq != null) {
            this.zzdeq.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzdo();

    public final /* synthetic */ Object zzns() {
        return this.zzder ? zzaid.zza(1, this.zzy) : zzaid.zzb(this.zzy);
    }

    public final zzalt zzqj() {
        return this.zzder ? zzaid.zza(1, this.zzy) : zzaid.zzb(this.zzy);
    }
}

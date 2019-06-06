package com.google.android.gms.internal;

final class zzadb implements Runnable {
    private /* synthetic */ zzahe zzant;
    private /* synthetic */ zzada zzcve;

    zzadb(zzada zzada, zzahe zzahe) {
        this.zzcve = zzada;
        this.zzant = zzahe;
    }

    public final void run() {
        this.zzcve.zzcre.zza(this.zzant);
        if (this.zzcve.zzcvd != null) {
            this.zzcve.zzcvd.release();
            this.zzcve.zzcvd = null;
        }
    }
}

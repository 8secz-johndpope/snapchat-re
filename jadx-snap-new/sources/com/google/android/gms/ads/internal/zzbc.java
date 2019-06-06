package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;

final class zzbc implements Runnable {
    private /* synthetic */ zzahe zzant;
    private /* synthetic */ zzbb zzaro;

    zzbc(zzbb zzbb, zzahe zzahe) {
        this.zzaro = zzbb;
        this.zzant = zzahe;
    }

    public final void run() {
        this.zzaro.zzb(new zzahd(this.zzant, null, null, null, null, null, null, null));
    }
}

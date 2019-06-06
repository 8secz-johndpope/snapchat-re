package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzajm;
import com.google.android.gms.internal.zzamh;
import com.google.android.gms.internal.zzamj;

public final class zzae extends zzamj<zzc> {
    private final Object mLock = new Object();
    private zzajm<zzc> zzcfj;
    private boolean zzcgd;
    private int zzcge;

    public zzae(zzajm<zzc> zzajm) {
        this.zzcfj = zzajm;
        this.zzcgd = false;
        this.zzcge = 0;
    }

    private final void zzmd() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcge >= 0);
            if (this.zzcgd && this.zzcge == 0) {
                zzahw.v("No reference is left (including root). Cleaning up engine.");
                zza(new zzah(this), new zzamh());
            } else {
                zzahw.v("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final zzaa zzma() {
        zzaa zzaa = new zzaa(this);
        synchronized (this.mLock) {
            zza(new zzaf(this, zzaa), new zzag(this, zzaa));
            zzbq.checkState(this.zzcge >= 0);
            this.zzcge++;
        }
        return zzaa;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzmb() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcge > 0);
            zzahw.v("Releasing 1 reference for JS Engine");
            this.zzcge--;
            zzmd();
        }
    }

    public final void zzmc() {
        synchronized (this.mLock) {
            zzbq.checkState(this.zzcge >= 0);
            zzahw.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzcgd = true;
            zzmd();
        }
    }
}

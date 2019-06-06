package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.Iterator;

final class zzaia extends zzaib {
    private /* synthetic */ zzahy zzdfg;
    private /* synthetic */ Bundle zzdfh;

    zzaia(zzahy zzahy, Bundle bundle) {
        this.zzdfg = zzahy;
        this.zzdfh = bundle;
        super();
    }

    public final void zzdo() {
        Iterator it = this.zzdfg.zzdeu.iterator();
        while (it.hasNext()) {
            ((zzaic) it.next()).zzb(this.zzdfh);
        }
    }
}

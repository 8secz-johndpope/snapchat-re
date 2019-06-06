package com.google.android.gms.internal;

import android.view.View;

final class zzhn implements Runnable {
    private /* synthetic */ View zzazo;
    private /* synthetic */ zzhm zzazp;

    zzhn(zzhm zzhm, View view) {
        this.zzazp = zzhm;
        this.zzazo = view;
    }

    public final void run() {
        this.zzazp.zzj(this.zzazo);
    }
}

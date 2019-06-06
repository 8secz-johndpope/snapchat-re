package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class zzfx implements zzhf {
    private WeakReference<zzpv> zzawq;

    public zzfx(zzpv zzpv) {
        this.zzawq = new WeakReference(zzpv);
    }

    public final View zzgh() {
        zzpv zzpv = (zzpv) this.zzawq.get();
        return zzpv != null ? zzpv.zzkt() : null;
    }

    public final boolean zzgi() {
        return this.zzawq.get() == null;
    }

    public final zzhf zzgj() {
        return new zzfz((zzpv) this.zzawq.get());
    }
}

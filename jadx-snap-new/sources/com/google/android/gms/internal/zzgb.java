package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class zzgb implements zzhf {
    private final WeakReference<View> zzawt;
    private final WeakReference<zzahd> zzawu;

    public zzgb(View view, zzahd zzahd) {
        this.zzawt = new WeakReference(view);
        this.zzawu = new WeakReference(zzahd);
    }

    public final View zzgh() {
        return (View) this.zzawt.get();
    }

    public final boolean zzgi() {
        return this.zzawt.get() == null || this.zzawu.get() == null;
    }

    public final zzhf zzgj() {
        return new zzga((View) this.zzawt.get(), (zzahd) this.zzawu.get());
    }
}

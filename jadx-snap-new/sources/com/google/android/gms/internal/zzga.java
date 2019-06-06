package com.google.android.gms.internal;

import android.view.View;

public final class zzga implements zzhf {
    private final View mView;
    private final zzahd zzaws;

    public zzga(View view, zzahd zzahd) {
        this.mView = view;
        this.zzaws = zzahd;
    }

    public final View zzgh() {
        return this.mView;
    }

    public final boolean zzgi() {
        return this.zzaws == null || this.mView == null;
    }

    public final zzhf zzgj() {
        return this;
    }
}

package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

final class zzfy extends ContentObserver {
    private /* synthetic */ zzfv zzawp;

    public zzfy(zzfv zzfv, Handler handler) {
        this.zzawp = zzfv;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.zzawp.zzgb();
    }
}

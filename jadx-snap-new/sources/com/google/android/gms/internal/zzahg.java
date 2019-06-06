package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

@zzabh
final class zzahg {
    private long zzddg = -1;
    private long zzddh = -1;

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzddg);
        bundle.putLong("tclose", this.zzddh);
        return bundle;
    }

    public final long zzpn() {
        return this.zzddh;
    }

    public final void zzpo() {
        this.zzddh = SystemClock.elapsedRealtime();
    }

    public final void zzpp() {
        this.zzddg = SystemClock.elapsedRealtime();
    }
}

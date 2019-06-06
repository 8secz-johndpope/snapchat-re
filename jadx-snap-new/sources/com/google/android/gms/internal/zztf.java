package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;

final class zztf extends zzamd<ParcelFileDescriptor> {
    private /* synthetic */ zzte zzcdd;

    zztf(zzte zzte) {
        this.zzcdd = zzte;
    }

    public final boolean cancel(boolean z) {
        this.zzcdd.disconnect();
        return super.cancel(z);
    }
}

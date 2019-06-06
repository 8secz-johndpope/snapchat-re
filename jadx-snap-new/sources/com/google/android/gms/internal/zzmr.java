package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzmr extends zzev implements zzmp {
    zzmr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void onVideoEnd() {
        zzb(4, zzbc());
    }

    public final void onVideoMute(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(5, zzbc);
    }

    public final void onVideoPause() {
        zzb(3, zzbc());
    }

    public final void onVideoPlay() {
        zzb(2, zzbc());
    }

    public final void onVideoStart() {
        zzb(1, zzbc());
    }
}

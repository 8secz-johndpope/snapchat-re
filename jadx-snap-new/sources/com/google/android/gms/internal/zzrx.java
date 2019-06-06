package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzrx extends zzev implements zzrv {
    zzrx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zza(zzrk zzrk) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzrk);
        zzb(1, zzbc);
    }
}

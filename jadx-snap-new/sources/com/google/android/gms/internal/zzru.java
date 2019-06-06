package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzru extends zzev implements zzrs {
    zzru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zza(zzrg zzrg) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzrg);
        zzb(1, zzbc);
    }
}

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzsd extends zzev implements zzsb {
    zzsd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zzb(zzro zzro) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzro);
        zzb(1, zzbc);
    }
}

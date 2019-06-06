package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzpd extends zzev implements zzpb {
    zzpd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zza(zzoy zzoy) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzoy);
        zzb(1, zzbc);
    }
}

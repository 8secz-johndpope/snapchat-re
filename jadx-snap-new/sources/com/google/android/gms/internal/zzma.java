package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzma extends zzev implements zzly {
    zzma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void onAppEvent(String str, String str2) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzb(1, zzbc);
    }
}

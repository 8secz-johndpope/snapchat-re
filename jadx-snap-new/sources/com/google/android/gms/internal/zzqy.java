package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public final class zzqy extends zzev implements zzqw {
    zzqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void destroy() {
        zzb(4, zzbc());
    }

    public final void zza(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(3, zzbc);
    }

    public final IObjectWrapper zzal(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(2, zzbc);
        IObjectWrapper zzaq = zza.zzaq(zza.readStrongBinder());
        zza.recycle();
        return zzaq;
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeInt(i);
        zzb(5, zzbc);
    }

    public final void zzb(String str, IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(1, zzbc);
    }
}

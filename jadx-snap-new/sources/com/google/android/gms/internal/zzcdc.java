package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

public final class zzcdc extends zzd<zzcdh> {
    public zzcdc(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 116, zzf, zzg, null);
    }

    public final zzcdh zzawc() {
        return (zzcdh) super.zzalw();
    }

    public final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzcdh ? (zzcdh) queryLocalInterface : new zzcdi(iBinder);
    }

    public final String zzhm() {
        return "com.google.android.gms.gass.START";
    }

    public final String zzhn() {
        return "com.google.android.gms.gass.internal.IGassService";
    }
}

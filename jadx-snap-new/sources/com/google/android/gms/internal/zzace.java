package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzabh
public final class zzace extends zzd<zzacn> {
    private int zzcrt;

    public zzace(Context context, Looper looper, zzf zzf, zzg zzg, int i) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        super(context, looper, 8, zzf, zzg, null);
        this.zzcrt = i;
    }

    public final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzacn ? (zzacn) queryLocalInterface : new zzacp(iBinder);
    }

    public final String zzhm() {
        return "com.google.android.gms.ads.service.START";
    }

    public final String zzhn() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final zzacn zzoa() {
        return (zzacn) super.zzalw();
    }
}

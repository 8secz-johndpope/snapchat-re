package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzabh
public final class zzsx extends zzd<zztc> {
    zzsx(Context context, Looper looper, zzf zzf, zzg zzg) {
        super(context, looper, 166, zzf, zzg, null);
    }

    public final /* synthetic */ IInterface zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zztc ? (zztc) queryLocalInterface : new zztd(iBinder);
    }

    public final String zzhm() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final String zzhn() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final zztc zzle() {
        return (zztc) super.zzalw();
    }
}

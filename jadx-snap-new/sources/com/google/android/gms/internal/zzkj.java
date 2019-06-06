package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;
import com.google.android.gms.dynamic.zzq;

@zzabh
public final class zzkj extends zzp<zzlw> {
    public zzkj() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzlt zza(Context context, zzko zzko, String str, zzwf zzwf, int i) {
        try {
            IBinder zza = ((zzlw) zzdg(context)).zza(zzn.zzz(context), zzko, str, zzwf, zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof zzlt ? (zzlt) queryLocalInterface : new zzlv(zza);
        } catch (RemoteException | zzq e) {
            zzaky.zza("Could not create remote AdManager.", e);
            return null;
        }
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzlw ? (zzlw) queryLocalInterface : new zzlx(iBinder);
    }
}

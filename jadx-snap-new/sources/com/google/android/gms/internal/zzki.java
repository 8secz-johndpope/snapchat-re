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
public final class zzki extends zzp<zzlr> {
    public zzki() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzlo zza(Context context, String str, zzwf zzwf) {
        try {
            IBinder zza = ((zzlr) zzdg(context)).zza(zzn.zzz(context), str, zzwf, zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new zzlq(zza);
        } catch (RemoteException | zzq e) {
            zzaky.zzc("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    public final /* synthetic */ Object zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzlr ? (zzlr) queryLocalInterface : new zzls(iBinder);
    }
}

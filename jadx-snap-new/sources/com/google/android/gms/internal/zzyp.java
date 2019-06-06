package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.dynamic.zzp;
import com.google.android.gms.dynamic.zzq;

@zzabh
public final class zzyp extends zzp<zzyt> {
    public zzyp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzyq zze(Activity activity) {
        String str = "Could not create remote AdOverlay.";
        try {
            IBinder zzl = ((zzyt) zzdg(activity)).zzl(zzn.zzz(activity));
            if (zzl == null) {
                return null;
            }
            IInterface queryLocalInterface = zzl.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzyq ? (zzyq) queryLocalInterface : new zzys(zzl);
        } catch (RemoteException e) {
            zzaky.zzc(str, e);
            return null;
        } catch (zzq e2) {
            zzaky.zzc(str, e2);
            return null;
        }
    }
}

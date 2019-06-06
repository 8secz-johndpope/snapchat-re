package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwu;
import java.util.Map;

final class zzaw implements zzt<zzaof> {
    private /* synthetic */ zzwr zzarb;
    private /* synthetic */ zzab zzarc;
    private /* synthetic */ zzwu zzard;

    zzaw(zzwr zzwr, zzab zzab, zzwu zzwu) {
        this.zzarb = zzwr;
        this.zzarc = zzab;
        this.zzard = zzwu;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        View view = zzaof.getView();
        if (view != null) {
            try {
                if (this.zzarb == null) {
                    if (this.zzard != null) {
                        if (this.zzard.getOverrideClickHandling()) {
                            zzar.zzc(zzaof);
                        } else {
                            this.zzard.zzh(zzn.zzz(view));
                            this.zzarc.zzaow.onAdClicked();
                        }
                    }
                } else if (this.zzarb.getOverrideClickHandling()) {
                    zzar.zzc(zzaof);
                } else {
                    this.zzarb.zzh(zzn.zzz(view));
                    this.zzarc.zzaow.onAdClicked();
                }
            } catch (RemoteException e) {
                zzaky.zzc("Unable to call handleClick on mapper", e);
            }
        }
    }
}

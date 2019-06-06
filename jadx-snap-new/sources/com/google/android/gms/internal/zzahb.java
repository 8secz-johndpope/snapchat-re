package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzahb implements Runnable {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzamd zzdcg;

    zzahb(zzaha zzaha, Context context, zzamd zzamd) {
        this.val$context = context;
        this.zzdcg = zzamd;
    }

    public final void run() {
        try {
            this.zzdcg.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdcg.setException(e);
            zzaky.zzb("Exception while getting advertising Id info", e);
        }
    }
}

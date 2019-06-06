package com.google.android.gms.internal;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;

public final class zzee extends zzeu {
    public zzee(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        super(zzdm, str, str2, zzba, i, 24);
    }

    private final void zzaz() {
        AdvertisingIdClient zzaq = this.zzagq.zzaq();
        if (zzaq != null) {
            try {
                Info info = zzaq.getInfo();
                String zzn = zzds.zzn(info.getId());
                if (zzn != null) {
                    synchronized (this.zzakm) {
                        this.zzakm.zzfc = zzn;
                        this.zzakm.zzfe = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.zzakm.zzfd = Integer.valueOf(5);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() {
        return call();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzaw() {
        if (this.zzagq.zzai()) {
            zzaz();
            return;
        }
        synchronized (this.zzakm) {
            this.zzakm.zzfc = (String) this.zzaku.invoke(null, new Object[]{this.zzagq.getContext()});
        }
    }

    public final Void zzay() {
        if (this.zzagq.isInitialized()) {
            return super.call();
        }
        if (this.zzagq.zzai()) {
            zzaz();
        }
        return null;
    }
}

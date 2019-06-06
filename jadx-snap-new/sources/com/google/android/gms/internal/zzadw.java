package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzadw implements zzt<Object> {
    private /* synthetic */ zzadt zzcwp;

    zzadw(zzadt zzadt) {
        this.zzcwp = zzadt;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.zzcwp.mLock) {
            if (this.zzcwp.zzcwl.isDone()) {
                return;
            }
            zzadz zzadz = new zzadz(-2, map);
            if (this.zzcwp.zzcwj.equals(zzadz.getRequestId())) {
                this.zzcwp.zzcwl.set(zzadz);
                return;
            }
        }
    }
}

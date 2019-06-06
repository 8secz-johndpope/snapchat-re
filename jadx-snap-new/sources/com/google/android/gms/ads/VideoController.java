package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zznr;

@zzabh
public final class VideoController {
    private final Object mLock = new Object();
    private zzmm zzama;
    private VideoLifecycleCallbacks zzamb;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzbq.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.mLock) {
            this.zzamb = videoLifecycleCallbacks;
            if (this.zzama == null) {
                return;
            }
            try {
                this.zzama.zza(new zznr(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzaky.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final void zza(zzmm zzmm) {
        synchronized (this.mLock) {
            this.zzama = zzmm;
            if (this.zzamb != null) {
                setVideoLifecycleCallbacks(this.zzamb);
            }
        }
    }

    public final zzmm zzbh() {
        zzmm zzmm;
        synchronized (this.mLock) {
            zzmm = this.zzama;
        }
        return zzmm;
    }
}

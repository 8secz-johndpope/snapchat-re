package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzaeq extends zzaey {
    private final Context mContext;
    private final Object mLock;
    private final zzala zzapq;
    private final zzaer zzczt;

    public zzaeq(Context context, zzv zzv, zzwf zzwf, zzala zzala) {
        this(context, zzala, new zzaer(context, zzv, zzko.zzib(), zzwf, zzala));
    }

    private zzaeq(Context context, zzala zzala, zzaer zzaer) {
        this.mLock = new Object();
        this.mContext = context;
        this.zzapq = zzala;
        this.zzczt = zzaer;
    }

    public final void destroy() {
        zzd(null);
    }

    public final String getMediationAdapterClassName() {
        String mediationAdapterClassName;
        synchronized (this.mLock) {
            mediationAdapterClassName = this.zzczt.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }

    public final boolean isLoaded() {
        boolean isLoaded;
        synchronized (this.mLock) {
            isLoaded = this.zzczt.isLoaded();
        }
        return isLoaded;
    }

    public final void pause() {
        zzb(null);
    }

    public final void resume() {
        zzc(null);
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.mLock) {
            this.zzczt.setImmersiveMode(z);
        }
    }

    public final void setUserId(String str) {
        synchronized (this.mLock) {
            this.zzczt.setUserId(str);
        }
    }

    public final void show() {
        synchronized (this.mLock) {
            this.zzczt.zzov();
        }
    }

    public final void zza(zzafc zzafc) {
        synchronized (this.mLock) {
            this.zzczt.zza(zzafc);
        }
    }

    public final void zza(zzafi zzafi) {
        synchronized (this.mLock) {
            this.zzczt.zza(zzafi);
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        synchronized (this.mLock) {
            this.zzczt.pause();
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper) {
        synchronized (this.mLock) {
            Context context;
            if (iObjectWrapper == null) {
                context = null;
            } else {
                try {
                    context = (Context) zzn.zzy(iObjectWrapper);
                } catch (Exception e) {
                    zzaky.zzc("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.zzczt.onContextChanged(context);
            }
            this.zzczt.resume();
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        synchronized (this.mLock) {
            this.zzczt.destroy();
        }
    }
}

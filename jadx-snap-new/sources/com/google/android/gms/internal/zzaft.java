package com.google.android.gms.internal;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzaft extends zzaga {
    private volatile zzafu zzdab;
    private volatile zzafr zzdao;
    private volatile zzafs zzdap;

    public zzaft(zzafs zzafs) {
        this.zzdap = zzafs;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzagd zzagd) {
        if (this.zzdap != null) {
            this.zzdap.zzc(zzagd);
        }
    }

    public final void zza(zzafr zzafr) {
        this.zzdao = zzafr;
    }

    public final void zza(zzafu zzafu) {
        this.zzdab = zzafu;
    }

    public final void zzc(IObjectWrapper iObjectWrapper, int i) {
        if (this.zzdao != null) {
            this.zzdao.zzaa(i);
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
        if (this.zzdab != null) {
            this.zzdab.zza(zzn.zzy(iObjectWrapper).getClass().getName(), i);
        }
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        if (this.zzdao != null) {
            this.zzdao.zzoz();
        }
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (this.zzdab != null) {
            this.zzdab.zzbr(zzn.zzy(iObjectWrapper).getClass().getName());
        }
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.onRewardedVideoAdOpened();
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.onRewardedVideoStarted();
        }
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.onRewardedVideoAdClosed();
        }
    }

    public final void zzr(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.zzdn();
        }
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.onRewardedVideoAdLeftApplication();
        }
    }

    public final void zzt(IObjectWrapper iObjectWrapper) {
        if (this.zzdap != null) {
            this.zzdap.onRewardedVideoCompleted();
        }
    }
}

package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.zzbq;

@zzabh
public final class zzane {
    private final Context zzdlx;
    private final zzann zzdly;
    private final ViewGroup zzdlz;
    private zzanb zzdma;

    private zzane(Context context, ViewGroup viewGroup, zzann zzann, zzanb zzanb) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzdlx = context;
        this.zzdlz = viewGroup;
        this.zzdly = zzann;
        this.zzdma = null;
    }

    public zzane(Context context, ViewGroup viewGroup, zzaof zzaof) {
        this(context, viewGroup, zzaof, null);
    }

    public final void onDestroy() {
        zzbq.zzgn("onDestroy must be called from the UI thread.");
        zzanb zzanb = this.zzdma;
        if (zzanb != null) {
            zzanb.destroy();
            this.zzdlz.removeView(this.zzdma);
            this.zzdma = null;
        }
    }

    public final void onPause() {
        zzbq.zzgn("onPause must be called from the UI thread.");
        zzanb zzanb = this.zzdma;
        if (zzanb != null) {
            zzanb.pause();
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzanm zzanm) {
        if (this.zzdma == null) {
            zzoo.zza(this.zzdly.zztk().zzjn(), this.zzdly.zzti(), "vpr2");
            Context context = this.zzdlx;
            zzann zzann = this.zzdly;
            this.zzdma = new zzanb(context, zzann, i5, z, zzann.zztk().zzjn(), zzanm);
            this.zzdlz.addView(this.zzdma, 0, new LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.zzdma.zzd(i, i2, i3, i4);
            this.zzdly.zzag(false);
        }
    }

    public final void zze(int i, int i2, int i3, int i4) {
        zzbq.zzgn("The underlay may only be modified from the UI thread.");
        zzanb zzanb = this.zzdma;
        if (zzanb != null) {
            zzanb.zzd(i, i2, i3, i4);
        }
    }

    public final zzanb zztb() {
        zzbq.zzgn("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzdma;
    }
}

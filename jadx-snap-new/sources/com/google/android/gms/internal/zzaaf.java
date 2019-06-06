package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbt;
import java.lang.ref.WeakReference;

@zzabh
public final class zzaaf {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzov zzanh;
    private int zzavd = -1;
    private int zzave = -1;
    private zzake zzavf;
    private final DisplayMetrics zzaxo;
    private final zzcv zzbyz;
    private final zzahe zzcob;
    private final zzbb zzcpw;
    private OnGlobalLayoutListener zzcpx;
    private OnScrollChangedListener zzcpy;

    public zzaaf(Context context, zzcv zzcv, zzahe zzahe, zzov zzov, zzbb zzbb) {
        this.mContext = context;
        this.zzbyz = zzcv;
        this.zzcob = zzahe;
        this.zzanh = zzov;
        this.zzcpw = zzbb;
        this.zzavf = new zzake(200);
        zzbt.zzel();
        this.zzaxo = zzaij.zza((WindowManager) context.getSystemService("window"));
    }

    private final void zza(WeakReference<zzaof> weakReference, boolean z) {
        if (weakReference != null) {
            zzaof zzaof = (zzaof) weakReference.get();
            if (zzaof != null && zzaof.getView() != null) {
                if (!z || this.zzavf.tryAcquire()) {
                    int[] iArr = new int[2];
                    zzaof.getView().getLocationOnScreen(iArr);
                    zzlc.zzij();
                    boolean z2 = false;
                    int zzb = zzako.zzb(this.zzaxo, iArr[0]);
                    zzlc.zzij();
                    int zzb2 = zzako.zzb(this.zzaxo, iArr[1]);
                    synchronized (this.mLock) {
                        if (!(this.zzavd == zzb && this.zzave == zzb2)) {
                            this.zzavd = zzb;
                            this.zzave = zzb2;
                            zzapu zzua = zzaof.zzua();
                            zzb = this.zzavd;
                            zzb2 = this.zzave;
                            if (!z) {
                                z2 = true;
                            }
                            zzua.zza(zzb, zzb2, z2);
                        }
                    }
                }
            }
        }
    }
}

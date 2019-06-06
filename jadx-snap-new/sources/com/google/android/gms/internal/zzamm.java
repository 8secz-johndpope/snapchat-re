package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzbt;
import java.lang.ref.WeakReference;

@zzabh
final class zzamm extends zzamo implements OnGlobalLayoutListener {
    private final WeakReference<OnGlobalLayoutListener> zzdkh;

    public zzamm(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.zzdkh = new WeakReference(onGlobalLayoutListener);
    }

    public final void onGlobalLayout() {
        OnGlobalLayoutListener onGlobalLayoutListener = (OnGlobalLayoutListener) this.zzdkh.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            detach();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzb(ViewTreeObserver viewTreeObserver) {
        zzbt.zzen().zza(viewTreeObserver, (OnGlobalLayoutListener) this);
    }
}

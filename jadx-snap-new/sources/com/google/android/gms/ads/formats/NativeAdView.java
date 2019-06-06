package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzqw;

public class NativeAdView extends FrameLayout {
    private final FrameLayout zzamk;
    private final zzqw zzaml;

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzamk);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        View view2 = this.zzamk;
        if (view2 != view) {
            super.bringChildToFront(view2);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzqw zzqw = this.zzaml;
        if (zzqw != null) {
            try {
                zzqw.zzb(zzn.zzz(view), i);
            } catch (RemoteException e) {
                zzaky.zzb("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzamk);
    }

    public void removeView(View view) {
        if (this.zzamk != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzaml.zza((IObjectWrapper) nativeAd.zzbi());
        } catch (RemoteException e) {
            zzaky.zzb("Unable to call setNativeAd on delegate", e);
        }
    }
}

package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzrb;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzamn = new WeakHashMap();
    private zzrb zzamm;
    private WeakReference<View> zzamo;

    public final void setNativeAd(NativeAd nativeAd) {
        WeakReference weakReference = this.zzamo;
        Object obj = weakReference != null ? (View) weakReference.get() : null;
        if (obj == null) {
            zzaky.zzcz("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzamn.containsKey(obj)) {
            zzamn.put(obj, this);
        }
        zzrb zzrb = this.zzamm;
        if (zzrb != null) {
            try {
                zzrb.zza((IObjectWrapper) nativeAd.zzbi());
            } catch (RemoteException e) {
                zzaky.zzb("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}

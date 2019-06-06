package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzqv extends Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzbxu;
    private final zzqs zzcai;

    public zzqv(zzqs zzqs) {
        Drawable drawable;
        double d;
        this.zzcai = zzqs;
        Uri uri = null;
        try {
            IObjectWrapper zzkb = this.zzcai.zzkb();
            if (zzkb != null) {
                drawable = (Drawable) zzn.zzy(zzkb);
                this.mDrawable = drawable;
                uri = this.zzcai.getUri();
                this.mUri = uri;
                d = 1.0d;
                d = this.zzcai.getScale();
                this.zzbxu = d;
            }
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get drawable.", e);
        }
        drawable = null;
        this.mDrawable = drawable;
        try {
            uri = this.zzcai.getUri();
        } catch (RemoteException e2) {
            zzaky.zzb("Failed to get uri.", e2);
        }
        this.mUri = uri;
        d = 1.0d;
        try {
            d = this.zzcai.getScale();
        } catch (RemoteException e3) {
            zzaky.zzb("Failed to get scale.", e3);
        }
        this.zzbxu = d;
    }

    public final Drawable getDrawable() {
        return this.mDrawable;
    }

    public final double getScale() {
        return this.zzbxu;
    }

    public final Uri getUri() {
        return this.mUri;
    }
}

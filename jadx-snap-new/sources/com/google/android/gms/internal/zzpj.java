package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzpj extends zzqt {
    private final Uri mUri;
    private final Drawable zzbxt;
    private final double zzbxu;

    public zzpj(Drawable drawable, Uri uri, double d) {
        this.zzbxt = drawable;
        this.mUri = uri;
        this.zzbxu = d;
    }

    public final double getScale() {
        return this.zzbxu;
    }

    public final Uri getUri() {
        return this.mUri;
    }

    public final IObjectWrapper zzkb() {
        return zzn.zzz(this.zzbxt);
    }
}

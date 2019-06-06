package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzabh
public final class zzxw extends zzwy {
    private final zza zzcko;

    public zzxw(zza zza) {
        this.zzcko = zza;
    }

    public final String getAdvertiser() {
        return this.zzcko.getAdvertiser();
    }

    public final String getBody() {
        return this.zzcko.getBody();
    }

    public final String getCallToAction() {
        return this.zzcko.getCallToAction();
    }

    public final Bundle getExtras() {
        return this.zzcko.getExtras();
    }

    public final String getHeadline() {
        return this.zzcko.getHeadline();
    }

    public final List getImages() {
        List<Image> images = this.zzcko.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (Image image : images) {
                arrayList.add(new zzpj(image.getDrawable(), image.getUri(), image.getScale()));
            }
        }
        return arrayList;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzcko.getOverrideClickHandling();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzcko.getOverrideImpressionRecording();
    }

    public final String getPrice() {
        return this.zzcko.getPrice();
    }

    public final double getStarRating() {
        return this.zzcko.getStarRating() != null ? this.zzcko.getStarRating().doubleValue() : -1.0d;
    }

    public final String getStore() {
        return this.zzcko.getStore();
    }

    public final zzmm getVideoController() {
        return this.zzcko.getVideoController() != null ? this.zzcko.getVideoController().zzbh() : null;
    }

    public final void recordImpression() {
    }

    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzcko.trackViews((View) zzn.zzy(iObjectWrapper), (HashMap) zzn.zzy(iObjectWrapper2), (HashMap) zzn.zzy(iObjectWrapper3));
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzn.zzy(iObjectWrapper);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzn.zzy(iObjectWrapper);
    }

    public final zzqs zzkc() {
        Image icon = this.zzcko.getIcon();
        return icon != null ? new zzpj(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    public final IObjectWrapper zzkh() {
        Object zzbl = this.zzcko.zzbl();
        return zzbl == null ? null : zzn.zzz(zzbl);
    }

    public final zzqo zzki() {
        return null;
    }

    public final IObjectWrapper zzmw() {
        return null;
    }

    public final IObjectWrapper zzmx() {
        return null;
    }
}

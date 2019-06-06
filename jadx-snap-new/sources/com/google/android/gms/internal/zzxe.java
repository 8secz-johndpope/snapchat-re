package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzabh
public final class zzxe extends zzws {
    private final NativeAppInstallAdMapper zzckf;

    public zzxe(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzckf = nativeAppInstallAdMapper;
    }

    public final String getBody() {
        return this.zzckf.getBody();
    }

    public final String getCallToAction() {
        return this.zzckf.getCallToAction();
    }

    public final Bundle getExtras() {
        return this.zzckf.getExtras();
    }

    public final String getHeadline() {
        return this.zzckf.getHeadline();
    }

    public final List getImages() {
        List<Image> images = this.zzckf.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new zzpj(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzckf.getOverrideClickHandling();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzckf.getOverrideImpressionRecording();
    }

    public final String getPrice() {
        return this.zzckf.getPrice();
    }

    public final double getStarRating() {
        return this.zzckf.getStarRating();
    }

    public final String getStore() {
        return this.zzckf.getStore();
    }

    public final zzmm getVideoController() {
        return this.zzckf.getVideoController() != null ? this.zzckf.getVideoController().zzbh() : null;
    }

    public final void recordImpression() {
        this.zzckf.recordImpression();
    }

    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzckf.trackViews((View) zzn.zzy(iObjectWrapper), (HashMap) zzn.zzy(iObjectWrapper2), (HashMap) zzn.zzy(iObjectWrapper3));
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzckf.handleClick((View) zzn.zzy(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzckf.trackView((View) zzn.zzy(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzckf.untrackView((View) zzn.zzy(iObjectWrapper));
    }

    public final zzqs zzkc() {
        Image icon = this.zzckf.getIcon();
        return icon != null ? new zzpj(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    public final IObjectWrapper zzkh() {
        return null;
    }

    public final zzqo zzki() {
        return null;
    }

    public final IObjectWrapper zzmw() {
        View adChoicesContent = this.zzckf.getAdChoicesContent();
        return adChoicesContent == null ? null : zzn.zzz(adChoicesContent);
    }

    public final IObjectWrapper zzmx() {
        View zzvq = this.zzckf.zzvq();
        return zzvq == null ? null : zzn.zzz(zzvq);
    }
}

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzabh
public final class zzxf extends zzwv {
    private final NativeContentAdMapper zzckg;

    public zzxf(NativeContentAdMapper nativeContentAdMapper) {
        this.zzckg = nativeContentAdMapper;
    }

    public final String getAdvertiser() {
        return this.zzckg.getAdvertiser();
    }

    public final String getBody() {
        return this.zzckg.getBody();
    }

    public final String getCallToAction() {
        return this.zzckg.getCallToAction();
    }

    public final Bundle getExtras() {
        return this.zzckg.getExtras();
    }

    public final String getHeadline() {
        return this.zzckg.getHeadline();
    }

    public final List getImages() {
        List<Image> images = this.zzckg.getImages();
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
        return this.zzckg.getOverrideClickHandling();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzckg.getOverrideImpressionRecording();
    }

    public final zzmm getVideoController() {
        return this.zzckg.getVideoController() != null ? this.zzckg.getVideoController().zzbh() : null;
    }

    public final void recordImpression() {
        this.zzckg.recordImpression();
    }

    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzckg.trackViews((View) zzn.zzy(iObjectWrapper), (HashMap) zzn.zzy(iObjectWrapper2), (HashMap) zzn.zzy(iObjectWrapper3));
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzckg.handleClick((View) zzn.zzy(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzckg.trackView((View) zzn.zzy(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzckg.untrackView((View) zzn.zzy(iObjectWrapper));
    }

    public final IObjectWrapper zzkh() {
        return null;
    }

    public final zzqo zzki() {
        return null;
    }

    public final zzqs zzkj() {
        Image logo = this.zzckg.getLogo();
        return logo != null ? new zzpj(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    public final IObjectWrapper zzmw() {
        View adChoicesContent = this.zzckg.getAdChoicesContent();
        return adChoicesContent == null ? null : zzn.zzz(adChoicesContent);
    }

    public final IObjectWrapper zzmx() {
        View zzvq = this.zzckg.zzvq();
        return zzvq == null ? null : zzn.zzz(zzvq);
    }
}

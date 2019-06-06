package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.internal.zzabh;
import java.util.List;
import java.util.Map;

@zzabh
public class zza {
    private String body;
    private Bundle extras = new Bundle();
    private String zzdtb;
    private List<Image> zzdtc;
    private Image zzdtd;
    private String zzdte;
    private String zzdtf;
    private Double zzdtg;
    private String zzdth;
    private String zzdti;
    private VideoController zzdtj;
    private Object zzdtk;
    private boolean zzdtl;
    private boolean zzdtm;

    public final String getAdvertiser() {
        return this.zzdtf;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.zzdte;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getHeadline() {
        return this.zzdtb;
    }

    public final Image getIcon() {
        return this.zzdtd;
    }

    public final List<Image> getImages() {
        return this.zzdtc;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzdtm;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzdtl;
    }

    public final String getPrice() {
        return this.zzdti;
    }

    public final Double getStarRating() {
        return this.zzdtg;
    }

    public final String getStore() {
        return this.zzdth;
    }

    public final VideoController getVideoController() {
        return this.zzdtj;
    }

    public final void setAdvertiser(String str) {
        this.zzdtf = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setCallToAction(String str) {
        this.zzdte = str;
    }

    public final void setHeadline(String str) {
        this.zzdtb = str;
    }

    public final void setIcon(Image image) {
        this.zzdtd = image;
    }

    public final void setImages(List<Image> list) {
        this.zzdtc = list;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzdtm = true;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzdtl = true;
    }

    public final void setPrice(String str) {
        this.zzdti = str;
    }

    public final void setStore(String str) {
        this.zzdth = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public final void zza(VideoController videoController) {
        this.zzdtj = videoController;
    }

    public final void zza(Double d) {
        this.zzdtg = d;
    }

    public final Object zzbl() {
        return this.zzdtk;
    }

    public final void zzk(Object obj) {
        this.zzdtk = obj;
    }
}

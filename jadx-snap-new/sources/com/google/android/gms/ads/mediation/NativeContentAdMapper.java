package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeContentAdMapper extends NativeAdMapper {
    private String zzbxv;
    private List<Image> zzbxw;
    private String zzbxx;
    private String zzbxz;
    private String zzbyl;
    private Image zzdta;

    public final String getAdvertiser() {
        return this.zzbyl;
    }

    public final String getBody() {
        return this.zzbxx;
    }

    public final String getCallToAction() {
        return this.zzbxz;
    }

    public final String getHeadline() {
        return this.zzbxv;
    }

    public final List<Image> getImages() {
        return this.zzbxw;
    }

    public final Image getLogo() {
        return this.zzdta;
    }

    public final void setAdvertiser(String str) {
        this.zzbyl = str;
    }

    public final void setBody(String str) {
        this.zzbxx = str;
    }

    public final void setCallToAction(String str) {
        this.zzbxz = str;
    }

    public final void setHeadline(String str) {
        this.zzbxv = str;
    }

    public final void setImages(List<Image> list) {
        this.zzbxw = list;
    }

    public final void setLogo(Image image) {
        this.zzdta = image;
    }
}

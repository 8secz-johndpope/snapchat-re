package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzbxv;
    private List<Image> zzbxw;
    private String zzbxx;
    private String zzbxz;
    private double zzbya;
    private String zzbyb;
    private String zzbyc;
    private Image zzdsz;

    public final String getBody() {
        return this.zzbxx;
    }

    public final String getCallToAction() {
        return this.zzbxz;
    }

    public final String getHeadline() {
        return this.zzbxv;
    }

    public final Image getIcon() {
        return this.zzdsz;
    }

    public final List<Image> getImages() {
        return this.zzbxw;
    }

    public final String getPrice() {
        return this.zzbyc;
    }

    public final double getStarRating() {
        return this.zzbya;
    }

    public final String getStore() {
        return this.zzbyb;
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

    public final void setIcon(Image image) {
        this.zzdsz = image;
    }

    public final void setImages(List<Image> list) {
        this.zzbxw = list;
    }

    public final void setPrice(String str) {
        this.zzbyc = str;
    }

    public final void setStarRating(double d) {
        this.zzbya = d;
    }

    public final void setStore(String str) {
        this.zzbyb = str;
    }
}

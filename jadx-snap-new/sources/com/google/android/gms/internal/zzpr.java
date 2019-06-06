package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.util.List;

@zzabh
public final class zzpr extends zzsl implements zzpy {
    private Object mLock = new Object();
    private String zzbxv;
    private List<zzpj> zzbxw;
    private String zzbxx;
    private zzqs zzbxy;
    private String zzbxz;
    private double zzbya;
    private String zzbyb;
    private String zzbyc;
    private zzph zzbyd;
    private zzmm zzbye;
    private View zzbyf;
    private IObjectWrapper zzbyg;
    private String zzbyh;
    private zzpv zzbyi;
    private String zzbyl;

    public zzpr(String str, List<zzpj> list, String str2, zzqs zzqs, String str3, String str4, double d, String str5, String str6, zzph zzph, zzmm zzmm, View view, IObjectWrapper iObjectWrapper, String str7) {
        this.zzbxv = str;
        this.zzbxw = list;
        this.zzbxx = str2;
        this.zzbxy = zzqs;
        this.zzbxz = str3;
        this.zzbyl = str4;
        this.zzbya = d;
        this.zzbyb = str5;
        this.zzbyc = str6;
        this.zzbyd = zzph;
        this.zzbye = zzmm;
        this.zzbyf = view;
        this.zzbyg = iObjectWrapper;
        this.zzbyh = str7;
    }

    public final void destroy() {
        zzaij.zzdfn.post(new zzps(this));
    }

    public final String getAdvertiser() {
        return this.zzbyl;
    }

    public final String getBody() {
        return this.zzbxx;
    }

    public final String getCallToAction() {
        return this.zzbxz;
    }

    public final String getCustomTemplateId() {
        return "";
    }

    public final String getHeadline() {
        return this.zzbxv;
    }

    public final List getImages() {
        return this.zzbxw;
    }

    public final String getMediationAdapterClassName() {
        return this.zzbyh;
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

    public final zzmm getVideoController() {
        return this.zzbye;
    }

    public final void performClick(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to perform click before unified native ad is initialized.");
                return;
            }
            this.zzbyi.performClick(bundle);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to record impression before unified native ad is initialized.");
                return false;
            }
            boolean recordImpression = this.zzbyi.recordImpression(bundle);
            return recordImpression;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to perform click before unified native ad is initialized.");
                return;
            }
            this.zzbyi.reportTouchEvent(bundle);
        }
    }

    public final void zzb(zzpv zzpv) {
        synchronized (this.mLock) {
            this.zzbyi = zzpv;
        }
    }

    public final zzqs zzkc() {
        return this.zzbxy;
    }

    public final IObjectWrapper zzkd() {
        return zzn.zzz(this.zzbyi);
    }

    public final String zzke() {
        return "6";
    }

    public final zzph zzkf() {
        return this.zzbyd;
    }

    public final View zzkg() {
        return this.zzbyf;
    }

    public final IObjectWrapper zzkh() {
        return this.zzbyg;
    }

    public final zzqo zzki() {
        return this.zzbyd;
    }
}

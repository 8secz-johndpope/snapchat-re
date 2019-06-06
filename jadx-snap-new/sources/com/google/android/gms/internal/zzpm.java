package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.samsung.android.sdk.camera.SCamera;
import java.util.List;

@zzabh
public final class zzpm extends zzrl implements zzpy {
    private Bundle mExtras;
    private Object mLock = new Object();
    private String zzbxv;
    private List<zzpj> zzbxw;
    private String zzbxx;
    private String zzbxz;
    private zzph zzbyd;
    private zzmm zzbye;
    private View zzbyf;
    private IObjectWrapper zzbyg;
    private String zzbyh;
    private zzpv zzbyi;
    private zzqs zzbyk;
    private String zzbyl;

    public zzpm(String str, List<zzpj> list, String str2, zzqs zzqs, String str3, String str4, zzph zzph, Bundle bundle, zzmm zzmm, View view, IObjectWrapper iObjectWrapper, String str5) {
        this.zzbxv = str;
        this.zzbxw = list;
        this.zzbxx = str2;
        this.zzbyk = zzqs;
        this.zzbxz = str3;
        this.zzbyl = str4;
        this.zzbyd = zzph;
        this.mExtras = bundle;
        this.zzbye = zzmm;
        this.zzbyf = view;
        this.zzbyg = iObjectWrapper;
        this.zzbyh = str5;
    }

    public final void destroy() {
        zzaij.zzdfn.post(new zzpn(this));
        this.zzbxv = null;
        this.zzbxw = null;
        this.zzbxx = null;
        this.zzbyk = null;
        this.zzbxz = null;
        this.zzbyl = null;
        this.zzbyd = null;
        this.mExtras = null;
        this.mLock = null;
        this.zzbye = null;
        this.zzbyf = null;
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

    public final Bundle getExtras() {
        return this.mExtras;
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

    public final zzmm getVideoController() {
        return this.zzbye;
    }

    public final void performClick(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to perform click before content ad initialized.");
                return;
            }
            this.zzbyi.performClick(bundle);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to record impression before content ad initialized.");
                return false;
            }
            boolean recordImpression = this.zzbyi.recordImpression(bundle);
            return recordImpression;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                zzaky.e("Attempt to perform click before app install ad initialized.");
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

    public final IObjectWrapper zzkd() {
        return zzn.zzz(this.zzbyi);
    }

    public final String zzke() {
        return SCamera.CAMERA_ID_FRONT;
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

    public final zzqs zzkj() {
        return this.zzbyk;
    }
}

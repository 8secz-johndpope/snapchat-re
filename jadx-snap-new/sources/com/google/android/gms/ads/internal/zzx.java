package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzagq;
import com.google.android.gms.internal.zzagt;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzaqa;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzwf;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwu;
import com.samsung.android.sdk.camera.SCamera;
import java.lang.ref.WeakReference;
import java.util.List;

@zzabh
public final class zzx extends zzi implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean zzamp;
    private WeakReference<Object> zzaor = new WeakReference(null);

    public zzx(Context context, zzko zzko, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        super(context, zzko, str, zzwf, zzala, zzv);
    }

    private final boolean zzd(zzahd zzahd, zzahd zzahd2) {
        if (zzahd2.zzcto) {
            View zze = zzar.zze(zzahd2);
            if (zze == null) {
                zzaky.zzcz("Could not get mediation view");
                return false;
            }
            View nextView = this.zzanm.zzaua.getNextView();
            if (nextView != null) {
                if (nextView instanceof zzaof) {
                    ((zzaof) nextView).destroy();
                }
                this.zzanm.zzaua.removeView(nextView);
            }
            if (!zzar.zzf(zzahd2)) {
                try {
                    if (zzbt.zzfh().zzr(this.zzanm.zzaiq)) {
                        new zzgr(this.zzanm.zzaiq, zze).zza(new zzagt(this.zzanm.zzaiq, this.zzanm.zzatx));
                    }
                    if (zzahd2.zzdcl != null) {
                        this.zzanm.zzaua.setMinimumWidth(zzahd2.zzdcl.widthPixels);
                        this.zzanm.zzaua.setMinimumHeight(zzahd2.zzdcl.heightPixels);
                    }
                    zzg(zze);
                } catch (Exception e) {
                    zzbt.zzep().zza(e, "BannerAdManager.swapViews");
                    zzaky.zzc("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(zzahd2.zzdcl == null || zzahd2.zzcnm == null)) {
            zzahd2.zzcnm.zza(zzaqa.zzc(zzahd2.zzdcl));
            this.zzanm.zzaua.removeAllViews();
            this.zzanm.zzaua.setMinimumWidth(zzahd2.zzdcl.widthPixels);
            this.zzanm.zzaua.setMinimumHeight(zzahd2.zzdcl.heightPixels);
            zzg(zzahd2.zzcnm.getView());
        }
        if (this.zzanm.zzaua.getChildCount() > 1) {
            this.zzanm.zzaua.showNext();
        }
        if (zzahd != null) {
            View nextView2 = this.zzanm.zzaua.getNextView();
            if (nextView2 instanceof zzaof) {
                ((zzaof) nextView2).destroy();
            } else if (nextView2 != null) {
                this.zzanm.zzaua.removeView(nextView2);
            }
            this.zzanm.zzfn();
        }
        this.zzanm.zzaua.setVisibility(0);
        return true;
    }

    public final zzmm getVideoController() {
        zzbq.zzgn("getVideoController must be called from the main thread.");
        return (this.zzanm.zzaue == null || this.zzanm.zzaue.zzcnm == null) ? null : this.zzanm.zzaue.zzcnm.zzth();
    }

    public final void onGlobalLayout() {
        zzd(this.zzanm.zzaue);
    }

    public final void onScrollChanged() {
        zzd(this.zzanm.zzaue);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        zzbq.zzgn("setManualImpressionsEnabled must be called from the main thread.");
        this.zzamp = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* Access modifiers changed, original: protected|final */
    public final zzaof zza(zzahe zzahe, zzw zzw, zzagq zzagq) {
        if (this.zzanm.zzaud.zzbic == null && this.zzanm.zzaud.zzbie) {
            zzko zzko;
            zzbu zzbu = this.zzanm;
            if (zzahe.zzdcw.zzbie) {
                zzko = this.zzanm.zzaud;
            } else {
                AdSize adSize;
                String str = zzahe.zzdcw.zzctr;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.zzanm.zzaud.zzic();
                }
                zzko = new zzko(this.zzanm.zzaiq, adSize);
            }
            zzbu.zzaud = zzko;
        }
        return super.zza(zzahe, zzw, zzagq);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzahd zzahd, boolean z) {
        super.zza(zzahd, z);
        if (zzar.zzf(zzahd)) {
            zzab zzab = new zzab(this);
            if (zzahd != null && zzar.zzf(zzahd)) {
                zzaof zzaof = zzahd.zzcnm;
                Object view = zzaof != null ? zzaof.getView() : null;
                if (view == null) {
                    zzaky.zzcz("AdWebView is null");
                    return;
                }
                try {
                    List list = zzahd.zzcje != null ? zzahd.zzcje.zzchr : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            zzwr zzmp = zzahd.zzcjf != null ? zzahd.zzcjf.zzmp() : null;
                            zzwu zzmq = zzahd.zzcjf != null ? zzahd.zzcjf.zzmq() : null;
                            String str = "/nativeExpressViewClicked";
                            if (list.contains("2") && zzmp != null) {
                                zzmp.zzi(zzn.zzz(view));
                                if (!zzmp.getOverrideImpressionRecording()) {
                                    zzmp.recordImpression();
                                }
                                zzaof.zzua().zza(str, zzar.zza(zzmp, null, zzab));
                                return;
                            } else if (!list.contains(SCamera.CAMERA_ID_FRONT) || zzmq == null) {
                                zzaky.zzcz("No matching template id and mapper");
                                return;
                            } else {
                                zzmq.zzi(zzn.zzz(view));
                                if (!zzmq.getOverrideImpressionRecording()) {
                                    zzmq.recordImpression();
                                }
                                zzaof.zzua().zza(str, zzar.zza(null, zzmq, zzab));
                                return;
                            }
                        }
                    }
                    zzaky.zzcz("No template ids present in mediation response");
                } catch (RemoteException e) {
                    zzaky.zzc("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:25:0x0079, code skipped:
            if (((java.lang.Boolean) com.google.android.gms.internal.zzlc.zzio().zzd(com.google.android.gms.internal.zzoi.zzbsh)).booleanValue() != false) goto L_0x007b;
     */
    public final boolean zza(com.google.android.gms.internal.zzahd r5, com.google.android.gms.internal.zzahd r6) {
        /*
        r4 = this;
        r0 = super.zza(r5, r6);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r4.zzanm;
        r0 = r0.zzfo();
        if (r0 == 0) goto L_0x0025;
    L_0x0010:
        r5 = r4.zzd(r5, r6);
        if (r5 != 0) goto L_0x0025;
    L_0x0016:
        r5 = r6.zzdcu;
        if (r5 == 0) goto L_0x0021;
    L_0x001a:
        r5 = r6.zzdcu;
        r6 = com.google.android.gms.internal.zziw.zza.zzb.AD_FAILED_TO_LOAD;
        r5.zza(r6);
    L_0x0021:
        r4.zzi(r1);
        return r1;
    L_0x0025:
        r5 = r6.zzcuf;
        r0 = 0;
        if (r5 == 0) goto L_0x0061;
    L_0x002a:
        r4.zzd(r6);
        com.google.android.gms.ads.internal.zzbt.zzfg();
        r5 = r4.zzanm;
        r5 = r5.zzaua;
        com.google.android.gms.internal.zzaml.zza(r5, r4);
        com.google.android.gms.ads.internal.zzbt.zzfg();
        r5 = r4.zzanm;
        r5 = r5.zzaua;
        com.google.android.gms.internal.zzaml.zza(r5, r4);
        r5 = r6.zzdci;
        if (r5 != 0) goto L_0x007e;
    L_0x0045:
        r5 = new com.google.android.gms.ads.internal.zzaa;
        r5.<init>(r4);
        r1 = r6.zzcnm;
        if (r1 == 0) goto L_0x0055;
    L_0x004e:
        r1 = r6.zzcnm;
        r1 = r1.zzua();
        goto L_0x0056;
    L_0x0055:
        r1 = r0;
    L_0x0056:
        if (r1 == 0) goto L_0x007e;
    L_0x0058:
        r2 = new com.google.android.gms.ads.internal.zzy;
        r2.<init>(r6, r5);
        r1.zza(r2);
        goto L_0x007e;
    L_0x0061:
        r5 = r4.zzanm;
        r5 = r5.zzfp();
        if (r5 == 0) goto L_0x007b;
    L_0x0069:
        r5 = com.google.android.gms.internal.zzoi.zzbsh;
        r2 = com.google.android.gms.internal.zzlc.zzio();
        r5 = r2.zzd(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x007e;
    L_0x007b:
        r4.zza(r6, r1);
    L_0x007e:
        r5 = r6.zzcnm;
        if (r5 == 0) goto L_0x00a2;
    L_0x0082:
        r5 = r6.zzcnm;
        r5 = r5.zzth();
        r1 = r6.zzcnm;
        r1 = r1.zzua();
        if (r1 == 0) goto L_0x0093;
    L_0x0090:
        r1.zzut();
    L_0x0093:
        r1 = r4.zzanm;
        r1 = r1.zzaur;
        if (r1 == 0) goto L_0x00a2;
    L_0x0099:
        if (r5 == 0) goto L_0x00a2;
    L_0x009b:
        r1 = r4.zzanm;
        r1 = r1.zzaur;
        r5.zzb(r1);
    L_0x00a2:
        r5 = r4.zzanm;
        r5 = r5.zzfo();
        if (r5 == 0) goto L_0x0115;
    L_0x00aa:
        r5 = r6.zzcnm;
        if (r5 == 0) goto L_0x0130;
    L_0x00ae:
        r5 = r6.zzdch;
        if (r5 == 0) goto L_0x00bb;
    L_0x00b2:
        r5 = r4.zzano;
        r0 = r4.zzanm;
        r0 = r0.zzaud;
        r5.zza(r0, r6);
    L_0x00bb:
        r5 = r6.zzcnm;
        r0 = r5.getView();
        r5 = new com.google.android.gms.internal.zzgr;
        r1 = r4.zzanm;
        r1 = r1.zzaiq;
        r5.<init>(r1, r0);
        r1 = com.google.android.gms.ads.internal.zzbt.zzfh();
        r2 = r4.zzanm;
        r2 = r2.zzaiq;
        r1 = r1.zzr(r2);
        if (r1 == 0) goto L_0x00fa;
    L_0x00d8:
        r1 = r6.zzcrv;
        r1 = com.google.android.gms.ads.internal.zza.zza(r1);
        if (r1 == 0) goto L_0x00fa;
    L_0x00e0:
        r1 = r4.zzanm;
        r1 = r1.zzatx;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x00fa;
    L_0x00ea:
        r1 = new com.google.android.gms.internal.zzagt;
        r2 = r4.zzanm;
        r2 = r2.zzaiq;
        r3 = r4.zzanm;
        r3 = r3.zzatx;
        r1.<init>(r2, r3);
        r5.zza(r1);
    L_0x00fa:
        r1 = r6.zzfz();
        if (r1 == 0) goto L_0x0106;
    L_0x0100:
        r1 = r6.zzcnm;
        r5.zza(r1);
        goto L_0x0130;
    L_0x0106:
        r1 = r6.zzcnm;
        r1 = r1.zzua();
        r2 = new com.google.android.gms.ads.internal.zzz;
        r2.<init>(r5, r6);
        r1.zza(r2);
        goto L_0x0130;
    L_0x0115:
        r5 = r4.zzanm;
        r5 = r5.zzava;
        if (r5 == 0) goto L_0x0130;
    L_0x011b:
        r5 = r6.zzdch;
        if (r5 == 0) goto L_0x0130;
    L_0x011f:
        r5 = r4.zzano;
        r0 = r4.zzanm;
        r0 = r0.zzaud;
        r1 = r4.zzanm;
        r1 = r1.zzava;
        r5.zza(r0, r6, r1);
        r5 = r4.zzanm;
        r0 = r5.zzava;
    L_0x0130:
        r5 = r6.zzcto;
        if (r5 != 0) goto L_0x0139;
    L_0x0134:
        r5 = r4.zzanm;
        r5.zzi(r0);
    L_0x0139:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.zzahd, com.google.android.gms.internal.zzahd):boolean");
    }

    public final boolean zzb(zzkk zzkk) {
        zzkk zzkk2 = zzkk;
        if (zzkk2.zzbha != this.zzamp) {
            int i = zzkk2.versionCode;
            long j = zzkk2.zzbgv;
            Bundle bundle = zzkk2.extras;
            int i2 = zzkk2.zzbgw;
            List list = zzkk2.zzbgx;
            boolean z = zzkk2.zzbgy;
            int i3 = zzkk2.zzbgz;
            boolean z2 = zzkk2.zzbha || this.zzamp;
            zzkk2 = new zzkk(i, j, bundle, i2, list, z, i3, z2, zzkk2.zzbhb, zzkk2.zzbhc, zzkk2.zzbhd, zzkk2.zzbhe, zzkk2.zzbhf, zzkk2.zzbhg, zzkk2.zzbhh, zzkk2.zzbhi, zzkk2.zzbhj, zzkk2.zzbhk);
        }
        return super.zzb(zzkk2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzce() {
        boolean z;
        zzbt.zzel();
        if (zzaij.zzd(this.zzanm.zzaiq, this.zzanm.zzaiq.getPackageName(), "android.permission.INTERNET")) {
            z = true;
        } else {
            zzlc.zzij().zza(this.zzanm.zzaua, this.zzanm.zzaud, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbt.zzel();
        if (!zzaij.zzag(this.zzanm.zzaiq)) {
            zzlc.zzij().zza(this.zzanm.zzaua, this.zzanm.zzaud, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.zzanm.zzaua == null)) {
            this.zzanm.zzaua.setVisibility(0);
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final void zzd(zzahd zzahd) {
        if (!(zzahd == null || zzahd.zzdci || this.zzanm.zzaua == null || !zzbt.zzel().zza(this.zzanm.zzaua, this.zzanm.zzaiq) || !this.zzanm.zzaua.getGlobalVisibleRect(new Rect(), null))) {
            if (!(zzahd == null || zzahd.zzcnm == null || zzahd.zzcnm.zzua() == null)) {
                zzahd.zzcnm.zzua().zza(null);
            }
            zza(zzahd, false);
            zzahd.zzdci = true;
        }
    }

    public final void zzda() {
        this.zzanl.zzdz();
    }
}

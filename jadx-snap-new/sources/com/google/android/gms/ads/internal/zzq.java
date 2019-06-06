package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpk;
import com.google.android.gms.internal.zzpm;
import com.google.android.gms.internal.zzpt;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzpv;
import com.google.android.gms.internal.zzpw;
import com.google.android.gms.internal.zzpx;
import com.google.android.gms.internal.zzqs;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzry;
import com.google.android.gms.internal.zzvq;
import com.google.android.gms.internal.zzwf;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwu;
import java.util.List;

@zzabh
public final class zzq extends zzd implements zzpw {
    private boolean zzamp;
    private zzahd zzaoe;
    private boolean zzaof = false;

    public zzq(Context context, zzv zzv, zzko zzko, String str, zzwf zzwf, zzala zzala) {
        super(context, zzko, str, zzwf, zzala, zzv);
    }

    private static zzahd zza(zzahe zzahe, int i) {
        zzahe zzahe2 = zzahe;
        return new zzahd(zzahe2.zzcvm.zzcrv, null, zzahe2.zzdcw.zzchw, i, zzahe2.zzdcw.zzchx, zzahe2.zzdcw.zzctq, zzahe2.zzdcw.orientation, zzahe2.zzdcw.zzcic, zzahe2.zzcvm.zzcry, zzahe2.zzdcw.zzcto, null, null, null, zzahe2.zzdcj, null, zzahe2.zzdcw.zzctp, zzahe2.zzaud, zzahe2.zzdcw.zzctn, zzahe2.zzdcn, zzahe2.zzdco, zzahe2.zzdcw.zzctt, zzahe2.zzdch, null, zzahe2.zzdcw.zzcuc, zzahe2.zzdcw.zzcud, zzahe2.zzdcw.zzcud, zzahe2.zzdcw.zzcuf, zzahe2.zzdcw.zzcug, null, zzahe2.zzdcw.zzchz, zzahe2.zzdcw.zzcuj, zzahe2.zzdcu, zzahe2.zzdcw.zzaqw, zzahe2.zzdcv);
    }

    private final boolean zzb(zzahd zzahd, zzahd zzahd2) {
        zzahd zzahd3 = zzahd2;
        List list = null;
        zzd(null);
        if (this.zzanm.zzfo()) {
            try {
                Handler handler;
                Runnable zzs;
                zzwr zzmp = zzahd3.zzcjf != null ? zzahd3.zzcjf.zzmp() : null;
                zzwu zzmq = zzahd3.zzcjf != null ? zzahd3.zzcjf.zzmq() : null;
                zzro zzmu = zzahd3.zzcjf != null ? zzahd3.zzcjf.zzmu() : null;
                String zzc = zzd.zzc(zzahd2);
                String headline;
                List images;
                String body;
                zzqs zzkc;
                String callToAction;
                if (zzmp != null && this.zzanm.zzaul != null) {
                    headline = zzmp.getHeadline();
                    images = zzmp.getImages();
                    body = zzmp.getBody();
                    zzkc = zzmp.zzkc() != null ? zzmp.zzkc() : null;
                    callToAction = zzmp.getCallToAction();
                    double starRating = zzmp.getStarRating();
                    String store = zzmp.getStore();
                    String price = zzmp.getPrice();
                    Bundle extras = zzmp.getExtras();
                    zzmm videoController = zzmp.getVideoController();
                    if (zzmp.zzmx() != null) {
                        list = (View) zzn.zzy(zzmp.zzmx());
                    }
                    zzpx zzpk = new zzpk(headline, images, body, zzkc, callToAction, starRating, store, price, null, extras, videoController, list, zzmp.zzkh(), zzc);
                    zzpx zzpx = zzpk;
                    zzpx.zzb(new zzpu(this.zzanm.zzaiq, (zzpw) this, this.zzanm.zzaty, zzmp, zzpk));
                    handler = zzaij.zzdfn;
                    zzs = new zzs(this, zzpx);
                } else if (zzmq != null && this.zzanm.zzaum != null) {
                    headline = zzmq.getHeadline();
                    images = zzmq.getImages();
                    body = zzmq.getBody();
                    zzkc = zzmq.zzkj() != null ? zzmq.zzkj() : null;
                    callToAction = zzmq.getCallToAction();
                    String advertiser = zzmq.getAdvertiser();
                    Bundle extras2 = zzmq.getExtras();
                    zzmm videoController2 = zzmq.getVideoController();
                    if (zzmq.zzmx() != null) {
                        list = (View) zzn.zzy(zzmq.zzmx());
                    }
                    zzpm zzpm = new zzpm(headline, images, body, zzkc, callToAction, advertiser, null, extras2, videoController2, list, zzmq.zzkh(), zzc);
                    zzpm.zzb(new zzpu(this.zzanm.zzaiq, (zzpw) this, this.zzanm.zzaty, zzmq, (zzpx) zzpm));
                    handler = zzaij.zzdfn;
                    zzs = new zzt(this, zzpm);
                } else if (zzmu == null || this.zzanm.zzaup == null || this.zzanm.zzaup.get(zzmu.getCustomTemplateId()) == null) {
                    zzaky.zzcz("No matching mapper/listener for retrieved native ad template.");
                    zzi(0);
                    return false;
                } else {
                    zzaij.zzdfn.post(new zzu(this, zzmu));
                    return super.zza(zzahd, zzahd2);
                }
                handler.post(zzs);
                return super.zza(zzahd, zzahd2);
            } catch (RemoteException e) {
                zzaky.zzc("Failed to get native ad mapper", e);
            }
        } else {
            zzaky.zzcz("Native ad does not have custom rendering mode.");
        }
        zzi(0);
        return false;
    }

    private final boolean zzc(zzahd zzahd, zzahd zzahd2) {
        View zze = zzar.zze(zzahd2);
        if (zze == null) {
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
                zzg(zze);
            } catch (Throwable th) {
                zzbt.zzep().zza(th, "AdLoaderManager.swapBannerViews");
                zzaky.zzc("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzanm.zzaua.getChildCount() > 1) {
            this.zzanm.zzaua.showNext();
        }
        if (zzahd != null) {
            View nextView2 = this.zzanm.zzaua.getNextView();
            if (nextView2 != null) {
                this.zzanm.zzaua.removeView(nextView2);
            }
            this.zzanm.zzfn();
        }
        this.zzanm.zzaua.setMinimumWidth(zzbq().widthPixels);
        this.zzanm.zzaua.setMinimumHeight(zzbq().heightPixels);
        this.zzanm.zzaua.requestLayout();
        this.zzanm.zzaua.setVisibility(0);
        return true;
    }

    private final zzvq zzcx() {
        return (this.zzanm.zzaue == null || !this.zzanm.zzaue.zzcto) ? null : this.zzanm.zzaue.zzdcj;
    }

    public final zzmm getVideoController() {
        return null;
    }

    public final void pause() {
        if (this.zzaof) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.zzaof) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void setManualImpressionsEnabled(boolean z) {
        zzbq.zzgn("setManualImpressionsEnabled must be called from the main thread.");
        this.zzamp = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    public final void zza(com.google.android.gms.internal.zzahe r11, com.google.android.gms.internal.zzov r12) {
        /*
        r10 = this;
        r0 = 0;
        r10.zzaoe = r0;
        r0 = r11.errorCode;
        r1 = 0;
        r2 = -2;
        if (r0 == r2) goto L_0x0012;
    L_0x0009:
        r0 = r11.errorCode;
        r0 = zza(r11, r0);
    L_0x000f:
        r10.zzaoe = r0;
        goto L_0x0022;
    L_0x0012:
        r0 = r11.zzdcw;
        r0 = r0.zzcto;
        if (r0 != 0) goto L_0x0022;
    L_0x0018:
        r0 = "partialAdState is not mediation";
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = zza(r11, r1);
        goto L_0x000f;
    L_0x0022:
        r0 = r10.zzaoe;
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r11 = com.google.android.gms.internal.zzaij.zzdfn;
        r12 = new com.google.android.gms.ads.internal.zzr;
        r12.<init>(r10);
        r11.post(r12);
        return;
    L_0x0031:
        r0 = r11.zzaud;
        if (r0 == 0) goto L_0x003b;
    L_0x0035:
        r0 = r10.zzanm;
        r2 = r11.zzaud;
        r0.zzaud = r2;
    L_0x003b:
        r0 = r10.zzanm;
        r0.zzavb = r1;
        r0 = r10.zzanm;
        com.google.android.gms.ads.internal.zzbt.zzek();
        r1 = r10.zzanm;
        r2 = r1.zzaiq;
        r1 = r10.zzanm;
        r5 = r1.zzaty;
        r6 = 0;
        r7 = r10.zzanu;
        r3 = r10;
        r4 = r11;
        r8 = r10;
        r9 = r12;
        r11 = com.google.android.gms.internal.zzzm.zza(r2, r3, r4, r5, r6, r7, r8, r9);
        r0.zzauc = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.zzahe, com.google.android.gms.internal.zzov):void");
    }

    public final void zza(zzpb zzpb) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void zza(zzpt zzpt) {
        zzaky.zzcz("Unexpected call to AdLoaderManager method");
    }

    public final void zza(zzpv zzpv) {
        zzaky.zzcz("Unexpected call to AdLoaderManager method");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00a2 in {4, 6, 15, 18, 23, 26, 27, 29, 30, 37, 39, 40, 42} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    protected final boolean zza(com.google.android.gms.internal.zzahd r5, com.google.android.gms.internal.zzahd r6) {
        /*
        r4 = this;
        r0 = r4.zzanm;
        r0 = r0.zzfo();
        if (r0 == 0) goto L_0x009a;
        r0 = r6.zzcto;
        r1 = 0;
        if (r0 != 0) goto L_0x0016;
        r4.zzi(r1);
        r5 = "newState is not mediation.";
        com.google.android.gms.internal.zzaky.zzcz(r5);
        return r1;
        r0 = r6.zzcje;
        r2 = 1;
        if (r0 == 0) goto L_0x006a;
        r0 = r6.zzcje;
        r0 = r0.zzmg();
        if (r0 == 0) goto L_0x006a;
        r0 = r4.zzanm;
        r0 = r0.zzfo();
        if (r0 == 0) goto L_0x003e;
        r0 = r4.zzanm;
        r0 = r0.zzaua;
        if (r0 == 0) goto L_0x003e;
        r0 = r4.zzanm;
        r0 = r0.zzaua;
        r0 = r0.zzfr();
        r3 = r6.zzctt;
        r0.zzcr(r3);
        r0 = super.zza(r5, r6);
        if (r0 != 0) goto L_0x0046;
        r5 = 0;
        goto L_0x0064;
        r0 = r4.zzanm;
        r0 = r0.zzfo();
        if (r0 == 0) goto L_0x0058;
        r5 = r4.zzc(r5, r6);
        if (r5 != 0) goto L_0x0058;
        r4.zzi(r1);
        goto L_0x0044;
        r5 = r4.zzanm;
        r5 = r5.zzfp();
        if (r5 != 0) goto L_0x0063;
        super.zza(r6, r1);
        r5 = 1;
        if (r5 != 0) goto L_0x0067;
        return r1;
        r4.zzaof = r2;
        goto L_0x007d;
        r0 = r6.zzcje;
        if (r0 == 0) goto L_0x0093;
        r0 = r6.zzcje;
        r0 = r0.zzmh();
        if (r0 == 0) goto L_0x0093;
        r5 = r4.zzb(r5, r6);
        if (r5 != 0) goto L_0x007d;
        return r1;
        r5 = new java.util.ArrayList;
        r6 = new java.lang.Integer[r2];
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r6[r1] = r0;
        r6 = java.util.Arrays.asList(r6);
        r5.<init>(r6);
        r4.zze(r5);
        return r2;
        r4.zzi(r1);
        r5 = "Response is neither banner nor native.";
        goto L_0x0012;
        r5 = new java.lang.IllegalStateException;
        r6 = "AdLoader API does not support custom rendering.";
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.zzahd, com.google.android.gms.internal.zzahd):boolean");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzkk zzkk, zzahd zzahd, boolean z) {
        return false;
    }

    public final boolean zzb(zzkk zzkk) {
        zzkk zzkk2 = zzkk;
        Object obj = (this.zzanm.zzauu != null && this.zzanm.zzauu.size() == 1 && ((Integer) this.zzanm.zzauu.get(0)).intValue() == 2) ? 1 : null;
        if (obj != null) {
            zzaky.e("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzi(0);
            return false;
        } else if (this.zzanm.zzaut == null) {
            return super.zzb(zzkk);
        } else {
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
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbw() {
        super.zzbw();
        zzahd zzahd = this.zzanm.zzaue;
        if (!(zzahd == null || zzahd.zzcje == null || !zzahd.zzcje.zzmg() || this.zzanm.zzaut == null)) {
            try {
                this.zzanm.zzaut.zza(this, zzn.zzz(this.zzanm.zzaiq));
            } catch (RemoteException e) {
                zzaky.zzc("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
            }
        }
    }

    public final void zzci() {
        if (this.zzanm.zzaue != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzanm.zzaue.zzcjg) && this.zzanm.zzaue.zzcje != null && this.zzanm.zzaue.zzcje.zzmh()) {
                zzby();
                return;
            }
        }
        super.zzci();
    }

    public final void zzcn() {
        if (this.zzanm.zzaue != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzanm.zzaue.zzcjg) && this.zzanm.zzaue.zzcje != null && this.zzanm.zzaue.zzcje.zzmh()) {
                zzbx();
                return;
            }
        }
        super.zzcn();
    }

    public final void zzcu() {
        zzaky.zzcz("Unexpected call to AdLoaderManager method");
    }

    public final boolean zzcv() {
        return zzcx() != null ? zzcx().zzcii : false;
    }

    public final boolean zzcw() {
        return zzcx() != null ? zzcx().zzcij : false;
    }

    public final void zzd(List<String> list) {
        zzbq.zzgn("setNativeTemplates must be called on the main UI thread.");
        this.zzanm.zzauy = list;
    }

    public final void zze(List<Integer> list) {
        zzbq.zzgn("setAllowedAdTypes must be called on the main UI thread.");
        this.zzanm.zzauu = list;
    }

    public final zzry zzs(String str) {
        zzbq.zzgn("getOnCustomClickListener must be called on the main UI thread.");
        return (zzry) this.zzanm.zzauo.get(str);
    }
}

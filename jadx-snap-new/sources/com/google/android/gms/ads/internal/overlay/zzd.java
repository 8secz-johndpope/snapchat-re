package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaip;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzyr;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.Collections;
import org.opencv.imgproc.Imgproc;

@zzabh
public class zzd extends zzyr implements zzw {
    private static int zzcmk = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;
    private zzaof zzcct;
    AdOverlayInfoParcel zzcml;
    private zzi zzcmm;
    private zzo zzcmn;
    private boolean zzcmo = false;
    private FrameLayout zzcmp;
    private CustomViewCallback zzcmq;
    private boolean zzcmr = false;
    private boolean zzcms = false;
    private zzh zzcmt;
    private boolean zzcmu = false;
    int zzcmv = 0;
    private final Object zzcmw = new Object();
    private Runnable zzcmx;
    private boolean zzcmy;
    private boolean zzcmz;
    private boolean zzcna = false;
    private boolean zzcnb = false;
    private boolean zzcnc = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zznk() {
        if (this.mActivity.isFinishing() && !this.zzcna) {
            this.zzcna = true;
            zzaof zzaof = this.zzcct;
            if (zzaof != null) {
                zzaof.zzag(this.zzcmv);
                synchronized (this.zzcmw) {
                    if (this.zzcmy || !this.zzcct.zzuh()) {
                    } else {
                        this.zzcmx = new zzf(this);
                        zzaij.zzdfn.postDelayed(this.zzcmx, ((Long) zzlc.zzio().zzd(zzoi.zzbpk)).longValue());
                        return;
                    }
                }
            }
            zznl();
        }
    }

    private final void zznn() {
        this.zzcct.zznn();
    }

    private final void zzs(boolean z) {
        int intValue = ((Integer) zzlc.zzio().zzd(zzoi.zzbvb)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzcmn = new zzo(this.mActivity, zzp, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzcml.zzcnp);
        this.zzcmt.addView(this.zzcmn, layoutParams);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:110:0x025e in {2, 9, 10, 15, 16, 19, 29, 32, 33, 35, 36, 42, 43, 44, 49, 52, 55, 56, 62, 63, 66, 67, 70, 71, 75, 78, 81, 84, 86, 89, 90, 95, 98, 103, 106, 107, 109} preds:[]
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
    private final void zzt(boolean r19) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r1.zzcmz;
        r2 = 1;
        if (r0 != 0) goto L_0x000c;
        r0 = r1.mActivity;
        r0.requestWindowFeature(r2);
        r0 = r1.mActivity;
        r0 = r0.getWindow();
        if (r0 == 0) goto L_0x0256;
        r3 = com.google.android.gms.common.util.zzs.isAtLeastN();
        if (r3 == 0) goto L_0x003e;
        r3 = com.google.android.gms.internal.zzoi.zzbuz;
        r4 = com.google.android.gms.internal.zzlc.zzio();
        r3 = r4.zzd(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x003e;
        com.google.android.gms.ads.internal.zzbt.zzel();
        r3 = r1.mActivity;
        r4 = r3.getResources();
        r4 = r4.getConfiguration();
        r3 = com.google.android.gms.internal.zzaij.zza(r3, r4);
        goto L_0x003f;
        r3 = 1;
        r4 = r1.zzcml;
        r4 = r4.zzcnu;
        r5 = 0;
        if (r4 == 0) goto L_0x0050;
        r4 = r1.zzcml;
        r4 = r4.zzcnu;
        r4 = r4.zzaqq;
        if (r4 == 0) goto L_0x0050;
        r4 = 1;
        goto L_0x0051;
        r4 = 0;
        r6 = r1.zzcms;
        if (r6 == 0) goto L_0x0057;
        if (r4 == 0) goto L_0x008d;
        if (r3 == 0) goto L_0x008d;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0.setFlags(r3, r3);
        r3 = com.google.android.gms.internal.zzoi.zzbpl;
        r4 = com.google.android.gms.internal.zzlc.zzio();
        r3 = r4.zzd(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x008d;
        r3 = com.google.android.gms.common.util.zzs.zzanv();
        if (r3 == 0) goto L_0x008d;
        r3 = r1.zzcml;
        r3 = r3.zzcnu;
        if (r3 == 0) goto L_0x008d;
        r3 = r1.zzcml;
        r3 = r3.zzcnu;
        r3 = r3.zzaqv;
        if (r3 == 0) goto L_0x008d;
        r3 = r0.getDecorView();
        r4 = 4098; // 0x1002 float:5.743E-42 double:2.0247E-320;
        r3.setSystemUiVisibility(r4);
        r3 = r1.zzcml;
        r3 = r3.zzcnm;
        r4 = 0;
        if (r3 == 0) goto L_0x009d;
        r3 = r1.zzcml;
        r3 = r3.zzcnm;
        r3 = r3.zzua();
        goto L_0x009e;
        r3 = r4;
        if (r3 == 0) goto L_0x00a5;
        r3 = r3.zzfz();
        goto L_0x00a6;
        r3 = 0;
        r1.zzcmu = r5;
        if (r3 == 0) goto L_0x00e8;
        r6 = r1.zzcml;
        r6 = r6.orientation;
        r7 = com.google.android.gms.ads.internal.zzbt.zzen();
        r7 = r7.zzrg();
        if (r6 != r7) goto L_0x00ca;
        r6 = r1.mActivity;
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.orientation;
        if (r6 != r2) goto L_0x00c7;
        r5 = 1;
        r1.zzcmu = r5;
        goto L_0x00e8;
        r6 = r1.zzcml;
        r6 = r6.orientation;
        r7 = com.google.android.gms.ads.internal.zzbt.zzen();
        r7 = r7.zzrh();
        if (r6 != r7) goto L_0x00e8;
        r6 = r1.mActivity;
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.orientation;
        r7 = 2;
        if (r6 != r7) goto L_0x00c7;
        goto L_0x00c6;
        r5 = r1.zzcmu;
        r6 = 46;
        r7 = new java.lang.StringBuilder;
        r7.<init>(r6);
        r6 = "Delay onShow to next orientation change: ";
        r7.append(r6);
        r7.append(r5);
        r5 = r7.toString();
        com.google.android.gms.internal.zzaky.zzby(r5);
        r5 = r1.zzcml;
        r5 = r5.orientation;
        r1.setRequestedOrientation(r5);
        r5 = com.google.android.gms.ads.internal.zzbt.zzen();
        r0 = r5.zza(r0);
        if (r0 == 0) goto L_0x0116;
        r0 = "Hardware acceleration on the AdActivity window enabled.";
        com.google.android.gms.internal.zzaky.zzby(r0);
        r0 = r1.zzcms;
        if (r0 != 0) goto L_0x011f;
        r0 = r1.zzcmt;
        r5 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        goto L_0x0123;
        r0 = r1.zzcmt;
        r5 = zzcmk;
        r0.setBackgroundColor(r5);
        r0 = r1.mActivity;
        r5 = r1.zzcmt;
        r0.setContentView(r5);
        r1.zzcmz = r2;
        if (r19 == 0) goto L_0x0200;
        r6 = com.google.android.gms.ads.internal.zzbt.zzem();	 Catch:{ Exception -> 0x01f2 }
        r7 = r1.mActivity;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        if (r0 == 0) goto L_0x0147;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzty();	 Catch:{ Exception -> 0x01f2 }
        r8 = r0;	 Catch:{ Exception -> 0x01f2 }
        goto L_0x0148;	 Catch:{ Exception -> 0x01f2 }
        r8 = r4;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        if (r0 == 0) goto L_0x0158;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zztz();	 Catch:{ Exception -> 0x01f2 }
        r9 = r0;	 Catch:{ Exception -> 0x01f2 }
        goto L_0x0159;	 Catch:{ Exception -> 0x01f2 }
        r9 = r4;	 Catch:{ Exception -> 0x01f2 }
        r10 = 1;	 Catch:{ Exception -> 0x01f2 }
        r12 = 0;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r13 = r0.zzatz;	 Catch:{ Exception -> 0x01f2 }
        r14 = 0;	 Catch:{ Exception -> 0x01f2 }
        r15 = 0;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        if (r0 == 0) goto L_0x0172;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcml;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzcnm;	 Catch:{ Exception -> 0x01f2 }
        r0 = r0.zzbo();	 Catch:{ Exception -> 0x01f2 }
        r16 = r0;	 Catch:{ Exception -> 0x01f2 }
        goto L_0x0174;	 Catch:{ Exception -> 0x01f2 }
        r16 = r4;	 Catch:{ Exception -> 0x01f2 }
        r17 = com.google.android.gms.internal.zziu.zzhp();	 Catch:{ Exception -> 0x01f2 }
        r11 = r3;	 Catch:{ Exception -> 0x01f2 }
        r0 = r6.zza(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x01f2 }
        r1.zzcct = r0;	 Catch:{ Exception -> 0x01f2 }
        r0 = r1.zzcct;
        r5 = r0.zzua();
        r6 = 0;
        r7 = 0;
        r0 = r1.zzcml;
        r8 = r0.zzcnn;
        r0 = r1.zzcml;
        r9 = r0.zzcnr;
        r10 = 1;
        r11 = 0;
        r0 = r1.zzcml;
        r0 = r0.zzcnm;
        if (r0 == 0) goto L_0x01a3;
        r0 = r1.zzcml;
        r0 = r0.zzcnm;
        r0 = r0.zzua();
        r4 = r0.zzun();
        r12 = r4;
        r13 = 0;
        r14 = 0;
        r5.zza(r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r0 = r1.zzcct;
        r0 = r0.zzua();
        r4 = com.google.android.gms.ads.internal.overlay.zze.zzcnd;
        r0.zza(r4);
        r0 = r1.zzcml;
        r0 = r0.url;
        if (r0 == 0) goto L_0x01c4;
        r0 = r1.zzcct;
        r4 = r1.zzcml;
        r4 = r4.url;
        r0.loadUrl(r4);
        goto L_0x01dc;
        r0 = r1.zzcml;
        r0 = r0.zzcnq;
        if (r0 == 0) goto L_0x01ea;
        r4 = r1.zzcct;
        r0 = r1.zzcml;
        r5 = r0.zzcno;
        r0 = r1.zzcml;
        r6 = r0.zzcnq;
        r9 = 0;
        r7 = "text/html";
        r8 = "UTF-8";
        r4.loadDataWithBaseURL(r5, r6, r7, r8, r9);
        r0 = r1.zzcml;
        r0 = r0.zzcnm;
        if (r0 == 0) goto L_0x020d;
        r0 = r1.zzcml;
        r0 = r0.zzcnm;
        r0.zzb(r1);
        goto L_0x020d;
        r0 = new com.google.android.gms.ads.internal.overlay.zzg;
        r2 = "No URL or HTML to display in ad overlay.";
        r0.<init>(r2);
        throw r0;
        r0 = move-exception;
        r2 = "Error obtaining webview.";
        com.google.android.gms.internal.zzaky.zzb(r2, r0);
        r0 = new com.google.android.gms.ads.internal.overlay.zzg;
        r2 = "Could not obtain webview for the overlay.";
        r0.<init>(r2);
        throw r0;
        r0 = r1.zzcml;
        r0 = r0.zzcnm;
        r1.zzcct = r0;
        r0 = r1.zzcct;
        r4 = r1.mActivity;
        r0.setContext(r4);
        r0 = r1.zzcct;
        r0.zza(r1);
        r0 = r1.zzcct;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x0229;
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x0229;
        r0 = (android.view.ViewGroup) r0;
        r4 = r1.zzcct;
        r4 = r4.getView();
        r0.removeView(r4);
        r0 = r1.zzcms;
        if (r0 == 0) goto L_0x0232;
        r0 = r1.zzcct;
        r0.zzul();
        r0 = r1.zzcmt;
        r4 = r1.zzcct;
        r4 = r4.getView();
        r5 = -1;
        r0.addView(r4, r5, r5);
        if (r19 != 0) goto L_0x0247;
        r0 = r1.zzcmu;
        if (r0 != 0) goto L_0x0247;
        r18.zznn();
        r1.zzs(r3);
        r0 = r1.zzcct;
        r0 = r0.zzub();
        if (r0 == 0) goto L_0x0255;
        r1.zza(r3, r2);
        return;
        r0 = new com.google.android.gms.ads.internal.overlay.zzg;
        r2 = "Invalid activity, no window available.";
        r0.<init>(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zzt(boolean):void");
    }

    public final void close() {
        this.zzcmv = 2;
        this.mActivity.finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.zzcmv = 0;
    }

    public void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzcmr = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.zzcml = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            if (this.zzcml != null) {
                if (this.zzcml.zzatz.zzdja > 7500000) {
                    this.zzcmv = 3;
                }
                if (this.mActivity.getIntent() != null) {
                    this.zzcnc = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzcml.zzcnu != null) {
                    this.zzcms = this.zzcml.zzcnu.zzaqp;
                } else {
                    this.zzcms = false;
                }
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrz)).booleanValue() && this.zzcms && this.zzcml.zzcnu.zzaqu != -1) {
                    new zzj(this, null).zzqj();
                }
                if (bundle == null) {
                    if (this.zzcml.zzcnl != null && this.zzcnc) {
                        this.zzcml.zzcnl.zzcg();
                    }
                    if (!(this.zzcml.zzcns == 1 || this.zzcml.zzcnk == null)) {
                        this.zzcml.zzcnk.onAdClicked();
                    }
                }
                this.zzcmt = new zzh(this.mActivity, this.zzcml.zzcnt, this.zzcml.zzatz.zzcu);
                this.zzcmt.setId(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
                int i = this.zzcml.zzcns;
                if (i == 1) {
                    zzt(false);
                    return;
                } else if (i == 2) {
                    this.zzcmm = new zzi(this.zzcml.zzcnm);
                    zzt(false);
                    return;
                } else if (i == 3) {
                    zzt(true);
                    return;
                } else {
                    throw new zzg("Could not determine ad overlay type.");
                }
            }
            throw new zzg("Could not get info for ad overlay.");
        } catch (zzg e) {
            zzaky.zzcz(e.getMessage());
            this.zzcmv = 3;
            this.mActivity.finish();
        }
    }

    public final void onDestroy() {
        zzaof zzaof = this.zzcct;
        if (zzaof != null) {
            this.zzcmt.removeView(zzaof.getView());
        }
        zznk();
    }

    public final void onPause() {
        zzng();
        if (this.zzcml.zzcnl != null) {
            this.zzcml.zzcnl.onPause();
        }
        if (!(((Boolean) zzlc.zzio().zzd(zzoi.zzbva)).booleanValue() || this.zzcct == null || (this.mActivity.isFinishing() && this.zzcmm != null))) {
            zzbt.zzen();
            zzaip.zzh(this.zzcct);
        }
        zznk();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.zzcml.zzcnl != null) {
            this.zzcml.zzcnl.onResume();
        }
        if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbva)).booleanValue()) {
            zzaof zzaof = this.zzcct;
            if (zzaof == null || zzaof.isDestroyed()) {
                zzaky.zzcz("The webview does not exist. Ignoring action.");
            } else {
                zzbt.zzen();
                zzaip.zzi(this.zzcct);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzcmr);
    }

    public final void onStart() {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbva)).booleanValue()) {
            zzaof zzaof = this.zzcct;
            if (zzaof == null || zzaof.isDestroyed()) {
                zzaky.zzcz("The webview does not exist. Ignoring action.");
            } else {
                zzbt.zzen();
                zzaip.zzi(this.zzcct);
            }
        }
    }

    public final void onStop() {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbva)).booleanValue() && this.zzcct != null && (!this.mActivity.isFinishing() || this.zzcmm == null)) {
            zzbt.zzen();
            zzaip.zzh(this.zzcct);
        }
        zznk();
    }

    public final void setRequestedOrientation(int i) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzlc.zzio().zzd(zzoi.zzbvx)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzlc.zzio().zzd(zzoi.zzbvy)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) zzlc.zzio().zzd(zzoi.zzbvz)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) zzlc.zzio().zzd(zzoi.zzbwa)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.mActivity.setRequestedOrientation(i);
    }

    public final void zza(View view, CustomViewCallback customViewCallback) {
        this.zzcmp = new FrameLayout(this.mActivity);
        this.zzcmp.setBackgroundColor(-16777216);
        this.zzcmp.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzcmp);
        this.zzcmz = true;
        this.zzcmq = customViewCallback;
        this.zzcmo = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A:{SKIP} */
    public final void zza(boolean r7, boolean r8) {
        /*
        r6 = this;
        r0 = com.google.android.gms.internal.zzoi.zzbpm;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0026;
    L_0x0014:
        r0 = r6.zzcml;
        if (r0 == 0) goto L_0x0026;
    L_0x0018:
        r0 = r0.zzcnu;
        if (r0 == 0) goto L_0x0026;
    L_0x001c:
        r0 = r6.zzcml;
        r0 = r0.zzcnu;
        r0 = r0.zzaqw;
        if (r0 == 0) goto L_0x0026;
    L_0x0024:
        r0 = 1;
        goto L_0x0027;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        if (r7 == 0) goto L_0x003b;
    L_0x0029:
        if (r8 == 0) goto L_0x003b;
    L_0x002b:
        if (r0 == 0) goto L_0x003b;
    L_0x002d:
        r3 = new com.google.android.gms.internal.zzyn;
        r4 = r6.zzcct;
        r5 = "useCustomClose";
        r3.<init>(r4, r5);
        r4 = "Custom close has been disabled for interstitial ads in this ad slot.";
        r3.zzbm(r4);
    L_0x003b:
        r3 = r6.zzcmn;
        if (r3 == 0) goto L_0x0048;
    L_0x003f:
        if (r8 == 0) goto L_0x0044;
    L_0x0041:
        if (r0 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0045;
    L_0x0044:
        r1 = 0;
    L_0x0045:
        r3.zza(r7, r1);
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zza(boolean, boolean):void");
    }

    public final void zzbd() {
        this.zzcmz = true;
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbuz)).booleanValue() && zzs.isAtLeastN()) {
            Configuration configuration = (Configuration) zzn.zzy(iObjectWrapper);
            zzbt.zzel();
            if (zzaij.zza(this.mActivity, configuration)) {
                this.mActivity.getWindow().addFlags(Imgproc.INTER_TAB_SIZE2);
                this.mActivity.getWindow().clearFlags(ItemAnimator.FLAG_MOVED);
                return;
            }
            this.mActivity.getWindow().addFlags(ItemAnimator.FLAG_MOVED);
            this.mActivity.getWindow().clearFlags(Imgproc.INTER_TAB_SIZE2);
        }
    }

    public final void zzng() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzcml;
        if (adOverlayInfoParcel != null && this.zzcmo) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzcmp != null) {
            this.mActivity.setContentView(this.zzcmt);
            this.zzcmz = true;
            this.zzcmp.removeAllViews();
            this.zzcmp = null;
        }
        CustomViewCallback customViewCallback = this.zzcmq;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzcmq = null;
        }
        this.zzcmo = false;
    }

    public final void zznh() {
        this.zzcmv = 1;
        this.mActivity.finish();
    }

    public final boolean zzni() {
        this.zzcmv = 0;
        zzaof zzaof = this.zzcct;
        if (zzaof == null) {
            return true;
        }
        boolean zzuf = zzaof.zzuf();
        if (!zzuf) {
            this.zzcct.zza("onbackblocked", Collections.emptyMap());
        }
        return zzuf;
    }

    public final void zznj() {
        this.zzcmt.removeView(this.zzcmn);
        zzs(true);
    }

    /* Access modifiers changed, original: final */
    public final void zznl() {
        if (!this.zzcnb) {
            this.zzcnb = true;
            zzaof zzaof = this.zzcct;
            if (zzaof != null) {
                this.zzcmt.removeView(zzaof.getView());
                zzi zzi = this.zzcmm;
                if (zzi != null) {
                    this.zzcct.setContext(zzi.zzaiq);
                    this.zzcct.zzah(false);
                    this.zzcmm.parent.addView(this.zzcct.getView(), this.zzcmm.index, this.zzcmm.zzcng);
                    this.zzcmm = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzcct.setContext(this.mActivity.getApplicationContext());
                }
                this.zzcct = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzcml;
            if (!(adOverlayInfoParcel == null || adOverlayInfoParcel.zzcnl == null)) {
                this.zzcml.zzcnl.zzcf();
            }
        }
    }

    public final void zznm() {
        if (this.zzcmu) {
            this.zzcmu = false;
            zznn();
        }
    }

    public final void zzno() {
        this.zzcmt.zzcnf = true;
    }

    public final void zznp() {
        synchronized (this.zzcmw) {
            this.zzcmy = true;
            if (this.zzcmx != null) {
                zzaij.zzdfn.removeCallbacks(this.zzcmx);
                zzaij.zzdfn.post(this.zzcmx);
            }
        }
    }
}

package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.brightcove.player.event.Event;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.zzs;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.ppy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
final class zzaqe extends zzaqh implements OnGlobalLayoutListener, DownloadListener, zzaof {
    private String zzalv;
    private final zzv zzanp;
    private final zzala zzapq;
    private zzakn zzavk;
    private final WindowManager zzavz;
    private final zzcv zzbyz;
    private int zzcly = -1;
    private int zzclz = -1;
    private int zzcmb = -1;
    private int zzcmc = -1;
    private String zzcwj = "";
    private zzot zzdnt;
    private final zzbm zzdqn;
    private zzd zzdqq;
    private zzaqa zzdqr;
    private boolean zzdqs;
    private boolean zzdqt;
    private boolean zzdqu;
    private boolean zzdqv;
    private int zzdqw;
    private boolean zzdqx = true;
    private boolean zzdqy = false;
    private zzaou zzdqz;
    private boolean zzdra;
    private boolean zzdrb;
    private zzpt zzdrc;
    private int zzdrd;
    private int zzdre;
    private zzot zzdrf;
    private zzot zzdrg;
    private zzou zzdrh;
    private WeakReference<OnClickListener> zzdri;
    private zzd zzdrj;
    private boolean zzdrk;
    private Map<String, zzany> zzdrl;
    private zzaqb zzdsr;
    private float zzdss;

    private zzaqe(zzapz zzapz, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        super(zzapz);
        this.zzdqr = zzaqa;
        this.zzalv = str;
        this.zzdqu = z;
        this.zzdqw = -1;
        this.zzbyz = zzcv;
        this.zzapq = zzala;
        this.zzdqn = zzbm;
        this.zzanp = zzv;
        this.zzavz = (WindowManager) getContext().getSystemService("window");
        this.zzavk = new zzakn(zzvo().zztj(), this, this, null);
        zzbt.zzel().zza((Context) zzapz, zzala.zzcu, getSettings());
        setDownloadListener(this);
        this.zzdss = zzvo().getResources().getDisplayMetrics().density;
        zzvd();
        if (zzs.zzant()) {
            addJavascriptInterface(zzaox.zzl(this), "googleAdsJsInterface");
        }
        zzvh();
        this.zzdrh = new zzou(new zzov(true, "make_wv", this.zzalv));
        this.zzdrh.zzjn().zzc(zzov);
        this.zzdnt = zzoo.zzb(this.zzdrh.zzjn());
        this.zzdrh.zza("native:view_create", this.zzdnt);
        this.zzdrg = null;
        this.zzdrf = null;
        zzbt.zzen().zzat(zzapz);
    }

    private final void zzal(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? SCamera.CAMERA_ID_FRONT : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    static zzaqe zzc(Context context, zzaqa zzaqa, String str, boolean z, boolean z2, zzcv zzcv, zzala zzala, zzov zzov, zzbm zzbm, zzv zzv, zziu zziu) {
        Context context2 = context;
        return new zzaqe(new zzapz(context), zzaqa, str, z, z2, zzcv, zzala, zzov, zzbm, zzv, zziu);
    }

    private final synchronized void zzqc() {
        if (!this.zzdrk) {
            this.zzdrk = true;
            zzbt.zzep().zzqc();
        }
    }

    private final boolean zzva() {
        boolean z = false;
        if (!this.zzdsr.zzfz() && !this.zzdsr.zzuo()) {
            return false;
        }
        int i;
        int i2;
        zzbt.zzel();
        DisplayMetrics zza = zzaij.zza(this.zzavz);
        zzlc.zzij();
        int zzb = zzako.zzb(zza, zza.widthPixels);
        zzlc.zzij();
        int zzb2 = zzako.zzb(zza, zza.heightPixels);
        Activity zztj = zzvo().zztj();
        if (zztj == null || zztj.getWindow() == null) {
            i = zzb;
            i2 = zzb2;
        } else {
            zzbt.zzel();
            int[] zzf = zzaij.zzf(zztj);
            zzlc.zzij();
            i = zzako.zzb(zza, zzf[0]);
            zzlc.zzij();
            i2 = zzako.zzb(zza, zzf[1]);
        }
        if (this.zzcly == zzb && this.zzclz == zzb2 && this.zzcmb == i && this.zzcmc == i2) {
            return false;
        }
        if (!(this.zzcly == zzb && this.zzclz == zzb2)) {
            z = true;
        }
        this.zzcly = zzb;
        this.zzclz = zzb2;
        this.zzcmb = i;
        this.zzcmc = i2;
        new zzyn(this).zza(zzb, zzb2, i, i2, zza.density, this.zzavz.getDefaultDisplay().getRotation());
        return z;
    }

    private final void zzvc() {
        zzoo.zza(this.zzdrh.zzjn(), this.zzdnt, "aeh2");
    }

    private final synchronized void zzvd() {
        if (!this.zzdqu) {
            if (!this.zzdqr.zzvl()) {
                if (VERSION.SDK_INT < 18) {
                    zzaky.zzby("Disabling hardware acceleration on an AdView.");
                    zzve();
                    return;
                }
                zzaky.zzby("Enabling hardware acceleration on an AdView.");
                zzvf();
                return;
            }
        }
        zzaky.zzby("Enabling hardware acceleration on an overlay.");
        zzvf();
    }

    private final synchronized void zzve() {
        if (!this.zzdqv) {
            zzbt.zzen().zzy(this);
        }
        this.zzdqv = true;
    }

    private final synchronized void zzvf() {
        if (this.zzdqv) {
            zzbt.zzen().zzx(this);
        }
        this.zzdqv = false;
    }

    private final synchronized void zzvg() {
        this.zzdrl = null;
    }

    private final void zzvh() {
        zzou zzou = this.zzdrh;
        if (zzou != null) {
            zzov zzjn = zzou.zzjn();
            if (!(zzjn == null || zzbt.zzep().zzpv() == null)) {
                zzbt.zzep().zzpv().zza(zzjn);
            }
        }
    }

    public final synchronized void destroy() {
        zzvh();
        this.zzavk.zzrw();
        if (this.zzdqq != null) {
            this.zzdqq.close();
            this.zzdqq.onDestroy();
            this.zzdqq = null;
        }
        zzaqb.reset();
        if (!this.zzdqt) {
            zzbt.zzff();
            zzanx.zzb((zzann) this);
            zzvg();
            this.zzdqt = true;
            zzahw.v("Initiating WebView self destruct sequence in 3...");
            zzahw.v("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                zzbt.zzep().zza(e, "AdWebViewImpl.loadUrlUnsafe");
                zzaky.zzc("Could not call loadUrl. ", e);
            }
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            return;
     */
    @android.annotation.TargetApi(19)
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.isDestroyed();	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r2 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.zzaky.zzcz(r2);	 Catch:{ all -> 0x0019 }
        if (r3 == 0) goto L_0x0012;
    L_0x000e:
        r2 = 0;
        r3.onReceiveValue(r2);	 Catch:{ all -> 0x0019 }
    L_0x0012:
        monitor-exit(r1);
        return;
    L_0x0014:
        super.evaluateJavascript(r2, r3);	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);
        return;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaqe.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.zzdqt) {
                    zzaqb.reset();
                    zzbt.zzff();
                    zzanx.zzb((zzann) this);
                    zzvg();
                    zzqc();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.zzdri.get();
    }

    public final synchronized String getRequestId() {
        return this.zzcwj;
    }

    public final synchronized int getRequestedOrientation() {
        return this.zzdqw;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final synchronized boolean isDestroyed() {
        return this.zzdqt;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (isDestroyed()) {
            zzaky.zzcz("The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (isDestroyed()) {
            zzaky.zzcz("The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public final synchronized void loadUrl(String str) {
        if (isDestroyed()) {
            zzaky.zzcz("The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzavk.onAttachedToWindow();
        }
        boolean z = this.zzdra;
        if (this.zzdsr != null && this.zzdsr.zzuo()) {
            if (!this.zzdrb) {
                OnGlobalLayoutListener zzup = this.zzdsr.zzup();
                if (zzup != null) {
                    zzbt.zzfg();
                    zzaml.zza((View) this, zzup);
                }
                OnScrollChangedListener zzuq = this.zzdsr.zzuq();
                if (zzuq != null) {
                    zzbt.zzfg();
                    zzaml.zza((View) this, zzuq);
                }
                this.zzdrb = true;
            }
            zzva();
            z = true;
        }
        zzal(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzavk.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzdrb && this.zzdsr != null && this.zzdsr.zzuo() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener zzup = this.zzdsr.zzup();
                if (zzup != null) {
                    zzbt.zzen().zza(getViewTreeObserver(), zzup);
                }
                OnScrollChangedListener zzuq = this.zzdsr.zzuq();
                if (zzuq != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(zzuq);
                }
                this.zzdrb = false;
            }
        }
        zzal(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzbt.zzel();
            zzaij.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length());
            stringBuilder.append("Couldn't find an Activity to view url/mimetype: ");
            stringBuilder.append(str);
            stringBuilder.append(" / ");
            stringBuilder.append(str4);
            zzaky.zzby(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                zzaqb zzaqb = this.zzdsr;
                if (!(zzaqb == null || zzaqb.zzuy() == null)) {
                    this.zzdsr.zzuy().zzdb();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbou)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > MapboxConstants.MINIMUM_ZOOM && !canScrollVertically(-1)) || ((axisValue < MapboxConstants.MINIMUM_ZOOM && !canScrollVertically(1)) || ((axisValue2 > MapboxConstants.MINIMUM_ZOOM && !canScrollHorizontally(-1)) || (axisValue2 < MapboxConstants.MINIMUM_ZOOM && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzva = zzva();
        zzd zztw = zztw();
        if (zztw != null && zzva) {
            zztw.zznm();
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01aa A:{SYNTHETIC, Splitter:B:98:0x01aa} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01aa A:{SYNTHETIC, Splitter:B:98:0x01aa} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    public final synchronized void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.isDestroyed();	 Catch:{ all -> 0x01c5 }
        r1 = 0;
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r7.setMeasuredDimension(r1, r1);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x000d:
        r0 = r7.isInEditMode();	 Catch:{ all -> 0x01c5 }
        if (r0 != 0) goto L_0x01c0;
    L_0x0013:
        r0 = r7.zzdqu;	 Catch:{ all -> 0x01c5 }
        if (r0 != 0) goto L_0x01c0;
    L_0x0017:
        r0 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r0 = r0.zzvm();	 Catch:{ all -> 0x01c5 }
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        goto L_0x01c0;
    L_0x0021:
        r0 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r0 = r0.zzvn();	 Catch:{ all -> 0x01c5 }
        if (r0 == 0) goto L_0x006b;
    L_0x0029:
        r0 = r7.zzth();	 Catch:{ all -> 0x01c5 }
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r0.getAspectRatio();	 Catch:{ all -> 0x01c5 }
        goto L_0x0036;
    L_0x0035:
        r0 = 0;
    L_0x0036:
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 != 0) goto L_0x003f;
    L_0x003a:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x003f:
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01c5 }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01c5 }
        r1 = (float) r9;	 Catch:{ all -> 0x01c5 }
        r1 = r1 * r0;
        r1 = (int) r1;	 Catch:{ all -> 0x01c5 }
        r2 = (float) r8;	 Catch:{ all -> 0x01c5 }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x01c5 }
        if (r9 != 0) goto L_0x0056;
    L_0x004f:
        if (r2 == 0) goto L_0x0056;
    L_0x0051:
        r9 = (float) r2;	 Catch:{ all -> 0x01c5 }
        r9 = r9 * r0;
        r1 = (int) r9;	 Catch:{ all -> 0x01c5 }
        r9 = r2;
        goto L_0x005e;
    L_0x0056:
        if (r8 != 0) goto L_0x005e;
    L_0x0058:
        if (r1 == 0) goto L_0x005e;
    L_0x005a:
        r8 = (float) r1;	 Catch:{ all -> 0x01c5 }
        r8 = r8 / r0;
        r2 = (int) r8;	 Catch:{ all -> 0x01c5 }
        r8 = r1;
    L_0x005e:
        r8 = java.lang.Math.min(r1, r8);	 Catch:{ all -> 0x01c5 }
        r9 = java.lang.Math.min(r2, r9);	 Catch:{ all -> 0x01c5 }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x006b:
        r0 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r0 = r0.isFluid();	 Catch:{ all -> 0x01c5 }
        if (r0 == 0) goto L_0x00ba;
    L_0x0073:
        r0 = com.google.android.gms.internal.zzoi.zzbsx;	 Catch:{ all -> 0x01c5 }
        r1 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x01c5 }
        r0 = r1.zzd(r0);	 Catch:{ all -> 0x01c5 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x01c5 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x01c5 }
        if (r0 != 0) goto L_0x00b5;
    L_0x0085:
        r0 = com.google.android.gms.common.util.zzs.zzant();	 Catch:{ all -> 0x01c5 }
        if (r0 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x00b5;
    L_0x008c:
        r0 = "/contentHeight";
        r1 = new com.google.android.gms.internal.zzaqf;	 Catch:{ all -> 0x01c5 }
        r1.<init>(r7);	 Catch:{ all -> 0x01c5 }
        r7.zza(r0, r1);	 Catch:{ all -> 0x01c5 }
        r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
        r7.zzdj(r0);	 Catch:{ all -> 0x01c5 }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01c5 }
        r0 = r7.zzdre;	 Catch:{ all -> 0x01c5 }
        r1 = -1;
        if (r0 == r1) goto L_0x00ac;
    L_0x00a4:
        r9 = r7.zzdre;	 Catch:{ all -> 0x01c5 }
        r9 = (float) r9;	 Catch:{ all -> 0x01c5 }
        r0 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r9 = r9 * r0;
        r9 = (int) r9;	 Catch:{ all -> 0x01c5 }
        goto L_0x00b0;
    L_0x00ac:
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01c5 }
    L_0x00b0:
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x00b5:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x00ba:
        r0 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r0 = r0.zzvl();	 Catch:{ all -> 0x01c5 }
        if (r0 == 0) goto L_0x00d9;
    L_0x00c2:
        r8 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x01c5 }
        r8.<init>();	 Catch:{ all -> 0x01c5 }
        r9 = r7.zzavz;	 Catch:{ all -> 0x01c5 }
        r9 = r9.getDefaultDisplay();	 Catch:{ all -> 0x01c5 }
        r9.getMetrics(r8);	 Catch:{ all -> 0x01c5 }
        r9 = r8.widthPixels;	 Catch:{ all -> 0x01c5 }
        r8 = r8.heightPixels;	 Catch:{ all -> 0x01c5 }
        r7.setMeasuredDimension(r9, r8);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x00d9:
        r0 = android.view.View.MeasureSpec.getMode(r8);	 Catch:{ all -> 0x01c5 }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01c5 }
        r2 = android.view.View.MeasureSpec.getMode(r9);	 Catch:{ all -> 0x01c5 }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01c5 }
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r0 == r4) goto L_0x00f9;
    L_0x00f2:
        if (r0 != r3) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00f9;
    L_0x00f5:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x00fa;
    L_0x00f9:
        r0 = r8;
    L_0x00fa:
        if (r2 == r4) goto L_0x00fe;
    L_0x00fc:
        if (r2 != r3) goto L_0x00ff;
    L_0x00fe:
        r5 = r9;
    L_0x00ff:
        r2 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r2 = r2.widthPixels;	 Catch:{ all -> 0x01c5 }
        r3 = 1;
        if (r2 > r0) goto L_0x010f;
    L_0x0106:
        r2 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r2 = r2.heightPixels;	 Catch:{ all -> 0x01c5 }
        if (r2 <= r5) goto L_0x010d;
    L_0x010c:
        goto L_0x010f;
    L_0x010d:
        r2 = 0;
        goto L_0x0110;
    L_0x010f:
        r2 = 1;
    L_0x0110:
        r4 = com.google.android.gms.internal.zzoi.zzbvq;	 Catch:{ all -> 0x01c5 }
        r6 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x01c5 }
        r4 = r6.zzd(r4);	 Catch:{ all -> 0x01c5 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01c5 }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01c5 }
        if (r4 == 0) goto L_0x0148;
    L_0x0122:
        r4 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r4 = r4.widthPixels;	 Catch:{ all -> 0x01c5 }
        r4 = (float) r4;	 Catch:{ all -> 0x01c5 }
        r6 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r4 = r4 / r6;
        r0 = (float) r0;	 Catch:{ all -> 0x01c5 }
        r6 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r0 = r0 / r6;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0143;
    L_0x0132:
        r0 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x01c5 }
        r0 = (float) r0;	 Catch:{ all -> 0x01c5 }
        r4 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r0 = r0 / r4;
        r4 = (float) r5;	 Catch:{ all -> 0x01c5 }
        r5 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r4 = r4 / r5;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0143;
    L_0x0142:
        goto L_0x0144;
    L_0x0143:
        r3 = 0;
    L_0x0144:
        if (r2 != 0) goto L_0x0147;
    L_0x0146:
        goto L_0x0148;
    L_0x0147:
        r2 = r3;
    L_0x0148:
        r0 = 8;
        if (r2 == 0) goto L_0x01aa;
    L_0x014c:
        r2 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r2 = r2.widthPixels;	 Catch:{ all -> 0x01c5 }
        r2 = (float) r2;	 Catch:{ all -> 0x01c5 }
        r3 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r2 = r2 / r3;
        r2 = (int) r2;	 Catch:{ all -> 0x01c5 }
        r3 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r3 = r3.heightPixels;	 Catch:{ all -> 0x01c5 }
        r3 = (float) r3;	 Catch:{ all -> 0x01c5 }
        r4 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r3 = r3 / r4;
        r3 = (int) r3;	 Catch:{ all -> 0x01c5 }
        r8 = (float) r8;	 Catch:{ all -> 0x01c5 }
        r4 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r8 = r8 / r4;
        r8 = (int) r8;	 Catch:{ all -> 0x01c5 }
        r9 = (float) r9;	 Catch:{ all -> 0x01c5 }
        r4 = r7.zzdss;	 Catch:{ all -> 0x01c5 }
        r9 = r9 / r4;
        r9 = (int) r9;	 Catch:{ all -> 0x01c5 }
        r4 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01c5 }
        r5.<init>(r4);	 Catch:{ all -> 0x01c5 }
        r4 = "Not enough space to show ad. Needs ";
        r5.append(r4);	 Catch:{ all -> 0x01c5 }
        r5.append(r2);	 Catch:{ all -> 0x01c5 }
        r2 = "x";
        r5.append(r2);	 Catch:{ all -> 0x01c5 }
        r5.append(r3);	 Catch:{ all -> 0x01c5 }
        r2 = " dp, but only has ";
        r5.append(r2);	 Catch:{ all -> 0x01c5 }
        r5.append(r8);	 Catch:{ all -> 0x01c5 }
        r8 = "x";
        r5.append(r8);	 Catch:{ all -> 0x01c5 }
        r5.append(r9);	 Catch:{ all -> 0x01c5 }
        r8 = " dp.";
        r5.append(r8);	 Catch:{ all -> 0x01c5 }
        r8 = r5.toString();	 Catch:{ all -> 0x01c5 }
        com.google.android.gms.internal.zzaky.zzcz(r8);	 Catch:{ all -> 0x01c5 }
        r8 = r7.getVisibility();	 Catch:{ all -> 0x01c5 }
        if (r8 == r0) goto L_0x01a5;
    L_0x01a1:
        r8 = 4;
        r7.setVisibility(r8);	 Catch:{ all -> 0x01c5 }
    L_0x01a5:
        r7.setMeasuredDimension(r1, r1);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x01aa:
        r8 = r7.getVisibility();	 Catch:{ all -> 0x01c5 }
        if (r8 == r0) goto L_0x01b3;
    L_0x01b0:
        r7.setVisibility(r1);	 Catch:{ all -> 0x01c5 }
    L_0x01b3:
        r8 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r8 = r8.widthPixels;	 Catch:{ all -> 0x01c5 }
        r9 = r7.zzdqr;	 Catch:{ all -> 0x01c5 }
        r9 = r9.heightPixels;	 Catch:{ all -> 0x01c5 }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x01c0:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01c5 }
        monitor-exit(r7);
        return;
    L_0x01c5:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaqe.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zzaky.zzb("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zzaky.zzb("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzdsr.zzuo()) {
            synchronized (this) {
                if (this.zzdrc != null) {
                    this.zzdrc.zzc(motionEvent);
                }
            }
        } else {
            zzcv zzcv = this.zzbyz;
            if (zzcv != null) {
                zzcv.zza(motionEvent);
            }
        }
        return isDestroyed() ? false : super.onTouchEvent(motionEvent);
    }

    public final void setContext(Context context) {
        zzvo().setBaseContext(context);
        this.zzavk.zzi(zzvo().zztj());
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.zzdri = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.zzdqw = i;
        if (this.zzdqq != null) {
            this.zzdqq.setRequestedOrientation(this.zzdqw);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzaqb) {
            this.zzdsr = (zzaqb) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzaky.zzb("Could not stop loading webview.", e);
            }
        }
    }

    public final void zza(zzc zzc) {
        zzaqb.zza(zzc);
    }

    public final synchronized void zza(zzd zzd) {
        this.zzdqq = zzd;
    }

    public final synchronized void zza(zzaou zzaou) {
        if (this.zzdqz != null) {
            zzaky.e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzdqz = zzaou;
        }
    }

    public final synchronized void zza(zzaqa zzaqa) {
        this.zzdqr = zzaqa;
        requestLayout();
    }

    public final void zza(zzgu zzgu) {
        synchronized (this) {
            this.zzdra = zzgu.zzakc;
        }
        zzal(zzgu.zzakc);
    }

    public final void zza(String str, zzt<? super zzaof> zzt) {
        zzaqb zzaqb = this.zzdsr;
        if (zzaqb != null) {
            zzaqb.zza(str, (zzt) zzt);
        }
    }

    public final void zza(String str, Map<String, ?> map) {
        try {
            zza(str, zzbt.zzel().zzq(map));
        } catch (JSONException unused) {
            zzaky.zzcz("Could not convert parameters to JSON.");
        }
    }

    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(ppy.b);
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        str = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        zzaky.zzby(jSONObject2.length() != 0 ? str.concat(jSONObject2) : new String(str));
        zzdj(stringBuilder.toString());
    }

    public final void zza(boolean z, int i) {
        zzaqb.zza(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        zzaqb.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzaqb.zza(z, i, str, str2);
    }

    public final void zzag(int i) {
        if (i == 0) {
            zzoo.zza(this.zzdrh.zzjn(), this.zzdnt, "aebb2");
        }
        zzvc();
        if (this.zzdrh.zzjn() != null) {
            this.zzdrh.zzjn().zzf("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzapq.zzcu);
        zza("onhide", hashMap);
    }

    public final void zzag(boolean z) {
        this.zzdsr.zzag(z);
    }

    public final synchronized void zzah(boolean z) {
        Object obj = z != this.zzdqu ? 1 : null;
        this.zzdqu = z;
        zzvd();
        if (obj != null) {
            new zzyn(this).zzbo(z ? "expanded" : "default");
        }
    }

    public final synchronized void zzai(boolean z) {
        if (this.zzdqq != null) {
            this.zzdqq.zza(this.zzdsr.zzfz(), z);
        } else {
            this.zzdqs = z;
        }
    }

    public final synchronized void zzaj(boolean z) {
        this.zzdqx = z;
    }

    public final synchronized void zzak(boolean z) {
        this.zzdrd += z ? 1 : -1;
        if (this.zzdrd <= 0 && this.zzdqq != null) {
            this.zzdqq.zznp();
        }
    }

    public final synchronized void zzb(zzd zzd) {
        this.zzdrj = zzd;
    }

    public final synchronized void zzb(zzpt zzpt) {
        this.zzdrc = zzpt;
    }

    public final void zzb(String str, zzt<? super zzaof> zzt) {
        if (this.zzdsr != null) {
            zzaqb.zzb(str, (zzt) zzt);
        }
    }

    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(jSONObject2).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        zzdj(stringBuilder.toString());
    }

    public final zzv zzbo() {
        return this.zzanp;
    }

    public final synchronized void zzc(String str, String str2, String str3) {
        if (isDestroyed()) {
            zzaky.zzcz("The webview is destroyed. Ignoring action.");
            return;
        }
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbow)).booleanValue()) {
            str2 = zzapp.zzb(str2, zzapp.zzvi());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    public final synchronized void zzcp() {
        this.zzdqy = true;
        if (this.zzdqn != null) {
            this.zzdqn.zzcp();
        }
    }

    public final synchronized void zzcq() {
        this.zzdqy = false;
        if (this.zzdqn != null) {
            this.zzdqn.zzcq();
        }
    }

    public final synchronized void zzde(String str) {
        if (str == null) {
            try {
                str = "";
            } catch (Throwable th) {
            }
        }
        this.zzcwj = str;
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void zzdj(String str) {
        if (isDestroyed()) {
            zzaky.zzcz("The webview is destroyed. Ignoring action.");
        } else {
            super.zzdj(str);
        }
    }

    public final void zznn() {
        if (this.zzdrf == null) {
            zzoo.zza(this.zzdrh.zzjn(), this.zzdnt, "aes2");
            this.zzdrf = zzoo.zzb(this.zzdrh.zzjn());
            this.zzdrh.zza("native:view_show", this.zzdrf);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zzapq.zzcu);
        zza("onshow", hashMap);
    }

    public final void zzno() {
        zzd zztw = zztw();
        if (zztw != null) {
            zztw.zzno();
        }
    }

    public final zzane zztg() {
        return null;
    }

    public final synchronized zzaou zzth() {
        return this.zzdqz;
    }

    public final zzot zzti() {
        return this.zzdnt;
    }

    public final Activity zztj() {
        return zzvo().zztj();
    }

    public final zzou zztk() {
        return this.zzdrh;
    }

    public final zzala zztl() {
        return this.zzapq;
    }

    public final int zztm() {
        return getMeasuredHeight();
    }

    public final int zztn() {
        return getMeasuredWidth();
    }

    public final void zztt() {
        zzvc();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zzapq.zzcu);
        zza("onhide", hashMap);
    }

    public final void zztu() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbt.zzfj().zzdq()));
        hashMap.put("app_volume", String.valueOf(zzbt.zzfj().zzdp()));
        hashMap.put("device_volume", String.valueOf(zzaja.zzav(getContext())));
        zza(Event.VOLUME, hashMap);
    }

    public final Context zztv() {
        return zzvo().zztv();
    }

    public final synchronized zzd zztw() {
        return this.zzdqq;
    }

    public final synchronized zzd zztx() {
        return this.zzdrj;
    }

    public final synchronized zzaqa zzty() {
        return this.zzdqr;
    }

    public final synchronized String zztz() {
        return this.zzalv;
    }

    public final zzapu zzua() {
        return this.zzdsr;
    }

    public final synchronized boolean zzub() {
        return this.zzdqs;
    }

    public final zzcv zzuc() {
        return this.zzbyz;
    }

    public final synchronized boolean zzud() {
        return this.zzdqu;
    }

    public final synchronized void zzue() {
        zzahw.v("Destroying WebView!");
        zzqc();
        zzaij.zzdfn.post(new zzaqg(this));
    }

    public final synchronized boolean zzuf() {
        return this.zzdqx;
    }

    public final synchronized boolean zzug() {
        return this.zzdqy;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean zzuh() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.zzdrd;	 Catch:{ all -> 0x000a }
        if (r0 <= 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaqe.zzuh():boolean");
    }

    public final void zzui() {
        this.zzavk.zzrv();
    }

    public final void zzuj() {
        if (this.zzdrg == null) {
            this.zzdrg = zzoo.zzb(this.zzdrh.zzjn());
            this.zzdrh.zza("native:view_load", this.zzdrg);
        }
    }

    public final synchronized zzpt zzuk() {
        return this.zzdrc;
    }

    public final void zzul() {
        setBackgroundColor(0);
    }

    public final void zzum() {
        zzahw.v("Cannot add text view to inner AdWebView");
    }
}

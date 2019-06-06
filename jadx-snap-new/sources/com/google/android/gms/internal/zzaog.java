package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.brightcove.player.media.MediaService;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzw;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import defpackage.kb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzabh
public class zzaog extends WebViewClient implements zzapu {
    private static final String[] zzdpb = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzdpc = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", MultiSnapThumbnailView.THUMBNAIL_INVALID_KEY};
    private final Object mLock;
    protected zzagq zzaop;
    private boolean zzavq;
    private zzkf zzbgt;
    private zzb zzcbc;
    private zzx zzcck;
    private zzw zzccm;
    private zzyd zzccn;
    private zzyo zzcco;
    private zzt zzccr;
    private zzn zzccs;
    private zzaof zzcct;
    private final HashMap<String, List<com.google.android.gms.ads.internal.gmsg.zzt<? super zzaof>>> zzcou;
    private zzapv zzdpd;
    private zzapw zzdpe;
    private zzapx zzdpf;
    private boolean zzdpg;
    private boolean zzdph;
    private OnGlobalLayoutListener zzdpi;
    private OnScrollChangedListener zzdpj;
    private boolean zzdpk;
    private final zzym zzdpl;
    private zzapy zzdpm;
    private boolean zzdpn;
    private boolean zzdpo;
    private int zzdpp;
    private OnAttachStateChangeListener zzdpq;

    public zzaog(zzaof zzaof, boolean z) {
        this(zzaof, z, new zzym(zzaof, zzaof.zztv(), new zznu(zzaof.getContext())), null);
    }

    private zzaog(zzaof zzaof, boolean z, zzym zzym, zzyd zzyd) {
        this.zzcou = new HashMap();
        this.mLock = new Object();
        this.zzdpg = false;
        this.zzcct = zzaof;
        this.zzavq = z;
        this.zzdpl = zzym;
        this.zzccn = null;
    }

    private final void zza(View view, zzagq zzagq, int i) {
        if (zzagq.zzpf() && i > 0) {
            zzagq.zzq(view);
            if (zzagq.zzpf()) {
                zzaij.zzdfn.postDelayed(new zzaoi(this, view, zzagq, i), 100);
            }
        }
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzyd zzyd = this.zzccn;
        boolean z = false;
        boolean zznf = zzyd != null ? zzyd.zznf() : false;
        zzbt.zzej();
        Context context = this.zzcct.getContext();
        if (!zznf) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.zzaop != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzcnj != null) {
                str = adOverlayInfoParcel.zzcnj.url;
            }
            this.zzaop.zzbv(str);
        }
    }

    private final void zzd(Context context, String str, String str2, String str3) {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbqr)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str = parse.getHost();
                    bundle.putString("host", str);
                    zzbt.zzel().zza(context, this.zzcct.zztl().zzcu, "gmob-apps", bundle, true);
                }
            }
            str = "";
            bundle.putString("host", str);
            zzbt.zzel().zza(context, this.zzcct.zztl().zzcu, "gmob-apps", bundle, true);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x00f7 in {14, 21, 22, 24, 27, 28, 29, 31, 33, 35, 37} preds:[]
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
    private final android.webkit.WebResourceResponse zzdf(java.lang.String r9) {
        /*
        r8 = this;
        r0 = new java.net.URL;
        r0.<init>(r9);
        r9 = 0;
        r1 = r0;
        r0 = 0;
        r0 = r0 + 1;
        r2 = 20;
        if (r0 > r2) goto L_0x00e1;
        r2 = r1.openConnection();
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r2.setConnectTimeout(r3);
        r2.setReadTimeout(r3);
        r3 = r2 instanceof java.net.HttpURLConnection;
        if (r3 == 0) goto L_0x00d9;
        r2 = (java.net.HttpURLConnection) r2;
        r3 = com.google.android.gms.ads.internal.zzbt.zzel();
        r4 = r8.zzcct;
        r4 = r4.getContext();
        r5 = r8.zzcct;
        r5 = r5.zztl();
        r5 = r5.zzcu;
        r3.zza(r4, r5, r9, r2);
        r3 = new com.google.android.gms.internal.zzaks;
        r3.<init>();
        r4 = 0;
        r3.zza(r2, r4);
        r5 = r2.getResponseCode();
        com.google.android.gms.ads.internal.zzbt.zzel();
        r6 = r2.getContentType();
        r6 = com.google.android.gms.internal.zzaij.zzcn(r6);
        com.google.android.gms.ads.internal.zzbt.zzel();
        r7 = r2.getContentType();
        r7 = com.google.android.gms.internal.zzaij.zzco(r7);
        r3.zza(r2, r5);
        r3 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r5 < r3) goto L_0x00cf;
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 >= r3) goto L_0x00cf;
        r3 = "Location";
        r3 = r2.getHeaderField(r3);
        if (r3 == 0) goto L_0x00c7;
        r5 = new java.net.URL;
        r5.<init>(r1, r3);
        r1 = r5.getProtocol();
        if (r1 != 0) goto L_0x007c;
        r9 = "Protocol is null";
        com.google.android.gms.internal.zzaky.zzcz(r9);
        return r4;
        r6 = "http";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00a7;
        r6 = "https";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00a7;
        r9 = "Unsupported scheme: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x009d;
        r9 = r9.concat(r0);
        goto L_0x00a3;
        r0 = new java.lang.String;
        r0.<init>(r9);
        r9 = r0;
        com.google.android.gms.internal.zzaky.zzcz(r9);
        return r4;
        r1 = "Redirecting to ";
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x00b8;
        r1 = r1.concat(r3);
        goto L_0x00be;
        r3 = new java.lang.String;
        r3.<init>(r1);
        r1 = r3;
        com.google.android.gms.internal.zzaky.zzby(r1);
        r2.disconnect();
        r1 = r5;
        goto L_0x0008;
        r9 = new java.io.IOException;
        r0 = "Missing Location header in redirect";
        r9.<init>(r0);
        throw r9;
        r9 = new android.webkit.WebResourceResponse;
        r0 = r2.getInputStream();
        r9.<init>(r6, r7, r0);
        return r9;
        r9 = new java.io.IOException;
        r0 = "Invalid protocol.";
        r9.<init>(r0);
        throw r9;
        r9 = new java.io.IOException;
        r0 = 32;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Too many redirects (20)";
        r1.append(r0);
        r0 = r1.toString();
        r9.<init>(r0);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaog.zzdf(java.lang.String):android.webkit.WebResourceResponse");
    }

    private final void zzh(Uri uri) {
        String path = uri.getPath();
        List<com.google.android.gms.ads.internal.gmsg.zzt> list = (List) this.zzcou.get(path);
        if (list != null) {
            zzbt.zzel();
            Map zzf = zzaij.zzf(uri);
            if (zzaky.zzae(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                zzahw.v(path.length() != 0 ? str.concat(path) : new String(str));
                for (String str2 : zzf.keySet()) {
                    String str3 = (String) zzf.get(str2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 4) + String.valueOf(str3).length());
                    stringBuilder.append("  ");
                    stringBuilder.append(str2);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    zzahw.v(stringBuilder.toString());
                }
            }
            for (com.google.android.gms.ads.internal.gmsg.zzt zza : list) {
                zza.zza(this.zzcct, zzf);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder2.append("No GMSG handler found for GMSG: ");
        stringBuilder2.append(valueOf);
        zzahw.v(stringBuilder2.toString());
    }

    private final void zzus() {
        if (this.zzdpq != null) {
            this.zzcct.getView().removeOnAttachStateChangeListener(this.zzdpq);
        }
    }

    private final void zzux() {
        if (this.zzdpd != null && ((this.zzdpn && this.zzdpp <= 0) || this.zzdpo)) {
            this.zzdpd.zza(this.zzcct, this.zzdpo ^ 1);
            this.zzdpd = null;
        }
        this.zzcct.zzuj();
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Loading resource: ";
        zzahw.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
                zzh(parse);
            }
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0018, code skipped:
            r0.zzdpn = true;
            r1 = r0.zzdpe;
     */
    /* JADX WARNING: Missing block: B:10:0x001d, code skipped:
            if (r1 == null) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            r1.zzf(r0.zzcct);
            r0.zzdpe = null;
     */
    /* JADX WARNING: Missing block: B:12:0x0027, code skipped:
            zzux();
     */
    /* JADX WARNING: Missing block: B:13:0x002a, code skipped:
            return;
     */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
        r0 = this;
        r1 = r0.mLock;
        monitor-enter(r1);
        r2 = r0.zzcct;	 Catch:{ all -> 0x002b }
        r2 = r2.isDestroyed();	 Catch:{ all -> 0x002b }
        if (r2 == 0) goto L_0x0017;
    L_0x000b:
        r2 = "Blank page loaded, 1...";
        com.google.android.gms.internal.zzahw.v(r2);	 Catch:{ all -> 0x002b }
        r2 = r0.zzcct;	 Catch:{ all -> 0x002b }
        r2.zzue();	 Catch:{ all -> 0x002b }
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        return;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        r1 = 1;
        r0.zzdpn = r1;
        r1 = r0.zzdpe;
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r2 = r0.zzcct;
        r1.zzf(r2);
        r1 = 0;
        r0.zzdpe = r1;
    L_0x0027:
        r0.zzux();
        return;
    L_0x002b:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaog.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = zzdpb;
            if (i2 < strArr.length) {
                str3 = strArr[i2];
                zzd(this.zzcct.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        zzd(this.zzcct.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            String str;
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = zzdpc;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    zzd(this.zzcct.getContext(), "ssl_err", str, zzbt.zzen().zza(sslError));
                }
            }
            str = String.valueOf(primaryError);
            zzd(this.zzcct.getContext(), "ssl_err", str, zzbt.zzen().zza(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void reset() {
        zzagq zzagq = this.zzaop;
        if (zzagq != null) {
            zzagq.zzph();
            this.zzaop = null;
        }
        zzus();
        synchronized (this.mLock) {
            this.zzcou.clear();
            this.zzbgt = null;
            this.zzccs = null;
            this.zzdpd = null;
            this.zzdpe = null;
            this.zzcbc = null;
            this.zzdpg = false;
            this.zzavq = false;
            this.zzdph = false;
            this.zzdpk = false;
            this.zzccr = null;
            this.zzdpf = null;
            if (this.zzccn != null) {
                this.zzccn.zzm(true);
                this.zzccn = null;
            }
        }
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2 = "";
        try {
            String zzb = zzagx.zzb(str, this.zzcct.getContext());
            if (!zzb.equals(str)) {
                return zzdf(zzb);
            }
            zzin zzab = zzin.zzab(str);
            if (zzab != null) {
                zzik zza = zzbt.zzer().zza(zzab);
                if (zza != null && zza.zzhj()) {
                    return new WebResourceResponse(str2, str2, zza.zzhk());
                }
            }
            if (zzaks.isEnabled()) {
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbqg)).booleanValue()) {
                    return zzdf(str);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbt.zzep().zza(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String scheme;
        String valueOf = String.valueOf(str);
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        zzahw.v(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme())) {
            if ("mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
                zzh(parse);
                return true;
            }
        }
        if (this.zzdpg && webView == this.zzcct.getWebView()) {
            scheme = parse.getScheme();
            Object obj = (MediaService.DEFAULT_MEDIA_DELIVERY.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) ? 1 : null;
            if (obj != null) {
                if (this.zzbgt != null) {
                    if (((Boolean) zzlc.zzio().zzd(zzoi.zzboc)).booleanValue()) {
                        this.zzbgt.onAdClicked();
                        zzagq zzagq = this.zzaop;
                        if (zzagq != null) {
                            zzagq.zzbv(str);
                        }
                        this.zzbgt = null;
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        String str3;
        if (this.zzcct.getWebView().willNotDraw()) {
            str3 = "AdWebView unable to handle URL: ";
            str = String.valueOf(str);
            zzaky.zzcz(str.length() != 0 ? str3.concat(str) : new String(str3));
        } else {
            try {
                zzcv zzuc = this.zzcct.zzuc();
                if (zzuc != null && zzuc.zzb(parse)) {
                    parse = zzuc.zza(parse, this.zzcct.getContext(), this.zzcct.getView(), this.zzcct.zztj());
                }
            } catch (zzcw unused) {
                str3 = "Unable to append parameter to URL: ";
                scheme = String.valueOf(str);
                zzaky.zzcz(scheme.length() != 0 ? str3.concat(scheme) : new String(str3));
            }
            zzw zzw = this.zzccm;
            if (zzw == null || zzw.zzcz()) {
                zza(new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
            } else {
                this.zzccm.zzt(str);
            }
        }
        return true;
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzdpl.zzc(i, i2);
        zzyd zzyd = this.zzccn;
        if (zzyd != null) {
            zzyd.zza(i, i2, z);
        }
    }

    public final void zza(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.mLock) {
            this.zzdph = true;
            this.zzcct.zzui();
            this.zzdpi = onGlobalLayoutListener;
            this.zzdpj = onScrollChangedListener;
        }
    }

    public final void zza(zzc zzc) {
        boolean zzud = this.zzcct.zzud();
        zzkf zzkf = (!zzud || this.zzcct.zzty().zzvl()) ? this.zzbgt : null;
        zza(new AdOverlayInfoParcel(zzc, zzkf, zzud ? null : this.zzccs, this.zzccr, this.zzcct.zztl()));
    }

    public final void zza(zzapv zzapv) {
        this.zzdpd = zzapv;
    }

    public final void zza(zzapw zzapw) {
        this.zzdpe = zzapw;
    }

    public final void zza(zzapx zzapx) {
        this.zzdpf = zzapx;
    }

    public final void zza(zzapy zzapy) {
        this.zzdpm = zzapy;
    }

    public final void zza(zzkf zzkf, zzn zzn, zzb zzb, zzt zzt, boolean z, zzx zzx, zzw zzw, zzyo zzyo, zzagq zzagq) {
        zzb zzb2 = zzb;
        zzx zzx2 = zzx;
        zzyo zzyo2 = zzyo;
        zzagq zzagq2 = zzagq;
        zzw zzw2 = zzw == null ? new zzw(this.zzcct.getContext(), zzagq2, null) : zzw;
        this.zzccn = new zzyd(this.zzcct, zzyo2);
        this.zzaop = zzagq2;
        zza("/appEvent", new zza(zzb2));
        zza("/backButton", zzd.zzcbn);
        zza("/refresh", zzd.zzcbo);
        zza("/canOpenURLs", zzd.zzcbe);
        zza("/canOpenIntents", zzd.zzcbf);
        zza("/click", zzd.zzcbg);
        zza("/close", zzd.zzcbh);
        zza("/customClose", zzd.zzcbi);
        zza("/instrument", zzd.zzcbr);
        zza("/delayPageLoaded", zzd.zzcbt);
        zza("/delayPageClosed", zzd.zzcbu);
        zza("/getLocationInfo", zzd.zzcbv);
        zza("/httpTrack", zzd.zzcbj);
        zza("/log", zzd.zzcbk);
        zza("/mraid", new zzaa(zzw2, this.zzccn, zzyo2));
        zza("/mraidLoaded", this.zzdpl);
        zza("/open", new zzab(this.zzcct.getContext(), this.zzcct.zztl(), this.zzcct.zzuc(), zzt, zzkf, zzb, zzn, zzw2, this.zzccn));
        zza("/precache", new zzaoc());
        zza("/touch", zzd.zzcbm);
        zza("/video", zzd.zzcbp);
        zza("/videoMeta", zzd.zzcbq);
        if (zzbt.zzfh().zzq(this.zzcct.getContext())) {
            zza("/logScionEvent", new zzz(this.zzcct.getContext()));
        }
        if (zzx2 != null) {
            zza("/setInterstitialProperties", new com.google.android.gms.ads.internal.gmsg.zzw(zzx2));
        }
        this.zzbgt = zzkf;
        this.zzccs = zzn;
        this.zzcbc = zzb2;
        this.zzccr = zzt;
        this.zzccm = zzw2;
        this.zzcco = zzyo2;
        this.zzcck = zzx2;
        this.zzdpg = z;
    }

    public final void zza(String str, com.google.android.gms.ads.internal.gmsg.zzt<? super zzaof> zzt) {
        synchronized (this.mLock) {
            List list = (List) this.zzcou.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzcou.put(str, list);
            }
            list.add(zzt);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0036 in {6, 12, 15, 18} preds:[]
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
    public final void zza(java.lang.String r6, com.google.android.gms.common.util.zzt<com.google.android.gms.ads.internal.gmsg.zzt<? super com.google.android.gms.internal.zzaof>> r7) {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = r5.zzcou;	 Catch:{ all -> 0x0033 }
        r6 = r1.get(r6);	 Catch:{ all -> 0x0033 }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x0033 }
        if (r6 != 0) goto L_0x000f;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return;	 Catch:{ all -> 0x0033 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0033 }
        r1.<init>();	 Catch:{ all -> 0x0033 }
        r2 = r6.iterator();	 Catch:{ all -> 0x0033 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0033 }
        if (r3 == 0) goto L_0x002e;	 Catch:{ all -> 0x0033 }
        r3 = r2.next();	 Catch:{ all -> 0x0033 }
        r3 = (com.google.android.gms.ads.internal.gmsg.zzt) r3;	 Catch:{ all -> 0x0033 }
        r4 = r7.apply(r3);	 Catch:{ all -> 0x0033 }
        if (r4 == 0) goto L_0x0018;	 Catch:{ all -> 0x0033 }
        r1.add(r3);	 Catch:{ all -> 0x0033 }
        goto L_0x0018;	 Catch:{ all -> 0x0033 }
        r6.removeAll(r1);	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return;	 Catch:{ all -> 0x0033 }
        r6 = move-exception;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaog.zza(java.lang.String, com.google.android.gms.common.util.zzt):void");
    }

    public final void zza(boolean z, int i) {
        zzkf zzkf = (!this.zzcct.zzud() || this.zzcct.zzty().zzvl()) ? this.zzbgt : null;
        zzkf zzkf2 = zzkf;
        zzn zzn = this.zzccs;
        zzt zzt = this.zzccr;
        zzaof zzaof = this.zzcct;
        zza(new AdOverlayInfoParcel(zzkf2, zzn, zzt, zzaof, z, i, zzaof.zztl()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzud = this.zzcct.zzud();
        zzkf zzkf = (!zzud || this.zzcct.zzty().zzvl()) ? this.zzbgt : null;
        zzn zzaok = zzud ? null : new zzaok(this.zzcct, this.zzccs);
        zzb zzb = this.zzcbc;
        zzt zzt = this.zzccr;
        zzaof zzaof = this.zzcct;
        zza(new AdOverlayInfoParcel(zzkf, zzaok, zzb, zzt, zzaof, z, i, str, zzaof.zztl()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzud = this.zzcct.zzud();
        zzkf zzkf = (!zzud || this.zzcct.zzty().zzvl()) ? this.zzbgt : null;
        zzn zzaok = zzud ? null : new zzaok(this.zzcct, this.zzccs);
        zzb zzb = this.zzcbc;
        zzt zzt = this.zzccr;
        zzaof zzaof = this.zzcct;
        zza(new AdOverlayInfoParcel(zzkf, zzaok, zzb, zzt, zzaof, z, i, str, str2, zzaof.zztl()));
    }

    public final void zzag(boolean z) {
        this.zzdpg = z;
    }

    public final void zzb(int i, int i2) {
        zzyd zzyd = this.zzccn;
        if (zzyd != null) {
            zzyd.zzb(i, i2);
        }
    }

    public final void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzt<? super zzaof> zzt) {
        synchronized (this.mLock) {
            List list = (List) this.zzcou.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzt);
        }
    }

    public final boolean zzfz() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzavq;
        }
        return z;
    }

    public final void zzk(zzaof zzaof) {
        this.zzcct = zzaof;
    }

    public final void zznj() {
        synchronized (this.mLock) {
            this.zzdpg = false;
            this.zzavq = true;
            zzaly.zzdjt.execute(new zzaoh(this));
        }
    }

    public final zzw zzun() {
        return this.zzccm;
    }

    public final boolean zzuo() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdph;
        }
        return z;
    }

    public final OnGlobalLayoutListener zzup() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.mLock) {
            onGlobalLayoutListener = this.zzdpi;
        }
        return onGlobalLayoutListener;
    }

    public final OnScrollChangedListener zzuq() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.mLock) {
            onScrollChangedListener = this.zzdpj;
        }
        return onScrollChangedListener;
    }

    public final boolean zzur() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdpk;
        }
        return z;
    }

    public final void zzut() {
        zzagq zzagq = this.zzaop;
        if (zzagq != null) {
            View webView = this.zzcct.getWebView();
            if (kb.a.r(webView)) {
                zza(webView, zzagq, 10);
                return;
            }
            zzus();
            this.zzdpq = new zzaoj(this, zzagq);
            this.zzcct.getView().addOnAttachStateChangeListener(this.zzdpq);
        }
    }

    public final void zzuu() {
        synchronized (this.mLock) {
            this.zzdpk = true;
        }
        this.zzdpp++;
        zzux();
    }

    public final void zzuv() {
        this.zzdpp--;
        zzux();
    }

    public final void zzuw() {
        this.zzdpo = true;
        zzux();
    }

    public final zzapy zzuy() {
        return this.zzdpm;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zzuz() {
        this.zzcct.zzui();
        com.google.android.gms.ads.internal.overlay.zzd zztw = this.zzcct.zztw();
        if (zztw != null) {
            zztw.zznj();
        }
        zzapx zzapx = this.zzdpf;
        if (zzapx != null) {
            zzapx.zzdc();
            this.zzdpf = null;
        }
    }
}

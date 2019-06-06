package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zziw.zza.zzb;

@zzabh
public final class zzabk extends zzahs implements zzabx {
    private final Context mContext;
    private zzvq zzcir;
    private zzacf zzcjk;
    private zzacj zzcoc;
    private Runnable zzcod;
    private final Object zzcoe = new Object();
    private final zzabj zzcre;
    private final zzacg zzcrf;
    private final zziu zzcrg;
    private final zziz zzcrh;
    zzajb zzcri;

    public zzabk(Context context, zzacg zzacg, zzabj zzabj, zziz zziz) {
        zziu zziu;
        zziv zziv;
        this.zzcre = zzabj;
        this.mContext = context;
        this.zzcrf = zzacg;
        this.zzcrh = zziz;
        this.zzcrg = new zziu(this.zzcrh);
        this.zzcrg.zza(new zzabl(this));
        zzjv zzjv = new zzjv();
        zzjv.zzbfv = Integer.valueOf(this.zzcrf.zzatz.zzdiz);
        zzjv.zzbfw = Integer.valueOf(this.zzcrf.zzatz.zzdja);
        zzjv.zzbfx = Integer.valueOf(this.zzcrf.zzatz.zzdjb ? 0 : 2);
        this.zzcrg.zza(new zzabm(zzjv));
        if (this.zzcrf.zzcrw != null) {
            this.zzcrg.zza(new zzabn(this));
        }
        zzko zzko = this.zzcrf.zzaud;
        if (zzko.zzbib) {
            if ("interstitial_mb".equals(zzko.zzbia)) {
                zziu = this.zzcrg;
                zziv = zzabo.zzcrl;
                zziu.zza(zziv);
                this.zzcrg.zza(zzb.AD_REQUEST);
            }
        }
        if (zzko.zzbib) {
            if ("reward_mb".equals(zzko.zzbia)) {
                zziu = this.zzcrg;
                zziv = zzabp.zzcrl;
                zziu.zza(zziv);
                this.zzcrg.zza(zzb.AD_REQUEST);
            }
        }
        if (zzko.zzbid || zzko.zzbib) {
            zziu = this.zzcrg;
            zziv = zzabr.zzcrl;
        } else {
            zziu = this.zzcrg;
            zziv = zzabq.zzcrl;
        }
        zziu.zza(zziv);
        this.zzcrg.zza(zzb.AD_REQUEST);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:68:0x0114 in {6, 7, 14, 22, 23, 30, 31, 33, 40, 41, 44, 45, 51, 52, 55, 56, 58, 62, 63, 65, 67} preds:[]
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
    private final com.google.android.gms.internal.zzko zza(com.google.android.gms.internal.zzacf r12) {
        /*
        r11 = this;
        r0 = r11.zzcjk;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0016;
        r0 = r0.zzauu;
        if (r0 == 0) goto L_0x0016;
        r0 = r11.zzcjk;
        r0 = r0.zzauu;
        r0 = r0.size();
        if (r0 <= r1) goto L_0x0016;
        r0 = 1;
        goto L_0x0017;
        r0 = 0;
        if (r0 == 0) goto L_0x0023;
        r0 = r11.zzcir;
        if (r0 == 0) goto L_0x0023;
        r0 = r0.zzcim;
        if (r0 != 0) goto L_0x0023;
        r12 = 0;
        return r12;
        r0 = r11.zzcoc;
        r0 = r0.zzbie;
        if (r0 == 0) goto L_0x0044;
        r0 = r12.zzaud;
        r0 = r0.zzbic;
        r3 = r0.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x0044;
        r5 = r0[r4];
        r6 = r5.zzbie;
        if (r6 == 0) goto L_0x0041;
        r0 = new com.google.android.gms.internal.zzko;
        r12 = r12.zzaud;
        r12 = r12.zzbic;
        r0.<init>(r5, r12);
        return r0;
        r4 = r4 + 1;
        goto L_0x002f;
        r0 = r11.zzcoc;
        r0 = r0.zzctr;
        if (r0 == 0) goto L_0x010c;
        r0 = r11.zzcoc;
        r0 = r0.zzctr;
        r3 = "x";
        r0 = r0.split(r3);
        r3 = r0.length;
        r4 = 2;
        if (r3 == r4) goto L_0x0079;
        r12 = new com.google.android.gms.internal.zzabu;
        r0 = "Invalid ad size format from the ad response: ";
        r1 = r11.zzcoc;
        r1 = r1.zzctr;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x006f;
        r0 = r0.concat(r1);
        goto L_0x0075;
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
        r12.<init>(r0, r2);
        throw r12;
        r3 = r0[r2];	 Catch:{ NumberFormatException -> 0x00eb }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00eb }
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00eb }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00eb }
        r1 = r12.zzaud;
        r1 = r1.zzbic;
        r4 = r1.length;
        r5 = 0;
        if (r5 >= r4) goto L_0x00ca;
        r6 = r1[r5];
        r7 = r11.mContext;
        r7 = r7.getResources();
        r7 = r7.getDisplayMetrics();
        r7 = r7.density;
        r8 = r6.width;
        r9 = -1;
        if (r8 != r9) goto L_0x00a6;
        r8 = r6.widthPixels;
        r8 = (float) r8;
        r8 = r8 / r7;
        r8 = (int) r8;
        goto L_0x00a8;
        r8 = r6.width;
        r9 = r6.height;
        r10 = -2;
        if (r9 != r10) goto L_0x00b3;
        r9 = r6.heightPixels;
        r9 = (float) r9;
        r9 = r9 / r7;
        r7 = (int) r9;
        goto L_0x00b5;
        r7 = r6.height;
        if (r3 != r8) goto L_0x00c7;
        if (r0 != r7) goto L_0x00c7;
        r7 = r6.zzbie;
        if (r7 != 0) goto L_0x00c7;
        r0 = new com.google.android.gms.internal.zzko;
        r12 = r12.zzaud;
        r12 = r12.zzbic;
        r0.<init>(r6, r12);
        return r0;
        r5 = r5 + 1;
        goto L_0x008b;
        r12 = new com.google.android.gms.internal.zzabu;
        r0 = "The ad size from the ad response was not one of the requested sizes: ";
        r1 = r11.zzcoc;
        r1 = r1.zzctr;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00e1;
        r0 = r0.concat(r1);
        goto L_0x00e7;
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
        r12.<init>(r0, r2);
        throw r12;
        r12 = new com.google.android.gms.internal.zzabu;
        r0 = "Invalid ad size number from the ad response: ";
        r1 = r11.zzcoc;
        r1 = r1.zzctr;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0102;
        r0 = r0.concat(r1);
        goto L_0x0108;
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
        r12.<init>(r0, r2);
        throw r12;
        r12 = new com.google.android.gms.internal.zzabu;
        r0 = "The ad response must specify one of the supported ad sizes.";
        r12.<init>(r0, r2);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabk.zza(com.google.android.gms.internal.zzacf):com.google.android.gms.internal.zzko");
    }

    private final void zzc(int i, String str) {
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            zzaky.zzcy(str);
        } else {
            zzaky.zzcz(str);
        }
        zzacj zzacj = this.zzcoc;
        if (zzacj == null) {
            this.zzcoc = new zzacj(i2);
        } else {
            this.zzcoc = new zzacj(i2, zzacj.zzcic);
        }
        zzacf zzacf = this.zzcjk;
        if (zzacf == null) {
            zzacf zzacf2 = new zzacf(this.zzcrf, -1, null, null, null);
        }
        zzacf zzacf3 = zzacf;
        zzacj zzacj2 = this.zzcoc;
        this.zzcre.zza(new zzahe(zzacf3, zzacj2, this.zzcir, null, i, -1, zzacj2.zzcts, null, this.zzcrg, null));
    }

    public final void onStop() {
        synchronized (this.zzcoe) {
            if (this.zzcri != null) {
                this.zzcri.cancel();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final zzajb zza(zzala zzala, zzamf<zzacf> zzamf) {
        Context context = this.mContext;
        if (new zzabw(context).zza(zzala)) {
            zzaky.zzby("Fetching ad response from local ad request service.");
            zzacc zzacc = new zzacc(context, zzamf, this);
            zzacc.zzns();
            return zzacc;
        }
        zzaky.zzby("Fetching ad response from remote ad request service.");
        zzlc.zzij();
        if (zzako.zzbb(context)) {
            return new zzacd(context, zzala, zzamf, this);
        }
        zzaky.zzcz("Failed to connect to remote ad request service.");
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:87:0x0216 in {10, 11, 17, 19, 28, 33, 34, 36, 37, 44, 46, 50, 51, 56, 58, 59, 64, 65, 68, 69, 70, 73, 76, 77, 78, 80, 82, 86} preds:[]
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
    public final void zza(com.google.android.gms.internal.zzacj r14) {
        /*
        r13 = this;
        r0 = "Received ad response.";
        com.google.android.gms.internal.zzaky.zzby(r0);
        r13.zzcoc = r14;
        r14 = com.google.android.gms.ads.internal.zzbt.zzes();
        r6 = r14.elapsedRealtime();
        r14 = r13.zzcoe;
        monitor-enter(r14);
        r0 = 0;
        r13.zzcri = r0;	 Catch:{ all -> 0x0213 }
        monitor-exit(r14);	 Catch:{ all -> 0x0213 }
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();
        r14 = r14.zzqe();
        r1 = r13.zzcoc;
        r1 = r1.zzcsr;
        r14.zzad(r1);
        r14 = com.google.android.gms.internal.zzoi.zzbpr;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r14 = r1.zzd(r14);
        r14 = (java.lang.Boolean) r14;
        r14 = r14.booleanValue();
        if (r14 == 0) goto L_0x005c;
        r14 = r13.zzcoc;
        r14 = r14.zzctd;
        if (r14 == 0) goto L_0x004d;
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();
        r14 = r14.zzqe();
        r1 = r13.zzcjk;
        r1 = r1.zzatx;
        r14.zzcd(r1);
        goto L_0x005c;
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();
        r14 = r14.zzqe();
        r1 = r13.zzcjk;
        r1 = r1.zzatx;
        r14.zzce(r1);
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.errorCode;	 Catch:{ zzabu -> 0x0206 }
        r1 = -2;	 Catch:{ zzabu -> 0x0206 }
        r2 = -3;	 Catch:{ zzabu -> 0x0206 }
        if (r14 == r1) goto L_0x008c;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.errorCode;	 Catch:{ zzabu -> 0x0206 }
        if (r14 != r2) goto L_0x006b;	 Catch:{ zzabu -> 0x0206 }
        goto L_0x008c;	 Catch:{ zzabu -> 0x0206 }
        r14 = new com.google.android.gms.internal.zzabu;	 Catch:{ zzabu -> 0x0206 }
        r0 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r0 = r0.errorCode;	 Catch:{ zzabu -> 0x0206 }
        r1 = 66;	 Catch:{ zzabu -> 0x0206 }
        r2 = new java.lang.StringBuilder;	 Catch:{ zzabu -> 0x0206 }
        r2.<init>(r1);	 Catch:{ zzabu -> 0x0206 }
        r1 = "There was a problem getting an ad response. ErrorCode: ";	 Catch:{ zzabu -> 0x0206 }
        r2.append(r1);	 Catch:{ zzabu -> 0x0206 }
        r2.append(r0);	 Catch:{ zzabu -> 0x0206 }
        r0 = r2.toString();	 Catch:{ zzabu -> 0x0206 }
        r1 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r1 = r1.errorCode;	 Catch:{ zzabu -> 0x0206 }
        r14.<init>(r0, r1);	 Catch:{ zzabu -> 0x0206 }
        throw r14;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.errorCode;	 Catch:{ zzabu -> 0x0206 }
        if (r14 == r2) goto L_0x013b;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.body;	 Catch:{ zzabu -> 0x0206 }
        r14 = android.text.TextUtils.isEmpty(r14);	 Catch:{ zzabu -> 0x0206 }
        if (r14 != 0) goto L_0x0132;	 Catch:{ zzabu -> 0x0206 }
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzqe();	 Catch:{ zzabu -> 0x0206 }
        r1 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r1 = r1.zzcsd;	 Catch:{ zzabu -> 0x0206 }
        r14.zzaa(r1);	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzcto;	 Catch:{ zzabu -> 0x0206 }
        if (r14 == 0) goto L_0x00f0;
        r14 = new com.google.android.gms.internal.zzvq;	 Catch:{ JSONException -> 0x00c8 }
        r1 = r13.zzcoc;	 Catch:{ JSONException -> 0x00c8 }
        r1 = r1.body;	 Catch:{ JSONException -> 0x00c8 }
        r14.<init>(r1);	 Catch:{ JSONException -> 0x00c8 }
        r13.zzcir = r14;	 Catch:{ JSONException -> 0x00c8 }
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ JSONException -> 0x00c8 }
        r1 = r13.zzcir;	 Catch:{ JSONException -> 0x00c8 }
        r1 = r1.zzcia;	 Catch:{ JSONException -> 0x00c8 }
        r14.zzz(r1);	 Catch:{ JSONException -> 0x00c8 }
        goto L_0x00fb;
        r14 = move-exception;
        r0 = "Could not parse mediation config.";	 Catch:{ zzabu -> 0x0206 }
        com.google.android.gms.internal.zzaky.zzb(r0, r14);	 Catch:{ zzabu -> 0x0206 }
        r14 = new com.google.android.gms.internal.zzabu;	 Catch:{ zzabu -> 0x0206 }
        r0 = "Could not parse mediation config: ";	 Catch:{ zzabu -> 0x0206 }
        r1 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r1 = r1.body;	 Catch:{ zzabu -> 0x0206 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ zzabu -> 0x0206 }
        r2 = r1.length();	 Catch:{ zzabu -> 0x0206 }
        if (r2 == 0) goto L_0x00e5;	 Catch:{ zzabu -> 0x0206 }
        r0 = r0.concat(r1);	 Catch:{ zzabu -> 0x0206 }
        goto L_0x00eb;	 Catch:{ zzabu -> 0x0206 }
        r1 = new java.lang.String;	 Catch:{ zzabu -> 0x0206 }
        r1.<init>(r0);	 Catch:{ zzabu -> 0x0206 }
        r0 = r1;	 Catch:{ zzabu -> 0x0206 }
        r1 = 0;	 Catch:{ zzabu -> 0x0206 }
        r14.<init>(r0, r1);	 Catch:{ zzabu -> 0x0206 }
        throw r14;	 Catch:{ zzabu -> 0x0206 }
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ zzabu -> 0x0206 }
        r1 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r1 = r1.zzcia;	 Catch:{ zzabu -> 0x0206 }
        r14.zzz(r1);	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzcss;	 Catch:{ zzabu -> 0x0206 }
        r14 = android.text.TextUtils.isEmpty(r14);	 Catch:{ zzabu -> 0x0206 }
        if (r14 != 0) goto L_0x013b;	 Catch:{ zzabu -> 0x0206 }
        r14 = com.google.android.gms.internal.zzoi.zzbtz;	 Catch:{ zzabu -> 0x0206 }
        r1 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ zzabu -> 0x0206 }
        r14 = r1.zzd(r14);	 Catch:{ zzabu -> 0x0206 }
        r14 = (java.lang.Boolean) r14;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.booleanValue();	 Catch:{ zzabu -> 0x0206 }
        if (r14 == 0) goto L_0x013b;	 Catch:{ zzabu -> 0x0206 }
        r14 = "Received cookie from server. Setting webview cookie in CookieManager.";	 Catch:{ zzabu -> 0x0206 }
        com.google.android.gms.internal.zzaky.zzby(r14);	 Catch:{ zzabu -> 0x0206 }
        r14 = com.google.android.gms.ads.internal.zzbt.zzen();	 Catch:{ zzabu -> 0x0206 }
        r1 = r13.mContext;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzau(r1);	 Catch:{ zzabu -> 0x0206 }
        if (r14 == 0) goto L_0x013b;	 Catch:{ zzabu -> 0x0206 }
        r1 = "googleads.g.doubleclick.net";	 Catch:{ zzabu -> 0x0206 }
        r2 = r13.zzcoc;	 Catch:{ zzabu -> 0x0206 }
        r2 = r2.zzcss;	 Catch:{ zzabu -> 0x0206 }
        r14.setCookie(r1, r2);	 Catch:{ zzabu -> 0x0206 }
        goto L_0x013b;	 Catch:{ zzabu -> 0x0206 }
        r14 = new com.google.android.gms.internal.zzabu;	 Catch:{ zzabu -> 0x0206 }
        r0 = "No fill from ad server.";	 Catch:{ zzabu -> 0x0206 }
        r1 = 3;	 Catch:{ zzabu -> 0x0206 }
        r14.<init>(r0, r1);	 Catch:{ zzabu -> 0x0206 }
        throw r14;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcjk;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzaud;	 Catch:{ zzabu -> 0x0206 }
        r14 = r14.zzbic;	 Catch:{ zzabu -> 0x0206 }
        if (r14 == 0) goto L_0x014b;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zzcjk;	 Catch:{ zzabu -> 0x0206 }
        r14 = r13.zza(r14);	 Catch:{ zzabu -> 0x0206 }
        r4 = r14;
        goto L_0x014c;
        r4 = r0;
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();
        r14 = r14.zzqe();
        r1 = r13.zzcoc;
        r1 = r1.zzcty;
        r14.zzab(r1);
        r14 = com.google.android.gms.ads.internal.zzbt.zzep();
        r14 = r14.zzqe();
        r1 = r13.zzcoc;
        r1 = r1.zzcuk;
        r14.zzac(r1);
        r14 = r13.zzcoc;
        r14 = r14.zzctw;
        r14 = android.text.TextUtils.isEmpty(r14);
        if (r14 != 0) goto L_0x0185;
        r14 = new org.json.JSONObject;	 Catch:{ Exception -> 0x017f }
        r1 = r13.zzcoc;	 Catch:{ Exception -> 0x017f }
        r1 = r1.zzctw;	 Catch:{ Exception -> 0x017f }
        r14.<init>(r1);	 Catch:{ Exception -> 0x017f }
        r10 = r14;
        goto L_0x0186;
        r14 = move-exception;
        r1 = "Error parsing the JSON for Active View.";
        com.google.android.gms.internal.zzaky.zzb(r1, r14);
        r10 = r0;
        r14 = r13.zzcoc;
        r14 = r14.zzcum;
        r1 = 2;
        r2 = 1;
        if (r14 != r1) goto L_0x01cb;
        r0 = java.lang.Boolean.TRUE;
        r14 = r13.zzcjk;
        r14 = r14.zzcrv;
        r1 = r14.zzbhf;
        if (r1 == 0) goto L_0x019b;
        r14 = r14.zzbhf;
        goto L_0x01a0;
        r14 = new android.os.Bundle;
        r14.<init>();
        r1 = com.google.ads.mediation.admob.AdMobAdapter.class;
        r1 = r1.getName();
        r1 = r14.getBundle(r1);
        if (r1 == 0) goto L_0x01b7;
        r1 = com.google.ads.mediation.admob.AdMobAdapter.class;
        r1 = r1.getName();
        r14 = r14.getBundle(r1);
        goto L_0x01c6;
        r1 = new android.os.Bundle;
        r1.<init>();
        r3 = com.google.ads.mediation.admob.AdMobAdapter.class;
        r3 = r3.getName();
        r14.putBundle(r3, r1);
        r14 = r1;
        r1 = "render_test_label";
        r14.putBoolean(r1, r2);
        r14 = r13.zzcoc;
        r14 = r14.zzcum;
        if (r14 != r2) goto L_0x01d3;
        r0 = java.lang.Boolean.FALSE;
        r14 = r13.zzcoc;
        r14 = r14.zzcum;
        if (r14 != 0) goto L_0x01e7;
        r14 = r13.zzcjk;
        r14 = r14.zzcrv;
        r14 = com.google.android.gms.internal.zzakh.zzo(r14);
        r14 = java.lang.Boolean.valueOf(r14);
        r12 = r14;
        goto L_0x01e8;
        r12 = r0;
        r14 = new com.google.android.gms.internal.zzahe;
        r1 = r13.zzcjk;
        r2 = r13.zzcoc;
        r3 = r13.zzcir;
        r5 = -2;
        r8 = r2.zzcts;
        r11 = r13.zzcrg;
        r0 = r14;
        r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12);
        r0 = r13.zzcre;
        r0.zza(r14);
        r14 = com.google.android.gms.internal.zzaij.zzdfn;
        r0 = r13.zzcod;
        r14.removeCallbacks(r0);
        return;
        r14 = move-exception;
        r0 = r14.getErrorCode();
        r14 = r14.getMessage();
        r13.zzc(r0, r14);
        goto L_0x01fe;
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0213 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzabk.zza(com.google.android.gms.internal.zzacj):void");
    }

    public final void zzdo() {
        zzaky.zzby("AdLoaderBackgroundTask started.");
        this.zzcod = new zzabs(this);
        zzaij.zzdfn.postDelayed(this.zzcod, ((Long) zzlc.zzio().zzd(zzoi.zzbrf)).longValue());
        long elapsedRealtime = zzbt.zzes().elapsedRealtime();
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrd)).booleanValue() && this.zzcrf.zzcrv.extras != null) {
            String string = this.zzcrf.zzcrv.extras.getString("_ad");
            if (string != null) {
                this.zzcjk = new zzacf(this.zzcrf, elapsedRealtime, null, null, null);
                zza(zzads.zza(this.mContext, this.zzcjk, string));
                return;
            }
        }
        zzamj zzamj = new zzamj();
        zzaid.zzb(new zzabt(this, zzamj));
        String zzx = zzbt.zzfh().zzx(this.mContext);
        String zzy = zzbt.zzfh().zzy(this.mContext);
        String zzz = zzbt.zzfh().zzz(this.mContext);
        zzbt.zzfh().zzg(this.mContext, zzz);
        this.zzcjk = new zzacf(this.zzcrf, elapsedRealtime, zzx, zzy, zzz);
        zzamj.zzj(this.zzcjk);
    }
}

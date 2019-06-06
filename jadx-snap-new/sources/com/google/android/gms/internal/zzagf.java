package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.common.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzagf implements zzagq {
    private static List<Future<Void>> zzday = Collections.synchronizedList(new ArrayList());
    private static ScheduledExecutorService zzdaz = Executors.newSingleThreadScheduledExecutor();
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzagn zzcxr;
    private final zzflw zzdba;
    private final LinkedHashMap<String, zzfme> zzdbb;
    private final zzags zzdbc;
    private boolean zzdbd;
    private HashSet<String> zzdbe = new HashSet();
    private boolean zzdbf = false;
    private boolean zzdbg = false;
    private boolean zzdbh = false;

    public zzagf(Context context, zzala zzala, zzagn zzagn, String str, zzags zzags) {
        zzbq.checkNotNull(zzagn, "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.mContext = context;
        this.zzdbb = new LinkedHashMap();
        this.zzdbc = zzags;
        this.zzcxr = zzagn;
        for (String toLowerCase : this.zzcxr.zzdbr) {
            this.zzdbe.add(toLowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzdbe.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzflw zzflw = new zzflw();
        zzflw.zzbdh = Integer.valueOf(8);
        zzflw.url = str;
        zzflw.zzpwg = str;
        zzflw.zzpwi = new zzflx();
        zzflw.zzpwi.zzdbn = this.zzcxr.zzdbn;
        zzfmf zzfmf = new zzfmf();
        zzfmf.zzpxp = zzala.zzcu;
        zzfmf.zzpxr = Boolean.valueOf(zzbih.zzdd(this.mContext).zzaoe());
        zzf.zzahf();
        long zzcg = (long) zzf.zzcg(this.mContext);
        if (zzcg > 0) {
            zzfmf.zzpxq = Long.valueOf(zzcg);
        }
        zzflw.zzpws = zzfmf;
        this.zzdba = zzflw;
    }

    private final zzfme zzbw(String str) {
        zzfme zzfme;
        synchronized (this.mLock) {
            zzfme = (zzfme) this.zzdbb.get(str);
        }
        return zzfme;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00e5 in {3, 7, 11, 12, 13, 17, 25, 26, 29, 32, 35} preds:[]
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
    private final com.google.android.gms.internal.zzalt<java.lang.Void> zzpi() {
        /*
        r9 = this;
        r0 = r9.zzdbd;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x000c;
        r0 = r9.zzcxr;
        r0 = r0.zzdbt;
        if (r0 != 0) goto L_0x0020;
        r0 = r9.zzdbh;
        if (r0 == 0) goto L_0x0016;
        r0 = r9.zzcxr;
        r0 = r0.zzdbs;
        if (r0 != 0) goto L_0x0020;
        r0 = r9.zzdbd;
        if (r0 != 0) goto L_0x0022;
        r0 = r9.zzcxr;
        r0 = r0.zzdbq;
        if (r0 == 0) goto L_0x0022;
        r0 = 1;
        goto L_0x0023;
        r0 = 0;
        r3 = 0;
        if (r0 != 0) goto L_0x002b;
        r0 = com.google.android.gms.internal.zzali.zzh(r3);
        return r0;
        r0 = r9.mLock;
        monitor-enter(r0);
        r4 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r5 = r9.zzdbb;	 Catch:{ all -> 0x00e2 }
        r5 = r5.size();	 Catch:{ all -> 0x00e2 }
        r5 = new com.google.android.gms.internal.zzfme[r5];	 Catch:{ all -> 0x00e2 }
        r4.zzpwj = r5;	 Catch:{ all -> 0x00e2 }
        r4 = r9.zzdbb;	 Catch:{ all -> 0x00e2 }
        r4 = r4.values();	 Catch:{ all -> 0x00e2 }
        r5 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r5 = r5.zzpwj;	 Catch:{ all -> 0x00e2 }
        r4.toArray(r5);	 Catch:{ all -> 0x00e2 }
        r4 = com.google.android.gms.internal.zzagp.isEnabled();	 Catch:{ all -> 0x00e2 }
        if (r4 == 0) goto L_0x00b3;	 Catch:{ all -> 0x00e2 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e2 }
        r5 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r5 = r5.url;	 Catch:{ all -> 0x00e2 }
        r6 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r6 = r6.zzpwk;	 Catch:{ all -> 0x00e2 }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00e2 }
        r7 = r7.length();	 Catch:{ all -> 0x00e2 }
        r7 = r7 + 53;	 Catch:{ all -> 0x00e2 }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00e2 }
        r8 = r8.length();	 Catch:{ all -> 0x00e2 }
        r7 = r7 + r8;	 Catch:{ all -> 0x00e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e2 }
        r8.<init>(r7);	 Catch:{ all -> 0x00e2 }
        r7 = "Sending SB report\n  url: ";	 Catch:{ all -> 0x00e2 }
        r8.append(r7);	 Catch:{ all -> 0x00e2 }
        r8.append(r5);	 Catch:{ all -> 0x00e2 }
        r5 = "\n  clickUrl: ";	 Catch:{ all -> 0x00e2 }
        r8.append(r5);	 Catch:{ all -> 0x00e2 }
        r8.append(r6);	 Catch:{ all -> 0x00e2 }
        r5 = "\n  resources: \n";	 Catch:{ all -> 0x00e2 }
        r8.append(r5);	 Catch:{ all -> 0x00e2 }
        r5 = r8.toString();	 Catch:{ all -> 0x00e2 }
        r4.<init>(r5);	 Catch:{ all -> 0x00e2 }
        r5 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r5 = r5.zzpwj;	 Catch:{ all -> 0x00e2 }
        r6 = r5.length;	 Catch:{ all -> 0x00e2 }
        if (r1 >= r6) goto L_0x00ac;	 Catch:{ all -> 0x00e2 }
        r7 = r5[r1];	 Catch:{ all -> 0x00e2 }
        r8 = "    [";	 Catch:{ all -> 0x00e2 }
        r4.append(r8);	 Catch:{ all -> 0x00e2 }
        r8 = r7.zzpxo;	 Catch:{ all -> 0x00e2 }
        r8 = r8.length;	 Catch:{ all -> 0x00e2 }
        r4.append(r8);	 Catch:{ all -> 0x00e2 }
        r8 = "] ";	 Catch:{ all -> 0x00e2 }
        r4.append(r8);	 Catch:{ all -> 0x00e2 }
        r7 = r7.url;	 Catch:{ all -> 0x00e2 }
        r4.append(r7);	 Catch:{ all -> 0x00e2 }
        r1 = r1 + 1;	 Catch:{ all -> 0x00e2 }
        goto L_0x0090;	 Catch:{ all -> 0x00e2 }
        r1 = r4.toString();	 Catch:{ all -> 0x00e2 }
        com.google.android.gms.internal.zzagp.zzby(r1);	 Catch:{ all -> 0x00e2 }
        r1 = r9.zzdba;	 Catch:{ all -> 0x00e2 }
        r1 = com.google.android.gms.internal.zzfls.zzc(r1);	 Catch:{ all -> 0x00e2 }
        r4 = r9.zzcxr;	 Catch:{ all -> 0x00e2 }
        r4 = r4.zzdbo;	 Catch:{ all -> 0x00e2 }
        r5 = new com.google.android.gms.internal.zzajr;	 Catch:{ all -> 0x00e2 }
        r6 = r9.mContext;	 Catch:{ all -> 0x00e2 }
        r5.<init>(r6);	 Catch:{ all -> 0x00e2 }
        r1 = r5.zza(r2, r4, r3, r1);	 Catch:{ all -> 0x00e2 }
        r2 = com.google.android.gms.internal.zzagp.isEnabled();	 Catch:{ all -> 0x00e2 }
        if (r2 == 0) goto L_0x00d8;	 Catch:{ all -> 0x00e2 }
        r2 = new com.google.android.gms.internal.zzagk;	 Catch:{ all -> 0x00e2 }
        r2.<init>(r9);	 Catch:{ all -> 0x00e2 }
        r3 = com.google.android.gms.internal.zzaid.zzdfi;	 Catch:{ all -> 0x00e2 }
        r1.zza(r2, r3);	 Catch:{ all -> 0x00e2 }
        r2 = com.google.android.gms.internal.zzagh.zzdbj;	 Catch:{ all -> 0x00e2 }
        r3 = com.google.android.gms.internal.zzaly.zzdju;	 Catch:{ all -> 0x00e2 }
        r1 = com.google.android.gms.internal.zzali.zza(r1, r2, r3);	 Catch:{ all -> 0x00e2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e2 }
        return r1;	 Catch:{ all -> 0x00e2 }
        r1 = move-exception;	 Catch:{ all -> 0x00e2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e2 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagf.zzpi():com.google.android.gms.internal.zzalt");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00c9 in {6, 10, 12, 23, 24, 27, 28, 31, 33, 35, 36, 39, 42} preds:[]
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
    public final void zza(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = 3;
        if (r9 != r1) goto L_0x0009;
        r2 = 1;
        r6.zzdbh = r2;	 Catch:{ all -> 0x00c6 }
        r2 = r6.zzdbb;	 Catch:{ all -> 0x00c6 }
        r2 = r2.containsKey(r7);	 Catch:{ all -> 0x00c6 }
        if (r2 == 0) goto L_0x0023;	 Catch:{ all -> 0x00c6 }
        if (r9 != r1) goto L_0x0021;	 Catch:{ all -> 0x00c6 }
        r8 = r6.zzdbb;	 Catch:{ all -> 0x00c6 }
        r7 = r8.get(r7);	 Catch:{ all -> 0x00c6 }
        r7 = (com.google.android.gms.internal.zzfme) r7;	 Catch:{ all -> 0x00c6 }
        r8 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x00c6 }
        r7.zzpxn = r8;	 Catch:{ all -> 0x00c6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c6 }
        return;	 Catch:{ all -> 0x00c6 }
        r1 = new com.google.android.gms.internal.zzfme;	 Catch:{ all -> 0x00c6 }
        r1.<init>();	 Catch:{ all -> 0x00c6 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x00c6 }
        r1.zzpxn = r9;	 Catch:{ all -> 0x00c6 }
        r9 = r6.zzdbb;	 Catch:{ all -> 0x00c6 }
        r9 = r9.size();	 Catch:{ all -> 0x00c6 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x00c6 }
        r1.zzjsx = r9;	 Catch:{ all -> 0x00c6 }
        r1.url = r7;	 Catch:{ all -> 0x00c6 }
        r9 = new com.google.android.gms.internal.zzflz;	 Catch:{ all -> 0x00c6 }
        r9.<init>();	 Catch:{ all -> 0x00c6 }
        r1.zzpxi = r9;	 Catch:{ all -> 0x00c6 }
        r9 = r6.zzdbe;	 Catch:{ all -> 0x00c6 }
        r9 = r9.size();	 Catch:{ all -> 0x00c6 }
        if (r9 <= 0) goto L_0x00bf;	 Catch:{ all -> 0x00c6 }
        if (r8 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00c6 }
        r9 = new java.util.LinkedList;	 Catch:{ all -> 0x00c6 }
        r9.<init>();	 Catch:{ all -> 0x00c6 }
        r8 = r8.entrySet();	 Catch:{ all -> 0x00c6 }
        r8 = r8.iterator();	 Catch:{ all -> 0x00c6 }
        r2 = r8.hasNext();	 Catch:{ all -> 0x00c6 }
        if (r2 == 0) goto L_0x00b2;	 Catch:{ all -> 0x00c6 }
        r2 = r8.next();	 Catch:{ all -> 0x00c6 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x00c6 }
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        if (r3 == 0) goto L_0x0073;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r3 = (java.lang.String) r3;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        goto L_0x0075;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r3 = "";	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        if (r4 == 0) goto L_0x0082;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r2 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        goto L_0x0084;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r2 = "";	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4 = r3.toLowerCase(r4);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r5 = r6.zzdbe;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4 = r5.contains(r4);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        if (r4 != 0) goto L_0x0093;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        goto L_0x005a;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4 = new com.google.android.gms.internal.zzfly;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r5 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r3 = r3.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4.zzpwu = r3;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r4.zzosz = r2;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        r9.add(r4);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        goto L_0x005a;
    L_0x00ac:
        r2 = "Cannot convert string to bytes, skip header.";	 Catch:{ all -> 0x00c6 }
        com.google.android.gms.internal.zzagp.zzby(r2);	 Catch:{ all -> 0x00c6 }
        goto L_0x005a;	 Catch:{ all -> 0x00c6 }
        r8 = r9.size();	 Catch:{ all -> 0x00c6 }
        r8 = new com.google.android.gms.internal.zzfly[r8];	 Catch:{ all -> 0x00c6 }
        r9.toArray(r8);	 Catch:{ all -> 0x00c6 }
        r9 = r1.zzpxi;	 Catch:{ all -> 0x00c6 }
        r9.zzpww = r8;	 Catch:{ all -> 0x00c6 }
        r8 = r6.zzdbb;	 Catch:{ all -> 0x00c6 }
        r8.put(r7, r1);	 Catch:{ all -> 0x00c6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c6 }
        return;	 Catch:{ all -> 0x00c6 }
        r7 = move-exception;	 Catch:{ all -> 0x00c6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00c6 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzagf.zza(java.lang.String, java.util.Map, int):void");
    }

    public final void zzbv(String str) {
        synchronized (this.mLock) {
            this.zzdba.zzpwk = str;
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ zzalt zzp(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    String str2;
                    JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.mLock) {
                            int length = optJSONArray.length();
                            zzfme zzbw = zzbw(str2);
                            if (zzbw == null) {
                                String str3 = "Cannot find the corresponding resource object for ";
                                str2 = String.valueOf(str2);
                                zzagp.zzby(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                            } else {
                                zzbw.zzpxo = new String[length];
                                int i = 0;
                                for (int i2 = 0; i2 < length; i2++) {
                                    zzbw.zzpxo[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                boolean z = this.zzdbd;
                                if (length > 0) {
                                    i = 1;
                                }
                                this.zzdbd = i | z;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzlc.zzio().zzd(zzoi.zzbty)).booleanValue()) {
                    zzaky.zza("Failed to get SafeBrowsing metadata", e);
                }
                return zzali.zzd(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdbd) {
            synchronized (this.mLock) {
                this.zzdba.zzbdh = Integer.valueOf(9);
            }
        }
        return zzpi();
    }

    public final zzagn zzpe() {
        return this.zzcxr;
    }

    public final boolean zzpf() {
        return zzs.zzanv() && this.zzcxr.zzdbp && !this.zzdbg;
    }

    public final void zzpg() {
        this.zzdbf = true;
    }

    public final void zzph() {
        synchronized (this.mLock) {
            zzalt zza = zzali.zza(this.zzdbc.zza(this.mContext, this.zzdbb.keySet()), new zzagg(this), zzaly.zzdju);
            zzalt zza2 = zzali.zza(zza, 10, TimeUnit.SECONDS, zzdaz);
            zzali.zza(zza, new zzagj(this, zza2), zzaly.zzdju);
            zzday.add(zza2);
        }
    }

    public final void zzq(View view) {
        if (this.zzcxr.zzdbp && !this.zzdbg) {
            zzbt.zzel();
            Bitmap zzs = zzaij.zzs(view);
            if (zzs == null) {
                zzagp.zzby("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdbg = true;
            zzaij.zzc(new zzagi(this, zzs));
        }
    }
}

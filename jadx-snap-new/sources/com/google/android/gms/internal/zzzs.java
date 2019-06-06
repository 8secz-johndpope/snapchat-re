package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzabh
public final class zzzs extends zzzi {
    private final zzov zzanh;
    private zzwf zzanu;
    private final zzaof zzcct;
    private zzvq zzcir;
    private zzvo zzcon;
    protected zzvw zzcoo;
    private boolean zzcop;

    zzzs(Context context, zzahe zzahe, zzwf zzwf, zzzn zzzn, zzov zzov, zzaof zzaof) {
        super(context, zzahe, zzzn);
        this.zzanu = zzwf;
        this.zzcir = zzahe.zzdcj;
        this.zzanh = zzov;
        this.zzcct = zzaof;
    }

    private static String zzk(List<zzvw> list) {
        Object obj = "";
        if (list == null) {
            return obj;
        }
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return obj.substring(0, Math.max(0, obj.length() - 1));
            }
            zzvw zzvw = (zzvw) it.next();
            if (!(zzvw == null || zzvw.zzcje == null || TextUtils.isEmpty(zzvw.zzcje.zzche))) {
                String valueOf = String.valueOf(obj);
                String str = zzvw.zzcje.zzche;
                int i2 = zzvw.zzcjd;
                if (i2 == -1) {
                    i = 4;
                } else if (i2 != 0) {
                    i = i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? 6 : 5 : 3 : 2 : 1;
                }
                long j = zzvw.zzcjj;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
                stringBuilder.append(str);
                String str2 = ".";
                stringBuilder.append(str2);
                stringBuilder.append(i);
                stringBuilder.append(str2);
                stringBuilder.append(j);
                str2 = stringBuilder.toString();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length());
                stringBuilder2.append(valueOf);
                stringBuilder2.append(str2);
                stringBuilder2.append("_");
                obj = stringBuilder2.toString();
            }
        }
    }

    public final void onStop() {
        synchronized (this.zzcoe) {
            super.onStop();
            if (this.zzcon != null) {
                this.zzcon.cancel();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:60:0x0178 in {5, 6, 13, 14, 21, 26, 28, 44, 46, 48, 51, 54, 55, 59} preds:[]
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
    protected final void zze(long r32) {
        /*
        r31 = this;
        r1 = r31;
        r2 = r1.zzcoe;
        monitor-enter(r2);
        r0 = r1.zzcir;	 Catch:{ all -> 0x0175 }
        r0 = r0.zzcif;	 Catch:{ all -> 0x0175 }
        r3 = -1;	 Catch:{ all -> 0x0175 }
        if (r0 == r3) goto L_0x0043;	 Catch:{ all -> 0x0175 }
        r0 = new com.google.android.gms.internal.zzvz;	 Catch:{ all -> 0x0175 }
        r5 = r1.mContext;	 Catch:{ all -> 0x0175 }
        r3 = r1.zzcob;	 Catch:{ all -> 0x0175 }
        r6 = r3.zzcvm;	 Catch:{ all -> 0x0175 }
        r7 = r1.zzanu;	 Catch:{ all -> 0x0175 }
        r8 = r1.zzcir;	 Catch:{ all -> 0x0175 }
        r3 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r9 = r3.zzbid;	 Catch:{ all -> 0x0175 }
        r3 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r10 = r3.zzbif;	 Catch:{ all -> 0x0175 }
        r3 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r11 = r3.zzcuh;	 Catch:{ all -> 0x0175 }
        r3 = com.google.android.gms.internal.zzoi.zzbrg;	 Catch:{ all -> 0x0175 }
        r4 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0175 }
        r3 = r4.zzd(r3);	 Catch:{ all -> 0x0175 }
        r3 = (java.lang.Long) r3;	 Catch:{ all -> 0x0175 }
        r14 = r3.longValue();	 Catch:{ all -> 0x0175 }
        r16 = 2;	 Catch:{ all -> 0x0175 }
        r3 = r1.zzcob;	 Catch:{ all -> 0x0175 }
        r3 = r3.zzdcv;	 Catch:{ all -> 0x0175 }
        r4 = r0;	 Catch:{ all -> 0x0175 }
        r12 = r32;	 Catch:{ all -> 0x0175 }
        r17 = r3;	 Catch:{ all -> 0x0175 }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17);	 Catch:{ all -> 0x0175 }
        goto L_0x008a;	 Catch:{ all -> 0x0175 }
        r0 = new com.google.android.gms.internal.zzwc;	 Catch:{ all -> 0x0175 }
        r3 = r1.mContext;	 Catch:{ all -> 0x0175 }
        r4 = r1.zzcob;	 Catch:{ all -> 0x0175 }
        r4 = r4.zzcvm;	 Catch:{ all -> 0x0175 }
        r5 = r1.zzanu;	 Catch:{ all -> 0x0175 }
        r6 = r1.zzcir;	 Catch:{ all -> 0x0175 }
        r7 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r7 = r7.zzbid;	 Catch:{ all -> 0x0175 }
        r8 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r8 = r8.zzbif;	 Catch:{ all -> 0x0175 }
        r9 = r1.zzcoc;	 Catch:{ all -> 0x0175 }
        r9 = r9.zzcuh;	 Catch:{ all -> 0x0175 }
        r10 = com.google.android.gms.internal.zzoi.zzbrg;	 Catch:{ all -> 0x0175 }
        r11 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0175 }
        r10 = r11.zzd(r10);	 Catch:{ all -> 0x0175 }
        r10 = (java.lang.Long) r10;	 Catch:{ all -> 0x0175 }
        r27 = r10.longValue();	 Catch:{ all -> 0x0175 }
        r10 = r1.zzanh;	 Catch:{ all -> 0x0175 }
        r11 = r1.zzcob;	 Catch:{ all -> 0x0175 }
        r11 = r11.zzdcv;	 Catch:{ all -> 0x0175 }
        r17 = r0;	 Catch:{ all -> 0x0175 }
        r18 = r3;	 Catch:{ all -> 0x0175 }
        r19 = r4;	 Catch:{ all -> 0x0175 }
        r20 = r5;	 Catch:{ all -> 0x0175 }
        r21 = r6;	 Catch:{ all -> 0x0175 }
        r22 = r7;	 Catch:{ all -> 0x0175 }
        r23 = r8;	 Catch:{ all -> 0x0175 }
        r24 = r9;	 Catch:{ all -> 0x0175 }
        r25 = r32;	 Catch:{ all -> 0x0175 }
        r29 = r10;	 Catch:{ all -> 0x0175 }
        r30 = r11;	 Catch:{ all -> 0x0175 }
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30);	 Catch:{ all -> 0x0175 }
        r1.zzcon = r0;	 Catch:{ all -> 0x0175 }
        monitor-exit(r2);	 Catch:{ all -> 0x0175 }
        r0 = new java.util.ArrayList;
        r2 = r1.zzcir;
        r2 = r2.zzchv;
        r0.<init>(r2);
        r2 = r1.zzcob;
        r2 = r2.zzcvm;
        r2 = r2.zzcrv;
        r2 = r2.zzbhf;
        r3 = "com.google.ads.mediation.admob.AdMobAdapter";
        r4 = 0;
        if (r2 == 0) goto L_0x00b0;
        r2 = r2.getBundle(r3);
        if (r2 == 0) goto L_0x00b0;
        r5 = "_skipMediation";
        r2 = r2.getBoolean(r5);
        goto L_0x00b1;
        r2 = 0;
        if (r2 == 0) goto L_0x00cf;
        r2 = r0.listIterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x00cf;
        r5 = r2.next();
        r5 = (com.google.android.gms.internal.zzvp) r5;
        r5 = r5.zzchd;
        r5 = r5.contains(r3);
        if (r5 != 0) goto L_0x00b7;
        r2.remove();
        goto L_0x00b7;
        r2 = r1.zzcon;
        r0 = r2.zzh(r0);
        r1.zzcoo = r0;
        r0 = r1.zzcoo;
        r0 = r0.zzcjd;
        r2 = 1;
        if (r0 == 0) goto L_0x0106;
        if (r0 == r2) goto L_0x00fd;
        r0 = new com.google.android.gms.internal.zzzl;
        r2 = r1.zzcoo;
        r2 = r2.zzcjd;
        r3 = 40;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r3);
        r3 = "Unexpected mediation result: ";
        r5.append(r3);
        r5.append(r2);
        r2 = r5.toString();
        r0.<init>(r2, r4);
        throw r0;
        r0 = new com.google.android.gms.internal.zzzl;
        r2 = 3;
        r3 = "No fill from any mediation ad networks.";
        r0.<init>(r3, r2);
        throw r0;
        r0 = r1.zzcoo;
        r0 = r0.zzcje;
        if (r0 == 0) goto L_0x0174;
        r0 = r1.zzcoo;
        r0 = r0.zzcje;
        r0 = r0.zzcho;
        if (r0 == 0) goto L_0x0174;
        r0 = new java.util.concurrent.CountDownLatch;
        r0.<init>(r2);
        r2 = com.google.android.gms.internal.zzaij.zzdfn;
        r3 = new com.google.android.gms.internal.zzzt;
        r3.<init>(r1, r0);
        r2.post(r3);
        r2 = 10;
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x014e }
        r0.await(r2, r5);	 Catch:{ InterruptedException -> 0x014e }
        r2 = r1.zzcoe;
        monitor-enter(r2);
        r0 = r1.zzcop;	 Catch:{ all -> 0x014b }
        if (r0 == 0) goto L_0x0143;	 Catch:{ all -> 0x014b }
        r0 = r1.zzcct;	 Catch:{ all -> 0x014b }
        r0 = r0.isDestroyed();	 Catch:{ all -> 0x014b }
        if (r0 != 0) goto L_0x013b;	 Catch:{ all -> 0x014b }
        monitor-exit(r2);	 Catch:{ all -> 0x014b }
        return;	 Catch:{ all -> 0x014b }
        r0 = new com.google.android.gms.internal.zzzl;	 Catch:{ all -> 0x014b }
        r3 = "Assets not loaded, web view is destroyed";	 Catch:{ all -> 0x014b }
        r0.<init>(r3, r4);	 Catch:{ all -> 0x014b }
        throw r0;	 Catch:{ all -> 0x014b }
        r0 = new com.google.android.gms.internal.zzzl;	 Catch:{ all -> 0x014b }
        r3 = "View could not be prepared";	 Catch:{ all -> 0x014b }
        r0.<init>(r3, r4);	 Catch:{ all -> 0x014b }
        throw r0;	 Catch:{ all -> 0x014b }
        r0 = move-exception;	 Catch:{ all -> 0x014b }
        monitor-exit(r2);	 Catch:{ all -> 0x014b }
        throw r0;
        r0 = move-exception;
        r2 = new com.google.android.gms.internal.zzzl;
        r0 = java.lang.String.valueOf(r0);
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 38;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r3);
        r3 = "Interrupted while waiting for latch : ";
        r5.append(r3);
        r5.append(r0);
        r0 = r5.toString();
        r2.<init>(r0, r4);
        throw r2;
        return;
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0175 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzzs.zze(long):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final zzahd zzy(int i) {
        zzacf zzacf = this.zzcob.zzcvm;
        zzkk zzkk = zzacf.zzcrv;
        zzaof zzaof = this.zzcct;
        List list = this.zzcoc.zzchw;
        List list2 = this.zzcoc.zzchx;
        List list3 = this.zzcoc.zzctq;
        int i2 = this.zzcoc.orientation;
        long j = this.zzcoc.zzcic;
        String str = zzacf.zzcry;
        boolean z = this.zzcoc.zzcto;
        zzvw zzvw = this.zzcoo;
        zzvp zzvp = zzvw != null ? zzvw.zzcje : null;
        zzvw = this.zzcoo;
        zzwi zzwi = zzvw != null ? zzvw.zzcjf : null;
        zzvw = this.zzcoo;
        String name = zzvw != null ? zzvw.zzcjg : AdMobAdapter.class.getName();
        zzvq zzvq = this.zzcir;
        zzvw zzvw2 = this.zzcoo;
        zzvs zzvs = zzvw2 != null ? zzvw2.zzcjh : null;
        zzvp zzvp2 = zzvp;
        zzwi zzwi2 = zzwi;
        long j2 = this.zzcoc.zzctp;
        zzko zzko = this.zzcob.zzaud;
        long j3 = j2;
        long j4 = this.zzcoc.zzctn;
        long j5 = this.zzcob.zzdcn;
        j2 = this.zzcoc.zzcts;
        String str2 = this.zzcoc.zzctt;
        JSONObject jSONObject = this.zzcob.zzdch;
        zzagd zzagd = this.zzcoc.zzcuc;
        List list4 = this.zzcoc.zzcud;
        List list5 = this.zzcoc.zzcue;
        zzvq zzvq2 = this.zzcir;
        boolean z2 = zzvq2 != null ? zzvq2.zzcih : false;
        zzacl zzacl = this.zzcoc.zzcug;
        zzvo zzvo = this.zzcon;
        zzacl zzacl2 = zzacl;
        return new zzahd(zzkk, zzaof, list, i, list2, list3, i2, j, str, z, zzvp2, zzwi2, name, zzvq, zzvs, j3, zzko, j4, j5, j2, str2, jSONObject, null, zzagd, list4, list5, z2, zzacl2, zzvo != null ? zzk(zzvo.zzmf()) : null, this.zzcoc.zzchz, this.zzcoc.zzcuj, this.zzcob.zzdcu, this.zzcoc.zzaqw, this.zzcob.zzdcv);
    }
}

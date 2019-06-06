package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzabh
public final class zzov {
    private final Object mLock = new Object();
    private boolean zzbwc;
    private final List<zzot> zzbwt = new LinkedList();
    private final Map<String, String> zzbwu = new LinkedHashMap();
    private String zzbwv;
    private zzov zzbww;

    public zzov(boolean z, String str, String str2) {
        this.zzbwc = z;
        this.zzbwu.put("action", str);
        this.zzbwu.put("ad_format", str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x001c in {5, 8, 11} preds:[]
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
    public final boolean zza(com.google.android.gms.internal.zzot r6, long r7, java.lang.String... r9) {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = r9.length;	 Catch:{ all -> 0x0019 }
        r2 = 0;	 Catch:{ all -> 0x0019 }
        if (r2 >= r1) goto L_0x0016;	 Catch:{ all -> 0x0019 }
        r3 = r9[r2];	 Catch:{ all -> 0x0019 }
        r4 = new com.google.android.gms.internal.zzot;	 Catch:{ all -> 0x0019 }
        r4.<init>(r7, r3, r6);	 Catch:{ all -> 0x0019 }
        r3 = r5.zzbwt;	 Catch:{ all -> 0x0019 }
        r3.add(r4);	 Catch:{ all -> 0x0019 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0019 }
        goto L_0x0005;	 Catch:{ all -> 0x0019 }
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        r6 = 1;	 Catch:{ all -> 0x0019 }
        return r6;	 Catch:{ all -> 0x0019 }
        r6 = move-exception;	 Catch:{ all -> 0x0019 }
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzov.zza(com.google.android.gms.internal.zzot, long, java.lang.String[]):boolean");
    }

    public final boolean zza(zzot zzot, String... strArr) {
        return (!this.zzbwc || zzot == null) ? false : zza(zzot, zzbt.zzes().elapsedRealtime(), strArr);
    }

    public final void zzao(String str) {
        if (this.zzbwc) {
            synchronized (this.mLock) {
                this.zzbwv = str;
            }
        }
    }

    public final void zzc(zzov zzov) {
        synchronized (this.mLock) {
            this.zzbww = zzov;
        }
    }

    public final zzot zzd(long j) {
        return !this.zzbwc ? null : new zzot(j, null, null);
    }

    public final void zzf(String str, String str2) {
        if (this.zzbwc && !TextUtils.isEmpty(str2)) {
            zzol zzpv = zzbt.zzep().zzpv();
            if (zzpv != null) {
                synchronized (this.mLock) {
                    zzop zzam = zzpv.zzam(str);
                    Map map = this.zzbwu;
                    map.put(str, zzam.zze((String) map.get(str), str2));
                }
            }
        }
    }

    public final zzot zzjo() {
        return zzd(zzbt.zzes().elapsedRealtime());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x006f in {10, 13, 16, 19, 22} preds:[]
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
    public final java.lang.String zzjp() {
        /*
        r10 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r10.mLock;
        monitor-enter(r1);
        r2 = r10.zzbwt;	 Catch:{ all -> 0x006c }
        r2 = r2.iterator();	 Catch:{ all -> 0x006c }
        r3 = r2.hasNext();	 Catch:{ all -> 0x006c }
        if (r3 == 0) goto L_0x0044;	 Catch:{ all -> 0x006c }
        r3 = r2.next();	 Catch:{ all -> 0x006c }
        r3 = (com.google.android.gms.internal.zzot) r3;	 Catch:{ all -> 0x006c }
        r4 = r3.getTime();	 Catch:{ all -> 0x006c }
        r6 = r3.zzjl();	 Catch:{ all -> 0x006c }
        r3 = r3.zzjm();	 Catch:{ all -> 0x006c }
        if (r3 == 0) goto L_0x000e;	 Catch:{ all -> 0x006c }
        r7 = 0;	 Catch:{ all -> 0x006c }
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));	 Catch:{ all -> 0x006c }
        if (r9 <= 0) goto L_0x000e;	 Catch:{ all -> 0x006c }
        r7 = r3.getTime();	 Catch:{ all -> 0x006c }
        r4 = r4 - r7;	 Catch:{ all -> 0x006c }
        r0.append(r6);	 Catch:{ all -> 0x006c }
        r3 = 46;	 Catch:{ all -> 0x006c }
        r0.append(r3);	 Catch:{ all -> 0x006c }
        r0.append(r4);	 Catch:{ all -> 0x006c }
        r3 = 44;	 Catch:{ all -> 0x006c }
        r0.append(r3);	 Catch:{ all -> 0x006c }
        goto L_0x000e;	 Catch:{ all -> 0x006c }
        r2 = r10.zzbwt;	 Catch:{ all -> 0x006c }
        r2.clear();	 Catch:{ all -> 0x006c }
        r2 = r10.zzbwv;	 Catch:{ all -> 0x006c }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x006c }
        if (r2 != 0) goto L_0x0057;	 Catch:{ all -> 0x006c }
        r2 = r10.zzbwv;	 Catch:{ all -> 0x006c }
        r0.append(r2);	 Catch:{ all -> 0x006c }
        goto L_0x0066;	 Catch:{ all -> 0x006c }
        r2 = r0.length();	 Catch:{ all -> 0x006c }
        if (r2 <= 0) goto L_0x0066;	 Catch:{ all -> 0x006c }
        r2 = r0.length();	 Catch:{ all -> 0x006c }
        r2 = r2 + -1;	 Catch:{ all -> 0x006c }
        r0.setLength(r2);	 Catch:{ all -> 0x006c }
        r0 = r0.toString();	 Catch:{ all -> 0x006c }
        monitor-exit(r1);	 Catch:{ all -> 0x006c }
        return r0;	 Catch:{ all -> 0x006c }
        r0 = move-exception;	 Catch:{ all -> 0x006c }
        monitor-exit(r1);	 Catch:{ all -> 0x006c }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzov.zzjp():java.lang.String");
    }

    /* Access modifiers changed, original: final */
    public final Map<String, String> zzjq() {
        synchronized (this.mLock) {
            Map zza;
            zzol zzpv = zzbt.zzep().zzpv();
            if (zzpv != null) {
                if (this.zzbww != null) {
                    zza = zzpv.zza(this.zzbwu, this.zzbww.zzjq());
                    return zza;
                }
            }
            zza = this.zzbwu;
            return zza;
        }
    }

    public final zzot zzjr() {
        synchronized (this.mLock) {
        }
        return null;
    }
}

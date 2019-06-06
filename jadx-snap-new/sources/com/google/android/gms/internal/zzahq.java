package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.HashSet;

@zzabh
public final class zzahq implements zzhl {
    private final Object lock;
    private zzahm zzdem;
    private HashSet<zzahf> zzden;
    private HashSet<zzahp> zzdeo;

    public zzahq() {
        this(zzlc.zzil());
    }

    private zzahq(String str) {
        this.lock = new Object();
        this.zzden = new HashSet();
        this.zzdeo = new HashSet();
        this.zzdem = new zzahm(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x006e in {6, 10, 13, 16} preds:[]
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
    public final android.os.Bundle zza(android.content.Context r5, com.google.android.gms.internal.zzahn r6, java.lang.String r7) {
        /*
        r4 = this;
        r0 = r4.lock;
        monitor-enter(r0);
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x006b }
        r1.<init>();	 Catch:{ all -> 0x006b }
        r2 = "app";	 Catch:{ all -> 0x006b }
        r3 = r4.zzdem;	 Catch:{ all -> 0x006b }
        r5 = r3.zzk(r5, r7);	 Catch:{ all -> 0x006b }
        r1.putBundle(r2, r5);	 Catch:{ all -> 0x006b }
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x006b }
        r5.<init>();	 Catch:{ all -> 0x006b }
        r7 = r4.zzdeo;	 Catch:{ all -> 0x006b }
        r7 = r7.iterator();	 Catch:{ all -> 0x006b }
        r2 = r7.hasNext();	 Catch:{ all -> 0x006b }
        if (r2 == 0) goto L_0x0036;	 Catch:{ all -> 0x006b }
        r2 = r7.next();	 Catch:{ all -> 0x006b }
        r2 = (com.google.android.gms.internal.zzahp) r2;	 Catch:{ all -> 0x006b }
        r3 = r2.zzqh();	 Catch:{ all -> 0x006b }
        r2 = r2.toBundle();	 Catch:{ all -> 0x006b }
        r5.putBundle(r3, r2);	 Catch:{ all -> 0x006b }
        goto L_0x001e;	 Catch:{ all -> 0x006b }
        r7 = "slots";	 Catch:{ all -> 0x006b }
        r1.putBundle(r7, r5);	 Catch:{ all -> 0x006b }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x006b }
        r5.<init>();	 Catch:{ all -> 0x006b }
        r7 = r4.zzden;	 Catch:{ all -> 0x006b }
        r7 = r7.iterator();	 Catch:{ all -> 0x006b }
        r2 = r7.hasNext();	 Catch:{ all -> 0x006b }
        if (r2 == 0) goto L_0x005a;	 Catch:{ all -> 0x006b }
        r2 = r7.next();	 Catch:{ all -> 0x006b }
        r2 = (com.google.android.gms.internal.zzahf) r2;	 Catch:{ all -> 0x006b }
        r2 = r2.toBundle();	 Catch:{ all -> 0x006b }
        r5.add(r2);	 Catch:{ all -> 0x006b }
        goto L_0x0046;	 Catch:{ all -> 0x006b }
        r7 = "ads";	 Catch:{ all -> 0x006b }
        r1.putParcelableArrayList(r7, r5);	 Catch:{ all -> 0x006b }
        r5 = r4.zzden;	 Catch:{ all -> 0x006b }
        r6.zza(r5);	 Catch:{ all -> 0x006b }
        r5 = r4.zzden;	 Catch:{ all -> 0x006b }
        r5.clear();	 Catch:{ all -> 0x006b }
        monitor-exit(r0);	 Catch:{ all -> 0x006b }
        return r1;	 Catch:{ all -> 0x006b }
        r5 = move-exception;	 Catch:{ all -> 0x006b }
        monitor-exit(r0);	 Catch:{ all -> 0x006b }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahq.zza(android.content.Context, com.google.android.gms.internal.zzahn, java.lang.String):android.os.Bundle");
    }

    public final void zza(zzahf zzahf) {
        synchronized (this.lock) {
            this.zzden.add(zzahf);
        }
    }

    public final void zza(zzahp zzahp) {
        synchronized (this.lock) {
            this.zzdeo.add(zzahp);
        }
    }

    public final void zzb(zzkk zzkk, long j) {
        synchronized (this.lock) {
            this.zzdem.zzb(zzkk, j);
        }
    }

    public final void zzb(HashSet<zzahf> hashSet) {
        synchronized (this.lock) {
            this.zzden.addAll(hashSet);
        }
    }

    public final void zzh(boolean z) {
        long currentTimeMillis = zzbt.zzes().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - zzbt.zzep().zzqe().zzqw() > ((Long) zzlc.zzio().zzd(zzoi.zzbpc)).longValue()) {
                this.zzdem.zzdef = -1;
                return;
            }
            this.zzdem.zzdef = zzbt.zzep().zzqe().zzqx();
            return;
        }
        zzbt.zzep().zzqe().zzj(currentTimeMillis);
        zzbt.zzep().zzqe().zzad(this.zzdem.zzdef);
    }

    public final void zzpk() {
        synchronized (this.lock) {
            this.zzdem.zzpk();
        }
    }

    public final void zzpl() {
        synchronized (this.lock) {
            this.zzdem.zzpl();
        }
    }
}

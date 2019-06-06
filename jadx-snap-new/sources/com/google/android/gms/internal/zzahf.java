package com.google.android.gms.internal;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbt;
import java.util.LinkedList;

@zzabh
public final class zzahf {
    private final Object mLock;
    private final zzahq zzatv;
    private boolean zzcwy;
    private final LinkedList<zzahg> zzdcx;
    private final String zzdcy;
    private final String zzdcz;
    private long zzdda;
    private long zzddb;
    private long zzddc;
    private long zzddd;
    private long zzdde;
    private long zzddf;

    private zzahf(zzahq zzahq, String str, String str2) {
        this.mLock = new Object();
        this.zzdda = -1;
        this.zzddb = -1;
        this.zzcwy = false;
        this.zzddc = -1;
        this.zzddd = 0;
        this.zzdde = -1;
        this.zzddf = -1;
        this.zzatv = zzahq;
        this.zzdcy = str;
        this.zzdcz = str2;
        this.zzdcx = new LinkedList();
    }

    public zzahf(String str, String str2) {
        this(zzbt.zzeq(), str, str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0070 in {6, 9, 12} preds:[]
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
    public final android.os.Bundle toBundle() {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x006d }
        r1.<init>();	 Catch:{ all -> 0x006d }
        r2 = "seq_num";	 Catch:{ all -> 0x006d }
        r3 = r5.zzdcy;	 Catch:{ all -> 0x006d }
        r1.putString(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "slotid";	 Catch:{ all -> 0x006d }
        r3 = r5.zzdcz;	 Catch:{ all -> 0x006d }
        r1.putString(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "ismediation";	 Catch:{ all -> 0x006d }
        r3 = r5.zzcwy;	 Catch:{ all -> 0x006d }
        r1.putBoolean(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "treq";	 Catch:{ all -> 0x006d }
        r3 = r5.zzdde;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "tresponse";	 Catch:{ all -> 0x006d }
        r3 = r5.zzddf;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "timp";	 Catch:{ all -> 0x006d }
        r3 = r5.zzddb;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "tload";	 Catch:{ all -> 0x006d }
        r3 = r5.zzddc;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "pcc";	 Catch:{ all -> 0x006d }
        r3 = r5.zzddd;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = "tfetch";	 Catch:{ all -> 0x006d }
        r3 = r5.zzdda;	 Catch:{ all -> 0x006d }
        r1.putLong(r2, r3);	 Catch:{ all -> 0x006d }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x006d }
        r2.<init>();	 Catch:{ all -> 0x006d }
        r3 = r5.zzdcx;	 Catch:{ all -> 0x006d }
        r3 = r3.iterator();	 Catch:{ all -> 0x006d }
        r4 = r3.hasNext();	 Catch:{ all -> 0x006d }
        if (r4 == 0) goto L_0x0066;	 Catch:{ all -> 0x006d }
        r4 = r3.next();	 Catch:{ all -> 0x006d }
        r4 = (com.google.android.gms.internal.zzahg) r4;	 Catch:{ all -> 0x006d }
        r4 = r4.toBundle();	 Catch:{ all -> 0x006d }
        r2.add(r4);	 Catch:{ all -> 0x006d }
        goto L_0x0052;	 Catch:{ all -> 0x006d }
        r3 = "tclick";	 Catch:{ all -> 0x006d }
        r1.putParcelableArrayList(r3, r2);	 Catch:{ all -> 0x006d }
        monitor-exit(r0);	 Catch:{ all -> 0x006d }
        return r1;	 Catch:{ all -> 0x006d }
        r1 = move-exception;	 Catch:{ all -> 0x006d }
        monitor-exit(r0);	 Catch:{ all -> 0x006d }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahf.toBundle():android.os.Bundle");
    }

    public final void zzh(long j) {
        synchronized (this.mLock) {
            this.zzddf = j;
            if (this.zzddf != -1) {
                this.zzatv.zza(this);
            }
        }
    }

    public final void zzi(long j) {
        synchronized (this.mLock) {
            if (this.zzddf != -1) {
                this.zzdda = j;
                this.zzatv.zza(this);
            }
        }
    }

    public final void zzn(zzkk zzkk) {
        synchronized (this.mLock) {
            this.zzdde = SystemClock.elapsedRealtime();
            this.zzatv.zzb(zzkk, this.zzdde);
        }
    }

    public final void zzpk() {
        synchronized (this.mLock) {
            if (this.zzddf != -1 && this.zzddb == -1) {
                this.zzddb = SystemClock.elapsedRealtime();
                this.zzatv.zza(this);
            }
            this.zzatv.zzpk();
        }
    }

    public final void zzpl() {
        synchronized (this.mLock) {
            if (this.zzddf != -1) {
                zzahg zzahg = new zzahg();
                zzahg.zzpp();
                this.zzdcx.add(zzahg);
                this.zzddd++;
                this.zzatv.zzpl();
                this.zzatv.zza(this);
            }
        }
    }

    public final void zzpm() {
        synchronized (this.mLock) {
            if (!(this.zzddf == -1 || this.zzdcx.isEmpty())) {
                zzahg zzahg = (zzahg) this.zzdcx.getLast();
                if (zzahg.zzpn() == -1) {
                    zzahg.zzpo();
                    this.zzatv.zza(this);
                }
            }
        }
    }

    public final void zzx(boolean z) {
        synchronized (this.mLock) {
            if (this.zzddf != -1) {
                this.zzddc = SystemClock.elapsedRealtime();
                if (!z) {
                    this.zzddb = this.zzddc;
                    this.zzatv.zza(this);
                }
            }
        }
    }

    public final void zzy(boolean z) {
        synchronized (this.mLock) {
            if (this.zzddf != -1) {
                this.zzcwy = z;
                this.zzatv.zza(this);
            }
        }
    }
}

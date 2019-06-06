package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzif {
    private Context mContext;
    private final Object mLock = new Object();
    private final Runnable zzbav = new zzig(this);
    private zzim zzbaw;
    private zziq zzbax;

    /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            return;
     */
    private final void connect() {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = r6.mContext;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x002e;
    L_0x0007:
        r1 = r6.zzbaw;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002e;
    L_0x000c:
        r1 = new com.google.android.gms.internal.zzii;	 Catch:{ all -> 0x0030 }
        r1.<init>(r6);	 Catch:{ all -> 0x0030 }
        r2 = new com.google.android.gms.internal.zzij;	 Catch:{ all -> 0x0030 }
        r2.<init>(r6);	 Catch:{ all -> 0x0030 }
        r3 = new com.google.android.gms.internal.zzim;	 Catch:{ all -> 0x0030 }
        r4 = r6.mContext;	 Catch:{ all -> 0x0030 }
        r5 = com.google.android.gms.ads.internal.zzbt.zzfa();	 Catch:{ all -> 0x0030 }
        r5 = r5.zzrt();	 Catch:{ all -> 0x0030 }
        r3.<init>(r4, r5, r1, r2);	 Catch:{ all -> 0x0030 }
        r6.zzbaw = r3;	 Catch:{ all -> 0x0030 }
        r1 = r6.zzbaw;	 Catch:{ all -> 0x0030 }
        r1.zzals();	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x002e:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0030:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzif.connect():void");
    }

    private final void disconnect() {
        synchronized (this.mLock) {
            if (this.zzbaw == null) {
                return;
            }
            if (this.zzbaw.isConnected() || this.zzbaw.isConnecting()) {
                this.zzbaw.disconnect();
            }
            this.zzbaw = null;
            this.zzbax = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX WARNING: Missing block: B:16:0x0047, code skipped:
            return;
     */
    public final void initialize(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = r2.mContext;	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x000c:
        r3 = r3.getApplicationContext();	 Catch:{ all -> 0x0048 }
        r2.mContext = r3;	 Catch:{ all -> 0x0048 }
        r3 = com.google.android.gms.internal.zzoi.zzbue;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0048 }
        r3 = r1.zzd(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r2.connect();	 Catch:{ all -> 0x0048 }
        goto L_0x0046;
    L_0x0028:
        r3 = com.google.android.gms.internal.zzoi.zzbud;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0048 }
        r3 = r1.zzd(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = new com.google.android.gms.internal.zzih;	 Catch:{ all -> 0x0048 }
        r3.<init>(r2);	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.zzbt.zzeo();	 Catch:{ all -> 0x0048 }
        r1.zza(r3);	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzif.initialize(android.content.Context):void");
    }

    public final zzik zza(zzin zzin) {
        synchronized (this.mLock) {
            zzik zzik;
            if (this.zzbax == null) {
                zzik = new zzik();
                return zzik;
            }
            try {
                zzik = this.zzbax.zza(zzin);
                return zzik;
            } catch (RemoteException e) {
                zzaky.zzb("Unable to call into cache service.", e);
                return new zzik();
            }
        }
    }

    public final void zzhi() {
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbuf)).booleanValue()) {
            synchronized (this.mLock) {
                connect();
                zzbt.zzel();
                zzaij.zzdfn.removeCallbacks(this.zzbav);
                zzbt.zzel();
                zzaij.zzdfn.postDelayed(this.zzbav, ((Long) zzlc.zzio().zzd(zzoi.zzbug)).longValue());
            }
        }
    }
}

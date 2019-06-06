package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zzcdb implements zzf, zzg {
    private final String packageName;
    private zzcdc zzijb;
    private final String zzijc;
    private final LinkedBlockingQueue<zzba> zzijd;
    private final HandlerThread zzije = new HandlerThread("GassClient");

    public zzcdb(Context context, String str, String str2) {
        this.packageName = str;
        this.zzijc = str2;
        this.zzije.start();
        this.zzijb = new zzcdc(context, this.zzije.getLooper(), this, this);
        this.zzijd = new LinkedBlockingQueue();
        this.zzijb.zzals();
    }

    private final zzcdh zzawa() {
        try {
            return this.zzijb.zzawc();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static zzba zzawb() {
        zzba zzba = new zzba();
        zzba.zzds = Long.valueOf(32768);
        return zzba;
    }

    private final void zzny() {
        zzcdc zzcdc = this.zzijb;
        if (zzcdc == null) {
            return;
        }
        if (zzcdc.isConnected() || this.zzijb.isConnecting()) {
            this.zzijb.disconnect();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:2:0x0006} */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A:{ExcHandler: all (th java.lang.Throwable), Splitter:B:2:0x0006} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:0x0031, code skipped:
            zzny();
            r3.zzije.quit();
     */
    public final void onConnected(android.os.Bundle r4) {
        /*
        r3 = this;
        r4 = r3.zzawa();
        if (r4 == 0) goto L_0x003a;
    L_0x0006:
        r0 = new com.google.android.gms.internal.zzcdd;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r1 = r3.packageName;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r2 = r3.zzijc;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.<init>(r1, r2);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.zza(r0);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.zzawd();	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0 = r3.zzijd;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.put(r4);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
    L_0x001c:
        r3.zzny();
        r4 = r3.zzije;
        r4.quit();
        return;
    L_0x0025:
        r4 = move-exception;
        goto L_0x0031;
    L_0x0027:
        r4 = r3.zzijd;	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        r0 = zzawb();	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        r4.put(r0);	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        goto L_0x001c;
    L_0x0031:
        r3.zzny();
        r0 = r3.zzije;
        r0.quit();
        throw r4;
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcdb.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzijd.put(zzawb());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.zzijd.put(zzawb());
        } catch (InterruptedException unused) {
        }
    }

    public final zzba zzdy(int i) {
        zzba zzba;
        try {
            zzba = (zzba) this.zzijd.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzba = null;
        }
        return zzba == null ? zzawb() : zzba;
    }
}

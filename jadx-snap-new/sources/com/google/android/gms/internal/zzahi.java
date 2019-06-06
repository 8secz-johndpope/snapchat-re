package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.zzc;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicInteger;

@zzabh
public final class zzahi implements zzaic {
    private Context mContext;
    private final Object mLock = new Object();
    private zzfu zzano;
    private zzala zzapq;
    private boolean zzarf = false;
    private zzhh zzaze = null;
    private final zzaho zzddo = new zzaho();
    private final zzahy zzddp = new zzahy();
    private zzol zzddq = null;
    private zzhm zzddr = null;
    private Boolean zzdds = null;
    private String zzddt;
    private final AtomicInteger zzddu = new AtomicInteger(0);
    private final zzahk zzddv = new zzahk();

    /* JADX WARNING: Missing block: B:28:0x0077, code skipped:
            return null;
     */
    private final com.google.android.gms.internal.zzhm zza(android.content.Context r4, boolean r5, boolean r6) {
        /*
        r3 = this;
        r0 = com.google.android.gms.internal.zzoi.zzbnh;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = com.google.android.gms.internal.zzoi.zzbnp;
        r2 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r2.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0039;
    L_0x0026:
        r0 = com.google.android.gms.internal.zzoi.zzbnn;
        r2 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r2.zzd(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        return r1;
    L_0x0039:
        if (r5 == 0) goto L_0x003e;
    L_0x003b:
        if (r6 == 0) goto L_0x003e;
    L_0x003d:
        return r1;
    L_0x003e:
        r5 = r3.mLock;
        monitor-enter(r5);
        r6 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0078 }
        if (r6 == 0) goto L_0x0076;
    L_0x0047:
        if (r4 != 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0076;
    L_0x004a:
        r6 = r3.zzaze;	 Catch:{ all -> 0x0078 }
        if (r6 != 0) goto L_0x0055;
    L_0x004e:
        r6 = new com.google.android.gms.internal.zzhh;	 Catch:{ all -> 0x0078 }
        r6.<init>();	 Catch:{ all -> 0x0078 }
        r3.zzaze = r6;	 Catch:{ all -> 0x0078 }
    L_0x0055:
        r6 = r3.zzddr;	 Catch:{ all -> 0x0078 }
        if (r6 != 0) goto L_0x0068;
    L_0x0059:
        r6 = new com.google.android.gms.internal.zzhm;	 Catch:{ all -> 0x0078 }
        r0 = r3.zzaze;	 Catch:{ all -> 0x0078 }
        r1 = r3.zzapq;	 Catch:{ all -> 0x0078 }
        r4 = com.google.android.gms.internal.zzabb.zzc(r4, r1);	 Catch:{ all -> 0x0078 }
        r6.<init>(r0, r4);	 Catch:{ all -> 0x0078 }
        r3.zzddr = r6;	 Catch:{ all -> 0x0078 }
    L_0x0068:
        r4 = r3.zzddr;	 Catch:{ all -> 0x0078 }
        r4.zzgx();	 Catch:{ all -> 0x0078 }
        r4 = "start fetching content...";
        com.google.android.gms.internal.zzaky.zzcy(r4);	 Catch:{ all -> 0x0078 }
        r4 = r3.zzddr;	 Catch:{ all -> 0x0078 }
        monitor-exit(r5);	 Catch:{ all -> 0x0078 }
        return r4;
    L_0x0076:
        monitor-exit(r5);	 Catch:{ all -> 0x0078 }
        return r1;
    L_0x0078:
        r4 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0078 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahi.zza(android.content.Context, boolean, boolean):com.google.android.gms.internal.zzhm");
    }

    public final Resources getResources() {
        if (this.zzapq.zzdjb) {
            return this.mContext.getResources();
        }
        Resources resources = null;
        try {
            DynamiteModule zza = DynamiteModule.zza(this.mContext, DynamiteModule.zzhdi, ModuleDescriptor.MODULE_ID);
            if (zza != null) {
                resources = zza.zzarl().getResources();
            }
            return resources;
        } catch (zzc e) {
            zzaky.zzc("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Boolean bool) {
        synchronized (this.mLock) {
            this.zzdds = bool;
        }
    }

    public final void zza(Throwable th, String str) {
        zzabb.zzc(this.mContext, this.zzapq).zza(th, str);
    }

    public final zzhm zzad(Context context) {
        return zza(context, this.zzddp.zzqp(), this.zzddp.zzqr());
    }

    public final void zzb(Bundle bundle) {
        String str = "content_url_opted_out";
        if (bundle.containsKey(str)) {
            String str2 = "content_vertical_opted_out";
            if (bundle.containsKey(str2)) {
                zza(this.mContext, bundle.getBoolean(str), bundle.getBoolean(str2));
            }
        }
    }

    @TargetApi(23)
    public final void zzd(Context context, zzala zzala) {
        synchronized (this.mLock) {
            if (!this.zzarf) {
                this.mContext = context.getApplicationContext();
                this.zzapq = zzala;
                zzbt.zzeo().zza(zzbt.zzeq());
                this.zzddp.initialize(this.mContext);
                this.zzddp.zza((zzaic) this);
                zzabb.zzc(this.mContext, this.zzapq);
                this.zzddt = zzbt.zzel().zzl(context, zzala.zzcu);
                this.zzano = new zzfu(context.getApplicationContext(), this.zzapq);
                zzok zzok = new zzok(this.mContext, this.zzapq.zzcu);
                try {
                    zzbt.zzeu();
                    this.zzddq = zzon.zza(zzok);
                } catch (IllegalArgumentException e) {
                    zzaky.zzc("Cannot initialize CSI reporter.", e);
                }
                this.zzarf = true;
            }
        }
    }

    public final zzaho zzpu() {
        return this.zzddo;
    }

    public final zzol zzpv() {
        zzol zzol;
        synchronized (this.mLock) {
            zzol = this.zzddq;
        }
        return zzol;
    }

    public final Boolean zzpw() {
        Boolean bool;
        synchronized (this.mLock) {
            bool = this.zzdds;
        }
        return bool;
    }

    public final boolean zzpx() {
        return this.zzddv.zzpx();
    }

    public final boolean zzpy() {
        return this.zzddv.zzpy();
    }

    public final void zzpz() {
        this.zzddv.zzpz();
    }

    public final zzfu zzqa() {
        return this.zzano;
    }

    public final void zzqb() {
        this.zzddu.incrementAndGet();
    }

    public final void zzqc() {
        this.zzddu.decrementAndGet();
    }

    public final int zzqd() {
        return this.zzddu.get();
    }

    public final zzahy zzqe() {
        zzahy zzahy;
        synchronized (this.mLock) {
            zzahy = this.zzddp;
        }
        return zzahy;
    }

    public final void zzz(boolean z) {
        this.zzddv.zzz(z);
    }
}

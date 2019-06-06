package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class zzcp {
    private static final ConditionVariable zzagr = new ConditionVariable();
    protected static volatile zziz zzags = null;
    private static volatile Random zzagu = null;
    private zzdm zzagq;
    protected volatile Boolean zzagt;

    public zzcp(zzdm zzdm) {
        this.zzagq = zzdm;
        zzdm.getExecutorService().execute(new zzcq(this));
    }

    public static int zzab() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zzac().nextInt();
        } catch (RuntimeException unused) {
            return zzac().nextInt();
        }
    }

    private static Random zzac() {
        if (zzagu == null) {
            synchronized (zzcp.class) {
                if (zzagu == null) {
                    zzagu = new Random();
                }
            }
        }
        return zzagu;
    }

    public final void zza(int i, int i2, long j) {
        try {
            zzagr.block();
            if (this.zzagt.booleanValue() && zzags != null) {
                zzaw zzaw = new zzaw();
                zzaw.zzcm = this.zzagq.zzaiq.getPackageName();
                zzaw.zzcn = Long.valueOf(j);
                zzjb zzd = zzags.zzd(zzfls.zzc(zzaw));
                zzd.zzp(i2);
                zzd.zzq(i);
                zzd.log();
            }
        } catch (Exception unused) {
        }
    }
}

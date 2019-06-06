package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzeu implements Callable {
    private String TAG = getClass().getSimpleName();
    private String className;
    protected final zzdm zzagq;
    protected final zzba zzakm;
    private String zzaks;
    protected Method zzaku;
    private int zzaky;
    private int zzakz;

    public zzeu(zzdm zzdm, String str, String str2, zzba zzba, int i, int i2) {
        this.zzagq = zzdm;
        this.className = str;
        this.zzaks = str2;
        this.zzakm = zzba;
        this.zzaky = i;
        this.zzakz = i2;
    }

    public abstract void zzaw();

    /* renamed from: zzay */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.zzaku = this.zzagq.zza(this.className, this.zzaks);
            if (this.zzaku == null) {
                return null;
            }
            zzaw();
            zzcp zzaj = this.zzagq.zzaj();
            if (!(zzaj == null || this.zzaky == Integer.MIN_VALUE)) {
                zzaj.zza(this.zzakz, this.zzaky, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}

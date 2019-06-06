package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class zzaad implements Runnable {
    private /* synthetic */ AtomicInteger zzcps;
    private /* synthetic */ int zzcpt;
    private /* synthetic */ zzamd zzcpu;
    private /* synthetic */ List zzcpv;

    zzaad(AtomicInteger atomicInteger, int i, zzamd zzamd, List list) {
        this.zzcps = atomicInteger;
        this.zzcpt = i;
        this.zzcpu = zzamd;
        this.zzcpv = list;
    }

    public final void run() {
        if (this.zzcps.incrementAndGet() >= this.zzcpt) {
            try {
                this.zzcpu.set(zzzy.zzm(this.zzcpv));
            } catch (InterruptedException | ExecutionException e) {
                zzaky.zzc("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}

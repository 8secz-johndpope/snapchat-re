package com.google.android.gms.internal;

final class zzaht implements Runnable {
    private /* synthetic */ zzahs zzdes;

    zzaht(zzahs zzahs) {
        this.zzdes = zzahs;
    }

    public final void run() {
        this.zzdes.zzdeq = Thread.currentThread();
        this.zzdes.zzdo();
    }
}

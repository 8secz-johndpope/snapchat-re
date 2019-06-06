package com.google.android.gms.internal;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class zzalm implements Runnable {
    private final zzamd zzcdk;

    zzalm(zzamd zzamd) {
        this.zzcdk = zzamd;
    }

    public final void run() {
        this.zzcdk.setException(new TimeoutException());
    }
}

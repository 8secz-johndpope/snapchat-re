package com.google.android.gms.internal;

import android.os.RemoteException;

public final class zzxa extends zzmn {
    private final Object mLock = new Object();
    private volatile zzmp zzcjx;

    public final float getAspectRatio() {
        throw new RemoteException();
    }

    public final int getPlaybackState() {
        throw new RemoteException();
    }

    public final boolean isClickToExpandEnabled() {
        throw new RemoteException();
    }

    public final boolean isCustomControlsEnabled() {
        throw new RemoteException();
    }

    public final boolean isMuted() {
        throw new RemoteException();
    }

    public final void mute(boolean z) {
        throw new RemoteException();
    }

    public final void pause() {
        throw new RemoteException();
    }

    public final void play() {
        throw new RemoteException();
    }

    public final void zza(zzmp zzmp) {
        synchronized (this.mLock) {
            this.zzcjx = zzmp;
        }
    }

    public final float zziq() {
        throw new RemoteException();
    }

    public final float zzir() {
        throw new RemoteException();
    }

    public final zzmp zzis() {
        zzmp zzmp;
        synchronized (this.mLock) {
            zzmp = this.zzcjx;
        }
        return zzmp;
    }
}

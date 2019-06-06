package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.zzc;

public abstract class zzdlc<T> {
    private final Context mContext;
    private final Object mLock = new Object();
    private final String mTag;
    private boolean zzlhu = false;
    private T zzlhv;

    public zzdlc(Context context, String str) {
        this.mContext = context;
        this.mTag = str;
    }

    public final boolean isOperational() {
        return zzblo() != null;
    }

    public abstract T zza(DynamiteModule dynamiteModule, Context context);

    public abstract void zzbll();

    public final void zzbln() {
        synchronized (this.mLock) {
            if (this.zzlhv == null) {
                return;
            }
            try {
                zzbll();
            } catch (RemoteException e) {
                Log.e(this.mTag, "Could not finalize native handle", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final T zzblo() {
        synchronized (this.mLock) {
            Object obj;
            if (this.zzlhv != null) {
                obj = this.zzlhv;
                return obj;
            }
            try {
                this.zzlhv = zza(DynamiteModule.zza(this.mContext, DynamiteModule.zzhdm, "com.google.android.gms.vision.dynamite"), this.mContext);
            } catch (RemoteException | zzc e) {
                Log.e(this.mTag, "Error creating remote native handle", e);
            }
            if (!this.zzlhu && this.zzlhv == null) {
                Log.w(this.mTag, "Native handle not yet available. Reverting to no-op handle.");
                this.zzlhu = true;
            } else if (this.zzlhu && this.zzlhv != null) {
                Log.w(this.mTag, "Native handle is now available.");
            }
            obj = this.zzlhv;
            return obj;
        }
    }
}

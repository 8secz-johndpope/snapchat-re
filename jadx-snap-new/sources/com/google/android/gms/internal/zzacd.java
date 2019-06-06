package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzabh
public final class zzacd extends zzabz implements zzf, zzg {
    private Context mContext;
    private final Object mLock = new Object();
    private zzala zzapq;
    private zzamf<zzacf> zzcro;
    private final zzabx zzcrp;
    private zzace zzcrs;

    public zzacd(Context context, zzala zzala, zzamf<zzacf> zzamf, zzabx zzabx) {
        super(zzamf, zzabx);
        this.mContext = context;
        this.zzapq = zzala;
        this.zzcro = zzamf;
        this.zzcrp = zzabx;
        this.zzcrs = new zzace(context, ((Boolean) zzlc.zzio().zzd(zzoi.zzbmw)).booleanValue() ? zzbt.zzfa().zzrt() : context.getMainLooper(), this, this, this.zzapq.zzdja);
        this.zzcrs.zzals();
    }

    public final void onConnected(Bundle bundle) {
        zzns();
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzaky.zzby("Cannot connect to remote service, fallback to local instance.");
        new zzacc(this.mContext, this.zzcro, this.zzcrp).zzns();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbt.zzel().zzb(this.mContext, this.zzapq.zzcu, "gmob-apps", bundle, true);
    }

    public final void onConnectionSuspended(int i) {
        zzaky.zzby("Disconnected from remote ad request service.");
    }

    public final void zzny() {
        synchronized (this.mLock) {
            if (this.zzcrs.isConnected() || this.zzcrs.isConnecting()) {
                this.zzcrs.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final zzacn zznz() {
        zzacn zzoa;
        synchronized (this.mLock) {
            try {
                zzoa = this.zzcrs.zzoa();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
            }
        }
        return zzoa;
    }
}

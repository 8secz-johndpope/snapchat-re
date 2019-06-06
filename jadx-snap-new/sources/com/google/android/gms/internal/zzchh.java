package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zzci;
import com.google.android.gms.common.api.internal.zzck;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

public final class zzchh extends zzcfq {
    private final zzcha zziuk;

    public zzchh(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzr zzr) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, zzr);
        this.zziuk = new zzcha(context, this.zzitk);
    }

    public final void disconnect() {
        synchronized (this.zziuk) {
            if (isConnected()) {
                try {
                    this.zziuk.removeAllListeners();
                    this.zziuk.zzaxc();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public final Location getLastLocation() {
        return this.zziuk.getLastLocation();
    }

    public final void zza(zzck<LocationListener> zzck, zzcgr zzcgr) {
        this.zziuk.zza(zzck, zzcgr);
    }

    public final void zza(LocationRequest locationRequest, zzci<LocationListener> zzci, zzcgr zzcgr) {
        synchronized (this.zziuk) {
            this.zziuk.zza(locationRequest, zzci, zzcgr);
        }
    }

    public final void zza(LocationSettingsRequest locationSettingsRequest, zzn<LocationSettingsResult> zzn, String str) {
        zzalv();
        boolean z = true;
        zzbq.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (zzn == null) {
            z = false;
        }
        zzbq.checkArgument(z, "listener can't be null.");
        ((zzcgw) zzalw()).zza(locationSettingsRequest, new zzchk(zzn), str);
    }
}

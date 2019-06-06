package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzbq;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zza implements ServiceConnection {
    private boolean zzfqr = false;
    private final BlockingQueue<IBinder> zzfqs = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zzfqs.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder zza(long j, TimeUnit timeUnit) {
        zzbq.zzgw("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zzfqr) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zzfqr = true;
        IBinder iBinder = (IBinder) this.zzfqs.poll(TelemetryConstants.FLUSH_DELAY_MS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
}

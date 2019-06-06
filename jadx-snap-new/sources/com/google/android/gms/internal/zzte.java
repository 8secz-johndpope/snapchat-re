package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzbt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzabh
public final class zzte implements zzm {
    private final Context mContext;
    private final Object mLock = new Object();
    private zzsx zzcdb;
    private boolean zzcdc;

    public zzte(Context context) {
        this.mContext = context;
    }

    private final void disconnect() {
        synchronized (this.mLock) {
            if (this.zzcdb == null) {
                return;
            }
            this.zzcdb.disconnect();
            this.zzcdb = null;
            Binder.flushPendingCommands();
        }
    }

    private final Future<ParcelFileDescriptor> zzb(zzsy zzsy) {
        zztf zztf = new zztf(this);
        zztg zztg = new zztg(this, zztf, zzsy);
        zztj zztj = new zztj(this, zztf);
        synchronized (this.mLock) {
            this.zzcdb = new zzsx(this.mContext, zzbt.zzfa().zzrt(), zztg, zztj);
            this.zzcdb.zzals();
        }
        return zztf;
    }

    public final zzp zzc(zzr<?> zzr) {
        String str = "ms";
        String str2 = "Http assets remote cache took ";
        zzsy zzh = zzsy.zzh(zzr);
        long intValue = (long) ((Integer) zzlc.zzio().zzd(zzoi.zzbun)).intValue();
        long elapsedRealtime = zzbt.zzes().elapsedRealtime();
        long elapsedRealtime2;
        StringBuilder stringBuilder;
        try {
            zzta zzta = (zzta) new zzacv((ParcelFileDescriptor) zzb(zzh).get(intValue, TimeUnit.MILLISECONDS)).zza(zzta.CREATOR);
            if (zzta.zzccz) {
                throw new zzae(zzta.zzcda);
            }
            zzp zzp;
            if (zzta.zzccx.length != zzta.zzccy.length) {
                zzp = null;
            } else {
                Map hashMap = new HashMap();
                for (int i = 0; i < zzta.zzccx.length; i++) {
                    hashMap.put(zzta.zzccx[i], zzta.zzccy[i]);
                }
                zzp zzp2 = new zzp(zzta.statusCode, zzta.data, hashMap, zzta.zzac, zzta.zzad);
            }
            elapsedRealtime2 = zzbt.zzes().elapsedRealtime() - elapsedRealtime;
            stringBuilder = new StringBuilder(52);
            stringBuilder.append(str2);
            stringBuilder.append(elapsedRealtime2);
            stringBuilder.append(str);
            zzahw.v(stringBuilder.toString());
            return zzp;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            elapsedRealtime2 = zzbt.zzes().elapsedRealtime() - elapsedRealtime;
            stringBuilder = new StringBuilder(52);
            stringBuilder.append(str2);
            stringBuilder.append(elapsedRealtime2);
            stringBuilder.append(str);
            zzahw.v(stringBuilder.toString());
            return null;
        } catch (Throwable th) {
            elapsedRealtime2 = zzbt.zzes().elapsedRealtime() - elapsedRealtime;
            StringBuilder stringBuilder2 = new StringBuilder(52);
            stringBuilder2.append(str2);
            stringBuilder2.append(elapsedRealtime2);
            stringBuilder2.append(str);
            zzahw.v(stringBuilder2.toString());
            throw th;
        }
    }
}

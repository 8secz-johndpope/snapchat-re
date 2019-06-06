package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbb;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzabh
public final class zzzu extends zzahs {
    private final Object mLock;
    private final zzzn zzcoa;
    private final zzahe zzcob;
    private final zzacj zzcoc;
    private final zzzy zzcor;
    private Future<zzahd> zzcos;

    public zzzu(Context context, zzbb zzbb, zzahe zzahe, zzcv zzcv, zzzn zzzn, zzov zzov) {
        this(zzahe, zzzn, new zzzy(context, zzbb, new zzajr(context), zzcv, zzahe, zzov));
    }

    private zzzu(zzahe zzahe, zzzn zzzn, zzzy zzzy) {
        this.mLock = new Object();
        this.zzcob = zzahe;
        this.zzcoc = zzahe.zzdcw;
        this.zzcoa = zzzn;
        this.zzcor = zzzy;
    }

    public final void onStop() {
        synchronized (this.mLock) {
            if (this.zzcos != null) {
                this.zzcos.cancel(true);
            }
        }
    }

    public final void zzdo() {
        int i;
        zzahd zzahd;
        zzahd zzahd2 = null;
        try {
            synchronized (this.mLock) {
                this.zzcos = zzaid.zza(zzaid.zzdfi, this.zzcor);
            }
            zzahd2 = (zzahd) this.zzcos.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            zzaky.zzcz("Timed out waiting for native ad.");
            this.zzcos.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        if (zzahd2 != null) {
            zzahd = zzahd2;
        } else {
            zzahd zzahd3 = new zzahd(this.zzcob.zzcvm.zzcrv, null, null, i, null, null, this.zzcoc.orientation, this.zzcoc.zzcic, this.zzcob.zzcvm.zzcry, false, null, null, null, null, null, this.zzcoc.zzctp, this.zzcob.zzaud, this.zzcoc.zzctn, this.zzcob.zzdcn, this.zzcoc.zzcts, this.zzcoc.zzctt, this.zzcob.zzdch, null, null, null, null, this.zzcob.zzdcw.zzcuf, this.zzcob.zzdcw.zzcug, null, null, this.zzcoc.zzcuj, this.zzcob.zzdcu, this.zzcob.zzdcw.zzaqw, false);
        }
        zzaij.zzdfn.post(new zzzv(this, zzahd));
    }
}

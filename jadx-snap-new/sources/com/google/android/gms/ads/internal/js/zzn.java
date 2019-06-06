package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzajm;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaly;
import com.google.android.gms.internal.zzcv;

@zzabh
public final class zzn {
    private final Context mContext;
    private final Object mLock;
    private final zzala zzapq;
    private final String zzcfh;
    private zzajm<zzc> zzcfi;
    private zzajm<zzc> zzcfj;
    private zzae zzcfk;
    private int zzcfl;

    public zzn(Context context, zzala zzala, String str) {
        this.mLock = new Object();
        this.zzcfl = 1;
        this.zzcfh = str;
        this.mContext = context.getApplicationContext();
        this.zzapq = zzala;
        this.zzcfi = new zzz();
        this.zzcfj = new zzz();
    }

    public zzn(Context context, zzala zzala, String str, zzajm<zzc> zzajm, zzajm<zzc> zzajm2) {
        this(context, zzala, str);
        this.zzcfi = zzajm;
        this.zzcfj = zzajm2;
    }

    /* Access modifiers changed, original: protected|final */
    public final zzae zza(zzcv zzcv) {
        zzae zzae = new zzae(this.zzcfj);
        zzaly.zzdjt.execute(new zzo(this, zzcv, zzae));
        zzae.zza(new zzw(this, zzae), new zzx(this, zzae));
        return zzae;
    }

    public final zzaa zzb(zzcv zzcv) {
        synchronized (this.mLock) {
            zzaa zzma;
            if (this.zzcfk != null) {
                if (this.zzcfk.getStatus() != -1) {
                    if (this.zzcfl == 0) {
                        zzma = this.zzcfk.zzma();
                        return zzma;
                    } else if (this.zzcfl == 1) {
                        this.zzcfl = 2;
                        zza(null);
                        zzma = this.zzcfk.zzma();
                        return zzma;
                    } else if (this.zzcfl == 2) {
                        zzma = this.zzcfk.zzma();
                        return zzma;
                    } else {
                        zzma = this.zzcfk.zzma();
                        return zzma;
                    }
                }
            }
            this.zzcfl = 2;
            this.zzcfk = zza(null);
            zzma = this.zzcfk.zzma();
            return zzma;
        }
    }
}

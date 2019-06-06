package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbt;
import java.util.concurrent.Future;

@zzabh
public final class zzafl extends zzahs implements zzafr, zzafu {
    private final Context mContext;
    private int mErrorCode = 3;
    private final Object mLock;
    public final String zzcip;
    private final zzahe zzcob;
    private final zzafy zzdaa;
    private final zzafu zzdab;
    private final String zzdac;
    private final zzvp zzdad;
    private final long zzdae;
    private int zzdaf = 0;
    private zzafo zzdag;
    private Future zzdah;

    public zzafl(Context context, String str, String str2, zzvp zzvp, zzahe zzahe, zzafy zzafy, zzafu zzafu, long j) {
        this.mContext = context;
        this.zzcip = str;
        this.zzdac = str2;
        this.zzdad = zzvp;
        this.zzcob = zzahe;
        this.zzdaa = zzafy;
        this.mLock = new Object();
        this.zzdab = zzafu;
        this.zzdae = j;
    }

    private final void zza(zzkk zzkk, zzwi zzwi) {
        this.zzdaa.zzpd().zza((zzafu) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzcip)) {
                zzwi.zza(zzkk, this.zzdac, this.zzdad.zzchb);
            } else {
                zzwi.zzc(zzkk, this.zzdac);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Fail to load ad from adapter.", e);
            zza(this.zzcip, 0);
        }
    }

    private final boolean zzf(long j) {
        int i;
        long elapsedRealtime = this.zzdae - (zzbt.zzes().elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            i = 4;
        } else {
            try {
                this.mLock.wait(elapsedRealtime);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = 5;
            }
        }
        this.mErrorCode = i;
        return false;
    }

    public final void onStop() {
    }

    public final void zza(String str, int i) {
        synchronized (this.mLock) {
            this.zzdaf = 2;
            this.mErrorCode = i;
            this.mLock.notify();
        }
    }

    public final void zzaa(int i) {
        zza(this.zzcip, 0);
    }

    public final void zzbr(String str) {
        synchronized (this.mLock) {
            this.zzdaf = 1;
            this.mLock.notify();
        }
    }

    public final void zzdo() {
        zzafy zzafy = this.zzdaa;
        if (zzafy != null && zzafy.zzpd() != null && this.zzdaa.zzpc() != null) {
            zzaft zzpd = this.zzdaa.zzpd();
            zzpd.zza(null);
            zzpd.zza((zzafr) this);
            zzkk zzkk = this.zzcob.zzcvm.zzcrv;
            zzwi zzpc = this.zzdaa.zzpc();
            try {
                Handler handler;
                Runnable zzafm;
                if (zzpc.isInitialized()) {
                    handler = zzako.zzaju;
                    zzafm = new zzafm(this, zzkk, zzpc);
                } else {
                    handler = zzako.zzaju;
                    zzafm = new zzafn(this, zzpc, zzkk, zzpd);
                }
                handler.post(zzafm);
            } catch (RemoteException e) {
                zzaky.zzc("Fail to check if adapter is initialized.", e);
                zza(this.zzcip, 0);
            }
            long elapsedRealtime = zzbt.zzes().elapsedRealtime();
            while (true) {
                synchronized (this.mLock) {
                    if (this.zzdaf != 0) {
                        this.zzdag = new zzafq().zzg(zzbt.zzes().elapsedRealtime() - elapsedRealtime).zzab(1 == this.zzdaf ? 6 : this.mErrorCode).zzbs(this.zzcip).zzbt(this.zzdad.zzche).zzpa();
                    } else if (!zzf(elapsedRealtime)) {
                        this.zzdag = new zzafq().zzab(this.mErrorCode).zzg(zzbt.zzes().elapsedRealtime() - elapsedRealtime).zzbs(this.zzcip).zzbt(this.zzdad.zzche).zzpa();
                        break;
                    }
                }
            }
            zzpd.zza(null);
            zzpd.zza(null);
            if (this.zzdaf == 1) {
                this.zzdab.zzbr(this.zzcip);
            } else {
                this.zzdab.zza(this.zzcip, this.mErrorCode);
            }
        }
    }

    public final Future zzow() {
        Future future = this.zzdah;
        if (future != null) {
            return future;
        }
        zzalt zzalt = (zzalt) zzns();
        this.zzdah = zzalt;
        return zzalt;
    }

    public final zzafo zzox() {
        zzafo zzafo;
        synchronized (this.mLock) {
            zzafo = this.zzdag;
        }
        return zzafo;
    }

    public final zzvp zzoy() {
        return this.zzdad;
    }

    public final void zzoz() {
        zza(this.zzcob.zzcvm.zzcrv, this.zzdaa.zzpc());
    }
}

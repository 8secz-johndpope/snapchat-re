package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwx extends zzfhu<zzdwx, zza> implements zzfje {
    private static volatile zzfjl<zzdwx> zzbbm;
    private static final zzdwx zzmjr;
    private int zzmfs;
    private zzdwz zzmjq;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwx, zza> implements zzfje {
        private zza() {
            super(zzdwx.zzmjr);
        }

        /* synthetic */ zza(zzdwy zzdwy) {
            this();
        }

        public final zza zzb(zzdwz zzdwz) {
            zzczv();
            ((zzdwx) this.zzppl).zza(zzdwz);
            return this;
        }

        public final zza zzgw(int i) {
            zzczv();
            ((zzdwx) this.zzppl).setVersion(0);
            return this;
        }
    }

    static {
        zzdwx zzdwx = new zzdwx();
        zzmjr = zzdwx;
        zzdwx.zza(zzg.zzppw, null, null);
        zzdwx.zzpph.zzbkr();
    }

    private zzdwx() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zza(zzdwz zzdwz) {
        if (zzdwz != null) {
            this.zzmjq = zzdwz;
            return;
        }
        throw new NullPointerException();
    }

    public static zzdwx zzal(zzfgs zzfgs) {
        return (zzdwx) zzfhu.zza(zzmjr, zzfgs);
    }

    public static zza zzbsg() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmjr.zza(zzg.zzppy, null, null));
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdwy.zzbbk[i - 1]) {
            case 1:
                return new zzdwx();
            case 2:
                return zzmjr;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwx zzdwx = (zzdwx) obj2;
                boolean z2 = this.zzmfs != 0;
                int i2 = this.zzmfs;
                if (zzdwx.zzmfs != 0) {
                    z = true;
                }
                this.zzmfs = zzh.zza(z2, i2, z, zzdwx.zzmfs);
                this.zzmjq = (zzdwz) zzh.zza(this.zzmjq, zzdwx.zzmjq);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmfs = zzfhb.zzcyg();
                                } else if (i == 18) {
                                    com.google.android.gms.internal.zzfhu.zza zza;
                                    if (this.zzmjq != null) {
                                        zzfhu zzfhu = this.zzmjq;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdwz.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmjq = (zzdwz) zzfhb.zza(zzdwz.zzbsk(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmjq);
                                        this.zzmjq = (zzdwz) zza.zzczw();
                                    }
                                } else if (zza(i, zzfhb)) {
                                }
                            }
                            z = true;
                        } catch (zzfie e) {
                            throw new RuntimeException(e.zzi(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfie(e2.getMessage()).zzi(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
            case 7:
                break;
            case 8:
                if (zzbbm == null) {
                    synchronized (zzdwx.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmjr);
                        }
                    }
                }
                return zzbbm;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return zzmjr;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmjq;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwz.zzbsk();
            }
            zzfhg.zza(2, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdwz zzbsf() {
        zzdwz zzdwz = this.zzmjq;
        return zzdwz == null ? zzdwz.zzbsk() : zzdwz;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmfs;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + zzfhg.zzah(1, i);
        }
        zzfjc zzfjc = this.zzmjq;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwz.zzbsk();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

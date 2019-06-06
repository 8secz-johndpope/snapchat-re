package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwt extends zzfhu<zzdwt, zza> implements zzfje {
    private static volatile zzfjl<zzdwt> zzbbm;
    private static final zzdwt zzmjn;
    private int zzmfs;
    private zzdwv zzmjm;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwt, zza> implements zzfje {
        private zza() {
            super(zzdwt.zzmjn);
        }

        /* synthetic */ zza(zzdwu zzdwu) {
            this();
        }

        public final zza zzb(zzdwv zzdwv) {
            zzczv();
            ((zzdwt) this.zzppl).zza(zzdwv);
            return this;
        }

        public final zza zzgv(int i) {
            zzczv();
            ((zzdwt) this.zzppl).setVersion(0);
            return this;
        }
    }

    static {
        zzdwt zzdwt = new zzdwt();
        zzmjn = zzdwt;
        zzdwt.zza(zzg.zzppw, null, null);
        zzdwt.zzpph.zzbkr();
    }

    private zzdwt() {
    }

    private final void setVersion(int i) {
        this.zzmfs = i;
    }

    private final void zza(zzdwv zzdwv) {
        if (zzdwv != null) {
            this.zzmjm = zzdwv;
            return;
        }
        throw new NullPointerException();
    }

    public static zzdwt zzaj(zzfgs zzfgs) {
        return (zzdwt) zzfhu.zza(zzmjn, zzfgs);
    }

    public static zza zzbsa() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmjn.zza(zzg.zzppy, null, null));
    }

    public final int getVersion() {
        return this.zzmfs;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdwu.zzbbk[i - 1]) {
            case 1:
                return new zzdwt();
            case 2:
                return zzmjn;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwt zzdwt = (zzdwt) obj2;
                boolean z2 = this.zzmfs != 0;
                int i2 = this.zzmfs;
                if (zzdwt.zzmfs != 0) {
                    z = true;
                }
                this.zzmfs = zzh.zza(z2, i2, z, zzdwt.zzmfs);
                this.zzmjm = (zzdwv) zzh.zza(this.zzmjm, zzdwt.zzmjm);
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
                                    if (this.zzmjm != null) {
                                        zzfhu zzfhu = this.zzmjm;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdwv.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmjm = (zzdwv) zzfhb.zza(zzdwv.zzbsd(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmjm);
                                        this.zzmjm = (zzdwv) zza.zzczw();
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
                    synchronized (zzdwt.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmjn);
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
        return zzmjn;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmfs;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        zzfjc zzfjc = this.zzmjm;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwv.zzbsd();
            }
            zzfhg.zza(2, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdwv zzbrz() {
        zzdwv zzdwv = this.zzmjm;
        return zzdwv == null ? zzdwv.zzbsd() : zzdwv;
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
        zzfjc zzfjc = this.zzmjm;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwv.zzbsd();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

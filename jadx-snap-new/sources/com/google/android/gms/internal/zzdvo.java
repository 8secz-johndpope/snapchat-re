package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvo extends zzfhu<zzdvo, zza> implements zzfje {
    private static volatile zzfjl<zzdvo> zzbbm;
    private static final zzdvo zzmgz;
    private zzdvu zzmgw;
    private zzdvk zzmgx;
    private int zzmgy;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvo, zza> implements zzfje {
        private zza() {
            super(zzdvo.zzmgz);
        }

        /* synthetic */ zza(zzdvp zzdvp) {
            this();
        }
    }

    static {
        zzdvo zzdvo = new zzdvo();
        zzmgz = zzdvo;
        zzdvo.zza(zzg.zzppw, null, null);
        zzdvo.zzpph.zzbkr();
    }

    private zzdvo() {
    }

    public static zzdvo zzbpv() {
        return zzmgz;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (zzdvp.zzbbk[i - 1]) {
            case 1:
                return new zzdvo();
            case 2:
                return zzmgz;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdvo zzdvo = (zzdvo) obj2;
                this.zzmgw = (zzdvu) zzh.zza(this.zzmgw, zzdvo.zzmgw);
                this.zzmgx = (zzdvk) zzh.zza(this.zzmgx, zzdvo.zzmgx);
                boolean z2 = this.zzmgy != 0;
                int i2 = this.zzmgy;
                if (zzdvo.zzmgy != 0) {
                    z = true;
                }
                this.zzmgy = zzh.zza(z2, i2, z, zzdvo.zzmgy);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    while (!z) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                zzfhu zzfhu;
                                com.google.android.gms.internal.zzfhu.zza zza;
                                com.google.android.gms.internal.zzfhu.zza zza2;
                                if (i == 10) {
                                    if (this.zzmgw != null) {
                                        zzfhu = this.zzmgw;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzdvu.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmgw = (zzdvu) zzfhb.zza(zzdvu.zzbqi(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmgw);
                                        this.zzmgw = (zzdvu) zza2.zzczw();
                                    }
                                } else if (i == 18) {
                                    if (this.zzmgx != null) {
                                        zzfhu = this.zzmgx;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzdvk.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmgx = (zzdvk) zzfhb.zza(zzdvk.zzbpo(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmgx);
                                        this.zzmgx = (zzdvk) zza2.zzczw();
                                    }
                                } else if (i == 24) {
                                    this.zzmgy = zzfhb.zzcyh();
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
                    synchronized (zzdvo.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmgz);
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
        return zzmgz;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmgw;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvu.zzbqi();
            }
            zzfhg.zza(1, zzfjc);
        }
        zzfjc = this.zzmgx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvk.zzbpo();
            }
            zzfhg.zza(2, zzfjc);
        }
        if (this.zzmgy != zzdvi.UNKNOWN_FORMAT.zzhu()) {
            zzfhg.zzad(3, this.zzmgy);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdvu zzbps() {
        zzdvu zzdvu = this.zzmgw;
        return zzdvu == null ? zzdvu.zzbqi() : zzdvu;
    }

    public final zzdvk zzbpt() {
        zzdvk zzdvk = this.zzmgx;
        return zzdvk == null ? zzdvk.zzbpo() : zzdvk;
    }

    public final zzdvi zzbpu() {
        zzdvi zzgh = zzdvi.zzgh(this.zzmgy);
        return zzgh == null ? zzdvi.UNRECOGNIZED : zzgh;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmgw;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvu.zzbqi();
            }
            i2 = 0 + zzfhg.zzc(1, zzfjc);
        }
        zzfjc = this.zzmgx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdvk.zzbpo();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        if (this.zzmgy != zzdvi.UNKNOWN_FORMAT.zzhu()) {
            i2 += zzfhg.zzaj(3, this.zzmgy);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdvu extends zzfhu<zzdvu, zza> implements zzfje {
    private static volatile zzfjl<zzdvu> zzbbm;
    private static final zzdvu zzmhi;
    private int zzmhf;
    private int zzmhg;
    private zzfgs zzmhh = zzfgs.zzpnw;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdvu, zza> implements zzfje {
        private zza() {
            super(zzdvu.zzmhi);
        }

        /* synthetic */ zza(zzdvv zzdvv) {
            this();
        }
    }

    static {
        zzdvu zzdvu = new zzdvu();
        zzmhi = zzdvu;
        zzdvu.zza(zzg.zzppw, null, null);
        zzdvu.zzpph.zzbkr();
    }

    private zzdvu() {
    }

    public static zzdvu zzbqi() {
        return zzmhi;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdvv.zzbbk[i - 1]) {
            case 1:
                return new zzdvu();
            case 2:
                return zzmhi;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdvu zzdvu = (zzdvu) obj2;
                this.zzmhf = zzh.zza(this.zzmhf != 0, this.zzmhf, zzdvu.zzmhf != 0, zzdvu.zzmhf);
                this.zzmhg = zzh.zza(this.zzmhg != 0, this.zzmhg, zzdvu.zzmhg != 0, zzdvu.zzmhg);
                boolean z2 = this.zzmhh != zzfgs.zzpnw;
                zzfgs zzfgs = this.zzmhh;
                if (zzdvu.zzmhh == zzfgs.zzpnw) {
                    z = false;
                }
                this.zzmhh = zzh.zza(z2, zzfgs, z, zzdvu.zzmhh);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmhf = zzfhb.zzcyh();
                                } else if (i == 16) {
                                    this.zzmhg = zzfhb.zzcyh();
                                } else if (i == 90) {
                                    this.zzmhh = zzfhb.zzcyf();
                                } else if (zza(i, zzfhb)) {
                                }
                            }
                            obj3 = 1;
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
                    synchronized (zzdvu.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmhi);
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
        return zzmhi;
    }

    public final void zza(zzfhg zzfhg) {
        if (this.zzmhf != zzdvw.UNKNOWN_CURVE.zzhu()) {
            zzfhg.zzad(1, this.zzmhf);
        }
        if (this.zzmhg != zzdvy.UNKNOWN_HASH.zzhu()) {
            zzfhg.zzad(2, this.zzmhg);
        }
        if (!this.zzmhh.isEmpty()) {
            zzfhg.zza(11, this.zzmhh);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdvw zzbqf() {
        zzdvw zzgk = zzdvw.zzgk(this.zzmhf);
        return zzgk == null ? zzdvw.UNRECOGNIZED : zzgk;
    }

    public final zzdvy zzbqg() {
        zzdvy zzgl = zzdvy.zzgl(this.zzmhg);
        return zzgl == null ? zzdvy.UNRECOGNIZED : zzgl;
    }

    public final zzfgs zzbqh() {
        return this.zzmhh;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzmhf != zzdvw.UNKNOWN_CURVE.zzhu()) {
            i2 = 0 + zzfhg.zzaj(1, this.zzmhf);
        }
        if (this.zzmhg != zzdvy.UNKNOWN_HASH.zzhu()) {
            i2 += zzfhg.zzaj(2, this.zzmhg);
        }
        if (!this.zzmhh.isEmpty()) {
            i2 += zzfhg.zzc(11, this.zzmhh);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

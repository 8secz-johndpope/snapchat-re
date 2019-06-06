package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzduo extends zzfhu<zzduo, zza> implements zzfje {
    private static volatile zzfjl<zzduo> zzbbm;
    private static final zzduo zzmfy;
    private zzdus zzmfw;
    private zzdwc zzmfx;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzduo, zza> implements zzfje {
        private zza() {
            super(zzduo.zzmfy);
        }

        /* synthetic */ zza(zzdup zzdup) {
            this();
        }
    }

    static {
        zzduo zzduo = new zzduo();
        zzmfy = zzduo;
        zzduo.zza(zzg.zzppw, null, null);
        zzduo.zzpph.zzbkr();
    }

    private zzduo() {
    }

    public static zzduo zzj(zzfgs zzfgs) {
        return (zzduo) zzfhu.zza(zzmfy, zzfgs);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdup.zzbbk[i - 1]) {
            case 1:
                return new zzduo();
            case 2:
                return zzmfy;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzduo zzduo = (zzduo) obj2;
                this.zzmfw = (zzdus) zzh.zza(this.zzmfw, zzduo.zzmfw);
                this.zzmfx = (zzdwc) zzh.zza(this.zzmfx, zzduo.zzmfx);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                zzfhm zzfhm = (zzfhm) obj2;
                if (zzfhm != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int zzcxx = zzfhb.zzcxx();
                            if (zzcxx != 0) {
                                zzfhu zzfhu;
                                com.google.android.gms.internal.zzfhu.zza zza;
                                com.google.android.gms.internal.zzfhu.zza zza2;
                                if (zzcxx == 10) {
                                    if (this.zzmfw != null) {
                                        zzfhu = this.zzmfw;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzdus.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmfw = (zzdus) zzfhb.zza(zzdus.zzbox(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmfw);
                                        this.zzmfw = (zzdus) zza2.zzczw();
                                    }
                                } else if (zzcxx == 18) {
                                    if (this.zzmfx != null) {
                                        zzfhu = this.zzmfx;
                                        zza = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza.zza(zzfhu);
                                        zza2 = (com.google.android.gms.internal.zzdwc.zza) zza;
                                    } else {
                                        zza2 = null;
                                    }
                                    this.zzmfx = (zzdwc) zzfhb.zza(zzdwc.zzbqo(), zzfhm);
                                    if (zza2 != null) {
                                        zza2.zza(this.zzmfx);
                                        this.zzmfx = (zzdwc) zza2.zzczw();
                                    }
                                } else if (zza(zzcxx, zzfhb)) {
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
                    synchronized (zzduo.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmfy);
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
        return zzmfy;
    }

    public final void zza(zzfhg zzfhg) {
        zzfjc zzfjc = this.zzmfw;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdus.zzbox();
            }
            zzfhg.zza(1, zzfjc);
        }
        zzfjc = this.zzmfx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwc.zzbqo();
            }
            zzfhg.zza(2, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdus zzbop() {
        zzdus zzdus = this.zzmfw;
        return zzdus == null ? zzdus.zzbox() : zzdus;
    }

    public final zzdwc zzboq() {
        zzdwc zzdwc = this.zzmfx;
        return zzdwc == null ? zzdwc.zzbqo() : zzdwc;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        zzfjc zzfjc = this.zzmfw;
        int i2 = 0;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdus.zzbox();
            }
            i2 = 0 + zzfhg.zzc(1, zzfjc);
        }
        zzfjc = this.zzmfx;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwc.zzbqo();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

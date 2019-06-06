package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwz extends zzfhu<zzdwz, zza> implements zzfje {
    private static volatile zzfjl<zzdwz> zzbbm;
    private static final zzdwz zzmju;
    private String zzmjs = "";
    private zzdwl zzmjt;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwz, zza> implements zzfje {
        private zza() {
            super(zzdwz.zzmju);
        }

        /* synthetic */ zza(zzdxa zzdxa) {
            this();
        }
    }

    static {
        zzdwz zzdwz = new zzdwz();
        zzmju = zzdwz;
        zzdwz.zza(zzg.zzppw, null, null);
        zzdwz.zzpph.zzbkr();
    }

    private zzdwz() {
    }

    public static zzdwz zzam(zzfgs zzfgs) {
        return (zzdwz) zzfhu.zza(zzmju, zzfgs);
    }

    public static zzdwz zzbsk() {
        return zzmju;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxa.zzbbk[i - 1]) {
            case 1:
                return new zzdwz();
            case 2:
                return zzmju;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwz zzdwz = (zzdwz) obj2;
                this.zzmjs = zzh.zza(this.zzmjs.isEmpty() ^ 1, this.zzmjs, 1 ^ zzdwz.zzmjs.isEmpty(), zzdwz.zzmjs);
                this.zzmjt = (zzdwl) zzh.zza(this.zzmjt, zzdwz.zzmjt);
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
                                if (zzcxx == 10) {
                                    this.zzmjs = zzfhb.zzcye();
                                } else if (zzcxx == 18) {
                                    com.google.android.gms.internal.zzfhu.zza zza;
                                    if (this.zzmjt != null) {
                                        zzfhu zzfhu = this.zzmjt;
                                        com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                        zza2.zza(zzfhu);
                                        zza = (com.google.android.gms.internal.zzdwl.zza) zza2;
                                    } else {
                                        zza = null;
                                    }
                                    this.zzmjt = (zzdwl) zzfhb.zza(zzdwl.zzbra(), zzfhm);
                                    if (zza != null) {
                                        zza.zza(this.zzmjt);
                                        this.zzmjt = (zzdwl) zza.zzczw();
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
                    synchronized (zzdwz.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmju);
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
        return zzmju;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmjs.isEmpty()) {
            zzfhg.zzp(1, this.zzmjs);
        }
        zzfjc zzfjc = this.zzmjt;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwl.zzbra();
            }
            zzfhg.zza(2, zzfjc);
        }
        this.zzpph.zza(zzfhg);
    }

    public final String zzbsi() {
        return this.zzmjs;
    }

    public final zzdwl zzbsj() {
        zzdwl zzdwl = this.zzmjt;
        return zzdwl == null ? zzdwl.zzbra() : zzdwl;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzmjs.isEmpty()) {
            i2 = 0 + zzfhg.zzq(1, this.zzmjs);
        }
        zzfjc zzfjc = this.zzmjt;
        if (zzfjc != null) {
            if (zzfjc == null) {
                zzfjc = zzdwl.zzbra();
            }
            i2 += zzfhg.zzc(2, zzfjc);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

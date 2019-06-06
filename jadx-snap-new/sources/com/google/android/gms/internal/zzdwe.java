package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzb;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwe extends zzfhu<zzdwe, zza> implements zzfje {
    private static volatile zzfjl<zzdwe> zzbbm;
    private static final zzdwe zzmic;
    private int zzmia;
    private int zzmib;

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwe, zza> implements zzfje {
        private zza() {
            super(zzdwe.zzmic);
        }

        /* synthetic */ zza(zzdwf zzdwf) {
            this();
        }
    }

    static {
        zzdwe zzdwe = new zzdwe();
        zzmic = zzdwe;
        zzdwe.zza(zzg.zzppw, null, null);
        zzdwe.zzpph.zzbkr();
    }

    private zzdwe() {
    }

    public static zzdwe zzbqs() {
        return zzmic;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdwf.zzbbk[i - 1]) {
            case 1:
                return new zzdwe();
            case 2:
                return zzmic;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwe zzdwe = (zzdwe) obj2;
                this.zzmia = zzh.zza(this.zzmia != 0, this.zzmia, zzdwe.zzmia != 0, zzdwe.zzmia);
                boolean z2 = this.zzmib != 0;
                int i2 = this.zzmib;
                if (zzdwe.zzmib == 0) {
                    z = false;
                }
                this.zzmib = zzh.zza(z2, i2, z, zzdwe.zzmib);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 8) {
                                    this.zzmia = zzfhb.zzcyh();
                                } else if (i == 16) {
                                    this.zzmib = zzfhb.zzcyg();
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
                    synchronized (zzdwe.class) {
                        if (zzbbm == null) {
                            zzbbm = new zzb(zzmic);
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
        return zzmic;
    }

    public final void zza(zzfhg zzfhg) {
        if (this.zzmia != zzdvy.UNKNOWN_HASH.zzhu()) {
            zzfhg.zzad(1, this.zzmia);
        }
        int i = this.zzmib;
        if (i != 0) {
            zzfhg.zzae(2, i);
        }
        this.zzpph.zza(zzfhg);
    }

    public final zzdvy zzbqq() {
        zzdvy zzgl = zzdvy.zzgl(this.zzmia);
        return zzgl == null ? zzdvy.UNRECOGNIZED : zzgl;
    }

    public final int zzbqr() {
        return this.zzmib;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.zzmia != zzdvy.UNKNOWN_HASH.zzhu()) {
            i2 = 0 + zzfhg.zzaj(1, this.zzmia);
        }
        i = this.zzmib;
        if (i != 0) {
            i2 += zzfhg.zzah(2, i);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

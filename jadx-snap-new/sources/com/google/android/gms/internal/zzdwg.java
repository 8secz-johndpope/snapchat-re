package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwg extends zzfhu<zzdwg, zza> implements zzfje {
    private static volatile zzfjl<zzdwg> zzbbm;
    private static final zzdwg zzmig;
    private String zzmid = "";
    private zzfgs zzmie = zzfgs.zzpnw;
    private int zzmif;

    public enum zzb implements zzfia {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzfib<zzb> zzbcn = null;
        private final int value;

        static {
            zzbcn = new zzdwi();
        }

        private zzb(int i) {
            this.value = i;
        }

        public static zzb zzgn(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : REMOTE : ASYMMETRIC_PUBLIC : ASYMMETRIC_PRIVATE : SYMMETRIC : UNKNOWN_KEYMATERIAL;
        }

        public final int zzhu() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwg, zza> implements zzfje {
        private zza() {
            super(zzdwg.zzmig);
        }

        /* synthetic */ zza(zzdwh zzdwh) {
            this();
        }

        public final zza zzai(zzfgs zzfgs) {
            zzczv();
            ((zzdwg) this.zzppl).zzah(zzfgs);
            return this;
        }

        public final zza zzb(zzb zzb) {
            zzczv();
            ((zzdwg) this.zzppl).zza(zzb);
            return this;
        }

        public final zza zzop(String str) {
            zzczv();
            ((zzdwg) this.zzppl).zzoo(str);
            return this;
        }
    }

    static {
        zzdwg zzdwg = new zzdwg();
        zzmig = zzdwg;
        zzdwg.zza(zzg.zzppw, null, null);
        zzdwg.zzpph.zzbkr();
    }

    private zzdwg() {
    }

    private final void zza(zzb zzb) {
        if (zzb != null) {
            this.zzmif = zzb.zzhu();
            return;
        }
        throw new NullPointerException();
    }

    private final void zzah(zzfgs zzfgs) {
        if (zzfgs != null) {
            this.zzmie = zzfgs;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbqx() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmig.zza(zzg.zzppy, null, null));
    }

    public static zzdwg zzbqy() {
        return zzmig;
    }

    private final void zzoo(String str) {
        if (str != null) {
            this.zzmid = str;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (zzdwh.zzbbk[i - 1]) {
            case 1:
                return new zzdwg();
            case 2:
                return zzmig;
            case 3:
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwg zzdwg = (zzdwg) obj2;
                this.zzmid = zzh.zza(this.zzmid.isEmpty() ^ 1, this.zzmid, zzdwg.zzmid.isEmpty() ^ 1, zzdwg.zzmid);
                this.zzmie = zzh.zza(this.zzmie != zzfgs.zzpnw, this.zzmie, zzdwg.zzmie != zzfgs.zzpnw, zzdwg.zzmie);
                boolean z2 = this.zzmif != 0;
                int i2 = this.zzmif;
                if (zzdwg.zzmif == 0) {
                    z = false;
                }
                this.zzmif = zzh.zza(z2, i2, z, zzdwg.zzmif);
                return this;
            case 6:
                zzfhb zzfhb = (zzfhb) obj;
                if (((zzfhm) obj2) != null) {
                    while (obj3 == null) {
                        try {
                            i = zzfhb.zzcxx();
                            if (i != 0) {
                                if (i == 10) {
                                    this.zzmid = zzfhb.zzcye();
                                } else if (i == 18) {
                                    this.zzmie = zzfhb.zzcyf();
                                } else if (i == 24) {
                                    this.zzmif = zzfhb.zzcyh();
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
                    synchronized (zzdwg.class) {
                        if (zzbbm == null) {
                            zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzmig);
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
        return zzmig;
    }

    public final void zza(zzfhg zzfhg) {
        if (!this.zzmid.isEmpty()) {
            zzfhg.zzp(1, this.zzmid);
        }
        if (!this.zzmie.isEmpty()) {
            zzfhg.zza(2, this.zzmie);
        }
        if (this.zzmif != zzb.UNKNOWN_KEYMATERIAL.zzhu()) {
            zzfhg.zzad(3, this.zzmif);
        }
        this.zzpph.zza(zzfhg);
    }

    public final String zzbqu() {
        return this.zzmid;
    }

    public final zzfgs zzbqv() {
        return this.zzmie;
    }

    public final zzb zzbqw() {
        zzb zzgn = zzb.zzgn(this.zzmif);
        return zzgn == null ? zzb.UNRECOGNIZED : zzgn;
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.zzmid.isEmpty()) {
            i2 = 0 + zzfhg.zzq(1, this.zzmid);
        }
        if (!this.zzmie.isEmpty()) {
            i2 += zzfhg.zzc(2, this.zzmie);
        }
        if (this.zzmif != zzb.UNKNOWN_KEYMATERIAL.zzhu()) {
            i2 += zzfhg.zzaj(3, this.zzmif);
        }
        i2 += this.zzpph.zzhs();
        this.zzppi = i2;
        return i2;
    }
}

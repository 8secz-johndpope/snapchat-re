package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzf;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;
import java.util.List;

public final class zzdwp extends zzfhu<zzdwp, zza> implements zzfje {
    private static volatile zzfjl<zzdwp> zzbbm;
    private static final zzdwp zzmje;
    private int zzmjb;
    private int zzmjc;
    private zzfid<zzb> zzmjd = zzfhu.zzczs();

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwp, zza> implements zzfje {
        private zza() {
            super(zzdwp.zzmje);
        }

        /* synthetic */ zza(zzdwq zzdwq) {
            this();
        }
    }

    public static final class zzb extends zzfhu<zzb, zza> implements zzfje {
        private static volatile zzfjl<zzb> zzbbm;
        private static final zzb zzmji;
        private int zzmiu;
        private zzdwg zzmjf;
        private int zzmjg;
        private int zzmjh;

        public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzb, zza> implements zzfje {
            private zza() {
                super(zzb.zzmji);
            }

            /* synthetic */ zza(zzdwq zzdwq) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzmji = zzb;
            zzb.zza(zzg.zzppw, null, null);
            zzb.zzpph.zzbkr();
        }

        private zzb() {
        }

        public static zzb zzbrs() {
            return zzmji;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            boolean z = true;
            Object obj3 = null;
            switch (zzdwq.zzbbk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzmji;
                case 3:
                    return null;
                case 4:
                    return new zza();
                case 5:
                    zzh zzh = (zzh) obj;
                    zzb zzb = (zzb) obj2;
                    this.zzmjf = (zzdwg) zzh.zza(this.zzmjf, zzb.zzmjf);
                    this.zzmjg = zzh.zza(this.zzmjg != 0, this.zzmjg, zzb.zzmjg != 0, zzb.zzmjg);
                    this.zzmjh = zzh.zza(this.zzmjh != 0, this.zzmjh, zzb.zzmjh != 0, zzb.zzmjh);
                    boolean z2 = this.zzmiu != 0;
                    int i2 = this.zzmiu;
                    if (zzb.zzmiu == 0) {
                        z = false;
                    }
                    this.zzmiu = zzh.zza(z2, i2, z, zzb.zzmiu);
                    return this;
                case 6:
                    zzfhb zzfhb = (zzfhb) obj;
                    zzfhm zzfhm = (zzfhm) obj2;
                    if (zzfhm != null) {
                        while (obj3 == null) {
                            try {
                                i = zzfhb.zzcxx();
                                if (i != 0) {
                                    if (i == 10) {
                                        com.google.android.gms.internal.zzfhu.zza zza;
                                        if (this.zzmjf != null) {
                                            zzfhu zzfhu = this.zzmjf;
                                            com.google.android.gms.internal.zzfhu.zza zza2 = (com.google.android.gms.internal.zzfhu.zza) zzfhu.zza(zzg.zzppy, null, null);
                                            zza2.zza(zzfhu);
                                            zza = (com.google.android.gms.internal.zzdwg.zza) zza2;
                                        } else {
                                            zza = null;
                                        }
                                        this.zzmjf = (zzdwg) zzfhb.zza(zzdwg.zzbqy(), zzfhm);
                                        if (zza != null) {
                                            zza.zza(this.zzmjf);
                                            this.zzmjf = (zzdwg) zza.zzczw();
                                        }
                                    } else if (i == 16) {
                                        this.zzmjg = zzfhb.zzcyh();
                                    } else if (i == 24) {
                                        this.zzmjh = zzfhb.zzcyg();
                                    } else if (i == 32) {
                                        this.zzmiu = zzfhb.zzcyh();
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
                        synchronized (zzb.class) {
                            if (zzbbm == null) {
                                zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzmji);
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
            return zzmji;
        }

        public final void zza(zzfhg zzfhg) {
            zzfjc zzfjc = this.zzmjf;
            if (zzfjc != null) {
                if (zzfjc == null) {
                    zzfjc = zzdwg.zzbqy();
                }
                zzfhg.zza(1, zzfjc);
            }
            if (this.zzmjg != zzdwj.UNKNOWN_STATUS.zzhu()) {
                zzfhg.zzad(2, this.zzmjg);
            }
            int i = this.zzmjh;
            if (i != 0) {
                zzfhg.zzae(3, i);
            }
            if (this.zzmiu != zzdxb.UNKNOWN_PREFIX.zzhu()) {
                zzfhg.zzad(4, this.zzmiu);
            }
            this.zzpph.zza(zzfhg);
        }

        public final boolean zzbrn() {
            return this.zzmjf != null;
        }

        public final zzdwg zzbro() {
            zzdwg zzdwg = this.zzmjf;
            return zzdwg == null ? zzdwg.zzbqy() : zzdwg;
        }

        public final zzdwj zzbrp() {
            zzdwj zzgo = zzdwj.zzgo(this.zzmjg);
            return zzgo == null ? zzdwj.UNRECOGNIZED : zzgo;
        }

        public final int zzbrq() {
            return this.zzmjh;
        }

        public final zzdxb zzbrr() {
            zzdxb zzgx = zzdxb.zzgx(this.zzmiu);
            return zzgx == null ? zzdxb.UNRECOGNIZED : zzgx;
        }

        public final int zzhs() {
            int i = this.zzppi;
            if (i != -1) {
                return i;
            }
            zzfjc zzfjc = this.zzmjf;
            int i2 = 0;
            if (zzfjc != null) {
                if (zzfjc == null) {
                    zzfjc = zzdwg.zzbqy();
                }
                i2 = 0 + zzfhg.zzc(1, zzfjc);
            }
            if (this.zzmjg != zzdwj.UNKNOWN_STATUS.zzhu()) {
                i2 += zzfhg.zzaj(2, this.zzmjg);
            }
            i = this.zzmjh;
            if (i != 0) {
                i2 += zzfhg.zzah(3, i);
            }
            if (this.zzmiu != zzdxb.UNKNOWN_PREFIX.zzhu()) {
                i2 += zzfhg.zzaj(4, this.zzmiu);
            }
            i2 += this.zzpph.zzhs();
            this.zzppi = i2;
            return i2;
        }
    }

    static {
        zzdwp zzdwp = new zzdwp();
        zzmje = zzdwp;
        zzdwp.zza(zzg.zzppw, null, null);
        zzdwp.zzpph.zzbkr();
    }

    private zzdwp() {
    }

    public static zzdwp zzai(byte[] bArr) {
        return (zzdwp) zzfhu.zza(zzmje, bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        int i2;
        switch (zzdwq.zzbbk[i - 1]) {
            case 1:
                return new zzdwp();
            case 2:
                return zzmje;
            case 3:
                this.zzmjd.zzbkr();
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwp zzdwp = (zzdwp) obj2;
                boolean z2 = this.zzmjc != 0;
                i2 = this.zzmjc;
                if (zzdwp.zzmjc != 0) {
                    z = true;
                }
                this.zzmjc = zzh.zza(z2, i2, z, zzdwp.zzmjc);
                this.zzmjd = zzh.zza(this.zzmjd, zzdwp.zzmjd);
                if (zzh == zzf.zzppq) {
                    this.zzmjb |= zzdwp.zzmjb;
                }
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
                                    this.zzmjc = zzfhb.zzcyg();
                                } else if (i == 18) {
                                    if (!this.zzmjd.zzcxk()) {
                                        zzfid zzfid = this.zzmjd;
                                        i2 = zzfid.size();
                                        this.zzmjd = zzfid.zzmo(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.zzmjd.add((zzb) zzfhb.zza(zzb.zzbrs(), zzfhm));
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
                    synchronized (zzdwp.class) {
                        if (zzbbm == null) {
                            zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzmje);
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
        return zzmje;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmjc;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        for (i = 0; i < this.zzmjd.size(); i++) {
            zzfhg.zza(2, (zzfjc) this.zzmjd.get(i));
        }
        this.zzpph.zza(zzfhg);
    }

    public final int zzbrj() {
        return this.zzmjc;
    }

    public final List<zzb> zzbrk() {
        return this.zzmjd;
    }

    public final int zzbrl() {
        return this.zzmjd.size();
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmjc;
        int i2 = 0;
        i = i != 0 ? zzfhg.zzah(1, i) + 0 : 0;
        while (i2 < this.zzmjd.size()) {
            i += zzfhg.zzc(2, (zzfjc) this.zzmjd.get(i2));
            i2++;
        }
        i += this.zzpph.zzhs();
        this.zzppi = i;
        return i;
    }
}

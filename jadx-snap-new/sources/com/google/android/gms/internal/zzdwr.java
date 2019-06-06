package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfhu.zzf;
import com.google.android.gms.internal.zzfhu.zzg;
import com.google.android.gms.internal.zzfhu.zzh;
import java.io.IOException;

public final class zzdwr extends zzfhu<zzdwr, zza> implements zzfje {
    private static volatile zzfjl<zzdwr> zzbbm;
    private static final zzdwr zzmjk;
    private int zzmjb;
    private int zzmjc;
    private zzfid<zzb> zzmjj = zzfhu.zzczs();

    public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzdwr, zza> implements zzfje {
        private zza() {
            super(zzdwr.zzmjk);
        }

        /* synthetic */ zza(zzdws zzdws) {
            this();
        }

        public final zza zzb(zzb zzb) {
            zzczv();
            ((zzdwr) this.zzppl).zza(zzb);
            return this;
        }

        public final zza zzgs(int i) {
            zzczv();
            ((zzdwr) this.zzppl).zzgr(i);
            return this;
        }
    }

    public static final class zzb extends zzfhu<zzb, zza> implements zzfje {
        private static volatile zzfjl<zzb> zzbbm;
        private static final zzb zzmjl;
        private String zzmid = "";
        private int zzmiu;
        private int zzmjg;
        private int zzmjh;

        public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zzb, zza> implements zzfje {
            private zza() {
                super(zzb.zzmjl);
            }

            /* synthetic */ zza(zzdws zzdws) {
                this();
            }

            public final zza zzb(zzdwj zzdwj) {
                zzczv();
                ((zzb) this.zzppl).zza(zzdwj);
                return this;
            }

            public final zza zzb(zzdxb zzdxb) {
                zzczv();
                ((zzb) this.zzppl).zza(zzdxb);
                return this;
            }

            public final zza zzgu(int i) {
                zzczv();
                ((zzb) this.zzppl).zzgt(i);
                return this;
            }

            public final zza zzov(String str) {
                zzczv();
                ((zzb) this.zzppl).zzoo(str);
                return this;
            }
        }

        static {
            zzb zzb = new zzb();
            zzmjl = zzb;
            zzb.zza(zzg.zzppw, null, null);
            zzb.zzpph.zzbkr();
        }

        private zzb() {
        }

        private final void zza(zzdwj zzdwj) {
            if (zzdwj != null) {
                this.zzmjg = zzdwj.zzhu();
                return;
            }
            throw new NullPointerException();
        }

        private final void zza(zzdxb zzdxb) {
            if (zzdxb != null) {
                this.zzmiu = zzdxb.zzhu();
                return;
            }
            throw new NullPointerException();
        }

        public static zza zzbrw() {
            return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmjl.zza(zzg.zzppy, null, null));
        }

        public static zzb zzbrx() {
            return zzmjl;
        }

        private final void zzgt(int i) {
            this.zzmjh = i;
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
            switch (zzdws.zzbbk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzmjl;
                case 3:
                    return null;
                case 4:
                    return new zza();
                case 5:
                    zzh zzh = (zzh) obj;
                    zzb zzb = (zzb) obj2;
                    this.zzmid = zzh.zza(this.zzmid.isEmpty() ^ 1, this.zzmid, zzb.zzmid.isEmpty() ^ 1, zzb.zzmid);
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
                    if (((zzfhm) obj2) != null) {
                        while (obj3 == null) {
                            try {
                                i = zzfhb.zzcxx();
                                if (i != 0) {
                                    if (i == 10) {
                                        this.zzmid = zzfhb.zzcye();
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
                                zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzmjl);
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
            return zzmjl;
        }

        public final void zza(zzfhg zzfhg) {
            if (!this.zzmid.isEmpty()) {
                zzfhg.zzp(1, this.zzmid);
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

        public final int zzhs() {
            int i = this.zzppi;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.zzmid.isEmpty()) {
                i2 = 0 + zzfhg.zzq(1, this.zzmid);
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
        zzdwr zzdwr = new zzdwr();
        zzmjk = zzdwr;
        zzdwr.zza(zzg.zzppw, null, null);
        zzdwr.zzpph.zzbkr();
    }

    private zzdwr() {
    }

    private final void zza(zzb zzb) {
        if (zzb != null) {
            if (!this.zzmjj.zzcxk()) {
                zzfid zzfid = this.zzmjj;
                int size = zzfid.size();
                this.zzmjj = zzfid.zzmo(size == 0 ? 10 : size << 1);
            }
            this.zzmjj.add(zzb);
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzbru() {
        return (zza) ((com.google.android.gms.internal.zzfhu.zza) zzmjk.zza(zzg.zzppy, null, null));
    }

    private final void zzgr(int i) {
        this.zzmjc = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        int i2;
        switch (zzdws.zzbbk[i - 1]) {
            case 1:
                return new zzdwr();
            case 2:
                return zzmjk;
            case 3:
                this.zzmjj.zzbkr();
                return null;
            case 4:
                return new zza();
            case 5:
                zzh zzh = (zzh) obj;
                zzdwr zzdwr = (zzdwr) obj2;
                boolean z2 = this.zzmjc != 0;
                i2 = this.zzmjc;
                if (zzdwr.zzmjc != 0) {
                    z = true;
                }
                this.zzmjc = zzh.zza(z2, i2, z, zzdwr.zzmjc);
                this.zzmjj = zzh.zza(this.zzmjj, zzdwr.zzmjj);
                if (zzh == zzf.zzppq) {
                    this.zzmjb |= zzdwr.zzmjb;
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
                                    if (!this.zzmjj.zzcxk()) {
                                        zzfid zzfid = this.zzmjj;
                                        i2 = zzfid.size();
                                        this.zzmjj = zzfid.zzmo(i2 == 0 ? 10 : i2 << 1);
                                    }
                                    this.zzmjj.add((zzb) zzfhb.zza(zzb.zzbrx(), zzfhm));
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
                    synchronized (zzdwr.class) {
                        if (zzbbm == null) {
                            zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzmjk);
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
        return zzmjk;
    }

    public final void zza(zzfhg zzfhg) {
        int i = this.zzmjc;
        if (i != 0) {
            zzfhg.zzae(1, i);
        }
        for (i = 0; i < this.zzmjj.size(); i++) {
            zzfhg.zza(2, (zzfjc) this.zzmjj.get(i));
        }
        this.zzpph.zza(zzfhg);
    }

    public final int zzhs() {
        int i = this.zzppi;
        if (i != -1) {
            return i;
        }
        i = this.zzmjc;
        int i2 = 0;
        i = i != 0 ? zzfhg.zzah(1, i) + 0 : 0;
        while (i2 < this.zzmjj.size()) {
            i += zzfhg.zzc(2, (zzfjc) this.zzmjj.get(i2));
            i2++;
        }
        i += this.zzpph.zzhs();
        this.zzppi = i;
        return i;
    }
}

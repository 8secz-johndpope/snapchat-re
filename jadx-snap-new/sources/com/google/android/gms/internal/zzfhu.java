package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzfhu<MessageType extends zzfhu<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzfgj<MessageType, BuilderType> {
    private static Map<Object, zzfhu<?, ?>> zzppj = new ConcurrentHashMap();
    protected zzfko zzpph = zzfko.zzdca();
    protected int zzppi = -1;

    public enum zzg {
        public static final int zzppr = 1;
        public static final int zzpps = 2;
        public static final int zzppt = 3;
        public static final int zzppu = 4;
        public static final int zzppv = 5;
        public static final int zzppw = 6;
        public static final int zzppx = 7;
        public static final int zzppy = 8;
        public static final int zzppz = 9;
        public static final int zzpqa = 10;
        private static final /* synthetic */ int[] zzpqb = new int[]{zzppr, zzpps, zzppt, zzppu, zzppv, zzppw, zzppx, zzppy, zzppz, zzpqa};
        public static final int zzpqc = 1;
        private static int zzpqd = 2;
        private static final /* synthetic */ int[] zzpqe = new int[]{zzpqc, zzpqd};
        public static final int zzpqf = 1;
        public static final int zzpqg = 2;
        private static final /* synthetic */ int[] zzpqh = new int[]{zzpqf, zzpqg};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzpqb.clone();
        }
    }

    public interface zzh {
        int zza(boolean z, int i, boolean z2, int i2);

        zzfgs zza(boolean z, zzfgs zzfgs, boolean z2, zzfgs zzfgs2);

        <T> zzfid<T> zza(zzfid<T> zzfid, zzfid<T> zzfid2);

        <T extends zzfjc> T zza(T t, T t2);

        zzfko zza(zzfko zzfko, zzfko zzfko2);

        String zza(boolean z, String str, boolean z2, String str2);

        boolean zza(boolean z, boolean z2, boolean z3, boolean z4);
    }

    static class zzc implements zzh {
        static final zzc zzppn = new zzc();
        private static zzfhv zzppo = new zzfhv();

        private zzc() {
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw zzppo;
        }

        public final zzfgs zza(boolean z, zzfgs zzfgs, boolean z2, zzfgs zzfgs2) {
            if (z == z2 && zzfgs.equals(zzfgs2)) {
                return zzfgs;
            }
            throw zzppo;
        }

        public final <T> zzfid<T> zza(zzfid<T> zzfid, zzfid<T> zzfid2) {
            if (zzfid.equals(zzfid2)) {
                return zzfid;
            }
            throw zzppo;
        }

        public final <T extends zzfjc> T zza(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw zzppo;
            }
            T t3 = (zzfhu) t;
            if (t3 != t2 && ((zzfhu) t3.zza(zzg.zzppz, null, null)).getClass().isInstance(t2)) {
                Object obj = (zzfhu) t2;
                t3.zza(zzg.zzpps, (Object) this, obj);
                t3.zzpph = zza(t3.zzpph, obj.zzpph);
            }
            return t;
        }

        public final zzfko zza(zzfko zzfko, zzfko zzfko2) {
            if (zzfko.equals(zzfko2)) {
                return zzfko;
            }
            throw zzppo;
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw zzppo;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw zzppo;
        }
    }

    static class zze implements zzh {
        int zzmci = 0;

        zze() {
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            this.zzmci = (this.zzmci * 53) + i;
            return i;
        }

        public final zzfgs zza(boolean z, zzfgs zzfgs, boolean z2, zzfgs zzfgs2) {
            this.zzmci = (this.zzmci * 53) + zzfgs.hashCode();
            return zzfgs;
        }

        public final <T> zzfid<T> zza(zzfid<T> zzfid, zzfid<T> zzfid2) {
            this.zzmci = (this.zzmci * 53) + zzfid.hashCode();
            return zzfid;
        }

        public final <T extends zzfjc> T zza(T t, T t2) {
            int i;
            if (t == null) {
                i = 37;
            } else if (t instanceof zzfhu) {
                Object obj = (zzfhu) t;
                if (obj.zzpno == 0) {
                    int i2 = this.zzmci;
                    this.zzmci = 0;
                    obj.zza(zzg.zzpps, (Object) this, obj);
                    obj.zzpph = zza(obj.zzpph, obj.zzpph);
                    obj.zzpno = this.zzmci;
                    this.zzmci = i2;
                }
                i = obj.zzpno;
            } else {
                i = t.hashCode();
            }
            this.zzmci = (this.zzmci * 53) + i;
            return t;
        }

        public final zzfko zza(zzfko zzfko, zzfko zzfko2) {
            this.zzmci = (this.zzmci * 53) + zzfko.hashCode();
            return zzfko;
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            this.zzmci = (this.zzmci * 53) + str.hashCode();
            return str;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            this.zzmci = (this.zzmci * 53) + zzfhz.zzdo(z2);
            return z2;
        }
    }

    public static class zzf implements zzh {
        public static final zzf zzppq = new zzf();

        private zzf() {
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public final zzfgs zza(boolean z, zzfgs zzfgs, boolean z2, zzfgs zzfgs2) {
            return z2 ? zzfgs2 : zzfgs;
        }

        public final <T> zzfid<T> zza(zzfid<T> zzfid, zzfid<T> zzfid2) {
            int size = zzfid.size();
            int size2 = zzfid2.size();
            if (size > 0 && size2 > 0) {
                if (!zzfid.zzcxk()) {
                    zzfid = zzfid.zzmo(size2 + size);
                }
                zzfid.addAll(zzfid2);
            }
            return size > 0 ? zzfid : zzfid2;
        }

        public final <T extends zzfjc> T zza(T t, T t2) {
            return (t == null || t2 == null) ? t != null ? t : t2 : t.zzczt().zzd(t2).zzczz();
        }

        public final zzfko zza(zzfko zzfko, zzfko zzfko2) {
            return zzfko2 == zzfko.zzdca() ? zzfko : zzfko.zzb(zzfko, zzfko2);
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }
    }

    public static class zzb<T extends zzfhu<T, ?>> extends zzfgm<T> {
        private T zzppk;

        public zzb(T t) {
            this.zzppk = t;
        }
    }

    public static abstract class zza<MessageType extends zzfhu<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzfgk<MessageType, BuilderType> {
        private final MessageType zzppk;
        protected MessageType zzppl;
        private boolean zzppm = false;

        protected zza(MessageType messageType) {
            this.zzppk = messageType;
            this.zzppl = (zzfhu) messageType.zza(zzg.zzppx, null, null);
        }

        private static void zza(MessageType messageType, MessageType messageType2) {
            Object obj = zzf.zzppq;
            messageType.zza(zzg.zzpps, obj, (Object) messageType2);
            messageType.zzpph = obj.zza(messageType.zzpph, messageType2.zzpph);
        }

        public /* synthetic */ Object clone() {
            zza zza = (zza) this.zzppk.zza(zzg.zzppy, null, null);
            if (!this.zzppm) {
                zzfhu zzfhu = this.zzppl;
                zzfhu.zza(zzg.zzppw, null, null);
                zzfhu.zzpph.zzbkr();
                this.zzppm = true;
            }
            zza.zza(this.zzppl);
            return zza;
        }

        public final BuilderType zza(MessageType messageType) {
            zzczv();
            zza(this.zzppl, messageType);
            return this;
        }

        public final /* synthetic */ zzfgk zzcxj() {
            return (zza) clone();
        }

        public final /* synthetic */ zzfjc zzczu() {
            return this.zzppk;
        }

        /* Access modifiers changed, original: protected|final */
        public final void zzczv() {
            if (this.zzppm) {
                zzfhu zzfhu = (zzfhu) this.zzppl.zza(zzg.zzppx, null, null);
                zza(zzfhu, this.zzppl);
                this.zzppl = zzfhu;
                this.zzppm = false;
            }
        }

        public final MessageType zzczw() {
            if (this.zzppm) {
                return this.zzppl;
            }
            zzfhu zzfhu = this.zzppl;
            zzfhu.zza(zzg.zzppw, null, null);
            zzfhu.zzpph.zzbkr();
            this.zzppm = true;
            return this.zzppl;
        }

        public final MessageType zzczx() {
            zzfhu zzfhu;
            boolean z = true;
            if (!this.zzppm) {
                zzfhu = this.zzppl;
                zzfhu.zza(zzg.zzppw, null, null);
                zzfhu.zzpph.zzbkr();
                this.zzppm = true;
            }
            zzfhu = this.zzppl;
            byte byteValue = ((Byte) zzfhu.zza(zzg.zzppt, null, null)).byteValue();
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    if (zzfhu.zza(zzg.zzppr, Boolean.FALSE, null) == null) {
                        z = false;
                    }
                    zzfhu.zza(zzg.zzppu, z ? zzfhu : null, null);
                }
            }
            if (z) {
                return zzfhu;
            }
            throw new zzfkm(zzfhu);
        }

        public final /* synthetic */ zzfjc zzczz() {
            zzfhu zzfhu;
            boolean z = true;
            if (!this.zzppm) {
                zzfhu = this.zzppl;
                zzfhu.zza(zzg.zzppw, null, null);
                zzfhu.zzpph.zzbkr();
                this.zzppm = true;
            }
            zzfhu = this.zzppl;
            byte byteValue = ((Byte) zzfhu.zza(zzg.zzppt, null, null)).byteValue();
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    if (zzfhu.zza(zzg.zzppr, Boolean.FALSE, null) == null) {
                        z = false;
                    }
                    zzfhu.zza(zzg.zzppu, z ? zzfhu : null, null);
                }
            }
            if (z) {
                return zzfhu;
            }
            throw new zzfkm(zzfhu);
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzfhu<MessageType, BuilderType> implements zzfje {
        protected zzfhq<Object> zzppp = zzfhq.zzczj();
    }

    protected static <T extends zzfhu<T, ?>> T zza(T t, zzfgs zzfgs) {
        byte byteValue;
        zzfhu zza = zza((zzfhu) t, zzfgs, zzfhm.zzczf());
        Object obj = null;
        if (zza != null) {
            Object obj2;
            byteValue = ((Byte) zza.zza(zzg.zzppt, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                obj2 = 1;
            } else if (byteValue == (byte) 0) {
                obj2 = null;
            } else {
                obj2 = zza.zza(zzg.zzppr, Boolean.FALSE, null) != null ? 1 : null;
                zza.zza(zzg.zzppu, obj2 != null ? zza : null, null);
            }
            if (obj2 == null) {
                throw new zzfkm(zza).zzdbz().zzi(zza);
            }
        }
        if (zza != null) {
            byteValue = ((Byte) zza.zza(zzg.zzppt, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                obj = 1;
            } else if (byteValue != (byte) 0) {
                if (zza.zza(zzg.zzppr, Boolean.FALSE, null) != null) {
                    obj = 1;
                }
                zza.zza(zzg.zzppu, obj != null ? zza : null, null);
            }
            if (obj == null) {
                throw new zzfkm(zza).zzdbz().zzi(zza);
            }
        }
        return zza;
    }

    private static <T extends zzfhu<T, ?>> T zza(T t, zzfgs zzfgs, zzfhm zzfhm) {
        zzfhu zza;
        try {
            zzfhb zzcxq = zzfgs.zzcxq();
            zza = zza((zzfhu) t, zzcxq, zzfhm);
            zzcxq.zzlf(0);
            return zza;
        } catch (zzfie e) {
            throw e.zzi(zza);
        } catch (zzfie e2) {
            throw e2;
        }
    }

    static <T extends zzfhu<T, ?>> T zza(T t, zzfhb zzfhb, zzfhm zzfhm) {
        zzfhu zzfhu = (zzfhu) t.zza(zzg.zzppx, null, null);
        try {
            zzfhu.zza(zzg.zzppv, (Object) zzfhb, (Object) zzfhm);
            zzfhu.zza(zzg.zzppw, null, null);
            zzfhu.zzpph.zzbkr();
            return zzfhu;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof zzfie) {
                throw ((zzfie) e.getCause());
            }
            throw e;
        }
    }

    protected static <T extends zzfhu<T, ?>> T zza(T t, byte[] bArr) {
        zzfhu zza = zza((zzfhu) t, bArr, zzfhm.zzczf());
        if (zza != null) {
            byte byteValue = ((Byte) zza.zza(zzg.zzppt, null, null)).byteValue();
            Object obj = null;
            if (byteValue == (byte) 1) {
                obj = 1;
            } else if (byteValue != (byte) 0) {
                if (zza.zza(zzg.zzppr, Boolean.FALSE, null) != null) {
                    obj = 1;
                }
                zza.zza(zzg.zzppu, obj != null ? zza : null, null);
            }
            if (obj == null) {
                throw new zzfkm(zza).zzdbz().zzi(zza);
            }
        }
        return zza;
    }

    private static <T extends zzfhu<T, ?>> T zza(T t, byte[] bArr, zzfhm zzfhm) {
        zzfhu zza;
        try {
            zzfhb zzbb = zzfhb.zzbb(bArr);
            zza = zza((zzfhu) t, zzbb, zzfhm);
            zzbb.zzlf(0);
            return zza;
        } catch (zzfie e) {
            throw e.zzi(zza);
        } catch (zzfie e2) {
            throw e2;
        }
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <E> zzfid<E> zzczs() {
        return zzfjo.zzdbg();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzfhu) zza(zzg.zzppz, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            Object obj2 = zzc.zzppn;
            obj = (zzfhu) obj;
            zza(zzg.zzpps, obj2, obj);
            this.zzpph = obj2.zza(this.zzpph, obj.zzpph);
            return true;
        } catch (zzfhv unused) {
            return false;
        }
    }

    public int hashCode() {
        if (this.zzpno != 0) {
            return this.zzpno;
        }
        Object zze = new zze();
        zza(zzg.zzpps, zze, (Object) this);
        zzfko zzfko = this.zzpph;
        this.zzpph = zze.zza(zzfko, zzfko);
        this.zzpno = zze.zzmci;
        return this.zzpno;
    }

    public String toString() {
        return zzfjf.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    public void zza(zzfhg zzfhg) {
        zzfjn.zzdbf().zzl(getClass()).zza(this, zzfhi.zzb(zzfhg));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(int i, zzfhb zzfhb) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.zzpph == zzfko.zzdca()) {
            this.zzpph = zzfko.zzdcb();
        }
        return this.zzpph.zzb(i, zzfhb);
    }

    public final /* synthetic */ zzfjd zzczt() {
        zza zza = (zza) zza(zzg.zzppy, null, null);
        zza.zza(this);
        return zza;
    }

    public final /* synthetic */ zzfjc zzczu() {
        return (zzfhu) zza(zzg.zzppz, null, null);
    }

    public int zzhs() {
        if (this.zzppi == -1) {
            this.zzppi = zzfjn.zzdbf().zzl(getClass()).zzct(this);
        }
        return this.zzppi;
    }
}

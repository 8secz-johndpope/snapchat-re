package com.google.android.gms.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzfhg extends zzfgr {
    private static final Logger logger = Logger.getLogger(zzfhg.class.getName());
    private static final boolean zzpop = zzfkq.zzdcd();
    zzfhi zzpoq = this;

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str, Throwable th) {
            str = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(str.length() != 0 ? str2.concat(str) : new String(str2), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static class zzb extends zzfhg {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if (((i | i2) | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i;
                    this.position = i;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zza(int i, long j) {
            zzac(i, 0);
            zzcu(j);
        }

        public final void zza(int i, zzfgs zzfgs) {
            zzac(i, 2);
            zzay(zzfgs);
        }

        public final void zza(int i, zzfjc zzfjc) {
            zzac(i, 2);
            zze(zzfjc);
        }

        public final void zzac(int i, int i2) {
            zzlt((i << 3) | i2);
        }

        public final void zzad(int i, int i2) {
            zzac(i, 0);
            zzls(i2);
        }

        public final void zzae(int i, int i2) {
            zzac(i, 0);
            zzlt(i2);
        }

        public final void zzaf(int i, int i2) {
            zzac(i, 5);
            zzlv(i2);
        }

        public final void zzay(zzfgs zzfgs) {
            zzlt(zzfgs.size());
            zzfgs.zza(this);
        }

        public final void zzb(byte b) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzb(int i, long j) {
            zzac(i, 1);
            zzcw(j);
        }

        public final void zzb(int i, zzfgs zzfgs) {
            zzac(1, 3);
            zzae(2, i);
            zza(3, zzfgs);
            zzac(1, 4);
        }

        public final void zzb(int i, zzfjc zzfjc) {
            zzac(1, 3);
            zzae(2, i);
            zza(3, zzfjc);
            zzac(1, 4);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x008a in {7, 8, 13, 15, 18} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void zzcu(long r10) {
            /*
            r9 = this;
            r0 = com.google.android.gms.internal.zzfhg.zzpop;
            r1 = 7;
            r2 = 0;
            r4 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
            if (r0 == 0) goto L_0x003c;
            r0 = r9.zzcyw();
            r6 = 10;
            if (r0 < r6) goto L_0x003c;
            r6 = r10 & r4;
            r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r0 != 0) goto L_0x0028;
            r0 = r9.buffer;
            r1 = r9.position;
            r2 = r1 + 1;
            r9.position = r2;
            r1 = (long) r1;
            r11 = (int) r10;
            r10 = (byte) r11;
            com.google.android.gms.internal.zzfkq.zza(r0, r1, r10);
            return;
            r0 = r9.buffer;
            r6 = r9.position;
            r7 = r6 + 1;
            r9.position = r7;
            r6 = (long) r6;
            r8 = (int) r10;
            r8 = r8 & 127;
            r8 = r8 | 128;
            r8 = (byte) r8;
            com.google.android.gms.internal.zzfkq.zza(r0, r6, r8);
            r10 = r10 >>> r1;
            goto L_0x0013;
            r6 = r10 & r4;
            r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
            if (r0 != 0) goto L_0x004f;
            r0 = r9.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r1 = r9.position;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r2 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r9.position = r2;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r11 = (int) r10;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r10 = (byte) r11;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r0[r1] = r10;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r0 = r9.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r6 = r9.position;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r7 = r6 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r9.position = r7;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r7 = (int) r10;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r7 = r7 & 127;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r7 = r7 | 128;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r7 = (byte) r7;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r0[r6] = r7;	 Catch:{ IndexOutOfBoundsException -> 0x0061 }
            r10 = r10 >>> r1;
            goto L_0x003c;
            r10 = move-exception;
            r11 = new com.google.android.gms.internal.zzfhg$zzc;
            r0 = 3;
            r0 = new java.lang.Object[r0];
            r1 = 0;
            r2 = r9.position;
            r2 = java.lang.Integer.valueOf(r2);
            r0[r1] = r2;
            r1 = r9.limit;
            r1 = java.lang.Integer.valueOf(r1);
            r2 = 1;
            r0[r2] = r1;
            r1 = 2;
            r2 = java.lang.Integer.valueOf(r2);
            r0[r1] = r2;
            r1 = "Pos: %d, limit: %d, len: %d";
            r0 = java.lang.String.format(r1, r0);
            r11.<init>(r0, r10);
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhg$zzb.zzcu(long):void");
        }

        public final void zzcw(long j) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final int zzcyw() {
            return this.limit - this.position;
        }

        public final void zze(zzfjc zzfjc) {
            zzlt(zzfjc.zzhs());
            zzfjc.zza(this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzl(int i, boolean z) {
            zzac(i, 0);
            zzb((byte) z);
        }

        public final void zzls(int i) {
            if (i >= 0) {
                zzlt(i);
            } else {
                zzcu((long) i);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x007f in {7, 8, 13, 15, 18} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void zzlt(int r5) {
            /*
            r4 = this;
            r0 = com.google.android.gms.internal.zzfhg.zzpop;
            if (r0 == 0) goto L_0x0034;
            r0 = r4.zzcyw();
            r1 = 10;
            if (r0 < r1) goto L_0x0034;
            r0 = r5 & -128;
            if (r0 != 0) goto L_0x0020;
            r0 = r4.buffer;
            r1 = r4.position;
            r2 = r1 + 1;
            r4.position = r2;
            r1 = (long) r1;
            r5 = (byte) r5;
            com.google.android.gms.internal.zzfkq.zza(r0, r1, r5);
            return;
            r0 = r4.buffer;
            r1 = r4.position;
            r2 = r1 + 1;
            r4.position = r2;
            r1 = (long) r1;
            r3 = r5 & 127;
            r3 = r3 | 128;
            r3 = (byte) r3;
            com.google.android.gms.internal.zzfkq.zza(r0, r1, r3);
            r5 = r5 >>> 7;
            goto L_0x000e;
            r0 = r5 & -128;
            if (r0 != 0) goto L_0x0044;
            r0 = r4.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r1 = r4.position;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r2 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r4.position = r2;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r5 = (byte) r5;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r0[r1] = r5;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r0 = r4.buffer;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r1 = r4.position;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r2 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r4.position = r2;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r2 = r5 & 127;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r2 = r2 | 128;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r2 = (byte) r2;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r0[r1] = r2;	 Catch:{ IndexOutOfBoundsException -> 0x0056 }
            r5 = r5 >>> 7;
            goto L_0x0034;
            r5 = move-exception;
            r0 = new com.google.android.gms.internal.zzfhg$zzc;
            r1 = 3;
            r1 = new java.lang.Object[r1];
            r2 = 0;
            r3 = r4.position;
            r3 = java.lang.Integer.valueOf(r3);
            r1[r2] = r3;
            r2 = r4.limit;
            r2 = java.lang.Integer.valueOf(r2);
            r3 = 1;
            r1[r3] = r2;
            r2 = 2;
            r3 = java.lang.Integer.valueOf(r3);
            r1[r2] = r3;
            r2 = "Pos: %d, limit: %d, len: %d";
            r1 = java.lang.String.format(r2, r1);
            r0.<init>(r1, r5);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhg$zzb.zzlt(int):void");
        }

        public final void zzlv(int i) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzp(int i, String str) {
            zzac(i, 2);
            zztw(str);
        }

        public final void zztw(String str) {
            int i = this.position;
            try {
                int zzly = zzfhg.zzly(str.length() * 3);
                int zzly2 = zzfhg.zzly(str.length());
                if (zzly2 == zzly) {
                    this.position = i + zzly2;
                    zzly = zzfks.zza(str, this.buffer, this.position, zzcyw());
                    this.position = i;
                    zzlt((zzly - i) - zzly2);
                    this.position = zzly;
                    return;
                }
                zzlt(zzfks.zzd(str));
                this.position = zzfks.zza(str, this.buffer, this.position, zzcyw());
            } catch (zzfkv e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }
    }

    private zzfhg() {
    }

    public static int zza(int i, zzfik zzfik) {
        i = zzlw(i);
        int zzhs = zzfik.zzhs();
        return i + (zzly(zzhs) + zzhs);
    }

    public static int zza(zzfik zzfik) {
        int zzhs = zzfik.zzhs();
        return zzly(zzhs) + zzhs;
    }

    public static int zzah(int i, int i2) {
        return zzlw(i) + zzly(i2);
    }

    public static int zzai(int i, int i2) {
        return zzlw(i) + 4;
    }

    public static int zzaj(int i, int i2) {
        return zzlw(i) + zzlx(i2);
    }

    public static int zzaz(zzfgs zzfgs) {
        int size = zzfgs.size();
        return zzly(size) + size;
    }

    public static int zzb(int i, zzfik zzfik) {
        return ((zzlw(1) << 1) + zzah(2, i)) + zza(3, zzfik);
    }

    public static zzfhg zzbc(byte[] bArr) {
        return zzi(bArr, 0, bArr.length);
    }

    public static int zzbd(byte[] bArr) {
        int length = bArr.length;
        return zzly(length) + length;
    }

    public static int zzc(int i, zzfgs zzfgs) {
        i = zzlw(i);
        int size = zzfgs.size();
        return i + (zzly(size) + size);
    }

    public static int zzc(int i, zzfjc zzfjc) {
        return zzlw(i) + zzf(zzfjc);
    }

    public static int zzcx(long j) {
        return zzcy(j);
    }

    public static int zzcy(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int zzcz(long j) {
        return zzcy(zzdc(j));
    }

    public static int zzd(int i, long j) {
        return zzlw(i) + zzcy(j);
    }

    public static int zzd(int i, zzfgs zzfgs) {
        return ((zzlw(1) << 1) + zzah(2, i)) + zzc(3, zzfgs);
    }

    public static int zzd(int i, zzfjc zzfjc) {
        return ((zzlw(1) << 1) + zzah(2, i)) + zzc(3, zzfjc);
    }

    public static int zzda(long j) {
        return 8;
    }

    public static int zzdb(long j) {
        return 8;
    }

    private static long zzdc(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzdm(boolean z) {
        return 1;
    }

    public static int zze(int i, long j) {
        return zzlw(i) + 8;
    }

    public static int zzf(zzfjc zzfjc) {
        int zzhs = zzfjc.zzhs();
        return zzly(zzhs) + zzhs;
    }

    public static int zzg(float f) {
        return 4;
    }

    @Deprecated
    public static int zzg(zzfjc zzfjc) {
        return zzfjc.zzhs();
    }

    public static zzfhg zzi(byte[] bArr, int i, int i2) {
        return new zzb(bArr, i, i2);
    }

    public static int zzlw(int i) {
        return zzly(i << 3);
    }

    public static int zzlx(int i) {
        return i >= 0 ? zzly(i) : 10;
    }

    public static int zzly(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzlz(int i) {
        return zzly(zzme(i));
    }

    public static int zzm(int i, boolean z) {
        return zzlw(i) + 1;
    }

    public static int zzma(int i) {
        return 4;
    }

    public static int zzmb(int i) {
        return 4;
    }

    public static int zzmc(int i) {
        return zzlx(i);
    }

    private static int zzme(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzmf(int i) {
        return zzly(i);
    }

    public static int zzo(double d) {
        return 8;
    }

    public static int zzq(int i, String str) {
        return zzlw(i) + zztx(str);
    }

    public static int zztx(String str) {
        int zzd;
        try {
            zzd = zzfks.zzd(str);
        } catch (zzfkv unused) {
            zzd = str.getBytes(zzfhz.UTF_8).length;
        }
        return zzly(zzd) + zzd;
    }

    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzfgs zzfgs);

    public abstract void zza(int i, zzfjc zzfjc);

    /* Access modifiers changed, original: final */
    public final void zza(String str, zzfkv zzfkv) {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfkv);
        byte[] bytes = str.getBytes(zzfhz.UTF_8);
        try {
            zzlt(bytes.length);
            zze(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    public abstract void zzac(int i, int i2);

    public abstract void zzad(int i, int i2);

    public abstract void zzae(int i, int i2);

    public abstract void zzaf(int i, int i2);

    public abstract void zzay(zzfgs zzfgs);

    public abstract void zzb(byte b);

    public abstract void zzb(int i, long j);

    public abstract void zzb(int i, zzfgs zzfgs);

    public abstract void zzb(int i, zzfjc zzfjc);

    public abstract void zzcu(long j);

    public abstract void zzcw(long j);

    public abstract int zzcyw();

    public final void zzcyx() {
        if (zzcyw() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zze(zzfjc zzfjc);

    public abstract void zzl(int i, boolean z);

    public abstract void zzls(int i);

    public abstract void zzlt(int i);

    public abstract void zzlv(int i);

    public abstract void zzp(int i, String str);

    public abstract void zztw(String str);
}

package com.google.android.gms.internal;

import java.util.Arrays;

final class zzfhd extends zzfhb {
    private final byte[] buffer;
    private final boolean immutable;
    private int limit;
    private int pos;
    private int zzpoh;
    private int zzpoi;
    private int zzpoj;
    private int zzpok;

    private zzfhd(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzpok = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzpoi = this.pos;
        this.immutable = z;
    }

    /* synthetic */ zzfhd(byte[] bArr, int i, int i2, boolean z, zzfhc zzfhc) {
        this(bArr, i, i2, z);
    }

    /* JADX WARNING: Missing block: B:36:0x00af, code skipped:
            if (((long) r2[r0]) >= 0) goto L_0x00b1;
     */
    private final long zzcyr() {
        /*
        r11 = this;
        r0 = r11.pos;
        r1 = r11.limit;
        if (r1 == r0) goto L_0x00b4;
    L_0x0006:
        r2 = r11.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0012;
    L_0x000e:
        r11.pos = r3;
        r0 = (long) r0;
        return r0;
    L_0x0012:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x00b4;
    L_0x0017:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0026;
    L_0x0020:
        r0 = r0 ^ -128;
    L_0x0022:
        r2 = (long) r0;
        r3 = r2;
        goto L_0x00b1;
    L_0x0026:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0036;
    L_0x002f:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r9 = r0;
        r1 = r3;
        r3 = r9;
        goto L_0x00b1;
    L_0x0036:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0044;
    L_0x003f:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0022;
    L_0x0044:
        r3 = (long) r0;
        r0 = r1 + 1;
        r1 = r2[r1];
        r5 = (long) r1;
        r1 = 28;
        r5 = r5 << r1;
        r3 = r3 ^ r5;
        r5 = 0;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x005b;
    L_0x0054:
        r1 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
    L_0x0057:
        r1 = r1 ^ r3;
        r3 = r1;
    L_0x0059:
        r1 = r0;
        goto L_0x00b1;
    L_0x005b:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 35;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x006f;
    L_0x0068:
        r5 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
    L_0x006d:
        r3 = r3 ^ r5;
        goto L_0x00b1;
    L_0x006f:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 42;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 < 0) goto L_0x0082;
    L_0x007c:
        r1 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        goto L_0x0057;
    L_0x0082:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = 49;
        r7 = r7 << r0;
        r3 = r3 ^ r7;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 >= 0) goto L_0x0095;
    L_0x008f:
        r5 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x006d;
    L_0x0095:
        r0 = r1 + 1;
        r1 = r2[r1];
        r7 = (long) r1;
        r1 = 56;
        r7 = r7 << r1;
        r3 = r3 ^ r7;
        r7 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r3 = r3 ^ r7;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x0059;
    L_0x00a8:
        r1 = r0 + 1;
        r0 = r2[r0];
        r7 = (long) r0;
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x00b4;
    L_0x00b1:
        r11.pos = r1;
        return r3;
    L_0x00b4:
        r0 = r11.zzcyn();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhd.zzcyr():long");
    }

    private final int zzcys() {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw zzfie.zzdae();
    }

    private final long zzcyt() {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw zzfie.zzdae();
    }

    private final void zzcyu() {
        this.limit += this.zzpoh;
        int i = this.limit;
        int i2 = i - this.zzpoi;
        int i3 = this.zzpok;
        if (i2 > i3) {
            this.zzpoh = i2 - i3;
            this.limit = i - this.zzpoh;
            return;
        }
        this.zzpoh = 0;
    }

    private final byte zzcyv() {
        int i = this.pos;
        if (i != this.limit) {
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzfie.zzdae();
    }

    public final <T extends zzfhu<T, ?>> T zza(T t, zzfhm zzfhm) {
        int zzcym = zzcym();
        if (this.zzpoc < this.zzpod) {
            zzcym = zzli(zzcym);
            this.zzpoc++;
            zzfhu zza = zzfhu.zza((zzfhu) t, (zzfhb) this, zzfhm);
            zzlf(0);
            this.zzpoc--;
            zzlj(zzcym);
            return zza;
        }
        throw zzfie.zzdak();
    }

    public final int zzcxx() {
        if (zzcyp()) {
            this.zzpoj = 0;
            return 0;
        }
        this.zzpoj = zzcym();
        int i = this.zzpoj;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw zzfie.zzdah();
    }

    public final long zzcxz() {
        return zzcyr();
    }

    public final long zzcyb() {
        return zzcyt();
    }

    public final int zzcyc() {
        return zzcys();
    }

    public final boolean zzcyd() {
        return zzcyr() != 0;
    }

    public final String zzcye() {
        int zzcym = zzcym();
        if (zzcym > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzcym <= i - i2) {
                if (zzfks.zzl(this.buffer, i2, i2 + zzcym)) {
                    i = this.pos;
                    this.pos = i + zzcym;
                    return new String(this.buffer, i, zzcym, zzfhz.UTF_8);
                }
                throw zzfie.zzdam();
            }
        }
        if (zzcym == 0) {
            return "";
        }
        if (zzcym <= 0) {
            throw zzfie.zzdaf();
        }
        throw zzfie.zzdae();
    }

    public final zzfgs zzcyf() {
        int i;
        int i2;
        int zzcym = zzcym();
        if (zzcym > 0) {
            i = this.limit;
            i2 = this.pos;
            if (zzcym <= i - i2) {
                zzfgs zzf = zzfgs.zzf(this.buffer, i2, zzcym);
                this.pos += zzcym;
                return zzf;
            }
        }
        if (zzcym == 0) {
            return zzfgs.zzpnw;
        }
        byte[] copyOfRange;
        if (zzcym > 0) {
            i = this.limit;
            i2 = this.pos;
            if (zzcym <= i - i2) {
                this.pos = zzcym + i2;
                copyOfRange = Arrays.copyOfRange(this.buffer, i2, this.pos);
                return zzfgs.zzba(copyOfRange);
            }
        }
        if (zzcym > 0) {
            throw zzfie.zzdae();
        } else if (zzcym == 0) {
            copyOfRange = zzfhz.EMPTY_BYTE_ARRAY;
            return zzfgs.zzba(copyOfRange);
        } else {
            throw zzfie.zzdaf();
        }
    }

    public final int zzcyg() {
        return zzcym();
    }

    public final int zzcyh() {
        return zzcym();
    }

    /* JADX WARNING: Missing block: B:29:0x0066, code skipped:
            if (r2[r3] >= (byte) 0) goto L_0x0068;
     */
    public final int zzcym() {
        /*
        r5 = this;
        r0 = r5.pos;
        r1 = r5.limit;
        if (r1 == r0) goto L_0x006b;
    L_0x0006:
        r2 = r5.buffer;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.pos = r3;
        return r0;
    L_0x0011:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x006b;
    L_0x0016:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x0022;
    L_0x001f:
        r0 = r0 ^ -128;
        goto L_0x0068;
    L_0x0022:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x002f;
    L_0x002b:
        r0 = r0 ^ 16256;
    L_0x002d:
        r1 = r3;
        goto L_0x0068;
    L_0x002f:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 >= 0) goto L_0x003d;
    L_0x0038:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0068;
    L_0x003d:
        r3 = r1 + 1;
        r1 = r2[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x002d;
    L_0x004a:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x0050:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0056:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0068;
    L_0x005c:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x002d;
    L_0x0062:
        r1 = r3 + 1;
        r2 = r2[r3];
        if (r2 < 0) goto L_0x006b;
    L_0x0068:
        r5.pos = r1;
        return r0;
    L_0x006b:
        r0 = r5.zzcyn();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhd.zzcym():int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x001d in {5, 6, 8} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final long zzcyn() {
        /*
        r6 = this;
        r0 = 0;
        r2 = 0;
        r3 = 64;
        if (r2 >= r3) goto L_0x0018;
        r3 = r6.zzcyv();
        r4 = r3 & 127;
        r4 = (long) r4;
        r4 = r4 << r2;
        r0 = r0 | r4;
        r3 = r3 & 128;
        if (r3 != 0) goto L_0x0015;
        return r0;
        r2 = r2 + 7;
        goto L_0x0003;
        r0 = com.google.android.gms.internal.zzfie.zzdag();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhd.zzcyn():long");
    }

    public final boolean zzcyp() {
        return this.pos == this.limit;
    }

    public final int zzcyq() {
        return this.pos - this.zzpoi;
    }

    public final void zzlf(int i) {
        if (this.zzpoj != i) {
            throw zzfie.zzdai();
        }
    }

    public final int zzli(int i) {
        if (i >= 0) {
            i += zzcyq();
            int i2 = this.zzpok;
            if (i <= i2) {
                this.zzpok = i;
                zzcyu();
                return i2;
            }
            throw zzfie.zzdae();
        }
        throw zzfie.zzdaf();
    }

    public final void zzlj(int i) {
        this.zzpok = i;
        zzcyu();
    }
}

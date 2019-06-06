package defpackage;

/* renamed from: akvt */
public final class akvt {
    private akuz a;
    private akvv b;
    private akvu c;
    private boolean d;
    private int e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private int p;
    private long q;
    private byte[] r;
    private int s;
    private long t;
    private long u;

    public akvt(akuz akuz) {
        this(akuz, (byte) 0);
    }

    private akvt(akuz akuz, byte b) {
        akvy akvy = new akvy();
        this.a = akuz;
        this.b = akvy;
    }

    private void a() {
        if (this.t > 0) {
            System.arraycopy(this.m, 0, this.n, 0, 16);
            this.u = this.t;
        }
        int i = this.s;
        if (i > 0) {
            a(this.n, this.r, 0, i);
            this.u += (long) this.s;
        }
        if (this.u > 0) {
            System.arraycopy(this.n, 0, this.l, 0, 16);
        }
    }

    private void a(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] c = c();
        akvw.a(c, bArr, 0, i);
        System.arraycopy(c, 0, bArr2, i2, i);
        bArr2 = this.l;
        if (this.d) {
            bArr = c;
        }
        a(bArr2, bArr, 0, i);
        this.q += (long) i;
    }

    private void a(byte[] bArr, byte[] bArr2) {
        akvw.b(bArr, bArr2);
        this.b.b(bArr);
    }

    private void a(byte[] bArr, byte[] bArr2, int i) {
        byte[] c = c();
        akvw.b(c, bArr);
        System.arraycopy(c, 0, bArr2, i, 16);
        bArr2 = this.l;
        if (this.d) {
            bArr = c;
        }
        a(bArr2, bArr);
        this.q += 16;
    }

    private void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        akvw.a(bArr, bArr2, i, i2);
        this.b.b(bArr);
    }

    private void b() {
        this.l = new byte[16];
        this.m = new byte[16];
        this.n = new byte[16];
        this.r = new byte[16];
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.o = akwc.b(this.i);
        this.p = 0;
        this.q = 0;
        byte[] bArr = this.j;
        if (bArr != null) {
            akwc.a(bArr);
        }
        bArr = this.g;
        if (bArr != null) {
            b(bArr, bArr.length);
        }
    }

    private void b(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = this.r;
            int i3 = this.s;
            bArr2[i3] = bArr[i2];
            i3++;
            this.s = i3;
            if (i3 == 16) {
                a(this.m, bArr2);
                this.s = 0;
                this.t += 16;
            }
        }
    }

    private void b(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            a(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void c(byte[] bArr, int i) {
        if (bArr.length >= i + 16) {
            if (this.q == 0) {
                a();
            }
            a(this.j, bArr, i);
            if (this.d) {
                this.p = 0;
                return;
            }
            bArr = this.j;
            System.arraycopy(bArr, 16, bArr, 0, this.e);
            this.p = this.e;
            return;
        }
        throw new akvh("Output buffer too short");
    }

    private byte[] c() {
        byte[] bArr = this.o;
        int i = (bArr[15] & 255) + 1;
        bArr[15] = (byte) i;
        int i2 = (i >>> 8) + (bArr[14] & 255);
        bArr[14] = (byte) i2;
        i2 = (i2 >>> 8) + (bArr[13] & 255);
        bArr[13] = (byte) i2;
        bArr[12] = (byte) ((i2 >>> 8) + (bArr[12] & 255));
        byte[] bArr2 = new byte[16];
        this.a.a(bArr, bArr2);
        return bArr2;
    }

    public final int a(int i) {
        i += this.p;
        if (this.d) {
            return i + this.e;
        }
        int i2 = this.e;
        return i < i2 ? 0 : i - i2;
    }

    public final int a(byte[] bArr, int i) {
        int i2;
        if (this.q == 0) {
            a();
        }
        int i3 = this.p;
        String str = "Output buffer too short";
        if (!this.d) {
            i2 = this.e;
            if (i3 >= i2) {
                i3 -= i2;
                if (bArr.length < i + i3) {
                    throw new akvh(str);
                }
            }
            throw new akvf("data too short");
        } else if (bArr.length < (i + i3) + this.e) {
            throw new akvh(str);
        }
        if (i3 > 0) {
            a(this.j, i3, bArr, i);
        }
        long j = this.t;
        i2 = this.s;
        this.t = j + ((long) i2);
        if (this.t > this.u) {
            if (i2 > 0) {
                a(this.m, this.r, 0, i2);
            }
            if (this.u > 0) {
                akvw.b(this.m, this.n);
            }
            long j2 = ((this.q << 3) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.c == null) {
                this.c = new akvx();
                this.c.a(this.h);
            }
            this.c.a(j2, bArr2);
            akvw.a(this.m, bArr2);
            akvw.b(this.l, this.m);
        }
        byte[] bArr3 = new byte[16];
        akwe.a(this.t << 3, bArr3, 0);
        akwe.a(this.q << 3, bArr3, 8);
        a(this.l, bArr3);
        bArr3 = new byte[16];
        this.a.a(this.i, bArr3);
        akvw.b(bArr3, this.l);
        int i4 = this.e;
        this.k = new byte[i4];
        System.arraycopy(bArr3, 0, this.k, 0, i4);
        if (this.d) {
            System.arraycopy(this.k, 0, bArr, i + this.p, this.e);
            i3 += this.e;
        } else {
            int i5 = this.e;
            byte[] bArr4 = new byte[i5];
            System.arraycopy(this.j, i3, bArr4, 0, i5);
            if (!akwc.a(this.k, bArr4)) {
                throw new akvf("mac check in GCM failed");
            }
        }
        b();
        return i3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0027 in {6, 7, 8, 10} preds:[]
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
    public final int a(byte[] r6, int r7, byte[] r8) {
        /*
        r5 = this;
        r0 = r6.length;
        if (r0 < r7) goto L_0x001f;
        r0 = 0;
        r1 = 0;
        if (r0 >= r7) goto L_0x001e;
        r2 = r5.j;
        r3 = r5.p;
        r4 = r6[r0];
        r2[r3] = r4;
        r3 = r3 + 1;
        r5.p = r3;
        r2 = r2.length;
        if (r3 != r2) goto L_0x001b;
        r5.c(r8, r1);
        r1 = r1 + 16;
        r0 = r0 + 1;
        goto L_0x0005;
        return r1;
        r6 = new akvc;
        r7 = "Input buffer too short";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvt.a(byte[], int, byte[]):int");
    }

    public final void a(boolean z, akva akva) {
        this.d = z;
        this.k = null;
        akvz akvz = (akvz) akva;
        this.f = akvz.b;
        this.g = null;
        int i = akvz.d;
        if (i < 32 || i > 128 || i % 8 != 0) {
            throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(i)));
        }
        this.e = i / 8;
        akwb akwb = akvz.c;
        this.j = new byte[(z ? 16 : this.e + 16)];
        byte[] bArr = this.f;
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (akwb != null) {
            this.a.a(akwb);
            this.h = new byte[16];
            akuz akuz = this.a;
            byte[] bArr2 = this.h;
            akuz.a(bArr2, bArr2);
            this.b.a(this.h);
            this.c = null;
        } else if (this.h == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        this.i = new byte[16];
        bArr = this.f;
        if (bArr.length == 12) {
            System.arraycopy(bArr, 0, this.i, 0, bArr.length);
            this.i[15] = (byte) 1;
        } else {
            b(this.i, bArr, bArr.length);
            bArr = new byte[16];
            akwe.a(((long) this.f.length) << 3, bArr, 8);
            a(this.i, bArr);
        }
        this.l = new byte[16];
        this.m = new byte[16];
        this.n = new byte[16];
        this.r = new byte[16];
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.o = akwc.b(this.i);
        this.p = 0;
        this.q = 0;
        bArr = this.g;
        if (bArr != null) {
            b(bArr, bArr.length);
        }
    }
}

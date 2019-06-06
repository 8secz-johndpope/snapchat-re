package defpackage;

import defpackage.bsl.a;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: bsm */
public final class bsm implements bnu {
    public final bsl a = new bsl();
    public boolean b;
    public b c;
    private final bwy d;
    private final int e;
    private final a f = new a();
    private final bzc g = new bzc(32);
    private a h = new a(0, this.e);
    private a i;
    private a j;
    private blg k;
    private boolean l;
    private blg m;
    private long n;
    private long o;

    /* renamed from: bsm$b */
    public interface b {
        void h();
    }

    /* renamed from: bsm$a */
    static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public bwx d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public final int a(long j) {
            return (int) (j - this.a);
        }

        public final a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public final void a(bwx bwx, a aVar) {
            this.d = bwx;
            this.e = aVar;
            this.c = true;
        }
    }

    public bsm(bwy bwy) {
        this.d = bwy;
        this.e = bwy.c();
        a aVar = this.h;
        this.i = aVar;
        this.j = aVar;
    }

    private void a(long j, ByteBuffer byteBuffer, int i) {
        c(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.i.b - j));
            byteBuffer.put(this.i.d.a, this.i.a(j), min);
            i -= min;
            j += (long) min;
            if (j == this.i.b) {
                this.i = this.i.e;
            }
        }
    }

    private void a(long j, byte[] bArr, int i) {
        c(j);
        long j2 = j;
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.i.b - j2));
            System.arraycopy(this.i.d.a, this.i.a(j2), bArr, i - i2, min);
            i2 -= min;
            j2 += (long) min;
            if (j2 == this.i.b) {
                this.i = this.i.e;
            }
        }
    }

    private void a(bmy bmy, a aVar) {
        int e;
        bmy bmy2 = bmy;
        a aVar2 = aVar;
        long j = aVar2.b;
        this.g.a(1);
        a(j, this.g.a, 1);
        j++;
        int i = 0;
        byte b = this.g.a[0];
        Object obj = (b & 128) != 0 ? 1 : null;
        int i2 = b & 127;
        if (bmy2.b.a == null) {
            bmy2.b.a = new byte[16];
        }
        a(j, bmy2.b.a, i2);
        j += (long) i2;
        if (obj != null) {
            this.g.a(2);
            a(j, this.g.a, 2);
            j += 2;
            e = this.g.e();
        } else {
            e = 1;
        }
        int[] iArr = bmy2.b.b;
        if (iArr == null || iArr.length < e) {
            iArr = new int[e];
        }
        int[] iArr2 = iArr;
        iArr = bmy2.b.c;
        if (iArr == null || iArr.length < e) {
            iArr = new int[e];
        }
        int[] iArr3 = iArr;
        if (obj != null) {
            i2 = e * 6;
            this.g.a(i2);
            a(j, this.g.a, i2);
            j += (long) i2;
            this.g.c(0);
            while (i < e) {
                iArr2[i] = this.g.e();
                iArr3[i] = this.g.o();
                i++;
            }
        } else {
            iArr2[0] = 0;
            iArr3[0] = aVar2.a - ((int) (j - aVar2.b));
        }
        bnu.a aVar3 = aVar2.c;
        bmy2.b.a(e, iArr2, iArr3, aVar3.b, bmy2.b.a, aVar3.a, aVar3.c, aVar3.d);
        int i3 = (int) (j - aVar2.b);
        aVar2.b += (long) i3;
        aVar2.a -= i3;
    }

    private void a(a aVar) {
        if (aVar.c) {
            bwx[] bwxArr = new bwx[(this.j.c + (((int) (this.j.a - aVar.a)) / this.e))];
            for (int i = 0; i < bwxArr.length; i++) {
                bwxArr[i] = aVar.d;
                aVar = aVar.a();
            }
            this.d.a(bwxArr);
        }
    }

    private int c(int i) {
        if (!this.j.c) {
            this.j.a(this.d.a(), new a(this.j.b, this.e));
        }
        return Math.min(i, (int) (this.j.b - this.o));
    }

    private void c(long j) {
        while (j >= this.i.b) {
            this.i = this.i.e;
        }
    }

    private void d(int i) {
        this.o += (long) i;
        if (this.o == this.j.b) {
            this.j = this.j.e;
        }
    }

    public final int a(long j, boolean z) {
        return this.a.a(j, z);
    }

    public final int a(blh blh, bmy bmy, boolean z, boolean z2, long j) {
        int a = this.a.a(blh, bmy, z, z2, this.k, this.f);
        if (a == -5) {
            this.k = blh.a;
            return -5;
        } else if (a == -4) {
            if (!bmy.c()) {
                if (bmy.d < j) {
                    bmy.a(Integer.MIN_VALUE);
                }
                if (bmy.e()) {
                    a(bmy, this.f);
                }
                bmy.c(this.f.a);
                a(this.f.b, bmy.c, this.f.a);
            }
            return -4;
        } else if (a == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    public final int a(bnl bnl, int i, boolean z) {
        int a = bnl.a(this.j.d.a, this.j.a(this.o), c(i));
        if (a != -1) {
            d(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a() {
        this.a.g();
        this.i = this.h;
    }

    public final void a(int i) {
        this.a.d = i;
    }

    public final void a(long j) {
        if (j != -1) {
            while (j >= this.h.b) {
                this.d.a(this.h.d);
                this.h = this.h.a();
            }
            if (this.i.a < this.h.a) {
                this.i = this.h;
            }
        }
    }

    public final void a(long j, int i, int i2, int i3, bnu.a aVar) {
        long j2 = j;
        if (this.l) {
            a(this.m);
        }
        if (this.b) {
            if ((i & 1) != 0 && this.a.a(j)) {
                this.b = false;
            } else {
                return;
            }
        }
        this.a.a(j2 + this.n, i, (this.o - ((long) i2)) - ((long) i3), i2, aVar);
    }

    public final void a(long j, boolean z, boolean z2) {
        a(this.a.a(j, z, z2));
    }

    public final void a(blg blg) {
        long j = this.n;
        blg a = blg == null ? null : (j == 0 || blg.j == Long.MAX_VALUE) ? blg : blg.a(blg.j + j);
        boolean a2 = this.a.a(a);
        this.m = blg;
        this.l = false;
        b bVar = this.c;
        if (bVar != null && a2) {
            bVar.h();
        }
    }

    public final void a(bzc bzc, int i) {
        while (i > 0) {
            int c = c(i);
            bzc.a(this.j.d.a, this.j.a(this.o), c);
            i -= c;
            d(c);
        }
    }

    public final void a(boolean z) {
        this.a.a(z);
        a(this.h);
        this.h = new a(0, this.e);
        a aVar = this.h;
        this.i = aVar;
        this.j = aVar;
        this.o = 0;
        this.d.b();
    }

    public final void b() {
        a(this.a.j());
    }

    public final void b(int i) {
        this.o = this.a.a(i);
        long j = this.o;
        a aVar;
        if (j == 0 || j == this.h.a) {
            a(this.h);
            this.h = new a(this.o, this.e);
            aVar = this.h;
            this.i = aVar;
            this.j = aVar;
            return;
        }
        aVar = this.h;
        while (this.o > aVar.b) {
            aVar = aVar.e;
        }
        a aVar2 = aVar.e;
        a(aVar2);
        aVar.e = new a(aVar.b, this.e);
        this.j = this.o == aVar.b ? aVar.e : aVar;
        if (this.i == aVar2) {
            this.i = aVar.e;
        }
    }

    public final void b(long j) {
        if (this.n != j) {
            this.n = j;
            this.l = true;
        }
    }
}

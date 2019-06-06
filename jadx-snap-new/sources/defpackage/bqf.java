package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import defpackage.bns.b;
import defpackage.bqg.a;
import defpackage.bqg.c;
import defpackage.bqg.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: bqf */
public final class bqf implements bnk {
    static final long a = ((long) bzo.f("AC-3"));
    static final long b = ((long) bzo.f("EAC3"));
    static final long c = ((long) bzo.f("HEVC"));
    final int d;
    final List<bzl> e;
    final c f;
    final SparseArray<bqg> g;
    final SparseBooleanArray h;
    bnm i;
    int j;
    boolean k;
    bqg l;
    private final bzc m;
    private final SparseIntArray n;
    private int o;

    /* renamed from: bqf$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bqf()};
        }
    }

    /* renamed from: bqf$a */
    class a implements bqb {
        private final bzb a = new bzb(new byte[4]);

        public final void a(bzc bzc) {
            if (bzc.d() == 0) {
                bzc.d(7);
                int b = bzc.b() / 4;
                for (int i = 0; i < b; i++) {
                    bzc.a(this.a, 4);
                    int c = this.a.c(16);
                    this.a.b(3);
                    if (c == 0) {
                        this.a.b(13);
                    } else {
                        c = this.a.c(13);
                        bqf.this.g.put(c, new bqc(new b(c)));
                        bqf bqf = bqf.this;
                        bqf.j++;
                    }
                }
                if (bqf.this.d != 2) {
                    bqf.this.g.remove(0);
                }
            }
        }

        public final void a(bzl bzl, bnm bnm, d dVar) {
        }
    }

    /* renamed from: bqf$b */
    class b implements bqb {
        private final bzb a = new bzb(new byte[5]);
        private final SparseArray<bqg> b = new SparseArray();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        public final void a(bzc bzc) {
            bzc bzc2 = bzc;
            if (bzc.d() == 2) {
                bzl bzl;
                bzl bzl2;
                int i;
                int i2;
                if (bqf.this.d == 1 || bqf.this.d == 2 || bqf.this.j == 1) {
                    bzl = (bzl) bqf.this.e.get(0);
                } else {
                    bzl = new bzl(((bzl) bqf.this.e.get(0)).a);
                    bqf.this.e.add(bzl);
                }
                bzc2.d(2);
                int e = bzc.e();
                int i3 = 5;
                bzc2.d(5);
                bzc2.a(this.a, 2);
                int i4 = 4;
                this.a.b(4);
                int i5 = 12;
                bzc2.d(this.a.c(12));
                if (bqf.this.d == 2 && bqf.this.l == null) {
                    defpackage.bqg.b bVar = new defpackage.bqg.b(21, null, null, new byte[0]);
                    bqf bqf = bqf.this;
                    bqf.l = bqf.f.a(21, bVar);
                    bqf.this.l.a(bzl, bqf.this.i, new d(e, 21, 8192));
                }
                this.b.clear();
                this.c.clear();
                int b = bzc.b();
                while (b > 0) {
                    bzc2.a(this.a, i3);
                    int c = this.a.c(8);
                    this.a.b(3);
                    int c2 = this.a.c(13);
                    this.a.b(i4);
                    int c3 = this.a.c(i5);
                    i5 = bzc2.b;
                    int i6 = i5 + c3;
                    String str = null;
                    int i7 = -1;
                    ArrayList arrayList = null;
                    while (bzc2.b < i6) {
                        int d = bzc.d();
                        i4 = bzc2.b + bzc.d();
                        if (d == i3) {
                            long h = bzc.h();
                            if (h != bqf.a) {
                                if (h != bqf.b) {
                                    if (h == bqf.c) {
                                        i7 = 36;
                                    }
                                }
                                bzl2 = bzl;
                                i = e;
                                i7 = 135;
                                bzc2.d(i4 - bzc2.b);
                                bzl = bzl2;
                                e = i;
                                i3 = 5;
                            }
                            bzl2 = bzl;
                            i = e;
                            i7 = 129;
                            bzc2.d(i4 - bzc2.b);
                            bzl = bzl2;
                            e = i;
                            i3 = 5;
                        } else {
                            if (d != 106) {
                                if (d != Imgproc.COLOR_YUV2BGRA_YVYU) {
                                    if (d == 123) {
                                        bzl2 = bzl;
                                        i = e;
                                        i7 = 138;
                                    } else if (d == 10) {
                                        str = bzc2.e(3).trim();
                                    } else {
                                        i3 = 3;
                                        if (d == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (bzc2.b < i4) {
                                                String trim = bzc2.e(i3).trim();
                                                i3 = bzc.d();
                                                bzl2 = bzl;
                                                byte[] bArr = new byte[4];
                                                i = e;
                                                bzc2.a(bArr, 0, 4);
                                                arrayList2.add(new a(trim, i3, bArr));
                                                bzl = bzl2;
                                                e = i;
                                                i3 = 3;
                                            }
                                            bzl2 = bzl;
                                            i = e;
                                            arrayList = arrayList2;
                                            i7 = 89;
                                        }
                                    }
                                    bzc2.d(i4 - bzc2.b);
                                    bzl = bzl2;
                                    e = i;
                                    i3 = 5;
                                }
                                bzl2 = bzl;
                                i = e;
                                i7 = 135;
                                bzc2.d(i4 - bzc2.b);
                                bzl = bzl2;
                                e = i;
                                i3 = 5;
                            }
                            bzl2 = bzl;
                            i = e;
                            i7 = 129;
                            bzc2.d(i4 - bzc2.b);
                            bzl = bzl2;
                            e = i;
                            i3 = 5;
                        }
                        bzl2 = bzl;
                        i = e;
                        bzc2.d(i4 - bzc2.b);
                        bzl = bzl2;
                        e = i;
                        i3 = 5;
                    }
                    bzl2 = bzl;
                    i = e;
                    bzc2.c(i6);
                    defpackage.bqg.b bVar2 = new defpackage.bqg.b(i7, str, arrayList, Arrays.copyOfRange(bzc2.a, i5, i6));
                    if (c == 6) {
                        c = bVar2.a;
                    }
                    b -= c3 + 5;
                    i2 = bqf.this.d == 2 ? c : c2;
                    if (!bqf.this.h.get(i2)) {
                        Object obj;
                        if (bqf.this.d == 2) {
                            if (c == 21) {
                                obj = bqf.this.l;
                                if (bqf.this.d == 2 || c2 < this.c.get(i2, 8192)) {
                                    this.c.put(i2, c2);
                                    this.b.put(i2, obj);
                                }
                            }
                        }
                        obj = bqf.this.f.a(c, bVar2);
                        if (bqf.this.d == 2) {
                        }
                        this.c.put(i2, c2);
                        this.b.put(i2, obj);
                    }
                    bzl = bzl2;
                    e = i;
                    i3 = 5;
                    i4 = 4;
                    i5 = 12;
                }
                bzl2 = bzl;
                i = e;
                int size = this.c.size();
                int i8 = 0;
                while (i8 < size) {
                    bzl bzl3;
                    i2 = this.c.keyAt(i8);
                    bqf.this.h.put(i2, true);
                    bqg bqg = (bqg) this.b.valueAt(i8);
                    if (bqg != null) {
                        if (bqg != bqf.this.l) {
                            bnm bnm = bqf.this.i;
                            i3 = i;
                            d dVar = new d(i3, i2, 8192);
                            bzl3 = bzl2;
                            bqg.a(bzl3, bnm, dVar);
                        } else {
                            bzl3 = bzl2;
                            i3 = i;
                        }
                        bqf.this.g.put(this.c.valueAt(i8), bqg);
                    } else {
                        bzl3 = bzl2;
                        i3 = i;
                    }
                    i8++;
                    bzl2 = bzl3;
                    i = i3;
                }
                bqf bqf2;
                if (bqf.this.d != 2) {
                    bqf.this.g.remove(this.d);
                    bqf2 = bqf.this;
                    bqf2.j = bqf2.d == 1 ? 0 : bqf.this.j - 1;
                    if (bqf.this.j == 0) {
                        bqf.this.i.a();
                        bqf.this.k = true;
                    }
                } else if (!bqf.this.k) {
                    bqf.this.i.a();
                    bqf2 = bqf.this;
                    bqf2.j = 0;
                    bqf2.k = true;
                }
            }
        }

        public final void a(bzl bzl, bnm bnm, d dVar) {
        }
    }

    static {
        1 1 = new 1();
    }

    public bqf() {
        this((byte) 0);
    }

    private bqf(byte b) {
        this(1);
    }

    public bqf(int i) {
        this(i, new bzl(0), new bpo(0));
    }

    public bqf(int i, bzl bzl, c cVar) {
        this.f = (c) byo.a((Object) cVar);
        this.d = i;
        if (i == 1 || i == 2) {
            this.e = Collections.singletonList(bzl);
        } else {
            this.e = new ArrayList();
            this.e.add(bzl);
        }
        this.m = new bzc(new byte[9400], 0);
        this.h = new SparseBooleanArray();
        this.g = new SparseArray();
        this.n = new SparseIntArray();
        a();
    }

    private void a() {
        this.h.clear();
        this.g.clear();
        SparseArray a = this.f.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.g.put(a.keyAt(i), a.valueAt(i));
        }
        this.g.put(0, new bqc(new a()));
        this.l = null;
    }

    public final int a(bnl bnl, bnr bnr) {
        int b;
        int a;
        byte[] bArr = this.m.a;
        if (9400 - this.m.b < 188) {
            b = this.m.b();
            if (b > 0) {
                System.arraycopy(bArr, this.m.b, bArr, 0, b);
            }
            this.m.a(bArr, b);
        }
        while (this.m.b() < 188) {
            b = this.m.c;
            a = bnl.a(bArr, b, 9400 - b);
            if (a == -1) {
                return -1;
            }
            this.m.b(b + a);
        }
        int i = this.m.c;
        b = this.m.b;
        int i2 = b;
        while (i2 < i && bArr[i2] != (byte) 71) {
            i2++;
        }
        this.m.c(i2);
        int i3 = i2 + 188;
        if (i3 > i) {
            this.o += i2 - b;
            if (this.d != 2 || this.o <= 376) {
                return 0;
            }
            throw new bln("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.o = 0;
        b = this.m.j();
        if ((8388608 & b) == 0) {
            boolean z = (4194304 & b) != 0;
            int i4 = (2096896 & b) >> 8;
            Object obj = (b & 32) != 0 ? 1 : null;
            bqg bqg = ((b & 16) != 0 ? 1 : null) != null ? (bqg) this.g.get(i4) : null;
            if (bqg != null) {
                if (this.d != 2) {
                    b &= 15;
                    a = this.n.get(i4, b - 1);
                    this.n.put(i4, b);
                    if (a != b) {
                        if (b != ((a + 1) & 15)) {
                            bqg.a();
                        }
                    }
                }
                if (obj != null) {
                    this.m.d(this.m.d());
                }
                this.m.b(i3);
                bqg.a(this.m, z);
                this.m.b(i);
            }
        }
        this.m.c(i3);
        return 0;
    }

    public final void a(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((bzl) this.e.get(i)).c = -9223372036854775807L;
        }
        this.m.a();
        this.n.clear();
        a();
        this.o = 0;
    }

    public final void a(bnm bnm) {
        this.i = bnm;
        bnm.a(new b(-9223372036854775807L));
    }

    public final boolean a(bnl bnl) {
        byte[] bArr = this.m.a;
        bnl.c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] == (byte) 71) {
                    i2++;
                } else {
                    i++;
                }
            }
            bnl.b(i);
            return true;
        }
        return false;
    }
}

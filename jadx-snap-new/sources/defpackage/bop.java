package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.bol.a;
import defpackage.bol.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.opencv.imgproc.Imgproc;

/* renamed from: bop */
public final class bop implements bnk {
    private static final int a = bzo.f("seig");
    private static final byte[] b = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    private static final blg c = blg.a("application/x-emsg", Long.MAX_VALUE);
    private long A;
    private b B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private bnm G;
    private bnu[] H;
    private bnu[] I;
    private boolean J;
    private final int d;
    private final bou e;
    private final List<blg> f;
    private final bnb g;
    private final SparseArray<b> h;
    private final bzc i;
    private final bzc j;
    private final bzc k;
    private final bzl l;
    private final bzc m;
    private final byte[] n;
    private final ArrayDeque<a> o;
    private final ArrayDeque<a> p;
    private final bnu q;
    private int r;
    private int s;
    private long t;
    private int u;
    private bzc v;
    private long w;
    private int x;
    private long y;
    private long z;

    /* renamed from: bop$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bop()};
        }
    }

    /* renamed from: bop$a */
    static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* renamed from: bop$b */
    static final class b {
        public final bnu a;
        public final bow b = new bow();
        public bou c;
        public bon d;
        public int e;
        public int f;
        public int g;
        public int h;
        final bzc i = new bzc(1);
        final bzc j = new bzc();

        public b(bnu bnu) {
            this.a = bnu;
        }

        public final void a() {
            this.b.a();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public final void a(long j) {
            j = bkw.a(j);
            int i = this.e;
            while (i < this.b.f && this.b.b(i) < j) {
                if (this.b.l[i]) {
                    this.h = i;
                }
                i++;
            }
        }

        public final void a(bnb bnb) {
            bov a = this.c.a(this.b.a.a);
            this.a.a(this.c.f.a(bnb.a(a != null ? a.a : null)));
        }

        public final void a(bou bou, bon bon) {
            this.c = (bou) byo.a((Object) bou);
            this.d = (bon) byo.a((Object) bon);
            this.a.a(bou.f);
            a();
        }

        public final boolean b() {
            this.e++;
            this.f++;
            int i = this.f;
            int[] iArr = this.b.h;
            int i2 = this.g;
            if (i != iArr[i2]) {
                return true;
            }
            this.g = i2 + 1;
            this.f = 0;
            return false;
        }

        /* Access modifiers changed, original: final */
        public final bov c() {
            return this.b.o != null ? this.b.o : this.c.a(this.b.a.a);
        }
    }

    static {
        1 1 = new 1();
    }

    public bop() {
        this((byte) 0);
    }

    public bop(byte b) {
        this(0);
    }

    private bop(int i) {
        this(0, (byte) 0);
    }

    private bop(int i, byte b) {
        this(i, null, null, Collections.emptyList());
    }

    public bop(int i, bzl bzl, bnb bnb, List<blg> list) {
        this(i, bzl, null, bnb, list, null);
    }

    public bop(int i, bzl bzl, bou bou, bnb bnb, List<blg> list, bnu bnu) {
        this.d = i;
        this.l = bzl;
        this.e = null;
        this.g = bnb;
        this.f = Collections.unmodifiableList(list);
        this.q = bnu;
        this.m = new bzc(16);
        this.i = new bzc(bza.a);
        this.j = new bzc(5);
        this.k = new bzc();
        this.n = new byte[16];
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.h = new SparseArray();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        a();
    }

    private static int a(b bVar, int i, long j, int i2, bzc bzc, int i3) {
        boolean[] zArr;
        long[] jArr;
        long j2;
        b bVar2 = bVar;
        bzc.c(8);
        int j3 = bzc.j() & 16777215;
        bou bou = bVar2.c;
        bow bow = bVar2.b;
        bon bon = bow.a;
        bow.h[i] = bzc.o();
        bow.g[i] = bow.c;
        if ((j3 & 1) != 0) {
            long[] jArr2 = bow.g;
            jArr2[i] = jArr2[i] + ((long) bzc.j());
        }
        Object obj = (j3 & 4) != 0 ? 1 : null;
        int i4 = bon.d;
        if (obj != null) {
            i4 = bzc.o();
        }
        Object obj2 = (j3 & 256) != 0 ? 1 : null;
        Object obj3 = (j3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? 1 : null;
        Object obj4 = (j3 & Imgproc.INTER_TAB_SIZE2) != 0 ? 1 : null;
        Object obj5 = (j3 & ItemAnimator.FLAG_MOVED) != 0 ? 1 : null;
        long j4 = 0;
        if (bou.h != null && bou.h.length == 1 && bou.h[0] == 0) {
            j4 = bzo.b(bou.i[0], 1000, bou.c);
        }
        int[] iArr = bow.i;
        int[] iArr2 = bow.j;
        long[] jArr3 = bow.k;
        boolean[] zArr2 = bow.l;
        int i5 = i4;
        Object obj6 = (bou.b != 2 || (i2 & 1) == 0) ? null : 1;
        int i6 = i3 + bow.h[i];
        long j5 = j4;
        boolean[] zArr3 = zArr2;
        long j6 = bou.c;
        if (i > 0) {
            zArr = zArr3;
            jArr = jArr3;
            j2 = bow.s;
        } else {
            zArr = zArr3;
            jArr = jArr3;
            j2 = j;
        }
        long j7 = j2;
        int i7 = i3;
        while (i7 < i6) {
            Object obj7;
            int o;
            Object obj8;
            int i8;
            Object obj9;
            Object obj10;
            Object obj11;
            int o2 = obj2 != null ? bzc.o() : bon.b;
            if (obj3 != null) {
                obj7 = obj2;
                o = bzc.o();
            } else {
                obj7 = obj2;
                o = bon.c;
            }
            if (i7 == 0 && obj != null) {
                obj8 = obj;
                i8 = i5;
            } else if (obj4 != null) {
                obj8 = obj;
                i8 = bzc.j();
            } else {
                obj8 = obj;
                i8 = bon.d;
            }
            if (obj5 != null) {
                obj9 = obj5;
                obj10 = obj3;
                obj11 = obj4;
                iArr2[i7] = (int) ((((long) bzc.j()) * 1000) / j6);
            } else {
                obj9 = obj5;
                obj10 = obj3;
                obj11 = obj4;
                iArr2[i7] = 0;
            }
            jArr[i7] = bzo.b(j7, 1000, j6) - j5;
            iArr[i7] = o;
            boolean z = ((i8 >> 16) & 1) == 0 && (obj6 == null || i7 == 0);
            zArr[i7] = z;
            i7++;
            j7 += (long) o2;
            obj2 = obj7;
            obj = obj8;
            obj5 = obj9;
            obj3 = obj10;
            obj4 = obj11;
            i6 = i6;
        }
        int i9 = i6;
        bow.s = j7;
        return i9;
    }

    private static Pair<Integer, bon> a(bzc bzc) {
        bzc.c(12);
        return Pair.create(Integer.valueOf(bzc.j()), new bon(bzc.o() - 1, bzc.o(), bzc.o(), bzc.j()));
    }

    private static bnb a(List<b> list) {
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            b bVar = (b) list.get(i);
            if (bVar.aO == bol.U) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                byte[] bArr = bVar.aP.a;
                UUID a = bos.a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    list2.add(new bnb.a(a, "video/mp4", bArr));
                }
            }
        }
        return list2 == null ? null : new bnb(list2);
    }

    private static bon a(SparseArray<bon> sparseArray, int i) {
        return (bon) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : byo.a(sparseArray.get(i)));
    }

    private static b a(bzc bzc, SparseArray<b> sparseArray) {
        bzc.c(8);
        int j = bzc.j() & 16777215;
        b b = bop.b(sparseArray, bzc.j());
        if (b == null) {
            return null;
        }
        if ((j & 1) != 0) {
            long q = bzc.q();
            b.b.c = q;
            b.b.d = q;
        }
        bon bon = b.d;
        b.b.a = new bon((j & 2) != 0 ? bzc.o() - 1 : bon.a, (j & 8) != 0 ? bzc.o() : bon.b, (j & 16) != 0 ? bzc.o() : bon.c, (j & 32) != 0 ? bzc.o() : bon.d);
        return b;
    }

    private void a() {
        this.r = 0;
        this.u = 0;
    }

    private void a(long j) {
        while (!this.o.isEmpty() && ((a) this.o.peek()).aP == j) {
            a((a) this.o.pop());
        }
        a();
    }

    private void a(a aVar) {
        if (aVar.aO == bol.B) {
            b(aVar);
        } else if (aVar.aO == bol.K) {
            c(aVar);
        } else {
            if (!this.o.isEmpty()) {
                ((a) this.o.peek()).a(aVar);
            }
        }
    }

    private static void a(a aVar, SparseArray<b> sparseArray, int i, byte[] bArr) {
        int size = aVar.aR.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar2 = (a) aVar.aR.get(i2);
            if (aVar2.aO == bol.L) {
                bop.b(aVar2, sparseArray, i, bArr);
            }
        }
    }

    private static void a(a aVar, b bVar, long j, int i) {
        List list = aVar.aQ;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar2 = (b) list.get(i5);
            if (bVar2.aO == bol.z) {
                bzc bzc = bVar2.aP;
                bzc.c(12);
                int o = bzc.o();
                if (o > 0) {
                    i4 += o;
                    i3++;
                }
            }
        }
        bVar.g = 0;
        bVar.f = 0;
        bVar.e = 0;
        bVar.b.a(i3, i4);
        i3 = 0;
        int i6 = 0;
        while (i2 < size) {
            b bVar3 = (b) list.get(i2);
            if (bVar3.aO == bol.z) {
                int i7 = i3 + 1;
                i6 = bop.a(bVar, i3, j, i, bVar3.aP, i6);
                i3 = i7;
            }
            i2++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0068 in {2, 11, 12, 13, 15, 16, 17, 19, 21} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void a(defpackage.bov r7, defpackage.bzc r8, defpackage.bow r9) {
        /*
        r7 = r7.c;
        r0 = 8;
        r8.c(r0);
        r1 = r8.j();
        r2 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r1 = r1 & r2;
        r2 = 1;
        r1 = r1 & r2;
        if (r1 != r2) goto L_0x0016;
        r8.d(r0);
        r0 = r8.d();
        r1 = r8.o();
        r3 = r9.f;
        if (r1 != r3) goto L_0x004a;
        r3 = 0;
        if (r0 != 0) goto L_0x003a;
        r0 = r9.n;
        r4 = 0;
        r5 = 0;
        if (r4 >= r1) goto L_0x0046;
        r6 = r8.d();
        r5 = r5 + r6;
        if (r6 <= r7) goto L_0x0034;
        r6 = 1;
        goto L_0x0035;
        r6 = 0;
        r0[r4] = r6;
        r4 = r4 + 1;
        goto L_0x0029;
        if (r0 <= r7) goto L_0x003d;
        goto L_0x003e;
        r2 = 0;
        r0 = r0 * r1;
        r5 = r0 + 0;
        r7 = r9.n;
        java.util.Arrays.fill(r7, r3, r1, r2);
        r9.a(r5);
        return;
        r7 = new bln;
        r8 = new java.lang.StringBuilder;
        r0 = "Length mismatch: ";
        r8.<init>(r0);
        r8.append(r1);
        r0 = ", ";
        r8.append(r0);
        r9 = r9.f;
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bop.a(bov, bzc, bow):void");
    }

    private static void a(bzc bzc, int i, bow bow) {
        bzc.c(i + 8);
        i = bzc.j() & 16777215;
        if ((i & 1) == 0) {
            boolean z = (i & 2) != 0;
            int o = bzc.o();
            if (o == bow.f) {
                Arrays.fill(bow.n, 0, o, z);
                bow.a(bzc.b());
                bow.a(bzc);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Length mismatch: ");
            stringBuilder.append(o);
            stringBuilder.append(ppy.d);
            stringBuilder.append(bow.f);
            throw new bln(stringBuilder.toString());
        }
        throw new bln("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(bzc bzc, bow bow) {
        bzc.c(8);
        int j = bzc.j();
        if (((16777215 & j) & 1) == 1) {
            bzc.d(8);
        }
        int o = bzc.o();
        if (o == 1) {
            bow.d += bol.a(j) == 0 ? bzc.h() : bzc.q();
            return;
        }
        throw new bln("Unexpected saio entry count: ".concat(String.valueOf(o)));
    }

    private static void a(bzc bzc, bow bow, byte[] bArr) {
        bzc.c(8);
        bzc.a(bArr, 0, 16);
        if (Arrays.equals(bArr, b)) {
            bop.a(bzc, 16, bow);
        }
    }

    private static void a(bzc bzc, bzc bzc2, String str, bow bow) {
        bzc.c(8);
        int j = bzc.j();
        if (bzc.j() == a) {
            if (bol.a(j) == 1) {
                bzc.d(4);
            }
            if (bzc.j() == 1) {
                bzc2.c(8);
                int j2 = bzc2.j();
                if (bzc2.j() == a) {
                    j2 = bol.a(j2);
                    if (j2 == 1) {
                        if (bzc2.h() == 0) {
                            throw new bln("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (j2 >= 2) {
                        bzc2.d(4);
                    }
                    if (bzc2.h() == 1) {
                        bzc2.d(1);
                        j2 = bzc2.d();
                        int i = (j2 & 240) >> 4;
                        int i2 = j2 & 15;
                        if ((bzc2.d() == 1 ? 1 : null) != null) {
                            byte[] bArr;
                            int d = bzc2.d();
                            byte[] bArr2 = new byte[16];
                            bzc2.a(bArr2, 0, 16);
                            if (d == 0) {
                                j2 = bzc2.d();
                                byte[] bArr3 = new byte[j2];
                                bzc2.a(bArr3, 0, j2);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            bow.m = true;
                            bow.o = new bov(true, str, d, bArr2, i, i2, bArr);
                            return;
                        }
                        return;
                    }
                    throw new bln("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new bln("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static long b(bzc bzc) {
        bzc.c(8);
        return bol.a(bzc.j()) == 0 ? bzc.h() : bzc.q();
    }

    private static b b(SparseArray<b> sparseArray, int i) {
        return (b) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i));
    }

    private void b() {
        bnu bnu;
        int i = 0;
        if (this.H == null) {
            int i2;
            this.H = new bnu[2];
            bnu = this.q;
            if (bnu != null) {
                this.H[0] = bnu;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.d & 4) != 0) {
                int i3 = i2 + 1;
                this.H[i2] = this.G.a(this.h.size(), 4);
                i2 = i3;
            }
            this.H = (bnu[]) Arrays.copyOf(this.H, i2);
            for (bnu a : this.H) {
                a.a(c);
            }
        }
        if (this.I == null) {
            this.I = new bnu[this.f.size()];
            while (i < this.I.length) {
                bnu = this.G.a((this.h.size() + 1) + i, 3);
                bnu.a((blg) this.f.get(i));
                this.I[i] = bnu;
                i++;
            }
        }
    }

    private void b(a aVar) {
        a aVar2 = aVar;
        boolean z = true;
        int i = 0;
        byo.b(this.e == null, "Unexpected moov box.");
        bnb bnb = this.g;
        if (bnb == null) {
            bnb = bop.a(aVar2.aQ);
        }
        a d = aVar2.d(bol.M);
        SparseArray sparseArray = new SparseArray();
        int size = d.aQ.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) d.aQ.get(i2);
            if (bVar.aO == bol.y) {
                Pair a = bop.a(bVar.aP);
                sparseArray.put(((Integer) a.first).intValue(), a.second);
            } else if (bVar.aO == bol.N) {
                j = bop.b(bVar.aP);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.aR.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4;
            int i5;
            d = (a) aVar2.aR.get(i3);
            if (d.aO == bol.D) {
                i4 = i3;
                i5 = size2;
                bou a2 = bom.a(d, aVar2.c(bol.C), j, bnb, (this.d & 16) != 0, false);
                if (a2 != null) {
                    sparseArray2.put(a2.a, a2);
                }
            } else {
                i4 = i3;
                i5 = size2;
            }
            i3 = i4 + 1;
            size2 = i5;
        }
        int size3 = sparseArray2.size();
        bou bou;
        if (this.h.size() == 0) {
            while (i < size3) {
                bou = (bou) sparseArray2.valueAt(i);
                b bVar2 = new b(this.G.a(i, bou.b));
                bVar2.a(bou, bop.a(sparseArray, bou.a));
                this.h.put(bou.a, bVar2);
                this.z = Math.max(this.z, bou.e);
                i++;
            }
            b();
            this.G.a();
            return;
        }
        if (this.h.size() != size3) {
            z = false;
        }
        byo.b(z);
        while (i < size3) {
            bou = (bou) sparseArray2.valueAt(i);
            ((b) this.h.get(bou.a)).a(bou, bop.a(sparseArray, bou.a));
            i++;
        }
    }

    private static void b(a aVar, SparseArray<b> sparseArray, int i, byte[] bArr) {
        b a = bop.a(aVar.c(bol.x).aP, (SparseArray) sparseArray);
        if (a != null) {
            bow bow = a.b;
            long j = bow.s;
            a.a();
            if (aVar.c(bol.w) != null && (i & 2) == 0) {
                j = bop.c(aVar.c(bol.w).aP);
            }
            bop.a(aVar, a, j, i);
            bov a2 = a.c.a(bow.a.a);
            b c = aVar.c(bol.ac);
            if (c != null) {
                bop.a(a2, c.aP, bow);
            }
            c = aVar.c(bol.ad);
            if (c != null) {
                bop.a(c.aP, bow);
            }
            c = aVar.c(bol.ah);
            int i2 = 0;
            if (c != null) {
                bop.a(c.aP, 0, bow);
            }
            c = aVar.c(bol.ae);
            b c2 = aVar.c(bol.af);
            if (!(c == null || c2 == null)) {
                bop.a(c.aP, c2.aP, a2 != null ? a2.a : null, bow);
            }
            int size = aVar.aQ.size();
            while (i2 < size) {
                c = (b) aVar.aQ.get(i2);
                if (c.aO == bol.ag) {
                    bop.a(c.aP, bow, bArr);
                }
                i2++;
            }
        }
    }

    private static long c(bzc bzc) {
        bzc.c(8);
        return bol.a(bzc.j()) == 1 ? bzc.q() : bzc.h();
    }

    private void c(a aVar) {
        bop.a(aVar, this.h, this.d, this.n);
        bnb a = this.g != null ? null : bop.a(aVar.aQ);
        if (a != null) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                ((b) this.h.valueAt(i)).a(a);
            }
        }
        if (this.y != -9223372036854775807L) {
            int size2 = this.h.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((b) this.h.valueAt(i2)).a(this.y);
            }
            this.y = -9223372036854775807L;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:301:0x06a6 in {16, 17, 21, 23, 26, 27, 34, 37, 40, 41, 44, 47, 50, 51, 54, 55, 58, 59, 60, 63, 76, 80, 81, 82, 84, 85, 86, 89, 90, 91, 94, 99, 100, 101, 102, 108, 111, 114, 115, 118, 125, 126, 128, 131, 133, 138, 143, 144, 149, 151, 152, 159, 162, 167, 170, 171, 172, 173, 174, 175, 180, 181, 184, 185, 192, 195, 202, 207, 208, 209, 228, 229, 230, 234, 235, 276, 277, 278, 285, 287, 289, 292, 293, 296, 298, 300} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final int a(defpackage.bnl r26, defpackage.bnr r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r2 = r0.r;
        r3 = 2;
        r4 = 0;
        r5 = 8;
        r6 = 1;
        if (r2 == 0) goto L_0x04d6;
        if (r2 == r6) goto L_0x034f;
        r9 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r11 = 3;
        if (r2 == r3) goto L_0x02f3;
        r12 = 6;
        if (r2 != r11) goto L_0x0165;
        r2 = r0.B;
        if (r2 != 0) goto L_0x0086;
        r2 = r0.h;
        r13 = r2.size();
        r14 = r9;
        r9 = 0;
        r10 = r4;
        if (r9 >= r13) goto L_0x004c;
        r16 = r2.valueAt(r9);
        r8 = r16;
        r8 = (defpackage.bop.b) r8;
        r3 = r8.g;
        r7 = r8.b;
        r7 = r7.e;
        if (r3 == r7) goto L_0x0048;
        r3 = r8.b;
        r3 = r3.g;
        r7 = r8.g;
        r18 = r3[r7];
        r3 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1));
        if (r3 >= 0) goto L_0x0048;
        r10 = r8;
        r14 = r18;
        r9 = r9 + 1;
        r3 = 2;
        goto L_0x0027;
        if (r10 != 0) goto L_0x0069;
        r2 = r0.w;
        r4 = r26.c();
        r2 = r2 - r4;
        r3 = (int) r2;
        if (r3 < 0) goto L_0x0061;
        r1.b(r3);
        r25.a();
        r6 = 0;
        goto L_0x02ef;
        r1 = new bln;
        r2 = "Offset to end of mdat was negative.";
        r1.<init>(r2);
        throw r1;
        r2 = r10.b;
        r2 = r2.g;
        r3 = r10.g;
        r7 = r2[r3];
        r2 = r26.c();
        r7 = r7 - r2;
        r7 = (int) r7;
        if (r7 >= 0) goto L_0x0081;
        r2 = "FragmentedMp4Extractor";
        r3 = "Ignoring negative offset to sample data.";
        android.util.Log.w(r2, r3);
        r7 = 0;
        r1.b(r7);
        r0.B = r10;
        r2 = r0.B;
        r2 = r2.b;
        r2 = r2.i;
        r3 = r0.B;
        r3 = r3.e;
        r2 = r2[r3];
        r0.C = r2;
        r2 = r0.B;
        r2 = r2.e;
        r3 = r0.B;
        r3 = r3.h;
        if (r2 >= r3) goto L_0x00dd;
        r2 = r0.C;
        r1.b(r2);
        r2 = r0.B;
        r3 = r2.b;
        r3 = r3.m;
        if (r3 == 0) goto L_0x00cf;
        r3 = r2.b;
        r3 = r3.q;
        r5 = r2.c();
        r7 = r5.c;
        if (r7 == 0) goto L_0x00bc;
        r5 = r5.c;
        r3.d(r5);
        r5 = r2.b;
        r5 = r5.n;
        r2 = r2.e;
        r2 = r5[r2];
        if (r2 == 0) goto L_0x00cf;
        r2 = r3.e();
        r2 = r2 * 6;
        r3.d(r2);
        r2 = r0.B;
        r2 = r2.b();
        if (r2 != 0) goto L_0x00d9;
        r0.B = r4;
        r0.r = r11;
        goto L_0x02ef;
        r2 = r0.B;
        r2 = r2.c;
        r2 = r2.g;
        if (r2 != r6) goto L_0x00ed;
        r2 = r0.C;
        r2 = r2 - r5;
        r0.C = r2;
        r1.b(r5);
        r2 = r0.B;
        r3 = r2.b;
        r3 = r3.m;
        if (r3 != 0) goto L_0x00f7;
        r7 = 0;
        goto L_0x0156;
        r3 = r2.c();
        r5 = r3.c;
        if (r5 == 0) goto L_0x0106;
        r5 = r2.b;
        r5 = r5.q;
        r3 = r3.c;
        goto L_0x0111;
        r3 = r3.d;
        r5 = r2.j;
        r7 = r3.length;
        r5.a(r3, r7);
        r5 = r2.j;
        r3 = r3.length;
        r7 = r2.b;
        r7 = r7.n;
        r8 = r2.e;
        r7 = r7[r8];
        r8 = r2.i;
        r8 = r8.a;
        if (r7 == 0) goto L_0x0122;
        r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x0123;
        r9 = 0;
        r9 = r9 | r3;
        r9 = (byte) r9;
        r10 = 0;
        r8[r10] = r9;
        r8 = r2.i;
        r8.c(r10);
        r8 = r2.a;
        r9 = r2.i;
        r8.a(r9, r6);
        r8 = r2.a;
        r8.a(r5, r3);
        if (r7 != 0) goto L_0x013e;
        r7 = r3 + 1;
        goto L_0x0156;
        r5 = r2.b;
        r5 = r5.q;
        r7 = r5.e();
        r8 = -2;
        r5.d(r8);
        r7 = r7 * 6;
        r8 = 2;
        r7 = r7 + r8;
        r2 = r2.a;
        r2.a(r5, r7);
        r3 = r3 + 1;
        r7 = r7 + r3;
        r0.D = r7;
        r2 = r0.C;
        r3 = r0.D;
        r2 = r2 + r3;
        r0.C = r2;
        r2 = 4;
        r0.r = r2;
        r2 = 0;
        r0.E = r2;
        r2 = r0.B;
        r2 = r2.b;
        r3 = r0.B;
        r3 = r3.c;
        r5 = r0.B;
        r5 = r5.a;
        r7 = r0.B;
        r7 = r7.e;
        r8 = r2.b(r7);
        r13 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r13;
        r10 = r0.l;
        if (r10 == 0) goto L_0x0184;
        r8 = r10.c(r8);
        r10 = r3.j;
        if (r10 == 0) goto L_0x025e;
        r10 = r0.j;
        r10 = r10.a;
        r13 = 0;
        r10[r13] = r13;
        r10[r6] = r13;
        r14 = 2;
        r10[r14] = r13;
        r13 = r3.j;
        r13 = r13 + r6;
        r14 = r3.j;
        r15 = 4;
        r14 = 4 - r14;
        r15 = r0.D;
        r11 = r0.C;
        if (r15 >= r11) goto L_0x0270;
        r11 = r0.E;
        r15 = "video/hevc";
        if (r11 != 0) goto L_0x0206;
        r1.b(r10, r14, r13);
        r11 = r0.j;
        r4 = 0;
        r11.c(r4);
        r11 = r0.j;
        r11 = r11.o();
        r11 = r11 - r6;
        r0.E = r11;
        r11 = r0.i;
        r11.c(r4);
        r4 = r0.i;
        r11 = 4;
        r5.a(r4, r11);
        r4 = r0.j;
        r5.a(r4, r6);
        r4 = r0.I;
        r4 = r4.length;
        if (r4 <= 0) goto L_0x01f5;
        r4 = r3.f;
        r4 = r4.f;
        r18 = r10[r11];
        r11 = "video/avc";
        r11 = r11.equals(r4);
        if (r11 == 0) goto L_0x01e1;
        r11 = r18 & 31;
        if (r11 == r12) goto L_0x01ee;
        r4 = r15.equals(r4);
        if (r4 == 0) goto L_0x01f0;
        r4 = r18 & 126;
        r4 = r4 >> r6;
        r11 = 39;
        if (r4 != r11) goto L_0x01f0;
        r4 = 1;
        goto L_0x01f1;
        r4 = 0;
        if (r4 == 0) goto L_0x01f5;
        r4 = 1;
        goto L_0x01f6;
        r4 = 0;
        r0.F = r4;
        r4 = r0.D;
        r4 = r4 + 5;
        r0.D = r4;
        r4 = r0.C;
        r4 = r4 + r14;
        r0.C = r4;
        r4 = 0;
        r11 = 3;
        goto L_0x019c;
        r4 = r0.F;
        if (r4 == 0) goto L_0x0248;
        r4 = r0.k;
        r4.a(r11);
        r4 = r0.k;
        r4 = r4.a;
        r11 = r0.E;
        r12 = 0;
        r1.b(r4, r12, r11);
        r4 = r0.k;
        r11 = r0.E;
        r5.a(r4, r11);
        r4 = r0.E;
        r11 = r0.k;
        r11 = r11.a;
        r12 = r0.k;
        r12 = r12.c;
        r11 = defpackage.bza.a(r11, r12);
        r12 = r0.k;
        r6 = r3.f;
        r6 = r6.f;
        r6 = r15.equals(r6);
        r12.c(r6);
        r6 = r0.k;
        r6.b(r11);
        r6 = r0.k;
        r11 = r0.I;
        defpackage.bvo.a(r8, r6, r11);
        goto L_0x024e;
        r4 = 0;
        r6 = r5.a(r1, r11, r4);
        r4 = r6;
        r6 = r0.D;
        r6 = r6 + r4;
        r0.D = r6;
        r6 = r0.E;
        r6 = r6 - r4;
        r0.E = r6;
        r4 = 0;
        r6 = 1;
        r11 = 3;
        r12 = 6;
        goto L_0x019c;
        r4 = r0.D;
        r6 = r0.C;
        if (r4 >= r6) goto L_0x0270;
        r6 = r6 - r4;
        r4 = 0;
        r6 = r5.a(r1, r6, r4);
        r4 = r0.D;
        r4 = r4 + r6;
        r0.D = r4;
        goto L_0x025e;
        r4 = r2.l;
        r4 = r4[r7];
        r6 = r2.m;
        if (r6 == 0) goto L_0x0291;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 | r6;
        r6 = r2.o;
        if (r6 == 0) goto L_0x0282;
        r2 = r2.o;
        goto L_0x028a;
        r2 = r2.a;
        r2 = r2.a;
        r2 = r3.a(r2);
        r2 = r2.b;
        r24 = r2;
        r21 = r4;
        goto L_0x0295;
        r21 = r4;
        r24 = 0;
        r2 = r0.C;
        r23 = 0;
        r18 = r5;
        r19 = r8;
        r22 = r2;
        r18.a(r19, r21, r22, r23, r24);
        r2 = r0.p;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x02e0;
        r2 = r0.p;
        r2 = r2.removeFirst();
        r2 = (defpackage.bop.a) r2;
        r3 = r0.x;
        r4 = r2.b;
        r3 = r3 - r4;
        r0.x = r3;
        r3 = r2.a;
        r3 = r3 + r8;
        r5 = r0.l;
        if (r5 == 0) goto L_0x02c4;
        r3 = r5.c(r3);
        r5 = r0.H;
        r6 = r5.length;
        r7 = 0;
        if (r7 >= r6) goto L_0x02a2;
        r18 = r5[r7];
        r21 = 1;
        r10 = r2.b;
        r11 = r0.x;
        r24 = 0;
        r19 = r3;
        r22 = r10;
        r23 = r11;
        r18.a(r19, r21, r22, r23, r24);
        r7 = r7 + 1;
        goto L_0x02c8;
        r2 = r0.B;
        r2 = r2.b();
        if (r2 != 0) goto L_0x02eb;
        r2 = 0;
        r0.B = r2;
        r2 = 3;
        r0.r = r2;
        r6 = 1;
        if (r6 == 0) goto L_0x0004;
        r2 = 0;
        return r2;
        r2 = r0.h;
        r2 = r2.size();
        r3 = 0;
        r4 = 0;
        if (r3 >= r2) goto L_0x0320;
        r5 = r0.h;
        r5 = r5.valueAt(r3);
        r5 = (defpackage.bop.b) r5;
        r5 = r5.b;
        r6 = r5.r;
        if (r6 == 0) goto L_0x031d;
        r6 = r5.d;
        r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x031d;
        r4 = r5.d;
        r6 = r0.h;
        r6 = r6.valueAt(r3);
        r6 = (defpackage.bop.b) r6;
        r9 = r4;
        r4 = r6;
        r3 = r3 + 1;
        goto L_0x02fb;
        if (r4 != 0) goto L_0x0327;
        r2 = 3;
        r0.r = r2;
        goto L_0x0004;
        r2 = r26.c();
        r9 = r9 - r2;
        r2 = (int) r9;
        if (r2 < 0) goto L_0x0347;
        r1.b(r2);
        r2 = r4.b;
        r3 = r2.q;
        r3 = r3.a;
        r4 = r2.p;
        r5 = 0;
        r1.b(r3, r5, r4);
        r3 = r2.q;
        r3.c(r5);
        r2.r = r5;
        goto L_0x0004;
        r1 = new bln;
        r2 = "Offset to encryption data was negative.";
        r1.<init>(r2);
        throw r1;
        r2 = r0.t;
        r3 = (int) r2;
        r2 = r0.u;
        r3 = r3 - r2;
        r2 = r0.v;
        if (r2 == 0) goto L_0x04c6;
        r2 = r2.a;
        r1.b(r2, r5, r3);
        r2 = new bol$b;
        r3 = r0.s;
        r4 = r0.v;
        r2.<init>(r3, r4);
        r3 = r26.c();
        r6 = r0.o;
        r6 = r6.isEmpty();
        if (r6 != 0) goto L_0x0382;
        r3 = r0.o;
        r3 = r3.peek();
        r3 = (defpackage.bol.a) r3;
        r3.a(r2);
        r4 = r0;
        r0 = r1;
        goto L_0x04cb;
        r6 = r2.aO;
        r7 = defpackage.bol.A;
        if (r6 != r7) goto L_0x044d;
        r2 = r2.aP;
        r2.c(r5);
        r5 = r2.j();
        r5 = defpackage.bol.a(r5);
        r6 = 4;
        r2.d(r6);
        r13 = r2.h();
        if (r5 != 0) goto L_0x03a8;
        r5 = r2.h();
        r7 = r2.h();
        goto L_0x03b0;
        r5 = r2.q();
        r7 = r2.q();
        r3 = r3 + r7;
        r9 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r5;
        r11 = r13;
        r18 = defpackage.bzo.b(r7, r9, r11);
        r7 = 2;
        r2.d(r7);
        r15 = r2.e();
        r11 = new int[r15];
        r12 = new long[r15];
        r9 = new long[r15];
        r10 = new long[r15];
        r16 = r5;
        r6 = r18;
        r4 = r3;
        r3 = 0;
        if (r3 >= r15) goto L_0x0423;
        r8 = r2.j();
        r20 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r20 = r8 & r20;
        if (r20 != 0) goto L_0x041b;
        r20 = r2.h();
        r22 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = r8 & r22;
        r11[r3] = r8;
        r12[r3] = r4;
        r10[r3] = r6;
        r16 = r16 + r20;
        r20 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r16;
        r6 = r9;
        r22 = r15;
        r15 = r10;
        r9 = r20;
        r1 = r11;
        r0 = r12;
        r11 = r13;
        r7 = defpackage.bzo.b(r7, r9, r11);
        r9 = r15[r3];
        r9 = r7 - r9;
        r6[r3] = r9;
        r9 = 4;
        r2.d(r9);
        r10 = r1[r3];
        r10 = (long) r10;
        r4 = r4 + r10;
        r3 = r3 + 1;
        r12 = r0;
        r11 = r1;
        r9 = r6;
        r6 = r7;
        r10 = r15;
        r15 = r22;
        r0 = r25;
        r1 = r26;
        goto L_0x03d0;
        r0 = new bln;
        r1 = "Unhandled indirect reference";
        r0.<init>(r1);
        throw r0;
        r6 = r9;
        r15 = r10;
        r1 = r11;
        r0 = r12;
        r2 = java.lang.Long.valueOf(r18);
        r3 = new bng;
        r3.<init>(r1, r0, r6, r15);
        r0 = android.util.Pair.create(r2, r3);
        r1 = r0.first;
        r1 = (java.lang.Long) r1;
        r1 = r1.longValue();
        r4 = r25;
        r4.A = r1;
        r1 = r4.G;
        r0 = r0.second;
        r0 = (defpackage.bns) r0;
        r1.a(r0);
        r0 = 1;
        r4.J = r0;
        goto L_0x04c3;
        r4 = r0;
        r0 = r2.aO;
        r1 = defpackage.bol.aF;
        if (r0 != r1) goto L_0x04c3;
        r0 = r2.aP;
        r1 = r4.H;
        if (r1 == 0) goto L_0x04c3;
        r1 = r1.length;
        if (r1 != 0) goto L_0x045e;
        goto L_0x04c3;
        r1 = 12;
        r0.c(r1);
        r2 = r0.b();
        r0.r();
        r0.r();
        r9 = r0.h();
        r5 = r0.h();
        r7 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r5 = defpackage.bzo.b(r5, r7, r9);
        r3 = r4.H;
        r7 = r3.length;
        r8 = 0;
        if (r8 >= r7) goto L_0x048d;
        r9 = r3[r8];
        r0.c(r1);
        r9.a(r0, r2);
        r8 = r8 + 1;
        goto L_0x0480;
        r0 = r4.A;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x04b4;
        r0 = r0 + r5;
        r3 = r4.l;
        if (r3 == 0) goto L_0x04a1;
        r0 = r3.c(r0);
        r3 = r4.H;
        r12 = r3.length;
        r13 = 0;
        if (r13 >= r12) goto L_0x04c3;
        r5 = r3[r13];
        r8 = 1;
        r10 = 0;
        r11 = 0;
        r6 = r0;
        r9 = r2;
        r5.a(r6, r8, r9, r10, r11);
        r13 = r13 + 1;
        goto L_0x04a5;
        r0 = r4.p;
        r1 = new bop$a;
        r1.<init>(r5, r2);
        r0.addLast(r1);
        r0 = r4.x;
        r0 = r0 + r2;
        r4.x = r0;
        r0 = r26;
        goto L_0x04cb;
        r4 = r0;
        r0 = r1;
        r0.b(r3);
        r1 = r26.c();
        r4.a(r1);
        r1 = r0;
        r0 = r4;
        goto L_0x0004;
        r4 = r0;
        r0 = r1;
        r1 = r4.u;
        if (r1 != 0) goto L_0x0502;
        r1 = r4.m;
        r1 = r1.a;
        r2 = 1;
        r3 = 0;
        r1 = r0.a(r1, r3, r5, r2);
        if (r1 != 0) goto L_0x04eb;
        r1 = 0;
        goto L_0x0692;
        r4.u = r5;
        r1 = r4.m;
        r1.c(r3);
        r1 = r4.m;
        r1 = r1.h();
        r4.t = r1;
        r1 = r4.m;
        r1 = r1.j();
        r4.s = r1;
        r1 = r4.t;
        r6 = 1;
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x051f;
        r1 = r4.m;
        r1 = r1.a;
        r0.b(r1, r5, r5);
        r1 = r4.u;
        r1 = r1 + r5;
        r4.u = r1;
        r1 = r4.m;
        r1 = r1.q();
        r4.t = r1;
        goto L_0x054f;
        r6 = 0;
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x054f;
        r1 = r26.d();
        r6 = -1;
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0541;
        r3 = r4.o;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x0541;
        r1 = r4.o;
        r1 = r1.peek();
        r1 = (defpackage.bol.a) r1;
        r1 = r1.aP;
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r3 == 0) goto L_0x054f;
        r6 = r26.c();
        r1 = r1 - r6;
        r3 = r4.u;
        r6 = (long) r3;
        r1 = r1 + r6;
        goto L_0x051c;
        r1 = r4.t;
        r3 = r4.u;
        r6 = (long) r3;
        r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r3 < 0) goto L_0x069e;
        r1 = r26.c();
        r3 = r4.u;
        r6 = (long) r3;
        r1 = r1 - r6;
        r3 = r4.s;
        r6 = defpackage.bol.K;
        if (r3 != r6) goto L_0x0582;
        r3 = r4.h;
        r3 = r3.size();
        r6 = 0;
        if (r6 >= r3) goto L_0x0582;
        r7 = r4.h;
        r7 = r7.valueAt(r6);
        r7 = (defpackage.bop.b) r7;
        r7 = r7.b;
        r7.b = r1;
        r7.d = r1;
        r7.c = r1;
        r6 = r6 + 1;
        goto L_0x056d;
        r3 = r4.s;
        r6 = defpackage.bol.h;
        if (r3 != r6) goto L_0x05a9;
        r3 = 0;
        r4.B = r3;
        r5 = r4.t;
        r5 = r5 + r1;
        r4.w = r5;
        r3 = r4.J;
        if (r3 != 0) goto L_0x05a3;
        r3 = r4.G;
        r5 = new bns$b;
        r6 = r4.z;
        r5.<init>(r6, r1);
        r3.a(r5);
        r1 = 1;
        r4.J = r1;
        r1 = 2;
        r4.r = r1;
        r1 = 1;
        goto L_0x0692;
        r1 = r4.s;
        r2 = defpackage.bol.B;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.D;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.E;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.F;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.G;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.K;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.L;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.M;
        if (r1 == r2) goto L_0x05d2;
        r2 = defpackage.bol.P;
        if (r1 != r2) goto L_0x05d0;
        goto L_0x05d2;
        r1 = 0;
        goto L_0x05d3;
        r1 = 1;
        if (r1 == 0) goto L_0x05fc;
        r1 = r26.c();
        r5 = r4.t;
        r1 = r1 + r5;
        r5 = 8;
        r1 = r1 - r5;
        r3 = r4.o;
        r5 = new bol$a;
        r6 = r4.s;
        r5.<init>(r6, r1);
        r3.push(r5);
        r5 = r4.t;
        r3 = r4.u;
        r7 = (long) r3;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x05f8;
        r4.a(r1);
        goto L_0x05a6;
        r25.a();
        goto L_0x05a6;
        r1 = r4.s;
        r2 = defpackage.bol.S;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.R;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.C;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.A;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.T;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.w;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.x;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.O;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.y;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.z;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.U;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.ac;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.ad;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.ah;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.ag;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.ae;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.af;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.Q;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.N;
        if (r1 == r2) goto L_0x0651;
        r2 = defpackage.bol.aF;
        if (r1 != r2) goto L_0x064f;
        goto L_0x0651;
        r1 = 0;
        goto L_0x0652;
        r1 = 1;
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == 0) goto L_0x0686;
        r1 = r4.u;
        if (r1 != r5) goto L_0x067e;
        r6 = r4.t;
        r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x0676;
        r1 = new bzc;
        r2 = (int) r6;
        r1.<init>(r2);
        r4.v = r1;
        r1 = r4.m;
        r1 = r1.a;
        r2 = r4.v;
        r2 = r2.a;
        r3 = 0;
        java.lang.System.arraycopy(r1, r3, r2, r3, r5);
        goto L_0x068f;
        r0 = new bln;
        r1 = "Leaf atom with length > 2147483647 (unsupported).";
        r0.<init>(r1);
        throw r0;
        r0 = new bln;
        r1 = "Leaf atom defines extended atom size (unsupported).";
        r0.<init>(r1);
        throw r0;
        r5 = r4.t;
        r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x0696;
        r1 = 0;
        r4.v = r1;
        r1 = 1;
        r4.r = r1;
        if (r1 != 0) goto L_0x04d2;
        r0 = -1;
        return r0;
        r0 = new bln;
        r1 = "Skipping atom with length > 2147483647 (unsupported).";
        r0.<init>(r1);
        throw r0;
        r0 = new bln;
        r1 = "Atom size less than header length (unsupported).";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bop.a(bnl, bnr):int");
    }

    public final void a(long j, long j2) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            ((b) this.h.valueAt(i)).a();
        }
        this.p.clear();
        this.x = 0;
        this.y = j2;
        this.o.clear();
        a();
    }

    public final void a(bnm bnm) {
        this.G = bnm;
        bou bou = this.e;
        if (bou != null) {
            b bVar = new b(bnm.a(0, bou.b));
            bVar.a(this.e, new bon(0, 0, 0, 0));
            this.h.put(0, bVar);
            b();
            this.G.a();
        }
    }

    public final boolean a(bnl bnl) {
        return bot.a(bnl, true);
    }
}

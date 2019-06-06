package defpackage;

import android.util.Pair;

/* renamed from: bws */
public abstract class bws extends bwv {
    private a b;

    /* renamed from: bws$a */
    public static final class a {
        final int a;
        final int[] b;
        final bss[] c;
        @Deprecated
        private int d = this.a;
        private final int[] e;
        private final int[][][] f;
        private final bss g;

        a(int[] iArr, bss[] bssArr, int[] iArr2, int[][][] iArr3, bss bss) {
            this.b = iArr;
            this.c = bssArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = bss;
            this.a = iArr.length;
        }
    }

    public abstract Pair<blu[], bwt[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public final bww a(blt[] bltArr, bss bss) {
        int i;
        int[] iArr = new int[(bltArr.length + 1)];
        bsr[][] bsrArr = new bsr[(bltArr.length + 1)][];
        int[][][] iArr2 = new int[(bltArr.length + 1)][][];
        for (i = 0; i < bsrArr.length; i++) {
            bsrArr[i] = new bsr[bss.b];
            iArr2[i] = new int[bss.b][];
        }
        int[] iArr3 = new int[bltArr.length];
        for (i = 0; i < iArr3.length; i++) {
            iArr3[i] = bltArr[i].m();
        }
        for (i = 0; i < bss.b; i++) {
            int[] iArr4;
            bsr bsr = bss.c[i];
            int length = bltArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < bltArr.length) {
                blt blt = bltArr[i2];
                int i4 = length;
                length = i3;
                for (i3 = 0; i3 < bsr.a; i3++) {
                    int a = blt.a(bsr.b[i3]) & 7;
                    if (a > length) {
                        if (a == 4) {
                            break;
                        }
                        i4 = i2;
                        length = a;
                    }
                }
                i2++;
                i3 = length;
                length = i4;
            }
            i2 = length;
            if (i2 == bltArr.length) {
                iArr4 = new int[bsr.a];
            } else {
                blt blt2 = bltArr[i2];
                int[] iArr5 = new int[bsr.a];
                for (int i5 = 0; i5 < bsr.a; i5++) {
                    iArr5[i5] = blt2.a(bsr.b[i5]);
                }
                iArr4 = iArr5;
            }
            length = iArr[i2];
            bsrArr[i2][length] = bsr;
            iArr2[i2][length] = iArr4;
            iArr[i2] = iArr[i2] + 1;
        }
        bss[] bssArr = new bss[bltArr.length];
        int[] iArr6 = new int[bltArr.length];
        for (int i6 = 0; i6 < bltArr.length; i6++) {
            int i7 = iArr[i6];
            bssArr[i6] = new bss((bsr[]) bzo.a(bsrArr[i6], i7));
            iArr2[i6] = (int[][]) bzo.a(iArr2[i6], i7);
            iArr6[i6] = bltArr[i6].a();
        }
        int[] iArr7 = iArr3;
        int[][][] iArr8 = iArr2;
        a aVar = new a(iArr6, bssArr, iArr7, iArr8, new bss((bsr[]) bzo.a(bsrArr[bltArr.length], iArr[bltArr.length])));
        Pair a2 = a(aVar, iArr2, iArr3);
        return new bww((blu[]) a2.first, (bwt[]) a2.second, aVar);
    }

    public final void a(Object obj) {
        this.b = (a) obj;
    }
}

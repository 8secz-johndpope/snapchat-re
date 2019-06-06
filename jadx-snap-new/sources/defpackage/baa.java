package defpackage;

/* renamed from: baa */
public final class baa {
    private static int[] a = new int[]{2, 1, 4, 8};

    static int a(int[] iArr) {
        int i = 0;
        if (iArr == null) {
            return 0;
        }
        int i2 = 0;
        while (i < iArr.length) {
            i2 |= iArr[i];
            i++;
        }
        return i2;
    }

    static int[] a(int i) {
        int[] iArr = a;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[i3];
            i2 += (i & i4) == i4 ? 1 : 0;
        }
        iArr = new int[i2];
        int[] iArr2 = a;
        i2 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = iArr2[i5];
            if ((i & i6) == i6) {
                int i7 = i2 + 1;
                iArr[i2] = i6;
                i2 = i7;
            }
        }
        return iArr;
    }
}

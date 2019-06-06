package defpackage;

/* renamed from: akvw */
public abstract class akvw {
    static final int[] a;

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= -520093696 >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        a = iArr;
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        int[] a = akvw.a(bArr);
        akvw.a(a, akvw.a(bArr2));
        akwe.a(a, bArr, 0);
    }

    public static void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                return;
            }
        }
    }

    public static void a(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i;
        int i4 = i2;
        int i5 = iArr[2];
        int i6 = iArr[3];
        i = 0;
        i2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i < 4) {
            int i10 = iArr2[i];
            int i11 = i6;
            i6 = i5;
            i5 = i4;
            i4 = i3;
            i3 = i9;
            i9 = i8;
            i8 = i7;
            i7 = i2;
            for (i2 = 0; i2 < 32; i2++) {
                int i12 = i10 >> 31;
                i10 <<= 1;
                i7 ^= i4 & i12;
                i8 ^= i5 & i12;
                i9 ^= i6 & i12;
                i3 ^= i12 & i11;
                i11 = (i11 >>> 1) | (i6 << 31);
                i6 = (i6 >>> 1) | (i5 << 31);
                i5 = (i5 >>> 1) | (i4 << 31);
                i4 = (i4 >>> 1) ^ (((i11 << 31) >> 8) & -520093696);
            }
            i++;
            i2 = i7;
            i7 = i8;
            i8 = i9;
            i9 = i3;
            i3 = i4;
            i4 = i5;
            i5 = i6;
            i6 = i11;
        }
        iArr[0] = i2;
        iArr[1] = i7;
        iArr[2] = i8;
        iArr[3] = i9;
    }

    public static int[] a(byte[] bArr) {
        int[] iArr = new int[4];
        akwe.a(bArr, 0, iArr);
        return iArr;
    }

    public static void b(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        } while (i < 16);
    }

    public static void b(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        i <<= 31;
        int i2 = iArr[1];
        iArr2[1] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[2];
        iArr2[2] = i | (i2 >>> 1);
        i = i2 << 31;
        int i3 = iArr[3];
        iArr2[3] = i | (i3 >>> 1);
        iArr2[0] = (((i3 << 31) >> 8) & -520093696) ^ iArr2[0];
    }
}

package defpackage;

/* renamed from: sz */
public final class sz {
    public static byte[] a = new byte[255];
    private static byte[] b = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            a[i2] = (byte) -1;
        }
        while (true) {
            byte[] bArr = b;
            if (i < bArr.length) {
                a[bArr[i]] = (byte) i;
                i++;
            } else {
                bArr = a;
                bArr[9] = (byte) -2;
                bArr[10] = (byte) -2;
                bArr[13] = (byte) -2;
                bArr[32] = (byte) -2;
                bArr[61] = (byte) -3;
                return;
            }
        }
    }

    public static final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[(((bArr.length + 2) / 3) << 2)];
        int i = 0;
        int i2 = 0;
        while (i + 3 <= bArr.length) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 16) | ((bArr[i3] & 255) << 8);
            i3 = i4 + 1;
            i |= bArr[i4] & 255;
            i4 = (i & 16515072) >> 18;
            int i5 = i2 + 1;
            byte[] bArr3 = b;
            bArr2[i2] = bArr3[i4];
            i4 = i5 + 1;
            bArr2[i5] = bArr3[(i & 258048) >> 12];
            int i6 = i4 + 1;
            bArr2[i4] = bArr3[(i & 4032) >> 6];
            i2 = i6 + 1;
            bArr2[i6] = bArr3[i & 63];
            i = i3;
        }
        int i7;
        int i8;
        int i9;
        byte[] bArr4;
        if (bArr.length - i == 2) {
            i7 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            i8 = (i7 & 16515072) >> 18;
            i9 = i2 + 1;
            bArr4 = b;
            bArr2[i2] = bArr4[i8];
            i2 = i9 + 1;
            bArr2[i9] = bArr4[(i7 & 258048) >> 12];
            i8 = i2 + 1;
            bArr2[i2] = bArr4[(i7 & 4032) >> 6];
            bArr2[i8] = (byte) 61;
        } else if (bArr.length - i == 1) {
            i7 = (bArr[i] & 255) << 16;
            i8 = (i7 & 16515072) >> 18;
            i9 = i2 + 1;
            bArr4 = b;
            bArr2[i2] = bArr4[i8];
            i8 = i9 + 1;
            bArr2[i9] = bArr4[(i7 & 258048) >> 12];
            i7 = i8 + 1;
            bArr2[i8] = (byte) 61;
            bArr2[i7] = (byte) 61;
        }
        return bArr2;
    }
}

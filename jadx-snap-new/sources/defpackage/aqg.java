package defpackage;

/* renamed from: aqg */
public final class aqg {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        return aqg.a(bArr, 0);
    }

    public static String a(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = 0;
        char[] cArr = new char[((length << 1) + (i > 0 ? length / i : 0))];
        int i3 = 0;
        while (i2 < length) {
            int i4;
            if (i > 0 && i2 % i == 0 && i3 > 0) {
                i4 = i3 + 1;
                cArr[i3] = '-';
                i3 = i4;
            }
            i4 = i3 + 1;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(bArr[i2] & 240) >>> 4];
            i3 = i4 + 1;
            cArr[i4] = cArr2[bArr[i2] & 15];
            i2++;
        }
        return new String(cArr);
    }
}

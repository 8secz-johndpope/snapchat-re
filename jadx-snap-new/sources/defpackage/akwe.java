package defpackage;

/* renamed from: akwe */
public abstract class akwe {
    public static int a(byte[] bArr, int i) {
        i++;
        i++;
        return (bArr[i + 1] << 24) | (((bArr[i] & 255) | ((bArr[i] & 255) << 8)) | ((bArr[i] & 255) << 16));
    }

    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        i2++;
        bArr[i2] = (byte) (i >>> 16);
        i2++;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public static void a(long j, byte[] bArr, int i) {
        akwe.a((int) (j >>> 32), bArr, i);
        akwe.a((int) j, bArr, i + 4);
    }

    public static void a(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = akwe.b(bArr, i);
            i += 4;
        }
    }

    public static void a(int[] iArr, byte[] bArr, int i) {
        for (int a : iArr) {
            akwe.a(a, bArr, i);
            i += 4;
        }
    }

    private static int b(byte[] bArr, int i) {
        i++;
        i++;
        return (bArr[i + 1] & 255) | (((bArr[i] << 24) | ((bArr[i] & 255) << 16)) | ((bArr[i] & 255) << 8));
    }

    public static void b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        i2++;
        bArr[i2] = (byte) (i >>> 8);
        i2++;
        bArr[i2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 24);
    }
}

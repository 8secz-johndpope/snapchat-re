package defpackage;

import java.io.InputStream;

/* renamed from: abue */
public final class abue {
    private static final byte[] a = new byte[]{(byte) -119, (byte) 80, (byte) 78, (byte) 71, (byte) 13, (byte) 10, (byte) 26, (byte) 10};
    private static final byte[] b = new byte[]{(byte) -1, (byte) -40};
    private static final byte[] c = new byte[]{(byte) 82, (byte) 73, (byte) 70, (byte) 70};
    private static final byte[] d = new byte[]{(byte) 87, (byte) 69, (byte) 66, (byte) 80};
    private static final byte[] e = new byte[]{(byte) 65, (byte) 78, (byte) 73, (byte) 77};

    static {
        abue abue = new abue();
    }

    public static int a(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(34);
            try {
                byte[] bArr = new byte[16];
                int i = 3;
                if (16 <= inputStream.read(bArr)) {
                    if (abue.a(bArr, 0, b)) {
                        i = 1;
                    } else if (abue.a(bArr, 0, a)) {
                        i = 2;
                    } else if (abue.a(bArr, 0, c) && abue.a(bArr, 8, d)) {
                        bArr = new byte[18];
                        if (18 <= inputStream.read(bArr)) {
                            if (abue.a(bArr, 14, e)) {
                                i = 4;
                            }
                        }
                    }
                    inputStream.reset();
                    return i;
                }
                i = 5;
                inputStream.reset();
                return i;
            } catch (Throwable th) {
                inputStream.reset();
            }
        } else {
            throw new UnsupportedOperationException("Cannot check stream if 'mark' is not supported.");
        }
    }

    private static boolean a(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (length = 0; length < length2; length++) {
            if (bArr[length + i] != bArr2[length]) {
                return false;
            }
        }
        return true;
    }
}

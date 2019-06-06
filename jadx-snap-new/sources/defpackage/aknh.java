package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.opencv.imgproc.Imgproc;

/* renamed from: aknh */
public class aknh {
    private boolean a = false;

    protected static int a(byte[] bArr, int i) {
        if (1 < bArr.length) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            return i == 77 ? i3 | (i2 << 8) : (i3 << 8) | i2;
        } else {
            StringBuffer stringBuffer = new StringBuffer("Index out of bounds. Array size: ");
            stringBuffer.append(bArr.length);
            stringBuffer.append(", index: 0");
            throw new akne(stringBuffer.toString());
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[Imgproc.INTER_TAB_SIZE2];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length < i + i2 || bArr2.length < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i + i3] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static final byte[] a(int i) {
        return new byte[]{(byte) (i >> 8), (byte) i};
    }

    public static byte[] a(int i, InputStream inputStream, String str) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read > 0) {
                i2 += read;
            } else {
                throw new IOException(str);
            }
        }
        return bArr;
    }
}

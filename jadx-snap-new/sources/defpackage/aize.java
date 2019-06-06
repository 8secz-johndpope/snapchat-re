package defpackage;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: aize */
public final class aize {
    private static final Logger a = Logger.getLogger(aize.class.getName());
    private static final byte[] b = "-bin".getBytes(Charsets.US_ASCII);

    private aize() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    public static byte[][] a(aivl aivl) {
        byte[][] bArr;
        if ((aivl.c << 1) == aivl.a()) {
            bArr = aivl.b;
        } else {
            byte[][] bArr2 = new byte[(aivl.c << 1)][];
            System.arraycopy(aivl.b, 0, bArr2, 0, aivl.c << 1);
            bArr = bArr2;
        }
        if (bArr == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 2) {
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = bArr[i2 + 1];
            if (aize.a(bArr3, b)) {
                bArr[i] = bArr3;
                bArr[i + 1] = BaseEncoding.base64().encode(bArr4).getBytes(Charsets.US_ASCII);
            } else {
                Object obj;
                for (byte b : bArr4) {
                    if (b < (byte) 32 || b > (byte) 126) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                if (obj != null) {
                    bArr[i] = bArr3;
                    bArr[i + 1] = bArr4;
                } else {
                    String str = new String(bArr3, Charsets.US_ASCII);
                    Logger logger = a;
                    StringBuilder stringBuilder = new StringBuilder("Metadata key=");
                    stringBuilder.append(str);
                    stringBuilder.append(", value=");
                    stringBuilder.append(Arrays.toString(bArr4));
                    stringBuilder.append(" contains invalid ASCII characters");
                    logger.warning(stringBuilder.toString());
                }
            }
            i += 2;
        }
        return i == bArr.length ? bArr : (byte[][]) Arrays.copyOfRange(bArr, 0, i);
    }

    public static byte[][] a(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            bArr[i] = bArr2;
            if (aize.a(bArr2, b)) {
                bArr[i2] = BaseEncoding.base64().decode(new String(bArr3, Charsets.US_ASCII));
            }
        }
        return bArr;
    }
}

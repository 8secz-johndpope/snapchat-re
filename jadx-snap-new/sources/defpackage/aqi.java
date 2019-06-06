package defpackage;

import defpackage.ceu.a;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: aqi */
public final class aqi {
    private static ceu a = new ceu();
    private static byte[] b = new byte[4];

    public static int a(byte b) {
        return b < (byte) 0 ? b + 256 : b;
    }

    public static long a(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static String a(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return aqn.a(bArr);
    }

    public static int b(ByteBuffer byteBuffer) {
        return ((aqi.c(byteBuffer) << 8) + 0) + aqi.a(byteBuffer.get());
    }

    public static int c(ByteBuffer byteBuffer) {
        return ((aqi.a(byteBuffer.get()) << 8) + 0) + aqi.a(byteBuffer.get());
    }

    public static String d(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == (byte) 0) {
                return aqn.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    public static long e(ByteBuffer byteBuffer) {
        long a = (aqi.a(byteBuffer) << 32) + 0;
        if (a >= 0) {
            return a + aqi.a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) ((((0 | ((bArr[0] << 24) & -16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static double g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) ((((0 | ((bArr[0] << 24) & -16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static float h(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((float) ((short) (((short) (0 | ((bArr[0] << 8) & 65280))) | (bArr[1] & 255)))) / 256.0f;
    }

    public static String i(ByteBuffer byteBuffer) {
        int c = aqi.c(byteBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append((char) (((c >> ((2 - i) * 5)) & 31) + 96));
        }
        return stringBuilder.toString();
    }

    public static String j(ByteBuffer byteBuffer) {
        Object obj;
        byteBuffer.get(b);
        byte[] bArr = b;
        int i = (bArr[3] & 255) | ((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280));
        a[] aVarArr = a.a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.c) {
            if (aVar.a == i) {
                obj = aVar.b;
                break;
            }
        }
        obj = null;
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        try {
            str = new String(b, "ISO-8859-1");
            a.a(i, str);
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static long k(ByteBuffer byteBuffer) {
        long c = ((long) aqi.c(byteBuffer)) << 32;
        if (c >= 0) {
            return c + aqi.a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}

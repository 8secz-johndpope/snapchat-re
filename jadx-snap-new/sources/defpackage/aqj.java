package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aqj */
public final class aqj {
    public static long a(ByteBuffer byteBuffer, int i) {
        int a;
        if (i == 1) {
            a = aqi.a(byteBuffer.get());
        } else if (i == 2) {
            a = aqi.c(byteBuffer);
        } else if (i == 3) {
            a = aqi.b(byteBuffer);
        } else if (i == 4) {
            return aqi.a(byteBuffer);
        } else {
            if (i == 8) {
                return aqi.e(byteBuffer);
            }
            StringBuilder stringBuilder = new StringBuilder("I don't know how to read ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            throw new RuntimeException(stringBuilder.toString());
        }
        return (long) a;
    }
}

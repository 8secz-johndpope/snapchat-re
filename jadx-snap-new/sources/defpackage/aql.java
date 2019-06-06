package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aql */
public final class aql {
    public static void a(long j, ByteBuffer byteBuffer, int i) {
        if (i == 1) {
            aqk.c(byteBuffer, (int) (j & 255));
        } else if (i == 2) {
            aqk.b(byteBuffer, (int) (j & 65535));
        } else if (i == 3) {
            aqk.a(byteBuffer, (int) (j & 16777215));
        } else if (i == 4) {
            aqk.b(byteBuffer, j);
        } else if (i == 8) {
            aqk.a(byteBuffer, j);
        } else {
            StringBuilder stringBuilder = new StringBuilder("I don't know how to read ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}

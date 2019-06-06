package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ihc */
public final class ihc {
    public static int a(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (b >= (byte) 0) {
            return b;
        }
        int i;
        int i2 = b & 127;
        byte b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & 127) << 7;
            b2 = byteBuffer.get();
            if (b2 >= (byte) 0) {
                i = b2 << 14;
            } else {
                i2 |= (b2 & 127) << 14;
                b2 = byteBuffer.get();
                if (b2 >= (byte) 0) {
                    i = b2 << 21;
                } else {
                    i2 |= (b2 & 127) << 21;
                    b2 = byteBuffer.get();
                    i2 |= b2 << 28;
                    while (b2 < (byte) 0) {
                        b2 = byteBuffer.get();
                    }
                    i = i2;
                    return i;
                }
            }
        }
        i |= i2;
        return i;
    }

    public static void a(int i, ByteBuffer byteBuffer) {
        while (true) {
            int i2 = i & 127;
            i >>>= 7;
            if (i == 0) {
                byteBuffer.put((byte) i2);
                return;
            }
            byteBuffer.put((byte) (i2 | 128));
        }
    }
}

package org.jcodec.common;

import java.nio.ByteBuffer;
import org.jcodec.platform.Platform;

public class JCodecUtil2 {
    public static byte[] asciiString(String str) {
        return Platform.getBytes(str);
    }

    public static int readBER32(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b = byteBuffer.get();
            i = (i << 7) | (b & 127);
            if (((b & 255) >> 7) == 0) {
                break;
            }
        }
        return i;
    }

    public static void writeBER32(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) ((i >> 21) | 128));
        byteBuffer.put((byte) ((i >> 14) | 128));
        byteBuffer.put((byte) ((i >> 7) | 128));
        byteBuffer.put((byte) (i & 127));
    }
}

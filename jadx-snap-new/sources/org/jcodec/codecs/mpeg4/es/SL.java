package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;

public class SL extends Descriptor {
    public SL() {
        super(tag(), 0);
    }

    public static int tag() {
        return 6;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 2);
    }
}

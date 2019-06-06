package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;
import org.jcodec.common.io.NIOUtils;

public class DecoderSpecific extends Descriptor {
    private ByteBuffer data;

    public DecoderSpecific(ByteBuffer byteBuffer) {
        super(tag(), 0);
        this.data = byteBuffer;
    }

    public static int tag() {
        return 5;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        NIOUtils.write(byteBuffer, this.data);
    }

    public ByteBuffer getData() {
        return this.data;
    }
}

package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;
import java.util.Collection;

public class DecoderConfig extends NodeDescriptor {
    private int avgBitrate;
    private int bufSize;
    private int maxBitrate;
    private int objectType;

    public DecoderConfig(int i, int i2, int i3, int i4, Collection<Descriptor> collection) {
        super(tag(), collection);
        this.objectType = i;
        this.bufSize = i2;
        this.maxBitrate = i3;
        this.avgBitrate = i4;
    }

    public static int tag() {
        return 4;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) this.objectType);
        byteBuffer.put((byte) 21);
        byteBuffer.put((byte) (this.bufSize >> 16));
        byteBuffer.putShort((short) this.bufSize);
        byteBuffer.putInt(this.maxBitrate);
        byteBuffer.putInt(this.avgBitrate);
        super.doWrite(byteBuffer);
    }

    public int getAvgBitrate() {
        return this.avgBitrate;
    }

    public int getBufSize() {
        return this.bufSize;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getObjectType() {
        return this.objectType;
    }
}

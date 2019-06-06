package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;
import java.util.Collection;

public class ES extends NodeDescriptor {
    private int trackId;

    public ES(int i, Collection<Descriptor> collection) {
        super(tag(), collection);
        this.trackId = i;
    }

    public static int tag() {
        return 3;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) this.trackId);
        byteBuffer.put((byte) 0);
        super.doWrite(byteBuffer);
    }

    public int getTrackId() {
        return this.trackId;
    }
}

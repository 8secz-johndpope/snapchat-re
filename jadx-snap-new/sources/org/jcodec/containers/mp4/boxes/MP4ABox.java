package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class MP4ABox extends Box {
    private int val;

    public MP4ABox(Header header) {
        super(header);
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.val);
    }

    public int estimateSize() {
        return 12;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.val = byteBuffer.getInt();
    }
}

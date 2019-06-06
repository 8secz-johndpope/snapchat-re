package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class UdtaMetaBox extends MetaBox {
    public UdtaMetaBox() {
        this(Header.createHeader(MetaBox.fourcc(), 0));
    }

    public UdtaMetaBox(Header header) {
        super(header);
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        super.doWrite(byteBuffer);
    }

    public void parse(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        super.parse(byteBuffer);
    }
}

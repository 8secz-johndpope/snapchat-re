package com.snap.spectacles.lib.main.newport;

import defpackage.ajxl;
import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public final class St3DBox extends FullBox {
    private final byte[] data = new byte[]{(byte) 2};

    public St3DBox() {
        super(new Header("st3d"));
    }

    public final void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        if (byteBuffer != null) {
            byteBuffer.put(this.data);
        }
    }

    public final int estimateSize() {
        return this.data.length + 12;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final void parse(ByteBuffer byteBuffer) {
        throw new ajxl("An operation is not implemented: ".concat("This won't be implemented"));
    }
}

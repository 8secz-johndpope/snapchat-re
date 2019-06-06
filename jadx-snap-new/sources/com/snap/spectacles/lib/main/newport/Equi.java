package com.snap.spectacles.lib.main.newport;

import defpackage.ajxl;
import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public final class Equi extends FullBox {
    private final byte[] projectionBoundsBottom = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] projectionBoundsLeft = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] projectionBoundsRight = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] projectionBoundsTop = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};

    public Equi() {
        super(new Header("equi"));
    }

    public final void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        if (byteBuffer != null) {
            byteBuffer.put(this.projectionBoundsTop);
        }
        if (byteBuffer != null) {
            byteBuffer.put(this.projectionBoundsBottom);
        }
        if (byteBuffer != null) {
            byteBuffer.put(this.projectionBoundsLeft);
        }
        if (byteBuffer != null) {
            byteBuffer.put(this.projectionBoundsRight);
        }
    }

    public final int estimateSize() {
        return (((this.projectionBoundsBottom.length + 12) + this.projectionBoundsLeft.length) + this.projectionBoundsRight.length) + this.projectionBoundsTop.length;
    }

    public final void parse(ByteBuffer byteBuffer) {
        throw new ajxl("An operation is not implemented: ".concat("This won't be implemented"));
    }
}

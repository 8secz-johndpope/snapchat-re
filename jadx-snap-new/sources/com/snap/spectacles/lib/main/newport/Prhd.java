package com.snap.spectacles.lib.main.newport;

import defpackage.ajxl;
import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public final class Prhd extends FullBox {
    private final byte[] posePitchDegrees = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] poseRollDegrees = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final byte[] poseYawDegrees = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};

    public Prhd() {
        super(new Header("prhd"));
    }

    public final void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        if (byteBuffer != null) {
            byteBuffer.put(this.poseYawDegrees);
        }
        if (byteBuffer != null) {
            byteBuffer.put(this.posePitchDegrees);
        }
        if (byteBuffer != null) {
            byteBuffer.put(this.poseRollDegrees);
        }
    }

    public final int estimateSize() {
        return ((this.posePitchDegrees.length + 12) + this.poseRollDegrees.length) + this.poseYawDegrees.length;
    }

    public final void parse(ByteBuffer byteBuffer) {
        throw new ajxl("An operation is not implemented: ".concat("This won't be implemented"));
    }
}

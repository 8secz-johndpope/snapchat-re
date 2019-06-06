package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class EndianBox extends Box {
    private ByteOrder endian;

    public EndianBox(Header header) {
        super(header);
    }

    public static EndianBox createEndianBox(ByteOrder byteOrder) {
        EndianBox endianBox = new EndianBox(new Header(fourcc()));
        endianBox.endian = byteOrder;
        return endianBox;
    }

    public static String fourcc() {
        return "enda";
    }

    /* Access modifiers changed, original: protected */
    public int calcSize() {
        return 2;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short) (this.endian == ByteOrder.LITTLE_ENDIAN ? 1 : 0));
    }

    public int estimateSize() {
        return 10;
    }

    public ByteOrder getEndian() {
        return this.endian;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.endian = ((long) byteBuffer.getShort()) == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
    }
}

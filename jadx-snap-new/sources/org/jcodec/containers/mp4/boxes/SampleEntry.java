package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

public class SampleEntry extends NodeBox {
    protected short drefInd;

    public SampleEntry(Header header) {
        super(header);
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});
        byteBuffer.putShort(this.drefInd);
    }

    public int estimateSize() {
        return super.estimateSize() + 8;
    }

    public short getDrefInd() {
        return this.drefInd;
    }

    public void parse(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.getShort();
        this.drefInd = byteBuffer.getShort();
    }

    /* Access modifiers changed, original: protected */
    public void parseExtensions(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
    }

    public void setDrefInd(short s) {
        this.drefInd = s;
    }

    public void setMediaType(String str) {
        this.header = new Header(str);
    }

    /* Access modifiers changed, original: protected */
    public void writeExtensions(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
    }
}

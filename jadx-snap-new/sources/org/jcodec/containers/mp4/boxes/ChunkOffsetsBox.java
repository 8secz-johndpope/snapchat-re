package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import java.nio.ByteBuffer;

public class ChunkOffsetsBox extends FullBox {
    private long[] chunkOffsets;

    public ChunkOffsetsBox(Header header) {
        super(header);
    }

    public static ChunkOffsetsBox createChunkOffsetsBox(long[] jArr) {
        ChunkOffsetsBox chunkOffsetsBox = new ChunkOffsetsBox(new Header(fourcc()));
        chunkOffsetsBox.chunkOffsets = jArr;
        return chunkOffsetsBox;
    }

    public static String fourcc() {
        return StaticChunkOffsetBox.TYPE;
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.chunkOffsets.length);
        int i = 0;
        while (true) {
            long[] jArr = this.chunkOffsets;
            if (i < jArr.length) {
                byteBuffer.putInt((int) jArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public int estimateSize() {
        return (this.chunkOffsets.length << 2) + 16;
    }

    public long[] getChunkOffsets() {
        return this.chunkOffsets;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.chunkOffsets = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.chunkOffsets[i2] = ((long) byteBuffer.getInt()) & 4294967295L;
        }
    }

    public void setChunkOffsets(long[] jArr) {
        this.chunkOffsets = jArr;
    }
}

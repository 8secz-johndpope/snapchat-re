package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.nio.ByteBuffer;

public class CompositionOffsetsBox extends FullBox {
    private Entry[] entries;

    public static class Entry {
        public int count;
        public int offset;

        public Entry(int i, int i2) {
            this.count = i;
            this.offset = i2;
        }
    }

    public CompositionOffsetsBox(Header header) {
        super(header);
    }

    public static CompositionOffsetsBox createCompositionOffsetsBox(Entry[] entryArr) {
        CompositionOffsetsBox compositionOffsetsBox = new CompositionOffsetsBox(new Header(fourcc()));
        compositionOffsetsBox.entries = entryArr;
        return compositionOffsetsBox;
    }

    public static String fourcc() {
        return CompositionTimeToSample.TYPE;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.entries.length);
        int i = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                byteBuffer.putInt(entryArr[i].count);
                byteBuffer.putInt(this.entries[i].offset);
                i++;
            } else {
                return;
            }
        }
    }

    public int estimateSize() {
        return (this.entries.length << 3) + 16;
    }

    public Entry[] getEntries() {
        return this.entries;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        int i = byteBuffer.getInt();
        this.entries = new Entry[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.entries[i2] = new Entry(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }
}

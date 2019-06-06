package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.containers.mp4.BoxFactory;
import org.jcodec.containers.mp4.Boxes;

public class IListBox extends Box {
    private static final String FOURCC = "ilst";
    private BoxFactory factory;
    private Map<Integer, List<Box>> values;

    static class LocalBoxes extends Boxes {
        private LocalBoxes() {
            this.mappings.put(DataBox.fourcc(), DataBox.class);
        }
    }

    public IListBox(Map<Integer, List<Box>> map) {
        this(Header.createHeader("ilst", 0));
        this.values = map;
    }

    public IListBox(Header header) {
        super(header);
        this.values = new LinkedHashMap();
        this.factory = new BoxFactory(new LocalBoxes());
    }

    public static String fourcc() {
        return "ilst";
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        for (Entry entry : this.values.entrySet()) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            byteBuffer.putInt(0);
            byteBuffer.putInt(((Integer) entry.getKey()).intValue());
            for (Box write : (List) entry.getValue()) {
                write.write(byteBuffer);
            }
            duplicate.putInt(byteBuffer.position() - duplicate.position());
        }
    }

    public int estimateSize() {
        int i = 8;
        for (Entry value : this.values.entrySet()) {
            for (Box estimateSize : (List) value.getValue()) {
                i += estimateSize.estimateSize() + 8;
            }
        }
        return i;
    }

    public Map<Integer, List<Box>> getValues() {
        return this.values;
    }

    public void parse(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 4) {
            ByteBuffer read = NIOUtils.read(byteBuffer, byteBuffer.getInt() - 4);
            int i = read.getInt();
            ArrayList arrayList = new ArrayList();
            this.values.put(Integer.valueOf(i), arrayList);
            while (read.hasRemaining()) {
                Header read2 = Header.read(read);
                if (read2 != null && ((long) read.remaining()) >= read2.getBodySize()) {
                    arrayList.add(Box.parseBox(NIOUtils.read(read, (int) read2.getBodySize()), read2, this.factory));
                }
            }
        }
    }
}

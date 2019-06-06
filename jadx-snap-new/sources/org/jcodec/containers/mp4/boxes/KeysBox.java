package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.BoxFactory;
import org.jcodec.containers.mp4.Boxes;

public class KeysBox extends NodeBox {
    private static final String FOURCC = "keys";

    static class LocalBoxes extends Boxes {
        private LocalBoxes() {
            this.mappings.put(MdtaBox.fourcc(), MdtaBox.class);
        }
    }

    public KeysBox() {
        this(Header.createHeader(FOURCC, 0));
    }

    public KeysBox(Header header) {
        super(header);
        this.factory = new BoxFactory(new LocalBoxes());
    }

    public static String fourcc() {
        return FOURCC;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.boxes.size());
        super.doWrite(byteBuffer);
    }

    public int estimateSize() {
        return super.estimateSize() + 8;
    }

    public void parse(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.getInt();
        super.parse(byteBuffer);
    }
}

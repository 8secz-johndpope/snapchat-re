package org.jcodec.containers.mp4.boxes;

import com.mapbox.mapboxsdk.style.layers.Property;
import java.nio.ByteBuffer;

public class FielExtension extends Box {
    private int order;
    private int type;

    public FielExtension(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "fiel";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) this.type);
        byteBuffer.put((byte) this.order);
    }

    public int estimateSize() {
        return 10;
    }

    public String getOrderInterpretation() {
        if (isInterlaced()) {
            int i = this.order;
            if (i == 1) {
                return Property.TEXT_ANCHOR_TOP;
            }
            if (i == 6) {
                return Property.TEXT_ANCHOR_BOTTOM;
            }
            if (i == 9) {
                return "bottomtop";
            }
            if (i == 14) {
                return "topbottom";
            }
        }
        return "";
    }

    public boolean isInterlaced() {
        return this.type == 2;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.type = byteBuffer.get() & 255;
        if (isInterlaced()) {
            this.order = byteBuffer.get() & 255;
        }
    }

    public boolean topFieldFirst() {
        int i = this.order;
        return i == 1 || i == 6;
    }
}

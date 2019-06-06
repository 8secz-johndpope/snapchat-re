package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.DataReferenceBox;
import java.nio.ByteBuffer;

public class DataRefBox extends NodeBox {
    public DataRefBox(Header header) {
        super(header);
    }

    public static DataRefBox createDataRefBox() {
        return new DataRefBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return DataReferenceBox.TYPE;
    }

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

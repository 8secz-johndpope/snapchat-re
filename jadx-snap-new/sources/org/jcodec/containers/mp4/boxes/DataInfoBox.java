package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;

public class DataInfoBox extends NodeBox {
    public DataInfoBox(Header header) {
        super(header);
    }

    public static DataInfoBox createDataInfoBox() {
        return new DataInfoBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return DataInformationBox.TYPE;
    }

    public DataRefBox getDref() {
        return (DataRefBox) NodeBox.findFirst(this, DataRefBox.class, DataReferenceBox.TYPE);
    }
}

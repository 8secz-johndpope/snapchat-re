package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.SampleTableBox;

public class MediaInfoBox extends NodeBox {
    public MediaInfoBox(Header header) {
        super(header);
    }

    public static MediaInfoBox createMediaInfoBox() {
        return new MediaInfoBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return MediaInformationBox.TYPE;
    }

    public DataInfoBox getDinf() {
        return (DataInfoBox) NodeBox.findFirst(this, DataInfoBox.class, DataInformationBox.TYPE);
    }

    public NodeBox getStbl() {
        return (NodeBox) NodeBox.findFirst(this, NodeBox.class, SampleTableBox.TYPE);
    }
}

package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.MediaInformationBox;

public class MediaBox extends NodeBox {
    public MediaBox(Header header) {
        super(header);
    }

    public static MediaBox createMediaBox() {
        return new MediaBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return com.coremedia.iso.boxes.MediaBox.TYPE;
    }

    public MediaInfoBox getMinf() {
        return (MediaInfoBox) NodeBox.findFirst(this, MediaInfoBox.class, MediaInformationBox.TYPE);
    }
}

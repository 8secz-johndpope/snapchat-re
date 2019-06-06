package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqo;

public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof HandlerBox) {
                return (HandlerBox) aqo;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof MediaHeaderBox) {
                return (MediaHeaderBox) aqo;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof MediaInformationBox) {
                return (MediaInformationBox) aqo;
            }
        }
        return null;
    }
}

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqo;

public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super(TYPE);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) aqo;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SampleTableBox) {
                return (SampleTableBox) aqo;
            }
        }
        return null;
    }
}

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqo;
import java.util.List;

public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(TYPE);
    }

    public MediaBox getMediaBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof MediaBox) {
                return (MediaBox) aqo;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        SampleTableBox sampleTableBox = this.sampleTableBox;
        if (sampleTableBox != null) {
            return sampleTableBox;
        }
        MediaBox mediaBox = getMediaBox();
        if (mediaBox != null) {
            MediaInformationBox mediaInformationBox = mediaBox.getMediaInformationBox();
            if (mediaInformationBox != null) {
                this.sampleTableBox = mediaInformationBox.getSampleTableBox();
                return this.sampleTableBox;
            }
        }
        return null;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof TrackHeaderBox) {
                return (TrackHeaderBox) aqo;
            }
        }
        return null;
    }

    public void setBoxes(List<aqo> list) {
        super.setBoxes(list);
        this.sampleTableBox = null;
    }
}

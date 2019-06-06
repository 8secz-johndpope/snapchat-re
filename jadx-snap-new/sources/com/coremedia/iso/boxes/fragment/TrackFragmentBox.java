package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqo;

public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) aqo;
            }
        }
        return null;
    }
}

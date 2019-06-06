package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqo;

public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) aqo;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) aqo;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) aqo;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) aqo;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SampleSizeBox) {
                return (SampleSizeBox) aqo;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox = this.sampleToChunkBox;
        if (sampleToChunkBox != null) {
            return sampleToChunkBox;
        }
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SampleToChunkBox) {
                this.sampleToChunkBox = (SampleToChunkBox) aqo;
                return this.sampleToChunkBox;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof SyncSampleBox) {
                return (SyncSampleBox) aqo;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (aqo aqo : getBoxes()) {
            if (aqo instanceof TimeToSampleBox) {
                return (TimeToSampleBox) aqo;
            }
        }
        return null;
    }
}

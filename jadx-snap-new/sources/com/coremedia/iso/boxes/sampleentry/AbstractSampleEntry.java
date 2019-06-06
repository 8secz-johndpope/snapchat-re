package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqf;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractSampleEntry extends AbstractContainerBox implements SampleEntry {
    protected int dataReferenceIndex = 1;

    protected AbstractSampleEntry(String str) {
        super(str);
    }

    public abstract void getBox(WritableByteChannel writableByteChannel);

    public int getDataReferenceIndex() {
        return this.dataReferenceIndex;
    }

    public abstract void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf);

    public void setDataReferenceIndex(int i) {
        this.dataReferenceIndex = i;
    }
}

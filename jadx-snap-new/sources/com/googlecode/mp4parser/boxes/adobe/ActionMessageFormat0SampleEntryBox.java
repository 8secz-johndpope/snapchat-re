package com.googlecode.mp4parser.boxes.adobe;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class ActionMessageFormat0SampleEntryBox extends AbstractSampleEntry {
    public static final String TYPE = "amf0";

    public ActionMessageFormat0SampleEntryBox() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public long getSize() {
        long containerSize = getContainerSize() + 8;
        int i = (this.largeBox || containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(8);
        ccy.a(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        initContainer(ccy, j - 8, aqf);
    }
}

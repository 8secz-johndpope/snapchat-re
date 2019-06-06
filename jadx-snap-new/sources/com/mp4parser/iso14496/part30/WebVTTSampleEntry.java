package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import defpackage.aqf;
import defpackage.ccy;
import defpackage.cez;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class WebVTTSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "wvtt";

    public WebVTTSampleEntry() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    public WebVTTConfigurationBox getConfig() {
        return (WebVTTConfigurationBox) cez.a(this, WebVTTConfigurationBox.TYPE);
    }

    public WebVTTSourceLabelBox getSourceLabel() {
        return (WebVTTSourceLabelBox) cez.a(this, WebVTTSourceLabelBox.TYPE);
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        initContainer(ccy, j, aqf);
    }
}

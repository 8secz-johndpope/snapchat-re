package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.opencv.imgproc.Imgproc;

public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super(TYPE);
        String str = "";
        this.namespace = str;
        this.schemaLocation = str;
        this.auxiliaryMimeTypes = str;
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate((((this.namespace.length() + 8) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        aqk.b(allocate, this.namespace);
        aqk.b(allocate, this.schemaLocation);
        aqk.b(allocate, this.auxiliaryMimeTypes);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    public long getSize() {
        int i = 8;
        long containerSize = getContainerSize() + ((long) ((((this.namespace.length() + 8) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3));
        if (this.largeBox || 8 + containerSize >= 4294967296L) {
            i = 16;
        }
        return containerSize + ((long) i);
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        ccy.a((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = aqi.c(allocate);
        long b = ccy.b();
        ByteBuffer allocate2 = ByteBuffer.allocate(Imgproc.INTER_TAB_SIZE2);
        ccy.a((ByteBuffer) allocate2.rewind());
        this.namespace = aqi.d((ByteBuffer) allocate2.rewind());
        ccy.a((((long) this.namespace.length()) + b) + 1);
        ccy.a((ByteBuffer) allocate2.rewind());
        this.schemaLocation = aqi.d((ByteBuffer) allocate2.rewind());
        ccy.a(((((long) this.namespace.length()) + b) + ((long) this.schemaLocation.length())) + 2);
        ccy.a((ByteBuffer) allocate2.rewind());
        this.auxiliaryMimeTypes = aqi.d((ByteBuffer) allocate2.rewind());
        ccy.a((((b + ((long) this.namespace.length())) + ((long) this.schemaLocation.length())) + ((long) this.auxiliaryMimeTypes.length())) + 3);
        initContainer(ccy, j - ((long) ((((byteBuffer.remaining() + this.namespace.length()) + this.schemaLocation.length()) + this.auxiliaryMimeTypes.length()) + 3)), aqf);
    }

    public void setAuxiliaryMimeTypes(String str) {
        this.auxiliaryMimeTypes = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setSchemaLocation(String str) {
        this.schemaLocation = str;
    }
}

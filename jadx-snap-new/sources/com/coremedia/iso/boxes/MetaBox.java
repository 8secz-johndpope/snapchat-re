package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class MetaBox extends AbstractContainerBox {
    public static final String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(4);
        writeVersionAndFlags(allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    public long getSize() {
        long containerSize = getContainerSize() + 4;
        int i = (this.largeBox || containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(4);
        ccy.a(byteBuffer);
        parseVersionAndFlags((ByteBuffer) byteBuffer.rewind());
        initContainer(ccy, j - 4, aqf);
    }

    /* Access modifiers changed, original: protected|final */
    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = aqi.a(byteBuffer.get());
        this.flags = aqi.b(byteBuffer);
        return 4;
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        aqk.c(byteBuffer, this.version);
        aqk.a(byteBuffer, this.flags);
    }
}

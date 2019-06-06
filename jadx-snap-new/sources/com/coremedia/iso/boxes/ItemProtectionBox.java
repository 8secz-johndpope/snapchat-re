package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class ItemProtectionBox extends AbstractContainerBox implements FullBox {
    public static final String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox() {
        super(TYPE);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(6);
        aqk.c(allocate, this.version);
        aqk.a(allocate, this.flags);
        aqk.b(allocate, getBoxes().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public int getFlags() {
        return this.flags;
    }

    public SchemeInformationBox getItemProtectionScheme() {
        return !getBoxes(SchemeInformationBox.class).isEmpty() ? (SchemeInformationBox) getBoxes(SchemeInformationBox.class).get(0) : null;
    }

    public long getSize() {
        long containerSize = getContainerSize() + 6;
        int i = (this.largeBox || containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(6);
        ccy.a(byteBuffer);
        byteBuffer.rewind();
        this.version = aqi.a(byteBuffer.get());
        this.flags = aqi.b(byteBuffer);
        initContainer(ccy, j - 6, aqf);
    }

    public void setFlags(int i) {
        this.flags = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}

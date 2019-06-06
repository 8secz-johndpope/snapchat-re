package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;

public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int flags;
    private int version;

    public FullContainerBox(String str) {
        super(str);
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    public <T extends aqo> List<T> getBoxes(Class<T> cls) {
        return getBoxes(cls, false);
    }

    public int getFlags() {
        return this.flags;
    }

    /* Access modifiers changed, original: protected */
    public ByteBuffer getHeader() {
        ByteBuffer wrap;
        byte[] bArr;
        if (this.largeBox || getSize() >= 4294967296L) {
            bArr = new byte[20];
            bArr[3] = (byte) 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            aqk.a(wrap, getSize());
        } else {
            bArr = new byte[12];
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            aqk.b(wrap, getSize());
            wrap.position(8);
        }
        writeVersionAndFlags(wrap);
        wrap.rewind();
        return wrap;
    }

    public int getVersion() {
        return this.version;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ccy.a(allocate);
        parseVersionAndFlags((ByteBuffer) allocate.rewind());
        super.parse(ccy, byteBuffer, j, aqf);
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(getClass().getSimpleName()));
        stringBuilder.append("[childBoxes]");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        aqk.c(byteBuffer, this.version);
        aqk.a(byteBuffer, this.flags);
    }
}

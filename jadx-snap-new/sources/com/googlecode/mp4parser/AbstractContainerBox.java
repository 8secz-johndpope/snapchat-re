package com.googlecode.mp4parser;

import defpackage.aqf;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccx;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class AbstractContainerBox extends ccx implements aqo {
    protected boolean largeBox;
    private long offset;
    aqp parent;
    protected String type;

    public AbstractContainerBox(String str) {
        this.type = str;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        writeContainer(writableByteChannel);
    }

    /* Access modifiers changed, original: protected */
    public ByteBuffer getHeader() {
        ByteBuffer wrap;
        byte[] bArr;
        if (this.largeBox || getSize() >= 4294967296L) {
            bArr = new byte[16];
            bArr[3] = (byte) 1;
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            aqk.a(wrap, getSize());
        } else {
            bArr = new byte[8];
            bArr[4] = this.type.getBytes()[0];
            bArr[5] = this.type.getBytes()[1];
            bArr[6] = this.type.getBytes()[2];
            bArr[7] = this.type.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            aqk.b(wrap, getSize());
        }
        wrap.rewind();
        return wrap;
    }

    public long getOffset() {
        return this.offset;
    }

    public aqp getParent() {
        return this.parent;
    }

    public long getSize() {
        long containerSize = getContainerSize();
        int i = (this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public String getType() {
        return this.type;
    }

    public void initContainer(ccy ccy, long j, aqf aqf) {
        this.dataSource = ccy;
        this.parsePosition = ccy.b();
        long j2 = this.parsePosition;
        int i = (this.largeBox || 8 + j >= 4294967296L) ? 16 : 8;
        this.startPosition = j2 - ((long) i);
        ccy.a(ccy.b() + j);
        this.endPosition = ccy.b();
        this.boxParser = aqf;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        this.offset = ccy.b() - ((long) byteBuffer.remaining());
        this.largeBox = byteBuffer.remaining() == 16;
        initContainer(ccy, j, aqf);
    }

    public void setParent(aqp aqp) {
        this.parent = aqp;
    }
}

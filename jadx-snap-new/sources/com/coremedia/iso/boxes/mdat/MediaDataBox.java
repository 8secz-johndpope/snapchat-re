package com.coremedia.iso.boxes.mdat;

import defpackage.aqf;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

public final class MediaDataBox implements aqo {
    private static Logger LOG = Logger.getLogger(MediaDataBox.class.getName());
    public static final String TYPE = "mdat";
    private ccy dataSource;
    boolean largeBox = false;
    private long offset;
    aqp parent;
    private long size;

    private static void transfer(ccy ccy, long j, long j2, WritableByteChannel writableByteChannel) {
        long j3 = 0;
        while (j3 < j2) {
            j3 += ccy.a(j + j3, Math.min(67076096, j2 - j3), writableByteChannel);
        }
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        transfer(this.dataSource, this.offset, this.size, writableByteChannel);
    }

    public final long getOffset() {
        return this.offset;
    }

    public final aqp getParent() {
        return this.parent;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getType() {
        return TYPE;
    }

    public final void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        this.offset = ccy.b() - ((long) byteBuffer.remaining());
        this.dataSource = ccy;
        this.size = ((long) byteBuffer.remaining()) + j;
        ccy.a(ccy.b() + j);
    }

    public final void setParent(aqp aqp) {
        this.parent = aqp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaDataBox{size=");
        stringBuilder.append(this.size);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

package com.coremedia.iso.boxes;

import defpackage.aqf;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

public class FreeBox implements aqo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private aqp parent;
    List<aqo> replacers;

    public FreeBox() {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int i) {
        this.replacers = new LinkedList();
        this.data = ByteBuffer.allocate(i);
    }

    public void addAndReplace(aqo aqo) {
        this.data.position(ces.a(aqo.getSize()));
        this.data = this.data.slice();
        this.replacers.add(aqo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeBox freeBox = (FreeBox) obj;
        return getData() == null ? freeBox.getData() == null : getData().equals(freeBox.getData());
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        for (aqo box : this.replacers) {
            box.getBox(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aqk.b(allocate, (long) (this.data.limit() + 8));
        allocate.put(TYPE.getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }

    public ByteBuffer getData() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null ? (ByteBuffer) byteBuffer.duplicate().rewind() : null;
    }

    public long getOffset() {
        return this.offset;
    }

    public aqp getParent() {
        return this.parent;
    }

    public long getSize() {
        long j = 8;
        for (aqo size : this.replacers) {
            j += size.getSize();
        }
        return j + ((long) this.data.limit());
    }

    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.data;
        return byteBuffer != null ? byteBuffer.hashCode() : 0;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        this.offset = ccy.b() - ((long) byteBuffer.remaining());
        if (j > 1048576) {
            this.data = ccy.a(ccy.b(), j);
            ccy.a(ccy.b() + j);
            return;
        }
        this.data = ByteBuffer.allocate(ces.a(j));
        ccy.a(this.data);
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setParent(aqp aqp) {
        this.parent = aqp;
    }
}

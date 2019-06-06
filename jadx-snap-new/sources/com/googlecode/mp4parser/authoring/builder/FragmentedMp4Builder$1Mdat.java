package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.mdat.MediaDataBox;
import defpackage.aqf;
import defpackage.aqh;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.cdd;
import defpackage.cde;
import defpackage.cdf;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;

public class FragmentedMp4Builder$1Mdat implements aqo {
    aqp parent;
    long size_ = -1;
    final /* synthetic */ cdf this$0;
    private final /* synthetic */ long val$endSample;
    private final /* synthetic */ int val$i;
    private final /* synthetic */ long val$startSample;
    private final /* synthetic */ cde val$track;

    FragmentedMp4Builder$1Mdat(cdf cdf, long j, long j2, cde cde, int i) {
        this.this$0 = cdf;
        this.val$startSample = j;
        this.val$endSample = j2;
        this.val$track = cde;
        this.val$i = i;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        aqk.b(allocate, (long) ces.a(getSize()));
        allocate.put(aqh.a(getType()));
        allocate.rewind();
        writableByteChannel.write(allocate);
        Iterator it = cdf.a(this.val$startSample, this.val$endSample, this.val$track).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public long getOffset() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }

    public aqp getParent() {
        return this.parent;
    }

    public long getSize() {
        long j = this.size_;
        if (j != -1) {
            return j;
        }
        j = 8;
        for (cdd a : cdf.a(this.val$startSample, this.val$endSample, this.val$track)) {
            j += a.a();
        }
        this.size_ = j;
        return j;
    }

    public String getType() {
        return MediaDataBox.TYPE;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
    }

    public void setParent(aqp aqp) {
        this.parent = aqp;
    }
}

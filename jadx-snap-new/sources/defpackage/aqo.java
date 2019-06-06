package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: aqo */
public interface aqo {
    void getBox(WritableByteChannel writableByteChannel);

    aqp getParent();

    long getSize();

    String getType();

    void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf);

    void setParent(aqp aqp);
}

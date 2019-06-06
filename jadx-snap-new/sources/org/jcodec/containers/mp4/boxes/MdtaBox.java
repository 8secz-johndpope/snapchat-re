package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.io.NIOUtils;

public class MdtaBox extends Box {
    private static final String FOURCC = "mdta";
    private String key;

    public MdtaBox(String str) {
        this(Header.createHeader(FOURCC, 0));
        this.key = str;
    }

    public MdtaBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return FOURCC;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(this.key.getBytes());
    }

    public int estimateSize() {
        return this.key.getBytes().length;
    }

    public String getKey() {
        return this.key;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.key = new String(NIOUtils.toArray(NIOUtils.readBuf(byteBuffer)));
    }
}

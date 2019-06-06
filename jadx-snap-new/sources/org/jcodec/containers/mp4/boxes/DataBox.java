package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.io.NIOUtils;

public class DataBox extends Box {
    private static final String FOURCC = "data";
    private byte[] data;
    private int locale;
    private int type;

    public DataBox(int i, int i2, byte[] bArr) {
        this(Header.createHeader("data", 0));
        this.type = i;
        this.locale = i2;
        this.data = bArr;
    }

    public DataBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "data";
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.type);
        byteBuffer.putInt(this.locale);
        byteBuffer.put(this.data);
    }

    public int estimateSize() {
        return this.data.length + 16;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLocale() {
        return this.locale;
    }

    public int getType() {
        return this.type;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.type = byteBuffer.getInt();
        this.locale = byteBuffer.getInt();
        this.data = NIOUtils.toArray(NIOUtils.readBuf(byteBuffer));
    }
}

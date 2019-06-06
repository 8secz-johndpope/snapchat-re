package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.FreeBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jcodec.common.Assert;
import org.jcodec.common.StringUtils;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.tools.ToJSON;
import org.jcodec.containers.mp4.IBoxFactory;
import org.jcodec.platform.Platform;

public abstract class Box {
    public static final int MAX_BOX_SIZE = 134217728;
    public Header header;

    public static class LeafBox extends Box {
        ByteBuffer data;

        public LeafBox(Header header) {
            super(header);
        }

        /* Access modifiers changed, original: protected */
        public void doWrite(ByteBuffer byteBuffer) {
            NIOUtils.write(byteBuffer, this.data);
        }

        public int estimateSize() {
            return this.data.remaining() + Header.estimateHeaderSize(this.data.remaining());
        }

        public ByteBuffer getData() {
            return this.data.duplicate();
        }

        public void parse(ByteBuffer byteBuffer) {
            this.data = NIOUtils.read(byteBuffer, (int) this.header.getBodySize());
        }
    }

    public Box(Header header) {
        this.header = header;
    }

    public static <T extends Box> T asBox(Class<T> cls, Box box) {
        try {
            Box box2 = (Box) Platform.newInstance(cls, new Object[]{box.getHeader()});
            ByteBuffer allocate = ByteBuffer.allocate((int) box.getHeader().getBodySize());
            box.doWrite(allocate);
            allocate.flip();
            box2.parse(allocate);
            return box2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static LeafBox createLeafBox(Header header, ByteBuffer byteBuffer) {
        LeafBox leafBox = new LeafBox(header);
        leafBox.data = byteBuffer;
        return leafBox;
    }

    public static Box parseBox(ByteBuffer byteBuffer, Header header, IBoxFactory iBoxFactory) {
        Box newBox = iBoxFactory.newBox(header);
        if (header.getBodySize() >= 134217728) {
            return new LeafBox(Header.createHeader(FreeBox.TYPE, 8));
        }
        newBox.parse(byteBuffer);
        return newBox;
    }

    public static String[] path(String str) {
        return StringUtils.splitC(str, '.');
    }

    public static Box terminatorAtom() {
        return createLeafBox(new Header(Platform.stringFromBytes(new byte[4])), ByteBuffer.allocate(0));
    }

    public abstract void doWrite(ByteBuffer byteBuffer);

    /* Access modifiers changed, original: protected */
    public void dump(StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder("{\"tag\":\"");
        stringBuilder2.append(this.header.getFourcc());
        stringBuilder2.append("\",");
        stringBuilder.append(stringBuilder2.toString());
        ToJSON.fieldsToJSON(this, stringBuilder, (String[]) new ArrayList(0).toArray(new String[0]));
        stringBuilder.append("}");
    }

    public abstract int estimateSize();

    public String getFourcc() {
        return this.header.getFourcc();
    }

    public Header getHeader() {
        return this.header;
    }

    public abstract void parse(ByteBuffer byteBuffer);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        dump(stringBuilder);
        return stringBuilder.toString();
    }

    public void write(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer, 8);
        doWrite(byteBuffer);
        this.header.setBodySize((byteBuffer.position() - duplicate.position()) - 8);
        Assert.assertEquals(this.header.headerSize(), 8);
        this.header.write(duplicate);
    }
}

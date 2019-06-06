package org.jcodec.codecs.h264.mp4;

import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Header;

public class AvcCBox extends Box {
    private int level;
    private int nalLengthSize;
    private List<ByteBuffer> ppsList = new ArrayList();
    private int profile;
    private int profileCompat;
    private List<ByteBuffer> spsList = new ArrayList();

    public AvcCBox(Header header) {
        super(header);
    }

    public static AvcCBox createAvcCBox(int i, int i2, int i3, int i4, List<ByteBuffer> list, List<ByteBuffer> list2) {
        AvcCBox avcCBox = new AvcCBox(new Header(fourcc()));
        avcCBox.profile = i;
        avcCBox.profileCompat = i2;
        avcCBox.level = i3;
        avcCBox.nalLengthSize = i4;
        avcCBox.spsList = list;
        avcCBox.ppsList = list2;
        return avcCBox;
    }

    public static AvcCBox createEmpty() {
        return new AvcCBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return AvcConfigurationBox.TYPE;
    }

    public static AvcCBox parseAvcCBox(ByteBuffer byteBuffer) {
        AvcCBox avcCBox = new AvcCBox(new Header(fourcc()));
        avcCBox.parse(byteBuffer);
        return avcCBox;
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) this.profile);
        byteBuffer.put((byte) this.profileCompat);
        byteBuffer.put((byte) this.level);
        byteBuffer.put((byte) -1);
        byteBuffer.put((byte) (this.spsList.size() | 224));
        for (ByteBuffer byteBuffer2 : this.spsList) {
            byteBuffer.putShort((short) (byteBuffer2.remaining() + 1));
            byteBuffer.put((byte) 103);
            NIOUtils.write(byteBuffer, byteBuffer2);
        }
        byteBuffer.put((byte) this.ppsList.size());
        for (ByteBuffer byteBuffer22 : this.ppsList) {
            byteBuffer.putShort((short) ((byte) (byteBuffer22.remaining() + 1)));
            byteBuffer.put((byte) 104);
            NIOUtils.write(byteBuffer, byteBuffer22);
        }
    }

    public int estimateSize() {
        int i = 17;
        for (ByteBuffer remaining : this.spsList) {
            i += remaining.remaining() + 3;
        }
        for (ByteBuffer remaining2 : this.ppsList) {
            i += remaining2.remaining() + 3;
        }
        return i;
    }

    public int getLevel() {
        return this.level;
    }

    public int getNalLengthSize() {
        return this.nalLengthSize;
    }

    public List<ByteBuffer> getPpsList() {
        return this.ppsList;
    }

    public int getProfile() {
        return this.profile;
    }

    public int getProfileCompat() {
        return this.profileCompat;
    }

    public List<ByteBuffer> getSpsList() {
        return this.spsList;
    }

    public void parse(ByteBuffer byteBuffer) {
        NIOUtils.skip(byteBuffer, 1);
        this.profile = byteBuffer.get() & 255;
        this.profileCompat = byteBuffer.get() & 255;
        this.level = byteBuffer.get() & 255;
        this.nalLengthSize = ((byteBuffer.get() & 255) & 3) + 1;
        int i = byteBuffer.get() & 31;
        for (int i2 = 0; i2 < i; i2++) {
            short s = byteBuffer.getShort();
            Assert.assertEquals(39, byteBuffer.get() & 63);
            this.spsList.add(NIOUtils.read(byteBuffer, s - 1));
        }
        i = byteBuffer.get() & 255;
        for (int i3 = 0; i3 < i; i3++) {
            short s2 = byteBuffer.getShort();
            Assert.assertEquals(40, byteBuffer.get() & 63);
            this.ppsList.add(NIOUtils.read(byteBuffer, s2 - 1));
        }
    }
}

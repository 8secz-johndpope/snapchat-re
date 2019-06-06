package org.jcodec.codecs.mpeg4.mp4;

import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jcodec.codecs.aac.AACUtils;
import org.jcodec.codecs.aac.ADTSParser;
import org.jcodec.codecs.mpeg4.es.DecoderConfig;
import org.jcodec.codecs.mpeg4.es.DecoderSpecific;
import org.jcodec.codecs.mpeg4.es.Descriptor;
import org.jcodec.codecs.mpeg4.es.DescriptorFactory;
import org.jcodec.codecs.mpeg4.es.ES;
import org.jcodec.codecs.mpeg4.es.NodeDescriptor;
import org.jcodec.codecs.mpeg4.es.SL;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public class EsdsBox extends FullBox {
    private int avgBitrate;
    private int bufSize;
    private int maxBitrate;
    private int objectType;
    private ByteBuffer streamInfo;
    private int trackId;

    public EsdsBox(Header header) {
        super(header);
    }

    public static EsdsBox createEsdsBox(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        EsdsBox esdsBox = new EsdsBox(new Header(fourcc()));
        esdsBox.objectType = i;
        esdsBox.bufSize = i2;
        esdsBox.maxBitrate = i3;
        esdsBox.avgBitrate = i4;
        esdsBox.trackId = i5;
        esdsBox.streamInfo = byteBuffer;
        return esdsBox;
    }

    public static String fourcc() {
        return ESDescriptorBox.TYPE;
    }

    public static EsdsBox fromADTS(ADTSParser.Header header) {
        return createEsdsBox(AACUtils.adtsToStreamInfo(header), header.getObjectType() << 5, 0, 210750, 133350, 2);
    }

    public static EsdsBox newEsdsBox() {
        return new EsdsBox(new Header(fourcc()));
    }

    public void doWrite(ByteBuffer byteBuffer) {
        ES es;
        super.doWrite(byteBuffer);
        ByteBuffer byteBuffer2 = this.streamInfo;
        ArrayList arrayList;
        if (byteBuffer2 == null || byteBuffer2.remaining() <= 0) {
            arrayList = new ArrayList();
            arrayList.add(new DecoderConfig(this.objectType, this.bufSize, this.maxBitrate, this.avgBitrate, new ArrayList()));
            arrayList.add(new SL());
            es = new ES(this.trackId, arrayList);
        } else {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new DecoderSpecific(this.streamInfo));
            arrayList.add(new DecoderConfig(this.objectType, this.bufSize, this.maxBitrate, this.avgBitrate, arrayList2));
            arrayList.add(new SL());
            es = new ES(this.trackId, arrayList);
        }
        es.write(byteBuffer);
    }

    public int estimateSize() {
        return 64;
    }

    public int getAvgBitrate() {
        return this.avgBitrate;
    }

    public int getBufSize() {
        return this.bufSize;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getObjectType() {
        return this.objectType;
    }

    public ByteBuffer getStreamInfo() {
        return this.streamInfo;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        ES es = (ES) Descriptor.read(byteBuffer, DescriptorFactory.getInstance());
        this.trackId = es.getTrackId();
        DecoderConfig decoderConfig = (DecoderConfig) NodeDescriptor.find(es, DecoderConfig.class, DecoderConfig.tag());
        this.objectType = decoderConfig.getObjectType();
        this.bufSize = decoderConfig.getBufSize();
        this.maxBitrate = decoderConfig.getMaxBitrate();
        this.avgBitrate = decoderConfig.getAvgBitrate();
        this.streamInfo = ((DecoderSpecific) NodeDescriptor.find(decoderConfig, DecoderSpecific.class, DecoderSpecific.tag())).getData();
    }
}

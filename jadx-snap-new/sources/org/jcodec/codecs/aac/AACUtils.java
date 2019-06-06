package org.jcodec.codecs.aac;

import java.nio.ByteBuffer;
import org.jcodec.codecs.aac.ADTSParser.Header;
import org.jcodec.common.io.BitWriter;
import org.jcodec.common.model.ChannelLabel;

public class AACUtils {
    private static ChannelLabel[][] AAC_DEFAULT_CONFIGS;

    static {
        r1 = new ChannelLabel[8][];
        r1[1] = new ChannelLabel[]{ChannelLabel.MONO};
        r1[2] = new ChannelLabel[]{ChannelLabel.STEREO_LEFT, ChannelLabel.STEREO_RIGHT};
        r1[3] = new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT};
        r1[4] = new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_CENTER};
        r1[5] = new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT};
        r1[6] = new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.LFE};
        r1[7] = new ChannelLabel[]{ChannelLabel.CENTER, ChannelLabel.FRONT_LEFT, ChannelLabel.FRONT_RIGHT, ChannelLabel.SIDE_LEFT, ChannelLabel.SIDE_RIGHT, ChannelLabel.REAR_LEFT, ChannelLabel.REAR_RIGHT, ChannelLabel.LFE};
        AAC_DEFAULT_CONFIGS = r1;
    }

    public static ByteBuffer adtsToStreamInfo(Header header) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        BitWriter bitWriter = new BitWriter(allocate);
        bitWriter.writeNBit(header.getObjectType(), 5);
        bitWriter.writeNBit(header.getSamplingIndex(), 4);
        bitWriter.writeNBit(header.getChanConfig(), 4);
        bitWriter.flush();
        allocate.clear();
        return allocate;
    }
}

package org.jcodec.containers.mp4;

import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import org.jcodec.containers.mp4.boxes.Box.LeafBox;
import org.jcodec.containers.mp4.boxes.ChannelBox;
import org.jcodec.containers.mp4.boxes.WaveExtension;

public class AudioBoxes extends Boxes {
    public AudioBoxes() {
        this.mappings.put(WaveExtension.fourcc(), WaveExtension.class);
        this.mappings.put(ChannelBox.fourcc(), ChannelBox.class);
        this.mappings.put(ESDescriptorBox.TYPE, LeafBox.class);
    }
}

package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.apple.AppleWaveBox;

public class WaveExtension extends NodeBox {
    public WaveExtension(Header header) {
        super(header);
    }

    public static String fourcc() {
        return AppleWaveBox.TYPE;
    }
}

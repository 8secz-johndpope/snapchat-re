package org.jcodec.containers.mp4;

import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Box.LeafBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.TimecodeSampleEntry;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;
import org.jcodec.containers.mp4.boxes.WaveExtension;
import org.jcodec.platform.Platform;

public class BoxFactory implements IBoxFactory {
    private static IBoxFactory audio = new BoxFactory(new AudioBoxes());
    private static IBoxFactory data = new BoxFactory(new DataBoxes());
    private static IBoxFactory instance = new BoxFactory(new DefaultBoxes());
    private static IBoxFactory sample = new BoxFactory(new SampleBoxes());
    private static IBoxFactory timecode = new BoxFactory(new TimecodeBoxes());
    private static IBoxFactory video = new BoxFactory(new VideoBoxes());
    private static IBoxFactory waveext = new BoxFactory(new WaveExtBoxes());
    private Boxes boxes;

    public BoxFactory(Boxes boxes) {
        this.boxes = boxes;
    }

    public static IBoxFactory getDefault() {
        return instance;
    }

    public Box newBox(Header header) {
        Class toClass = this.boxes.toClass(header.getFourcc());
        if (toClass == null) {
            return new LeafBox(header);
        }
        Box box = (Box) Platform.newInstance(toClass, new Object[]{header});
        if (box instanceof NodeBox) {
            IBoxFactory iBoxFactory;
            NodeBox nodeBox = (NodeBox) box;
            if (nodeBox instanceof SampleDescriptionBox) {
                iBoxFactory = sample;
            } else if (nodeBox instanceof VideoSampleEntry) {
                iBoxFactory = video;
            } else if (nodeBox instanceof AudioSampleEntry) {
                iBoxFactory = audio;
            } else if (nodeBox instanceof TimecodeSampleEntry) {
                iBoxFactory = timecode;
            } else if (nodeBox instanceof DataRefBox) {
                iBoxFactory = data;
            } else if (nodeBox instanceof WaveExtension) {
                iBoxFactory = waveext;
            } else {
                nodeBox.setFactory(this);
            }
            nodeBox.setFactory(iBoxFactory);
        }
        return box;
    }
}

package com.snap.spectacles.lib.main.newport;

import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.NodeBox;

public final class Proj extends NodeBox {
    public Proj() {
        super(new Header("proj"));
    }
}

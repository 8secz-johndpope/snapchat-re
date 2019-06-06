package com.snap.spectacles.lib.main.newport;

import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.NodeBox;

public final class Sv3DBox extends NodeBox {
    public Sv3DBox() {
        super(new Header("sv3d"));
    }
}

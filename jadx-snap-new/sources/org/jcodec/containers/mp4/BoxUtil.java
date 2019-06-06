package org.jcodec.containers.mp4;

import com.coremedia.iso.boxes.FreeBox;
import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Box.LeafBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.NodeBox;

public class BoxUtil {
    public static boolean containsBox(NodeBox nodeBox, String str) {
        return NodeBox.findFirstPath(nodeBox, Box.class, new String[]{str}) != null;
    }

    public static Box parseBox(ByteBuffer byteBuffer, Header header, IBoxFactory iBoxFactory) {
        Box newBox = iBoxFactory.newBox(header);
        if (header.getBodySize() >= 134217728) {
            return new LeafBox(Header.createHeader(FreeBox.TYPE, 8));
        }
        newBox.parse(byteBuffer);
        return newBox;
    }
}

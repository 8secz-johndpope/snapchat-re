package org.jcodec.containers.mp4.boxes;

import org.jcodec.containers.mp4.IBoxFactory;

public class UdtaBox extends NodeBox {
    private static final String FOURCC = "udta";

    public UdtaBox() {
        this(Header.createHeader(fourcc(), 0));
    }

    public UdtaBox(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "udta";
    }

    public MetaBox meta() {
        return (MetaBox) NodeBox.findFirst(this, MetaBox.class, MetaBox.fourcc());
    }

    public void setFactory(final IBoxFactory iBoxFactory) {
        this.factory = new IBoxFactory() {
            public Box newBox(Header header) {
                if (!header.getFourcc().equals(MetaBox.fourcc())) {
                    return iBoxFactory.newBox(header);
                }
                UdtaMetaBox udtaMetaBox = new UdtaMetaBox(header);
                udtaMetaBox.setFactory(iBoxFactory);
                return udtaMetaBox;
            }
        };
    }
}

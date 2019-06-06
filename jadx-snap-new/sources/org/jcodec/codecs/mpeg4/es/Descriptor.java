package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil2;
import org.jcodec.common.io.NIOUtils;

public abstract class Descriptor {
    private int _tag;
    protected IDescriptorFactory factory;
    private int size;

    public Descriptor(int i, int i2) {
        this._tag = i;
        this.size = i2;
    }

    public static Descriptor read(ByteBuffer byteBuffer, IDescriptorFactory iDescriptorFactory) {
        if (byteBuffer.remaining() < 2) {
            return null;
        }
        int i = byteBuffer.get() & 255;
        int readBER32 = JCodecUtil2.readBER32(byteBuffer);
        try {
            Descriptor descriptor = (Descriptor) iDescriptorFactory.byTag(i).getDeclaredMethod("parse", new Class[]{ByteBuffer.class, IDescriptorFactory.class}).invoke(null, new Object[]{NIOUtils.read(byteBuffer, readBER32), iDescriptorFactory});
            descriptor.setFactory(iDescriptorFactory);
            return descriptor;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void setFactory(IDescriptorFactory iDescriptorFactory) {
        this.factory = iDescriptorFactory;
    }

    public abstract void doWrite(ByteBuffer byteBuffer);

    /* Access modifiers changed, original: 0000 */
    public int getTag() {
        return this._tag;
    }

    public void write(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer, 5);
        doWrite(byteBuffer);
        int position = (byteBuffer.position() - duplicate.position()) - 5;
        duplicate.put((byte) this._tag);
        JCodecUtil2.writeBER32(duplicate, position);
    }
}

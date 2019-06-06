package org.jcodec.codecs.mpeg4.es;

import java.nio.ByteBuffer;
import java.util.Collection;

public class NodeDescriptor extends Descriptor {
    private Collection<Descriptor> children;

    public NodeDescriptor(int i, Collection<Descriptor> collection) {
        super(i, 0);
        this.children = collection;
    }

    public static <T> T find(Descriptor descriptor, Class<T> cls, int i) {
        if (descriptor.getTag() == i) {
            return descriptor;
        }
        if (descriptor instanceof NodeDescriptor) {
            for (Descriptor find : ((NodeDescriptor) descriptor).getChildren()) {
                Object find2 = find(find, cls, i);
                if (find2 != null) {
                    return find2;
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        for (Descriptor write : this.children) {
            write.write(byteBuffer);
        }
    }

    public Collection<Descriptor> getChildren() {
        return this.children;
    }
}

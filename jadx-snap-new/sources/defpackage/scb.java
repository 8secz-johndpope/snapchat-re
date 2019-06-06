package defpackage;

import com.google.common.base.Preconditions;
import defpackage.jf.b;
import java.nio.ByteBuffer;

/* renamed from: scb */
public final class scb extends b<ByteBuffer> implements sca {
    private final int a;

    public scb(int i, int i2) {
        super(i);
        this.a = i2;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean a;
        akcr.b(byteBuffer, "element");
        synchronized (this) {
            Preconditions.checkArgument(byteBuffer.capacity() >= this.a, "Invalid element to be released", new Object[0]);
            a = super.a(byteBuffer);
        }
        return a;
    }

    private ByteBuffer b() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = (ByteBuffer) super.a();
        }
        if (byteBuffer != null) {
            return byteBuffer;
        }
        Object allocate = ByteBuffer.allocate(this.a);
        akcr.a(allocate, "ByteBuffer.allocate(this…apacityForEachByteBuffer)");
        return allocate;
    }

    public final /* synthetic */ Object a() {
        return b();
    }
}

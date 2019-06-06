package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bmy */
public class bmy extends bmu {
    public final bmv b = new bmv();
    public ByteBuffer c;
    public long d;
    public final int e;

    public bmy(int i) {
        this.e = i;
    }

    private ByteBuffer d(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        i2 = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder stringBuilder = new StringBuilder("Buffer too small (");
        stringBuilder.append(i2);
        stringBuilder.append(" < ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void c(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = d(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.c.position();
        i += position;
        if (capacity < i) {
            ByteBuffer d = d(i);
            if (position > 0) {
                this.c.position(0);
                this.c.limit(position);
                d.put(this.c);
            }
            this.c = d;
        }
    }

    public final boolean e() {
        return b(AudioPlayer.INFINITY_LOOP_COUNT);
    }

    public final void f() {
        this.c.flip();
    }
}

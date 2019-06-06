package defpackage;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: abpk */
public final class abpk extends InputStream {
    private final ByteBuffer a;

    public abpk(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
    }

    public final int available() {
        return this.a.remaining();
    }

    public final void close() {
    }

    public final synchronized void mark(int i) {
        this.a.mark();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        return this.a.hasRemaining() ? this.a.get() & 255 : -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (!this.a.hasRemaining()) {
            return -1;
        } else {
            i2 = Math.min(i2, this.a.remaining());
            this.a.get(bArr, i, i2);
            return i2;
        }
    }

    public final synchronized void reset() {
        this.a.reset();
    }

    public final long skip(long j) {
        Preconditions.checkArgument(j >= 0, "Bytes to skip should not be negative");
        j = Math.min((long) this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j));
        return j;
    }
}

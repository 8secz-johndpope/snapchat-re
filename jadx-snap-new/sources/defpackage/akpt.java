package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akpt */
final class akpt implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private akpt(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new akpt(inputStream);
    }

    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    public final boolean isOpen() {
        return this.b.get();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.a.read(bArr);
        if (read2 > 0) {
            byteBuffer.put(bArr, 0, read2);
        }
        return read2;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sce */
public final class sce implements sca {
    private final AtomicInteger a = new AtomicInteger(0);
    private final sca b;
    private final String c;

    public sce(sca sca, String str) {
        akcr.b(sca, "delegate");
        akcr.b(str, "trackingId");
        this.b = sca;
        this.c = str;
    }

    public final /* synthetic */ Object a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.b.a();
        if (byteBuffer == null) {
            return null;
        }
        this.a.incrementAndGet();
        return byteBuffer;
    }

    public final /* synthetic */ boolean a(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        akcr.b(byteBuffer, "instance");
        this.a.decrementAndGet();
        return this.b.a(byteBuffer);
    }
}

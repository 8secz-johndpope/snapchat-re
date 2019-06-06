package defpackage;

import com.google.common.net.MediaType;
import java.io.InputStream;

/* renamed from: sbl */
public class sbl implements sai {
    private final MediaType a;
    private final long b;
    private final long c;
    private final sbd d;

    public sbl(MediaType mediaType, long j, long j2, sbd sbd) {
        this.a = mediaType;
        this.b = j;
        this.c = j2;
        this.d = sbd;
    }

    public sbl(MediaType mediaType, long j, sbd sbd) {
        this.a = mediaType;
        this.b = j;
        this.c = j;
        this.d = sbd;
    }

    public final MediaType b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public synchronized void close() {
        aklc.a(this.d);
    }

    public final long d() {
        return this.c;
    }

    public final synchronized InputStream e() {
        return this.d.a();
    }
}

package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: apn */
public final class apn extends InputStream {
    private static final Queue<apn> b = aps.a(0);
    public IOException a;
    private InputStream c;

    apn() {
    }

    public static apn a(InputStream inputStream) {
        apn apn;
        synchronized (b) {
            apn = (apn) b.poll();
        }
        if (apn == null) {
            apn = new apn();
        }
        apn.c = inputStream;
        return apn;
    }

    public final void a() {
        this.a = null;
        this.c = null;
        synchronized (b) {
            b.offer(this);
        }
    }

    public final int available() {
        return this.c.available();
    }

    public final void close() {
        this.c.close();
    }

    public final void mark(int i) {
        this.c.mark(i);
    }

    public final boolean markSupported() {
        return this.c.markSupported();
    }

    public final int read() {
        try {
            return this.c.read();
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.c.read(bArr);
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.c.read(bArr, i, i2);
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    public final synchronized void reset() {
        this.c.reset();
    }

    public final long skip(long j) {
        try {
            return this.c.skip(j);
        } catch (IOException e) {
            this.a = e;
            return 0;
        }
    }
}

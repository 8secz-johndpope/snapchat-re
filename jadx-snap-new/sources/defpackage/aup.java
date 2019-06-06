package defpackage;

import java.io.InputStream;

/* renamed from: aup */
public final class aup extends InputStream {
    private auo a;
    private int b = 0;
    private int c = 0;

    public aup(auo auo) {
        auh.a(auo.d() ^ 1);
        this.a = (auo) auh.a((Object) auo);
    }

    public final int available() {
        return this.a.a() - this.b;
    }

    public final void mark(int i) {
        this.c = this.b;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        auo auo = this.a;
        this.b++;
        return auo.b() & 255;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder stringBuilder = new StringBuilder("length=");
            stringBuilder.append(bArr.length);
            stringBuilder.append("; regionStart=");
            stringBuilder.append(i);
            stringBuilder.append("; regionLength=");
            stringBuilder.append(i2);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        available = Math.min(available, i2);
        this.b += available;
        return available;
    }

    public final void reset() {
        this.b = this.c;
    }

    public final long skip(long j) {
        auh.a(j >= 0);
        int min = Math.min((int) j, available());
        this.b += min;
        return (long) min;
    }
}

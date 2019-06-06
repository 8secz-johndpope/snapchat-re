package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: zp */
public final class zp extends FilterInputStream {
    private static final byte[] a = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    private final byte b;
    private int c;

    public zp(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(i)));
        } else {
            this.b = (byte) i;
        }
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i = this.c;
        i = (i < 2 || i > 31) ? super.read() : i == 31 ? this.b : a[i - 2] & 255;
        if (i != -1) {
            this.c++;
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        int i3 = this.c;
        if (i3 > 31) {
            read = super.read(bArr, i, i2);
        } else if (i3 == 31) {
            bArr[i] = this.b;
            read = 1;
        } else if (i3 < 2) {
            read = super.read(bArr, i, 2 - i3);
        } else {
            i2 = Math.min(31 - i3, i2);
            System.arraycopy(a, this.c - 2, bArr, i, i2);
            read = i2;
        }
        if (read > 0) {
            this.c += read;
        }
        return read;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        j = super.skip(j);
        if (j > 0) {
            this.c = (int) (((long) this.c) + j);
        }
        return j;
    }
}

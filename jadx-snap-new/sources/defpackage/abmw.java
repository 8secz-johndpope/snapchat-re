package defpackage;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* renamed from: abmw */
public final class abmw extends FilterInputStream {
    private Cipher a;
    private InputStream b;
    private byte[] c;
    private boolean d;
    private byte[] e;
    private int f;
    private int g;

    public abmw(InputStream inputStream, Cipher cipher) {
        this(inputStream, cipher, inputStream instanceof FileInputStream ? 128 : 16384);
    }

    private abmw(InputStream inputStream, Cipher cipher, int i) {
        super(inputStream);
        this.d = false;
        this.f = 0;
        this.g = 0;
        this.b = inputStream;
        this.a = cipher;
        this.c = new byte[i];
        this.e = new byte[(i + 4096)];
    }

    private int a() {
        if (this.d) {
            return -1;
        }
        int read = this.b.read(this.c);
        if (read == -1) {
            this.d = true;
            try {
                this.e = this.a.doFinal();
                byte[] bArr = this.e;
                if (bArr == null) {
                    return -1;
                }
                this.f = 0;
                read = bArr.length;
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
                return -1;
            }
        }
        try {
            this.f = 0;
            int outputSize = this.a.getOutputSize(read);
            if (outputSize > this.e.length) {
                this.e = new byte[outputSize];
            }
            read = this.a.update(this.c, 0, read, this.e);
        } catch (IllegalStateException | ShortBufferException unused2) {
            this.g = 0;
        }
        this.g = read;
        return this.g;
    }

    public final int available() {
        return this.g - this.f;
    }

    public final void close() {
        this.b.close();
        try {
            if (!this.d) {
                this.a.doFinal();
            }
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
        }
        this.f = 0;
        this.g = 0;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        if (this.f >= this.g) {
            int i = 0;
            while (i == 0) {
                i = a();
            }
            if (i == -1) {
                return -1;
            }
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f >= this.g) {
            i3 = 0;
            while (i3 == 0) {
                i3 = a();
            }
            if (i3 == -1) {
                return -1;
            }
        }
        if (i2 <= 0) {
            return 0;
        }
        i3 = this.g - this.f;
        if (i2 >= i3) {
            i2 = i3;
        }
        if (bArr != null) {
            System.arraycopy(this.e, this.f, bArr, i, i2);
        }
        this.f += i2;
        return i2;
    }

    public final long skip(long j) {
        long j2 = (long) (this.g - this.f);
        if (j > j2) {
            j = j2;
        }
        if (j < 0) {
            return 0;
        }
        this.f = (int) (((long) this.f) + j);
        return j;
    }
}

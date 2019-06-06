package defpackage;

import java.io.OutputStream;
import org.opencv.imgproc.Imgproc;

/* renamed from: zl */
public final class zl extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private abd c;
    private int d;

    public zl(OutputStream outputStream, abd abd) {
        this(outputStream, abd, (byte) 0);
    }

    private zl(OutputStream outputStream, abd abd, byte b) {
        this.a = outputStream;
        this.c = abd;
        this.b = (byte[]) abd.a(Imgproc.FLOODFILL_FIXED_RANGE, byte[].class);
    }

    private void a() {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private void b() {
        if (this.d == this.b.length) {
            a();
        }
    }

    public final void close() {
        try {
            flush();
            Object obj = this.b;
            if (obj != null) {
                this.c.a(obj);
                this.b = null;
            }
        } finally {
            this.a.close();
        }
    }

    public final void flush() {
        a();
        this.a.flush();
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.d != 0 || i4 < this.b.length) {
                i4 = Math.min(i4, this.b.length - this.d);
                System.arraycopy(bArr, i5, this.b, this.d, i4);
                this.d += i4;
                i3 += i4;
                b();
            } else {
                this.a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}

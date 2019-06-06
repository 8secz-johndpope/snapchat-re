package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import org.opencv.imgproc.Imgproc;

/* renamed from: bnh */
public final class bnh implements bnl {
    private final byte[] a = new byte[4096];
    private final bxe b;
    private final long c;
    private long d;
    private byte[] e = new byte[Imgproc.FLOODFILL_FIXED_RANGE];
    private int f;
    private int g;

    public bnh(bxe bxe, long j, long j2) {
        this.b = bxe;
        this.d = j;
        this.c = j2;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private boolean a(int i, boolean z) {
        d(i);
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = a(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.f += i;
        this.g = Math.max(this.g, this.f);
        return true;
    }

    private int d(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        i2 = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, i2);
        f(i2);
        return i2;
    }

    private void d(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, bzo.a(bArr.length << 1, Imgproc.FLOODFILL_FIXED_RANGE + i2, i2 + 524288));
        }
    }

    private int e(int i) {
        i = Math.min(this.g, i);
        f(i);
        return i;
    }

    private void f(int i) {
        this.g -= i;
        this.f = 0;
        Object obj = this.e;
        int i2 = this.g;
        if (i2 < obj.length - 524288) {
            obj = new byte[(i2 + Imgproc.FLOODFILL_FIXED_RANGE)];
        }
        System.arraycopy(this.e, i, obj, 0, this.g);
        this.e = obj;
    }

    private void g(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    public final int a(int i) {
        int e = e(i);
        if (e == 0) {
            e = a(this.a, 0, Math.min(i, 4096), 0, true);
        }
        g(e);
        return e;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int d = d(bArr, i, i2);
        if (d == 0) {
            d = a(bArr, i, i2, 0, true);
        }
        g(d);
        return d;
    }

    public final void a() {
        this.f = 0;
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int d = d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = a(bArr, i, i2, d, z);
        }
        g(d);
        return d != -1;
    }

    public final long b() {
        return this.d + ((long) this.f);
    }

    public final void b(int i) {
        int e = e(i);
        while (e < i && e != -1) {
            e = a(this.a, -e, Math.min(i, e + 4096), e, false);
        }
        g(e);
    }

    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final long c() {
        return this.d;
    }

    public final void c(int i) {
        a(i, false);
    }

    public final void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final long d() {
        return this.c;
    }
}

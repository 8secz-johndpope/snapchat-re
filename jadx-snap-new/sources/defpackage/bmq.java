package defpackage;

import defpackage.bmf.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bmq */
public final class bmq implements bmf {
    boolean b;
    long c;
    private int d = -1;
    private int e = -1;
    private int f;
    private ByteBuffer g = a;
    private ByteBuffer h = a;
    private boolean i;
    private byte[] j = new byte[0];
    private byte[] k = new byte[0];
    private int l;
    private int m;
    private int n;
    private boolean o;

    private int a(long j) {
        return (int) ((j * ((long) this.e)) / 1000000);
    }

    private void a(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        if (i > 0) {
            this.o = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.n);
        int i2 = this.n - min;
        System.arraycopy(bArr, i - i2, this.k, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.k, i2, min);
    }

    private void a(byte[] bArr, int i) {
        a(i);
        this.g.put(bArr, 0, i);
        this.g.flip();
        this.h = this.g;
    }

    private int b(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i = this.f;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public final void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.h.hasRemaining()) {
            int i = this.l;
            if (i == 0) {
                int limit;
                i = byteBuffer.limit();
                byteBuffer.limit(Math.min(i, byteBuffer.position() + this.j.length));
                for (limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
                    if (Math.abs(byteBuffer.get(limit)) > 4) {
                        int i2 = this.f;
                        limit = ((limit / i2) * i2) + i2;
                        break;
                    }
                }
                limit = byteBuffer.position();
                if (limit == byteBuffer.position()) {
                    this.l = 1;
                } else {
                    byteBuffer.limit(limit);
                    a(byteBuffer.remaining());
                    this.g.put(byteBuffer);
                    this.g.flip();
                    this.h = this.g;
                }
            } else if (i == 1) {
                i = byteBuffer.limit();
                int b = b(byteBuffer);
                int position = b - byteBuffer.position();
                byte[] bArr = this.j;
                int length = bArr.length;
                int i3 = this.m;
                length -= i3;
                if (b >= i || position >= length) {
                    b = Math.min(position, length);
                    byteBuffer.limit(byteBuffer.position() + b);
                    byteBuffer.get(this.j, this.m, b);
                    this.m += b;
                    b = this.m;
                    byte[] bArr2 = this.j;
                    if (b == bArr2.length) {
                        if (this.o) {
                            a(bArr2, this.n);
                            this.c += (long) ((this.m - (this.n << 1)) / this.f);
                        } else {
                            this.c += (long) ((b - this.n) / this.f);
                        }
                        a(byteBuffer, this.j, this.m);
                        this.m = 0;
                        this.l = 2;
                    }
                } else {
                    a(bArr, i3);
                    this.m = 0;
                    this.l = 0;
                }
            } else if (i == 2) {
                i = byteBuffer.limit();
                int b2 = b(byteBuffer);
                byteBuffer.limit(b2);
                this.c += (long) (byteBuffer.remaining() / this.f);
                a(byteBuffer, this.k, this.n);
                if (b2 < i) {
                    a(this.k, this.n);
                    this.l = 0;
                }
            } else {
                throw new IllegalStateException();
            }
            byteBuffer.limit(i);
        }
    }

    public final boolean a() {
        return this.e != -1 && this.b;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new a(i, i2, i3);
        } else if (this.e == i && this.d == i2) {
            return false;
        } else {
            this.e = i;
            this.d = i2;
            this.f = i2 << 1;
            return true;
        }
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.e;
    }

    public final void e() {
        this.i = true;
        int i = this.m;
        if (i > 0) {
            a(this.j, i);
        }
        if (!this.o) {
            this.c += (long) (this.n / this.f);
        }
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.h;
        this.h = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.i && this.h == a;
    }

    public final void h() {
        if (a()) {
            int a = a(150000) * this.f;
            if (this.j.length != a) {
                this.j = new byte[a];
            }
            this.n = a(20000) * this.f;
            a = this.k.length;
            int i = this.n;
            if (a != i) {
                this.k = new byte[i];
            }
        }
        this.l = 0;
        this.h = a;
        this.i = false;
        this.c = 0;
        this.m = 0;
        this.o = false;
    }

    public final void i() {
        this.b = false;
        h();
        this.g = a;
        this.d = -1;
        this.e = -1;
        this.n = 0;
        this.j = new byte[0];
        this.k = new byte[0];
    }
}

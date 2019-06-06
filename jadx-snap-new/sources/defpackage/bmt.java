package defpackage;

import defpackage.bmf.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bmt */
final class bmt implements bmf {
    int b;
    int c;
    private boolean d;
    private int e = -1;
    private int f = -1;
    private int g;
    private ByteBuffer h = a;
    private ByteBuffer i = a;
    private byte[] j = new byte[0];
    private int k;
    private boolean l;

    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.g);
        this.g -= min;
        byteBuffer.position(position + min);
        if (this.g <= 0) {
            i -= min;
            position = (this.k + i) - this.j.length;
            if (this.h.capacity() < position) {
                this.h = ByteBuffer.allocateDirect(position).order(ByteOrder.nativeOrder());
            } else {
                this.h.clear();
            }
            min = bzo.a(position, 0, this.k);
            this.h.put(this.j, 0, min);
            position = bzo.a(position - min, 0, i);
            byteBuffer.limit(byteBuffer.position() + position);
            this.h.put(byteBuffer);
            byteBuffer.limit(limit);
            i -= position;
            this.k -= min;
            byte[] bArr = this.j;
            System.arraycopy(bArr, min, bArr, 0, this.k);
            byteBuffer.get(this.j, this.k, i);
            this.k += i;
            this.h.flip();
            this.i = this.h;
        }
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 2) {
            this.e = i2;
            this.f = i;
            i = this.c;
            this.j = new byte[((i * i2) << 1)];
            this.k = 0;
            int i4 = this.b;
            this.g = (i2 * i4) << 1;
            boolean z = this.d;
            boolean z2 = (i4 == 0 && i == 0) ? false : true;
            this.d = z2;
            return z != this.d;
        } else {
            throw new a(i, i2, i3);
        }
    }

    public final int b() {
        return this.e;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.f;
    }

    public final void e() {
        this.l = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.i;
        this.i = a;
        return byteBuffer;
    }

    public final boolean g() {
        return this.l && this.i == a;
    }

    public final void h() {
        this.i = a;
        this.l = false;
        this.g = 0;
        this.k = 0;
    }

    public final void i() {
        h();
        this.h = a;
        this.e = -1;
        this.f = -1;
        this.j = new byte[0];
    }
}

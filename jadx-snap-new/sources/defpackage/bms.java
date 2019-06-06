package defpackage;

import defpackage.bmf.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: bms */
public final class bms implements bmf {
    int b = -1;
    float c = 1.0f;
    float d = 1.0f;
    int e = -1;
    bmr f;
    long g;
    long h;
    private int i = -1;
    private int j = -1;
    private ByteBuffer k = a;
    private ShortBuffer l = this.k.asShortBuffer();
    private ByteBuffer m = a;
    private boolean n;

    public final void a(ByteBuffer byteBuffer) {
        int remaining;
        byo.b(this.f != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            remaining = byteBuffer.remaining();
            this.g += (long) remaining;
            bmr bmr = this.f;
            int remaining2 = asShortBuffer.remaining() / bmr.a;
            int i = (bmr.a * remaining2) << 1;
            bmr.f = bmr.a(bmr.f, bmr.g, remaining2);
            asShortBuffer.get(bmr.f, bmr.g * bmr.a, i / 2);
            bmr.g += remaining2;
            bmr.b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i2 = (this.f.i * this.i) << 1;
        if (i2 > 0) {
            if (this.k.capacity() < i2) {
                this.k = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.l = this.k.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            bmr bmr2 = this.f;
            ShortBuffer shortBuffer = this.l;
            remaining = Math.min(shortBuffer.remaining() / bmr2.a, bmr2.i);
            shortBuffer.put(bmr2.h, 0, bmr2.a * remaining);
            bmr2.i -= remaining;
            System.arraycopy(bmr2.h, remaining * bmr2.a, bmr2.h, 0, bmr2.i * bmr2.a);
            this.h += (long) i2;
            this.k.limit(i2);
            this.m = this.k;
        }
    }

    public final boolean a() {
        return this.b != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.e != this.b);
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 2) {
            i3 = this.j;
            if (i3 == -1) {
                i3 = i;
            }
            if (this.b == i && this.i == i2 && this.e == i3) {
                return false;
            }
            this.b = i;
            this.i = i2;
            this.e = i3;
            this.f = null;
            return true;
        }
        throw new a(i, i2, i3);
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.e;
    }

    public final void e() {
        byo.b(this.f != null);
        bmr bmr = this.f;
        int i = bmr.g;
        int i2 = bmr.i + ((int) ((((((float) i) / (bmr.b / bmr.c)) + ((float) bmr.j)) / (bmr.d * bmr.c)) + 0.5f));
        bmr.f = bmr.a(bmr.f, bmr.g, (bmr.e * 2) + i);
        for (int i3 = 0; i3 < (bmr.e * 2) * bmr.a; i3++) {
            bmr.f[(bmr.a * i) + i3] = (short) 0;
        }
        bmr.g += bmr.e * 2;
        bmr.b();
        if (bmr.i > i2) {
            bmr.i = i2;
        }
        bmr.g = 0;
        bmr.k = 0;
        bmr.j = 0;
        this.n = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.m;
        this.m = a;
        return byteBuffer;
    }

    public final boolean g() {
        if (this.n) {
            bmr bmr = this.f;
            if (bmr == null || bmr.i == 0) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        if (a()) {
            bmr bmr = this.f;
            if (bmr == null) {
                this.f = new bmr(this.b, this.i, this.c, this.d, this.e);
            } else {
                bmr.a();
            }
        }
        this.m = a;
        this.g = 0;
        this.h = 0;
        this.n = false;
    }

    public final void i() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.i = -1;
        this.b = -1;
        this.e = -1;
        this.k = a;
        this.l = this.k.asShortBuffer();
        this.m = a;
        this.j = -1;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.n = false;
    }
}

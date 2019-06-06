package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjv */
public final class acjv extends cce {
    public static int a(ccc ccc, int i, long j, long j2, int i2, int i3, int i4, int i5, long j3, int i6, int i7, long j4, int i8, boolean z, int i9, int i10) {
        ccc ccc2 = ccc;
        ccc.c(15);
        ccc.a(10, j4);
        long j5 = j3;
        ccc.a(7, j3);
        j5 = j2;
        ccc.a(2, j2);
        j5 = j;
        ccc.a(1, j);
        ccc.c(14, i10);
        ccc.c(13, i9);
        ccc.c(11, i8);
        ccc.c(9, i7);
        ccc.c(8, i6);
        int i11 = i5;
        ccc.c(6, i5);
        i11 = i4;
        ccc.c(5, i4);
        i11 = i3;
        ccc.c(4, i3);
        i11 = i2;
        ccc.c(3, i2);
        i11 = i;
        ccc.c(0, i);
        ccc.a(12, z);
        return ccc.d();
    }

    public static acjv a(ByteBuffer byteBuffer) {
        acjv acjv = new acjv();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjv.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjv.b = byteBuffer;
        return acjv;
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final long c() {
        int a = a(6);
        return a != 0 ? this.b.getLong(a + this.a) : 0;
    }

    public final long d() {
        int a = a(8);
        return a != 0 ? this.b.getLong(a + this.a) : 0;
    }

    public final acjs e() {
        acjs acjs = new acjs();
        int a = a(10);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        acjs.a = a;
        acjs.b = byteBuffer;
        return acjs;
    }

    public final String f() {
        int a = a(12);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String g() {
        int a = a(14);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String h() {
        int a = a(16);
        return a != 0 ? c(a + this.a) : null;
    }

    public final long i() {
        int a = a(18);
        return a != 0 ? this.b.getLong(a + this.a) : 0;
    }

    public final acjl j() {
        acjl acjl = new acjl();
        int a = a(20);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        acjl.a = a;
        acjl.b = byteBuffer;
        return acjl;
    }

    public final String k() {
        int a = a(22);
        return a != 0 ? c(a + this.a) : null;
    }

    public final long l() {
        int a = a(24);
        return a != 0 ? this.b.getLong(a + this.a) : 0;
    }

    public final String m() {
        int a = a(26);
        return a != 0 ? c(a + this.a) : null;
    }

    public final boolean n() {
        int a = a(28);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public final String o() {
        int a = a(30);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String p() {
        int a = a(32);
        return a != 0 ? c(a + this.a) : null;
    }
}

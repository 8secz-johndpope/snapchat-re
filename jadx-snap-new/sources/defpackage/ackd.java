package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ackd */
public final class ackd extends cce {
    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static ackd a(ByteBuffer byteBuffer) {
        ackd ackd = new ackd();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ackd.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        ackd.b = byteBuffer;
        return ackd;
    }

    public static void a(ccc ccc) {
        ccc.c(7);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static void a(ccc ccc, boolean z) {
        ccc.a(4, z);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static int b(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public static void d(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public static void e(ccc ccc, int i) {
        ccc.c(5, i);
    }

    public static void f(ccc ccc, int i) {
        ccc.c(6, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String d() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String e() {
        int a = a(10);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String f(int i) {
        int a = a(14);
        return a != 0 ? c(e(a) + (i << 2)) : null;
    }

    public final boolean f() {
        int a = a(12);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public final int g() {
        int a = a(14);
        return a != 0 ? d(a) : 0;
    }

    public final String g(int i) {
        int a = a(16);
        return a != 0 ? c(e(a) + (i << 2)) : null;
    }

    public final int h() {
        int a = a(16);
        return a != 0 ? d(a) : 0;
    }
}

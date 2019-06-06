package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjh */
public final class acjh extends cce {
    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static acjh a(ByteBuffer byteBuffer) {
        acjh acjh = new acjh();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjh.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjh.b = byteBuffer;
        return acjh;
    }

    public static void a(ccc ccc) {
        ccc.c(4);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static void a(ccc ccc, boolean z) {
        ccc.a(1, z);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(2, i);
    }

    public static void c(ccc ccc, int i) {
        ccc.c(3, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final boolean c() {
        int a = a(6);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public final String d() {
        int a = a(8);
        return a != 0 ? c(a + this.a) : null;
    }

    public final int e() {
        int a = a(10);
        return a != 0 ? d(a) : 0;
    }

    public final String f(int i) {
        int a = a(10);
        return a != 0 ? c(e(a) + (i << 2)) : null;
    }
}

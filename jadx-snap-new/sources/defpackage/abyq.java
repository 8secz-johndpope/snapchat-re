package defpackage;

import java.nio.ByteBuffer;

/* renamed from: abyq */
public final class abyq extends cce {
    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static void a(ccc ccc) {
        ccc.c(5);
    }

    public static void a(ccc ccc, int i) {
        ccc.b(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        if (i == 0) {
            return;
        }
        if (i == ccc.a()) {
            ccc.d(2);
            return;
        }
        throw new AssertionError("FlatBuffers: struct must be serialized inline.");
    }

    public static void c(ccc ccc, int i) {
        ccc.c(4, i);
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int c() {
        int a = a(12);
        return a != 0 ? d(a) : 0;
    }

    public final abyv f(int i) {
        abyv abyv = new abyv();
        int a = a(12);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        abyv.a = i;
        abyv.b = byteBuffer;
        return abyv;
    }
}

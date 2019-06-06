package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjt */
public final class acjt extends cce {
    public static acjt a(ByteBuffer byteBuffer) {
        acjt acjt = new acjt();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjt.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjt.b = byteBuffer;
        return acjt;
    }

    public static void a(ccc ccc) {
        ccc.c(2);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public static void b(ccc ccc, int i) {
        ccc.c(1, i);
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
    }
}

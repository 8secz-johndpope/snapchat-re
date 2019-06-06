package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjm */
public final class acjm extends cce {
    public static acjm a(ByteBuffer byteBuffer) {
        acjm acjm = new acjm();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acjm.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acjm.b = byteBuffer;
        return acjm;
    }

    public static void a(ccc ccc) {
        ccc.c(1);
    }

    public static void a(ccc ccc, int i) {
        ccc.c(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }
}

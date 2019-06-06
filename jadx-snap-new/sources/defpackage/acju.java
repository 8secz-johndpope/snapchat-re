package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acju */
public final class acju extends cce {
    public static acju a(ByteBuffer byteBuffer) {
        acju acju = new acju();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acju.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acju.b = byteBuffer;
        return acju;
    }

    public static void a(ccc ccc) {
        ccc.c(1);
    }

    public static void a(ccc ccc, int i) {
        ccc.b(0, i);
    }

    public static int b(ccc ccc) {
        return ccc.d();
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }
}

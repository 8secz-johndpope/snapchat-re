package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acka */
public final class acka extends cce {
    public static acka a(ByteBuffer byteBuffer) {
        return acka.a(byteBuffer, new acka());
    }

    private static acka a(ByteBuffer byteBuffer, acka acka) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acka.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return acka;
    }

    private void b(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }

    public final String f(int i) {
        int a = a(4);
        return a != 0 ? c(e(a) + (i << 2)) : null;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acke */
public final class acke extends cce {
    public static int a(ccc ccc, int i, int i2, boolean z) {
        ccc.c(3);
        ccc.c(1, i2);
        ccc.c(0, i);
        ccc.a(2, z);
        return ccc.d();
    }

    public static acke a(ByteBuffer byteBuffer) {
        acke acke = new acke();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        acke.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        acke.b = byteBuffer;
        return acke;
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final String c() {
        int a = a(6);
        return a != 0 ? c(a + this.a) : null;
    }

    public final boolean d() {
        int a = a(8);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: abyt */
public final class abyt extends cce {
    public static int a(ccc ccc, int i, int i2) {
        ccc.c(3);
        ccc.c(2, i2);
        ccc.c(1, i);
        ccc.b(0, 1);
        return ccc.d();
    }

    public static int a(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public static abyt a(ByteBuffer byteBuffer) {
        abyt abyt = new abyt();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        abyt.a = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        abyt.b = byteBuffer;
        return abyt;
    }

    public static void a(ccc ccc, int i) {
        ccc.a(ccc.c, 8);
        for (int i2 = 3; i2 >= 0; i2--) {
            ccc.a((byte) "SCOF".charAt(i2));
        }
        ccc.e(i);
    }

    public static int b(ccc ccc, int[] iArr) {
        ccc.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        return ccc.b();
    }

    public final int b() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? d(a) : 0;
    }

    public final int d() {
        int a = a(8);
        return a != 0 ? d(a) : 0;
    }

    public final abyq f(int i) {
        abyq abyq = new abyq();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        abyq.a = i;
        abyq.b = byteBuffer;
        return abyq;
    }

    public final abyr g(int i) {
        abyr abyr = new abyr();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        abyr.a = i;
        abyr.b = byteBuffer;
        return abyr;
    }
}

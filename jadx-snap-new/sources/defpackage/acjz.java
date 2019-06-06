package defpackage;

import java.nio.ByteBuffer;

/* renamed from: acjz */
public final class acjz extends cce {
    public static int a(ccc ccc, int i, int i2) {
        ccc.c(2);
        ccc.b(1, i2);
        i2 = 0;
        ccc.c(0, i);
        i = ccc.d();
        int capacity = ccc.a.capacity() - i;
        if (ccc.a.getShort((capacity - ccc.a.getInt(capacity)) + 4) != (short) 0) {
            i2 = 1;
        }
        if (i2 != 0) {
            return i;
        }
        throw new AssertionError(new StringBuilder("FlatBuffers: field 4 must be set").toString());
    }

    public final int a(Integer num, Integer num2, ByteBuffer byteBuffer) {
        int a = cce.a(num.intValue(), byteBuffer);
        int a2 = cce.a(num2.intValue(), byteBuffer);
        a += byteBuffer.getInt(a);
        a2 += byteBuffer.getInt(a2);
        int i = byteBuffer.getInt(a);
        int i2 = byteBuffer.getInt(a2);
        a += 4;
        a2 += 4;
        int min = Math.min(i, i2);
        byte[] array = byteBuffer.array();
        for (int i3 = 0; i3 < min; i3++) {
            int i4 = i3 + a;
            int i5 = i3 + a2;
            if (array[i4] != array[i5]) {
                return array[i4] - array[i5];
            }
        }
        return i - i2;
    }

    public final String b() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final int c() {
        int a = a(6);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }
}

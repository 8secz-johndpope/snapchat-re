package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yfl */
public final class yfl implements ainu<yfj, byte[]> {
    public final /* synthetic */ Object decode(Object obj) {
        byte[] bArr = (byte[]) obj;
        int i = 0;
        if (bArr == null) {
            return new yfj(new long[0]);
        }
        Object wrap = ByteBuffer.wrap(bArr);
        int length = bArr.length / 8;
        long[] jArr = new long[length];
        while (i < length) {
            akcr.a(wrap, "buffer");
            jArr[i] = wrap.getLong();
            i++;
        }
        return new yfj(jArr);
    }

    public final /* synthetic */ Object encode(Object obj) {
        yfj yfj = (yfj) obj;
        akcr.b(yfj, "longs");
        ByteBuffer allocate = ByteBuffer.allocate(yfj.a.length << 3);
        for (long putLong : yfj.a) {
            allocate.putLong(putLong);
        }
        obj = allocate.array();
        akcr.a(obj, "ByteBuffer.allocate(long…g(it) }\n        }.array()");
        return obj;
    }
}

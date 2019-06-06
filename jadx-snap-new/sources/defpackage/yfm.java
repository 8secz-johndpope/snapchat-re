package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yfm */
public final class yfm implements aina<yfj, byte[]> {
    public final /* synthetic */ Object decode(Object obj) {
        byte[] bArr = (byte[]) obj;
        akcr.b(bArr, "databaseValue");
        Object wrap = ByteBuffer.wrap(bArr);
        int length = bArr.length / 8;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            akcr.a(wrap, "buffer");
            jArr[i] = wrap.getLong();
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

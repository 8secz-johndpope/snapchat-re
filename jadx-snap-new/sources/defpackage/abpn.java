package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abpn */
public final class abpn {
    public static List<String> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        acka a = acka.a(ByteBuffer.wrap(bArr));
        ArrayList arrayList = new ArrayList(a.b());
        for (int i = 0; i < a.b(); i++) {
            arrayList.add(a.f(i));
        }
        return arrayList;
    }

    public static byte[] a(List<String> list) {
        if (list == null) {
            return null;
        }
        int length;
        int size = list.size();
        ccc ccc = new ccc();
        int[] iArr = new int[size];
        int i = 0;
        for (CharSequence a : list) {
            int i2 = i + 1;
            iArr[i] = ccc.a(a);
            i = i2;
        }
        ccc.a(4, iArr.length, 4);
        for (length = iArr.length - 1; length >= 0; length--) {
            ccc.b(iArr[length]);
        }
        length = ccc.b();
        ccc.c(1);
        ccc.c(0, length);
        ccc.e(ccc.d());
        length = ccc.b;
        size = ccc.a.capacity() - ccc.b;
        ccc.c();
        byte[] bArr = new byte[size];
        ccc.a.position(length);
        ccc.a.get(bArr);
        return bArr;
    }
}

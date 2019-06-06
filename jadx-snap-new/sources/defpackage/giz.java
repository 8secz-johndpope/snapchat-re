package defpackage;

import com.google.common.base.Charsets;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: giz */
public final class giz {
    private static byte[] a;

    static {
        giz giz = new giz();
        Object obj = Charsets.UTF_8;
        akcr.a(obj, "Charsets.UTF_8");
        obj = "PK".getBytes(obj);
        akcr.a(obj, "(this as java.lang.String).getBytes(charset)");
        a = obj;
    }

    private giz() {
    }

    public static final aknc<Boolean, InputStream> a(InputStream inputStream) {
        akcr.b(inputStream, "inputStream");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        bufferedInputStream.mark(128);
        byte[] bArr = new byte[a.length];
        aklc.a((InputStream) bufferedInputStream, bArr);
        bufferedInputStream.reset();
        Object a = aknc.a(Boolean.valueOf(Arrays.equals(a, bArr)), bufferedInputStream);
        akcr.a(a, "Pair.of(\n               …          bufferedStream)");
        return a;
    }
}

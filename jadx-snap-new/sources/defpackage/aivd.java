package defpackage;

import defpackage.aivl.e;
import defpackage.aivl.g;
import java.nio.charset.Charset;

/* renamed from: aivd */
public final class aivd {
    public static final Charset a = Charset.forName("US-ASCII");

    /* renamed from: aivd$a */
    public interface a<T> extends g<T> {
    }

    public static <T> e<T> a(String str, a<T> aVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return e.a(str, z, aVar);
    }

    public static aivl a(byte[]... bArr) {
        return new aivl(bArr);
    }
}

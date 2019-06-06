package defpackage;

import com.google.common.base.Charsets;
import com.google.common.net.MediaType;
import defpackage.sbe.a;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: sbg */
public final class sbg {
    public static <T> String a(T t) {
        return t == null ? "null" : t.getClass().getSimpleName();
    }

    public static sai a() {
        return sbg.a(null, -1, 0, scc.a());
    }

    public static sai a(MediaType mediaType, long j, long j2, InputStream inputStream) {
        return new sbl(mediaType, j, j2, a.b(inputStream));
    }

    public static sai a(MediaType mediaType, long j, long j2, sbd sbd) {
        return new sbl(mediaType, j, j2, sbd);
    }

    public static sai a(MediaType mediaType, long j, InputStream inputStream) {
        return new sbl(mediaType, j, a.b(inputStream));
    }

    public static sai a(MediaType mediaType, long j, sbd sbd) {
        return new sbl(mediaType, j, sbd);
    }

    public static sai a(MediaType mediaType, String str) {
        Charset charset = Charsets.UTF_8;
        if (mediaType != null) {
            charset = (Charset) mediaType.charset().or((Object) charset);
        }
        byte[] bytes = str.getBytes(charset);
        return new sbl(mediaType, (long) bytes.length, a.a(bytes));
    }

    public static void a(sai sai) {
        if (sai != null) {
            try {
                sai.close();
            } catch (Exception unused) {
            }
        }
    }

    public static <T> String b(T t) {
        if (t == null) {
            return "null";
        }
        if (!(t instanceof sai)) {
            return t.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(((sai) t).d());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

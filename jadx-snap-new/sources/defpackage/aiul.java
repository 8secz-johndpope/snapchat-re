package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: aiul */
public interface aiul extends aium, aiut {

    /* renamed from: aiul$a */
    public static final class a implements aiul {
        public final InputStream a(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        public final OutputStream a(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }

        public final String a() {
            return "gzip";
        }
    }

    /* renamed from: aiul$b */
    public static final class b implements aiul {
        public static final aiul a = new b();

        private b() {
        }

        public final InputStream a(InputStream inputStream) {
            return inputStream;
        }

        public final OutputStream a(OutputStream outputStream) {
            return outputStream;
        }

        public final String a() {
            return "identity";
        }
    }
}

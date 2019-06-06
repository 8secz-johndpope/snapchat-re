package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: akhw */
public abstract class akhw implements Closeable {
    private Reader a;

    /* renamed from: akhw$a */
    static final class a extends Reader {
        private final akkf a;
        private final Charset b;
        private boolean c;
        private Reader d;

        a(akkf akkf, Charset charset) {
            this.a = akkf;
            this.b = charset;
        }

        public final void close() {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }

        public final int read(char[] cArr, int i, int i2) {
            if (this.c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.d;
            if (reader == null) {
                Reader inputStreamReader = new InputStreamReader(this.a.e(), akib.a(this.a, this.b));
                this.d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static akhw a(final akho akho, final long j, final akkf akkf) {
        if (akkf != null) {
            return new akhw() {
                public final akho a() {
                    return akho;
                }

                public final long b() {
                    return j;
                }

                public final akkf d() {
                    return akkf;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static akhw a(akho akho, String str) {
        Charset charset = akib.d;
        if (akho != null) {
            charset = akho.a(null);
            if (charset == null) {
                charset = akib.d;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(akho);
                stringBuilder.append("; charset=utf-8");
                akho = akho.a(stringBuilder.toString());
            }
        }
        akkd a = new akkd().a(str, 0, str.length(), charset);
        return akhw.a(akho, a.b, a);
    }

    private Charset h() {
        akho a = a();
        return a != null ? a.a(akib.d) : akib.d;
    }

    public abstract akho a();

    public abstract long b();

    public final InputStream c() {
        return d().e();
    }

    public void close() {
        akib.a(d());
    }

    public abstract akkf d();

    public final byte[] e() {
        long b = b();
        if (b <= 2147483647L) {
            Closeable d = d();
            try {
                byte[] q = d.q();
                if (b == -1 || b == ((long) q.length)) {
                    return q;
                }
                StringBuilder stringBuilder = new StringBuilder("Content-Length (");
                stringBuilder.append(b);
                stringBuilder.append(") and stream length (");
                stringBuilder.append(q.length);
                stringBuilder.append(") disagree");
                throw new IOException(stringBuilder.toString());
            } finally {
                akib.a(d);
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(b)));
        }
    }

    public final Reader f() {
        Reader reader = this.a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(d(), h());
        this.a = aVar;
        return aVar;
    }

    public final String g() {
        Closeable d = d();
        try {
            String a = d.a(akib.a((akkf) d, h()));
            return a;
        } finally {
            akib.a(d);
        }
    }
}

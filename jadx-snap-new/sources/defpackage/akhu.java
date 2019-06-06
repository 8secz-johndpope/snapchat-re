package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/* renamed from: akhu */
public abstract class akhu {
    public static akhu create(final akho akho, final akkg akkg) {
        return new akhu() {
            public final long contentLength() {
                return (long) akkg.g();
            }

            public final akho contentType() {
                return akho;
            }

            public final void writeTo(akke akke) {
                akke.c(akkg);
            }
        };
    }

    public static akhu create(final akho akho, final File file) {
        if (file != null) {
            return new akhu() {
                public final long contentLength() {
                    return file.length();
                }

                public final akho contentType() {
                    return akho;
                }

                public final void writeTo(akke akke) {
                    Closeable closeable = null;
                    try {
                        File file = file;
                        if (file != null) {
                            closeable = akko.a(new FileInputStream(file));
                            akke.a(closeable);
                            return;
                        }
                        throw new IllegalArgumentException("file == null");
                    } finally {
                        akib.a(closeable);
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static akhu create(akho akho, String str) {
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
        return akhu.create(akho, str.getBytes(charset));
    }

    public static akhu create(akho akho, byte[] bArr) {
        return akhu.create(akho, bArr, 0, bArr.length);
    }

    public static akhu create(final akho akho, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            akib.a((long) bArr.length, (long) i, (long) i2);
            return new akhu() {
                public final long contentLength() {
                    return (long) i2;
                }

                public final akho contentType() {
                    return akho;
                }

                public final void writeTo(akke akke) {
                    akke.c(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() {
        return -1;
    }

    public abstract akho contentType();

    public abstract void writeTo(akke akke);
}

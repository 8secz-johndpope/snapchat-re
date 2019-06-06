package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: akhp */
public final class akhp extends akhu {
    public static final akho a = akho.a("multipart/mixed");
    public static final akho b = akho.a("multipart/form-data");
    private static final byte[] c = new byte[]{(byte) 58, (byte) 32};
    private static final byte[] d = new byte[]{(byte) 13, (byte) 10};
    private static final byte[] e = new byte[]{(byte) 45, (byte) 45};
    private final akkg f;
    private final akho g;
    private final akho h;
    private final List<b> i;
    private long j = -1;

    /* renamed from: akhp$a */
    public static final class a {
        private final akkg a;
        private akho b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a(String str) {
            this.b = akhp.a;
            this.c = new ArrayList();
            this.a = akkg.a(str);
        }

        public final a a(akhl akhl, akhu akhu) {
            return a(b.a(akhl, akhu));
        }

        public final a a(akho akho) {
            if (akho == null) {
                throw new NullPointerException("type == null");
            } else if (akho.a.equals("multipart")) {
                this.b = akho;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(akho)));
            }
        }

        public final a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public final akhp a() {
            if (!this.c.isEmpty()) {
                return new akhp(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: akhp$b */
    public static final class b {
        final akhl a;
        final akhu b;

        private b(akhl akhl, akhu akhu) {
            this.a = akhl;
            this.b = akhu;
        }

        public static b a(akhl akhl, akhu akhu) {
            if (akhu == null) {
                throw new NullPointerException("body == null");
            } else if (akhl != null && akhl.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (akhl == null || akhl.a("Content-Length") == null) {
                return new b(akhl, akhu);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    static {
        akho.a("multipart/alternative");
        akho.a("multipart/digest");
        akho.a("multipart/parallel");
    }

    akhp(akkg akkg, akho akho, List<b> list) {
        this.f = akkg;
        this.g = akho;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(akho);
        stringBuilder.append("; boundary=");
        stringBuilder.append(akkg.a());
        this.h = akho.a(stringBuilder.toString());
        this.i = akib.a((List) list);
    }

    private long a(akke akke, boolean z) {
        akkd akkd;
        if (z) {
            akke = new akkd();
            akkd = akke;
        } else {
            akkd = null;
        }
        int size = this.i.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.i.get(i);
            akhl akhl = bVar.a;
            akhu akhu = bVar.b;
            akke.c(e);
            akke.c(this.f);
            akke.c(d);
            if (akhl != null) {
                int length = akhl.a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    akke.b(akhl.a(i2)).c(c).b(akhl.b(i2)).c(d);
                }
            }
            akho contentType = akhu.contentType();
            if (contentType != null) {
                akke.b("Content-Type: ").b(contentType.toString()).c(d);
            }
            long contentLength = akhu.contentLength();
            if (contentLength != -1) {
                akke.b("Content-Length: ").j(contentLength).c(d);
            } else if (z) {
                akkd.r();
                return -1;
            }
            akke.c(d);
            if (z) {
                j += contentLength;
            } else {
                akhu.writeTo(akke);
            }
            akke.c(d);
        }
        akke.c(e);
        akke.c(this.f);
        akke.c(e);
        akke.c(d);
        if (z) {
            j += akkd.b;
            akkd.r();
        }
        return j;
    }

    public final long contentLength() {
        long j = this.j;
        if (j != -1) {
            return j;
        }
        j = a(null, true);
        this.j = j;
        return j;
    }

    public final akho contentType() {
        return this.h;
    }

    public final void writeTo(akke akke) {
        a(akke, false);
    }
}

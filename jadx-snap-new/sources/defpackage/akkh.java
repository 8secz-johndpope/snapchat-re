package defpackage;

import java.util.zip.Deflater;

/* renamed from: akkh */
public final class akkh implements akku {
    private final akke a;
    private final Deflater b;
    private boolean c;

    akkh(akke akke, Deflater deflater) {
        if (akke == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.a = akke;
            this.b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void a(boolean z) {
        akkr f;
        akkd c = this.a.c();
        while (true) {
            f = c.f(1);
            int deflate = z ? this.b.deflate(f.a, f.c, 8192 - f.c, 2) : this.b.deflate(f.a, f.c, 8192 - f.c);
            if (deflate > 0) {
                f.c += deflate;
                c.b += (long) deflate;
                this.a.v();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (f.b == f.c) {
            c.a = f.a();
            akks.a(f);
        }
    }

    public final akkw a() {
        return this.a.a();
    }

    public final void a_(akkd akkd, long j) {
        akkx.a(akkd.b, 0, j);
        while (j > 0) {
            akkr akkr = akkd.a;
            int min = (int) Math.min(j, (long) (akkr.c - akkr.b));
            this.b.setInput(akkr.a, akkr.b, min);
            a(false);
            long j2 = (long) min;
            akkd.b -= j2;
            akkr.b += min;
            if (akkr.b == akkr.c) {
                akkd.a = akkr.a();
                akks.a(akkr);
            }
            j -= j2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b.finish();
        a(false);
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.a.close();
            } catch (Throwable th32) {
                if (th == null) {
                    th = th32;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        a(true);
        this.a.flush();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeflaterSink(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: akkl */
public final class akkl implements akku {
    private final akke a;
    private final Deflater b;
    private final akkh c;
    private boolean d;
    private final CRC32 e = new CRC32();

    public akkl(akku akku) {
        if (akku != null) {
            this.b = new Deflater(-1, true);
            this.a = akko.a(akku);
            this.c = new akkh(this.a, this.b);
            akkd c = this.a.c();
            c.i(8075);
            c.j(8);
            c.j(0);
            c.h(0);
            c.j(0);
            c.j(0);
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    private void b(akkd akkd, long j) {
        akkr akkr = akkd.a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (akkr.c - akkr.b));
            this.e.update(akkr.a, akkr.b, min);
            j -= (long) min;
            akkr = akkr.f;
        }
    }

    public final akkw a() {
        return this.a.a();
    }

    public final void a_(akkd akkd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (j != 0) {
            b(akkd, j);
            this.c.a_(akkd, j);
        }
    }

    public final void close() {
        if (!this.d) {
            Throwable th = null;
            try {
                this.c.b();
                this.a.g((int) this.e.getValue());
                this.a.g((int) this.b.getBytesRead());
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
            this.d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        this.c.flush();
    }
}

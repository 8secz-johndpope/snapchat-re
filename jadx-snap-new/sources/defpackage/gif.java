package defpackage;

import java.io.InputStream;
import java.util.List;

/* renamed from: gif */
public final class gif implements gej {
    private final gej a;
    private final gff b;

    public gif(gej gej, gff gff) {
        akcr.b(gej, "delegate");
        akcr.b(gff, "metrics");
        this.a = gej;
        this.b = gff;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final InputStream b() {
        Object b = this.a.b();
        akcr.a(b, "delegate.openDefaultAsset()");
        return b;
    }

    public final List<gdt> c() {
        Object c = this.a.c();
        akcr.a(c, "delegate.assets");
        return c;
    }

    public final void close() {
        this.a.close();
    }

    public final /* synthetic */ gej d() {
        Object d = this.a.d();
        akcr.a(d, "delegate.newResult()");
        return new gif(d, this.b);
    }

    public final gey e() {
        Object e = this.a.e();
        akcr.a(e, "delegate.failureReason");
        return e;
    }

    public final gff f() {
        return this.b;
    }
}

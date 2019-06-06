package defpackage;

import defpackage.gel.b;
import defpackage.gfl.a;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ggx */
public final class ggx implements gej {
    private final List<gdt> a = this.d.a(this.c);
    private final AtomicBoolean b;
    private final gez c;
    private final a d;
    private final gff e;
    private final b f;

    public ggx(gez gez, a aVar, gff gff, b bVar) {
        akcr.b(gez, "fileLease");
        akcr.b(aVar, "assetDescriptorListFactory");
        akcr.b(gff, "metrics");
        akcr.b(bVar, "resultTracker");
        this.c = gez;
        this.d = aVar;
        this.e = gff;
        this.f = bVar;
        gff gff2 = this.e;
        List list = this.a;
        gff2.g = new gdu(list.size(), ggz.a(list));
        this.b = new AtomicBoolean(false);
    }

    private final void g() {
        if (this.b.get()) {
            throw new IllegalStateException("The result is already closed");
        }
    }

    public final boolean a() {
        return true;
    }

    public final InputStream b() {
        g();
        Object b = ((gdt) this.a.get(0)).b();
        akcr.a(b, "assetDescriptors.get(0).openStream()");
        return b;
    }

    public final List<gdt> c() {
        g();
        return this.a;
    }

    public final void close() {
        if (this.b.compareAndSet(false, true)) {
            this.f.close();
            aklc.a((Closeable) this.c);
        }
    }

    public final gej d() {
        g();
        Object c = this.c.c();
        akcr.a(c, "fileLease.newLease()");
        return new ggx(c, this.d, this.e, this.f.a());
    }

    public final gey e() {
        throw new IllegalStateException("The result was successful");
    }

    public final gff f() {
        return this.e;
    }
}

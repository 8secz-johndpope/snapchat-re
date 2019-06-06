package defpackage;

import defpackage.ygm.b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gje */
public final class gje implements gez {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final yeu b;
    private final b<ygk, ygh> c;
    private final akbk<yeu> d;
    private final akbk<b<ygk, ygh>> e;

    public gje(yeu yeu, b<ygk, ygh> bVar, akbk<? extends yeu> akbk, akbk<? extends b<ygk, ygh>> akbk2) {
        akcr.b(yeu, "entrySnapshot");
        akcr.b(bVar, "fileLease");
        akcr.b(akbk, "snapshotCreator");
        akcr.b(akbk2, "leaseCreator");
        this.b = yeu;
        this.c = bVar;
        this.d = akbk;
        this.e = akbk2;
    }

    private void d() {
        if (this.a.get()) {
            throw new IllegalStateException("Result is already closed", null);
        }
    }

    public final int a() {
        d();
        return this.b.a();
    }

    public final InputStream a(int i) {
        d();
        Object b = this.b.b(i);
        akcr.a(b, "entrySnapshot.getInputStream(index)");
        return (InputStream) b;
    }

    public final long b() {
        d();
        Iterable a = akef.a(0, a());
        Collection arrayList = new ArrayList(ajyn.a(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(c(((ajzg) it).a())));
        }
        return ajyu.x((List) arrayList);
    }

    public final File b(int i) {
        d();
        Object a = this.b.a(i);
        akcr.a(a, "entrySnapshot.getCleanFile(index)");
        return a;
    }

    public final long c(int i) {
        d();
        return this.b.c(i);
    }

    public final gez c() {
        d();
        b bVar = (b) this.e.invoke();
        yeu yeu = (yeu) this.d.invoke();
        if (yeu != null) {
            return new gje(yeu, bVar, this.d, this.e);
        }
        bVar.a();
        throw new IOException("Failed to acquire new lease because entry snapshot is null");
    }

    public final void close() {
        if (this.a.compareAndSet(false, true)) {
            aklc.a((Closeable) this.b);
            this.c.a();
        }
    }
}

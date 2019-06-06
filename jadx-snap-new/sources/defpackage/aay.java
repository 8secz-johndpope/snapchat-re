package defpackage;

import defpackage.zm.a;
import java.io.File;
import java.util.List;

/* renamed from: aay */
final class aay implements aah, a<Object> {
    private final aah.a a;
    private final aai<?> b;
    private int c;
    private int d = -1;
    private zd e;
    private List<acq<File, ?>> f;
    private int g;
    private volatile acq.a<?> h;
    private File i;
    private aaz j;

    aay(aai<?> aai, aah.a aVar) {
        this.b = aai;
        this.a = aVar;
    }

    private boolean c() {
        return this.g < this.f.size();
    }

    public final void a(Exception exception) {
        this.a.a(this.j, exception, this.h.c, yx.RESOURCE_DISK_CACHE);
    }

    public final void a(Object obj) {
        this.a.a(this.e, obj, this.h.c, yx.RESOURCE_DISK_CACHE, this.j);
    }

    public final boolean a() {
        List d = this.b.d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        aai aai = this.b;
        List b = aai.a.c.b(aai.b.getClass(), aai.e, aai.i);
        if (!b.isEmpty()) {
            while (true) {
                if (this.f == null || !c()) {
                    this.d++;
                    if (this.d >= b.size()) {
                        this.c++;
                        if (this.c >= d.size()) {
                            return false;
                        }
                        this.d = 0;
                    }
                    zd zdVar = (zd) d.get(this.c);
                    Class cls = (Class) b.get(this.d);
                    zd zdVar2 = zdVar;
                    this.j = new aaz(this.b.a.b, zdVar2, this.b.j, this.b.c, this.b.d, this.b.c(cls), cls, this.b.g);
                    this.i = this.b.b().a(this.j);
                    File file = this.i;
                    if (file != null) {
                        this.e = zdVar;
                        this.f = this.b.a(file);
                        this.g = 0;
                    }
                } else {
                    this.h = null;
                    while (!z && c()) {
                        d = this.f;
                        int i = this.g;
                        this.g = i + 1;
                        this.h = ((acq) d.get(i)).a(this.i, this.b.c, this.b.d, this.b.g);
                        if (this.h != null && this.b.a(this.h.c.a())) {
                            this.h.c.a(this.b.k, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.b.i)) {
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Failed to find any load path from ");
            stringBuilder.append(this.b.b.getClass());
            stringBuilder.append(" to ");
            stringBuilder.append(this.b.i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void b() {
        acq.a aVar = this.h;
        if (aVar != null) {
            aVar.c.c();
        }
    }
}

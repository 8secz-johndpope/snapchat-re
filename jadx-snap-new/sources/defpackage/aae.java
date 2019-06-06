package defpackage;

import defpackage.zm.a;
import java.io.File;
import java.util.List;

/* renamed from: aae */
final class aae implements aah, a<Object> {
    private final List<zd> a;
    private final aai<?> b;
    private final aah.a c;
    private int d;
    private zd e;
    private List<acq<File, ?>> f;
    private int g;
    private volatile acq.a<?> h;
    private File i;

    aae(aai<?> aai, aah.a aVar) {
        this(aai.d(), aai, aVar);
    }

    aae(List<zd> list, aai<?> aai, aah.a aVar) {
        this.d = -1;
        this.a = list;
        this.b = aai;
        this.c = aVar;
    }

    private boolean c() {
        return this.g < this.f.size();
    }

    public final void a(Exception exception) {
        this.c.a(this.e, exception, this.h.c, yx.DATA_DISK_CACHE);
    }

    public final void a(Object obj) {
        this.c.a(this.e, obj, this.h.c, yx.DATA_DISK_CACHE, this.e);
    }

    public final boolean a() {
        while (true) {
            boolean z = false;
            if (this.f == null || !c()) {
                this.d++;
                if (this.d >= this.a.size()) {
                    return false;
                }
                zd zdVar = (zd) this.a.get(this.d);
                this.i = this.b.b().a(new aaf(zdVar, this.b.j));
                File file = this.i;
                if (file != null) {
                    this.e = zdVar;
                    this.f = this.b.a(file);
                    this.g = 0;
                }
            } else {
                this.h = null;
                while (!z && c()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    this.h = ((acq) list.get(i)).a(this.i, this.b.c, this.b.d, this.b.g);
                    if (this.h != null && this.b.a(this.h.c.a())) {
                        this.h.c.a(this.b.k, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public final void b() {
        acq.a aVar = this.h;
        if (aVar != null) {
            aVar.c.c();
        }
    }
}

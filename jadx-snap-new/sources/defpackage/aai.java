package defpackage;

import com.bumptech.glide.GlideContext;
import defpackage.aaj.d;
import defpackage.acq.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aai */
final class aai<Transcode> {
    GlideContext a;
    Object b;
    int c;
    int d;
    Class<?> e;
    d f;
    zf g;
    Map<Class<?>, zi<?>> h;
    Class<Transcode> i;
    zd j;
    yk k;
    aal l;
    boolean m;
    boolean n;
    private final List<a<?>> o = new ArrayList();
    private final List<zd> p = new ArrayList();
    private boolean q;
    private boolean r;

    aai() {
    }

    /* Access modifiers changed, original: final */
    public final List<acq<File, ?>> a(File file) {
        return this.a.c.a((Object) file);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = null;
        this.b = null;
        this.j = null;
        this.e = null;
        this.i = null;
        this.g = null;
        this.k = null;
        this.h = null;
        this.l = null;
        this.o.clear();
        this.q = false;
        this.p.clear();
        this.r = false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Class<?> cls) {
        return b(cls) != null;
    }

    /* Access modifiers changed, original: final */
    public final <Data> aav<Data, ?, Transcode> b(Class<Data> cls) {
        return this.a.c.a((Class) cls, this.e, this.i);
    }

    /* Access modifiers changed, original: final */
    public final abq b() {
        return this.f.a();
    }

    /* Access modifiers changed, original: final */
    public final List<a<?>> c() {
        if (!this.q) {
            this.q = true;
            this.o.clear();
            List a = this.a.c.a(this.b);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                a a2 = ((acq) a.get(i)).a(this.b, this.c, this.d, this.g);
                if (a2 != null) {
                    this.o.add(a2);
                }
            }
        }
        return this.o;
    }

    /* Access modifiers changed, original: final */
    public final <Z> zi<Z> c(Class<Z> cls) {
        zi<Z> ziVar = (zi) this.h.get(cls);
        if (ziVar == null) {
            for (Entry entry : this.h.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ziVar = (zi) entry.getValue();
                    break;
                }
            }
        }
        if (ziVar != null) {
            return ziVar;
        }
        if (!this.h.isEmpty() || !this.m) {
            return (adh) adh.b;
        }
        StringBuilder stringBuilder = new StringBuilder("Missing transformation for ");
        stringBuilder.append(cls);
        stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final List<zd> d() {
        if (!this.r) {
            this.r = true;
            this.p.clear();
            List c = c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                a aVar = (a) c.get(i);
                if (!this.p.contains(aVar.a)) {
                    this.p.add(aVar.a);
                }
                for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                    if (!this.p.contains(aVar.b.get(i2))) {
                        this.p.add(aVar.b.get(i2));
                    }
                }
            }
        }
        return this.p;
    }
}

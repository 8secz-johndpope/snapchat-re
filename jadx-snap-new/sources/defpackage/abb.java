package defpackage;

import android.util.Log;
import defpackage.aah.a;
import defpackage.yl.e;
import java.util.Collections;
import java.util.List;

/* renamed from: abb */
final class abb implements aah, a, zm.a<Object> {
    private final aai<?> a;
    private final a b;
    private int c;
    private aae d;
    private Object e;
    private volatile acq.a<?> f;
    private aaf g;

    abb(aai<?> aai, a aVar) {
        this.a = aai;
        this.b = aVar;
    }

    public final void a(Exception exception) {
        this.b.a(this.g, exception, this.f.c, this.f.c.d());
    }

    public final void a(Object obj) {
        aal aal = this.a.l;
        if (obj == null || !aal.a(this.f.c.d())) {
            this.b.a(this.f.a, obj, this.f.c, this.f.c.d(), this.g);
            return;
        }
        this.e = obj;
        this.b.c();
    }

    public final void a(zd zdVar, Exception exception, zm<?> zmVar, yx yxVar) {
        this.b.a(zdVar, exception, zmVar, this.f.c.d());
    }

    public final void a(zd zdVar, Object obj, zm<?> zmVar, yx yxVar, zd zdVar2) {
        this.b.a(zdVar, obj, zmVar, this.f.c.d(), zdVar);
    }

    public final boolean a() {
        String str = "SourceGenerator";
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            long a = ahh.a();
            try {
                za a2 = this.a.a.c.a.a(obj.getClass());
                if (a2 != null) {
                    aag aag = new aag(a2, obj, this.a.g);
                    this.g = new aaf(this.f.a, this.a.j);
                    this.a.b().a(this.g, aag);
                    if (Log.isLoggable(str, 2)) {
                        StringBuilder stringBuilder = new StringBuilder("Finished encoding source to cache, key: ");
                        stringBuilder.append(this.g);
                        stringBuilder.append(", data: ");
                        stringBuilder.append(obj);
                        stringBuilder.append(", encoder: ");
                        stringBuilder.append(a2);
                        stringBuilder.append(", duration: ");
                        stringBuilder.append(ahh.a(a));
                        Log.v(str, stringBuilder.toString());
                    }
                    this.f.c.b();
                    this.d = new aae(Collections.singletonList(this.f.a), this.a, this);
                } else {
                    throw new e(obj.getClass());
                }
            } catch (Throwable th) {
                this.f.c.b();
            }
        }
        aae aae = this.d;
        if (aae != null && aae.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z) {
            if ((this.c < this.a.c().size() ? 1 : null) == null) {
                break;
            }
            List c = this.a.c();
            int i = this.c;
            this.c = i + 1;
            this.f = (acq.a) c.get(i);
            if (this.f != null && (this.a.l.a(this.f.c.d()) || this.a.a(this.f.c.a()))) {
                this.f.c.a(this.a.k, this);
                z = true;
            }
        }
        return z;
    }

    public final void b() {
        acq.a aVar = this.f;
        if (aVar != null) {
            aVar.c.c();
        }
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }
}

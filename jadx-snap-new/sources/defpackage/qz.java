package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: qz */
public abstract class qz<T> implements qt<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public ri<T> c;
    private a d;

    /* renamed from: qz$a */
    public interface a {
        void b(List<String> list);

        void c(List<String> list);
    }

    qz(ri<T> riVar) {
        this.c = riVar;
    }

    private void a() {
        if (!(this.a.isEmpty() || this.d == null)) {
            Object obj = this.b;
            if (obj == null || b(obj)) {
                this.d.c(this.a);
            } else {
                this.d.b(this.a);
            }
        }
    }

    public final void a(T t) {
        this.b = t;
        a();
    }

    public final void a(List<rv> list) {
        this.a.clear();
        for (rv rvVar : list) {
            if (a(rvVar)) {
                this.a.add(rvVar.b);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a((qt) this);
        }
        a();
    }

    public final void a(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            a();
        }
    }

    public abstract boolean a(rv rvVar);

    public abstract boolean b(T t);
}

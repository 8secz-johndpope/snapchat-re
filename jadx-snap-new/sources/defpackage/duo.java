package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: duo */
public class duo<T> {
    final List<a<T>> a = new ArrayList();

    /* renamed from: duo$a */
    public interface a<T> {
        void a(T t);
    }

    public final void a(a<T> aVar) {
        this.a.add(aVar);
    }

    public final void a(T t) {
        for (a a : this.a) {
            a.a(t);
        }
        this.a.clear();
    }
}

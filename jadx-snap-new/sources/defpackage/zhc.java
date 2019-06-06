package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zhc */
public abstract class zhc<T> {
    protected final List<T> a = new CopyOnWriteArrayList();

    public final void a(T t) {
        int indexOf = this.a.indexOf(t);
        if (indexOf < 0) {
            this.a.add(0, t);
            return;
        }
        if (indexOf > 0) {
            List list = this.a;
            list.add(0, list.remove(indexOf));
        }
    }

    public final void b(T t) {
        this.a.remove(t);
    }
}

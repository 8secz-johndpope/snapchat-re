package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ainr */
public final class ainr {

    /* renamed from: ainr$a */
    static final class a extends akcs implements akbk<T> {
        private /* synthetic */ ThreadLocal a;

        a(ThreadLocal threadLocal) {
            this.a = threadLocal;
            super(0);
        }

        public final T invoke() {
            return this.a.get();
        }
    }

    public static final <T> akbk<T> a(T t) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(t);
        return new a(threadLocal);
    }

    public static final List<ainb<?>> a() {
        return new CopyOnWriteArrayList();
    }

    public static final <T> Set<T> b() {
        return new LinkedHashSet();
    }
}

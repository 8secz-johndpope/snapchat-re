package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Map;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: szw */
public class szw extends Observable {
    public static final szw cY = new a();
    private final Map<b, Object> a;
    private int b;

    /* renamed from: szw$b */
    public static class b<T> {
        public final String a;
        public final T b;
        public final boolean c;

        public b(String str) {
            this.a = str;
            this.b = null;
            this.c = false;
        }

        public b(String str, T t) {
            this.a = str;
            this.b = t;
            this.c = true;
        }

        public final boolean equals(Object obj) {
            return obj == this ? true : !(obj instanceof b) ? false : ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return this.a;
        }
    }

    /* renamed from: szw$a */
    public static class a extends szw {
        public final synchronized void a(szw szw) {
            throw new UnsupportedOperationException("Empty params is immutable");
        }

        public final <T> void b(b<T> bVar, T t) {
            throw new UnsupportedOperationException("Empty params is immutable");
        }
    }

    public szw() {
        this(20);
    }

    private szw(int i) {
        this.b = 0;
        this.a = new ConcurrentHashMap(i);
    }

    public szw(szw szw) {
        this(szw.a());
        a(szw);
    }

    private synchronized int a() {
        return this.a.size();
    }

    public static <T> szw a(b<T> bVar, T t) {
        szw szw = new szw();
        szw.b(bVar, t);
        return szw;
    }

    public static <T, S> szw a(b<T> bVar, T t, b<S> bVar2, S s) {
        szw szw = new szw();
        szw.b(bVar, t);
        szw.b(bVar2, s);
        return szw;
    }

    public static <T, S, R> szw a(b<T> bVar, T t, b<S> bVar2, S s, b<R> bVar3, R r) {
        szw a = szw.a(bVar, t, bVar2, s);
        a.b(bVar3, r);
        return a;
    }

    public final synchronized float a(b<Float> bVar, float f) {
        return ((Float) c(bVar, Float.valueOf(f))).floatValue();
    }

    public final synchronized int a(b<Integer> bVar, int i) {
        return ((Integer) c(bVar, Integer.valueOf(i))).intValue();
    }

    public final synchronized long a(b<Long> bVar, long j) {
        return ((Long) c(bVar, Long.valueOf(j))).longValue();
    }

    public final synchronized <E extends Enum<E>> E a(b<E> bVar, E e) {
        return (Enum) c(bVar, e);
    }

    public final synchronized <T> T a(b<T> bVar) {
        Object obj = this.a.get(bVar);
        if (obj != null) {
            return obj;
        }
        if (!bVar.c) {
            return null;
        }
        return bVar.b;
    }

    public final synchronized String a(b<String> bVar, String str) {
        return (String) c(bVar, str);
    }

    public synchronized void a(szw szw) {
        this.a.putAll(szw.a);
        this.b++;
    }

    public final synchronized boolean a(b<Boolean> bVar, boolean z) {
        return ((Boolean) c(bVar, Boolean.valueOf(z))).booleanValue();
    }

    public final synchronized <T> void b(b<T> bVar) {
        this.a.remove(bVar);
        this.b++;
    }

    public synchronized <T> void b(b<T> bVar, T t) {
        if (t != null) {
            this.a.put(bVar, t);
            this.b++;
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void b(szw szw) {
        d();
        if (szw != null) {
            a(szw);
        }
    }

    public final synchronized <T> T c(b<T> bVar, T t) {
        Object obj = this.a.get(bVar);
        return obj == null ? t : obj;
    }

    public final synchronized boolean c(b<?> bVar) {
        return this.a.containsKey(bVar);
    }

    public final synchronized String d(b<String> bVar) {
        return (String) a((b) bVar);
    }

    public final synchronized void d() {
        this.a.clear();
        this.b++;
    }

    public final synchronized int e() {
        return this.b;
    }

    public final synchronized Integer e(b<Integer> bVar) {
        return (Integer) a((b) bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.a, ((szw) obj).a);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized Map<b, Object> f() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public String toString() {
        return MoreObjects.toStringHelper("Params").add("mParams", this.a).toString();
    }
}

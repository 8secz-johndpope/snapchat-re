package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: abj */
final class abj<K extends abo, V> {
    private final a<K, V> a = new a();
    private final Map<K, a<K, V>> b = new HashMap();

    /* renamed from: abj$a */
    static class a<K, V> {
        final K a;
        a<K, V> b;
        a<K, V> c;
        private List<V> d;

        a() {
            this(null);
        }

        a(K k) {
            this.c = this;
            this.b = this;
            this.a = k;
        }

        public final V a() {
            int b = b();
            return b > 0 ? this.d.remove(b - 1) : null;
        }

        public final void a(V v) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(v);
        }

        public final int b() {
            List list = this.d;
            return list != null ? list.size() : 0;
        }
    }

    abj() {
    }

    private void a(a<K, V> aVar) {
        abj.d(aVar);
        a aVar2 = this.a;
        aVar.c = aVar2;
        aVar.b = aVar2.b;
        abj.c(aVar);
    }

    private void b(a<K, V> aVar) {
        abj.d(aVar);
        aVar.c = this.a.c;
        aVar.b = this.a;
        abj.c(aVar);
    }

    private static <K, V> void c(a<K, V> aVar) {
        aVar.b.c = aVar;
        aVar.c.b = aVar;
    }

    private static <K, V> void d(a<K, V> aVar) {
        aVar.c.b = aVar.b;
        aVar.b.c = aVar.c;
    }

    public final V a() {
        a aVar = this.a;
        while (true) {
            aVar = aVar.c;
            if (aVar.equals(this.a)) {
                return null;
            }
            Object a = aVar.a();
            if (a != null) {
                return a;
            }
            abj.d(aVar);
            this.b.remove(aVar.a);
            ((abo) aVar.a).a();
        }
    }

    public final V a(K k) {
        a aVar = (a) this.b.get(k);
        if (aVar == null) {
            aVar = new a(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        a(aVar);
        return aVar.a();
    }

    public final void a(K k, V v) {
        a aVar = (a) this.b.get(k);
        if (aVar == null) {
            aVar = new a(k);
            b(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (Object obj2 = this.a.b; !obj2.equals(this.a); obj2 = obj2.b) {
            obj = 1;
            stringBuilder.append('{');
            stringBuilder.append(obj2.a);
            stringBuilder.append(':');
            stringBuilder.append(obj2.b());
            stringBuilder.append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
}

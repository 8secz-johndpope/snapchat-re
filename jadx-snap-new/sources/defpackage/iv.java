package defpackage;

import defpackage.jc.b;
import defpackage.jc.e;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: iv */
public class iv<K, V> extends jh<K, V> implements Map<K, V> {
    private jc<K, V> c;

    /* renamed from: iv$1 */
    class 1 extends jc<K, V> {
        1() {
        }

        /* Access modifiers changed, original: protected|final */
        public final int a() {
            return iv.this.b;
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(Object obj) {
            return iv.this.a(obj);
        }

        /* Access modifiers changed, original: protected|final */
        public final Object a(int i, int i2) {
            return iv.this.a[(i << 1) + i2];
        }

        /* Access modifiers changed, original: protected|final */
        public final V a(int i, V v) {
            return iv.this.a(i, (Object) v);
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(int i) {
            iv.this.d(i);
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(K k, V v) {
            iv.this.put(k, v);
        }

        /* Access modifiers changed, original: protected|final */
        public final int b(Object obj) {
            return iv.this.b(obj);
        }

        /* Access modifiers changed, original: protected|final */
        public final Map<K, V> b() {
            return iv.this;
        }

        /* Access modifiers changed, original: protected|final */
        public final void c() {
            iv.this.clear();
        }
    }

    public iv(int i) {
        super(i);
    }

    public iv(jh jhVar) {
        super(jhVar);
    }

    private jc<K, V> a() {
        if (this.c == null) {
            this.c = new 1();
        }
        return this.c;
    }

    public Set<Entry<K, V>> entrySet() {
        jc a = a();
        if (a.a == null) {
            a.a = new b();
        }
        return a.a;
    }

    public Set<K> keySet() {
        return a().d();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.b + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        jc a = a();
        if (a.b == null) {
            a.b = new e();
        }
        return a.b;
    }
}

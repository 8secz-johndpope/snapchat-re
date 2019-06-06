package defpackage;

import defpackage.f.c;
import java.util.HashMap;

/* renamed from: e */
public final class e<K, V> extends f<K, V> {
    public HashMap<K, c<K, V>> a = new HashMap();

    /* Access modifiers changed, original: protected|final */
    public final c<K, V> a(K k) {
        return (c) this.a.get(k);
    }

    public final V a(K k, V v) {
        c a = a(k);
        if (a != null) {
            return a.b;
        }
        this.a.put(k, b(k, v));
        return null;
    }

    public final V b(K k) {
        Object b = super.b(k);
        this.a.remove(k);
        return b;
    }

    public final boolean c(K k) {
        return this.a.containsKey(k);
    }
}

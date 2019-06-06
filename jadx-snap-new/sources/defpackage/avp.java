package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: avp */
public final class avp<K, V> {
    private final avs<V> a;
    private final LinkedHashMap<K, V> b = new LinkedHashMap();
    private int c = 0;

    public avp(avs<V> avs) {
        this.a = avs;
    }

    private int d(V v) {
        return v == null ? 0 : this.a.getSizeInBytes(v);
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final synchronized V a(K k, V v) {
        Object remove;
        remove = this.b.remove(k);
        this.c -= d(remove);
        this.b.put(k, v);
        this.c += d(v);
        return remove;
    }

    public final synchronized boolean a(K k) {
        return this.b.containsKey(k);
    }

    public final synchronized int b() {
        return this.c;
    }

    public final synchronized V b(K k) {
        return this.b.get(k);
    }

    public final synchronized K c() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.keySet().iterator().next();
    }

    public final synchronized V c(K k) {
        Object remove;
        remove = this.b.remove(k);
        this.c -= d(remove);
        return remove;
    }

    public final synchronized ArrayList<V> d() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.values());
        this.b.clear();
        this.c = 0;
        return arrayList;
    }
}

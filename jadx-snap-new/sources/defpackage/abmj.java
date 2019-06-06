package defpackage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: abmj */
public final class abmj<K, V> {
    private final Cache<K, V> a;

    public abmj(int i, int i2, TimeUnit timeUnit) {
        this.a = CacheBuilder.newBuilder().maximumSize((long) i).expireAfterWrite((long) i2, timeUnit).concurrencyLevel(1).build();
    }

    public final V a(K k) {
        return this.a.getIfPresent(k);
    }

    public final ConcurrentMap<K, V> a() {
        return this.a.asMap();
    }

    public final void a(K k, V v) {
        if (k != null && v != null) {
            this.a.put(k, v);
        }
    }

    public final V b(K k) {
        Object ifPresent = this.a.getIfPresent(k);
        this.a.invalidate(k);
        return ifPresent;
    }

    public final boolean c(K k) {
        return (k == null || a(k) == null) ? false : true;
    }

    public final void d(K k) {
        if (k != null) {
            this.a.invalidate(k);
        }
    }
}

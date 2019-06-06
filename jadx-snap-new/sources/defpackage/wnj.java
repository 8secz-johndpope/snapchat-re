package defpackage;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wnj */
final class wnj {
    final BiMap<String, fth> a;

    public wnj(Map<Class<?>, wnh> map) {
        Builder builder = ImmutableBiMap.builder();
        for (wnh a : map.values()) {
            for (Entry entry : a.a().entrySet()) {
                builder.put(entry.getValue(), entry.getKey());
            }
        }
        this.a = builder.build();
    }

    public final boolean a(fth fth) {
        return this.a.containsValue(fth);
    }
}

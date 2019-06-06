package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ewq */
public final class ewq {
    private final Map<fth, String> a;

    public ewq(Map<Class<?>, evf> map) {
        Builder builder = ImmutableMap.builder();
        for (evf a : map.values()) {
            for (Entry entry : a.a().entrySet()) {
                builder.put(entry.getKey(), entry.getValue());
            }
        }
        this.a = builder.build();
    }

    public final boolean a(fth fth) {
        return this.a.containsKey(fth);
    }

    public final String b(fth fth) {
        return (String) this.a.get(fth);
    }
}

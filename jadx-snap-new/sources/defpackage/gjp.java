package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;

/* renamed from: gjp */
public final class gjp {
    private static final Map<Class<?>, Class<?>> a;
    private static final Set<Class<?>> b;

    static {
        ImmutableMap build = ImmutableMap.builder().put(Integer.TYPE, Integer.class).put(Long.TYPE, Long.class).put(Boolean.TYPE, Boolean.class).put(Byte.TYPE, Byte.class).put(Character.TYPE, Character.class).put(Double.TYPE, Double.class).put(Float.TYPE, Float.class).put(Short.TYPE, Short.class).put(Void.TYPE, Void.class).build();
        a = build;
        b = ImmutableSet.copyOf(build.values());
    }

    public static long a(Long l) {
        return l == null ? 0 : l.longValue();
    }

    public static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean a(Class cls) {
        return b.contains(cls);
    }

    public static <T> Class<T> b(Class<T> cls) {
        Class cls2 = (Class) a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}

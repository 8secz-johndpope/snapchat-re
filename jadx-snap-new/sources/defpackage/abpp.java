package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abpp */
public final class abpp {
    static {
        ImmutableSet.copyOf(ImmutableMap.builder().put(Integer.TYPE, Integer.class).put(Long.TYPE, Long.class).put(Boolean.TYPE, Boolean.class).put(Byte.TYPE, Byte.class).put(Character.TYPE, Character.class).put(Double.TYPE, Double.class).put(Float.TYPE, Float.class).put(Short.TYPE, Short.class).put(Void.TYPE, Void.class).build().values());
    }

    public static double a(Double d) {
        return d == null ? 0.0d : d.doubleValue();
    }

    public static float a(Float f) {
        return f == null ? MapboxConstants.MINIMUM_ZOOM : f.floatValue();
    }

    public static int a(Integer num) {
        return abpp.a(num, 0);
    }

    public static int a(Integer num, int i) {
        return num == null ? i : num.intValue();
    }

    public static long a(Long l) {
        return l == null ? 0 : l.longValue();
    }

    public static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    public static double b(Double d) {
        return d == null ? 0.0d : d.doubleValue();
    }

    public static long b(Long l) {
        return l == null ? -1 : l.longValue();
    }
}

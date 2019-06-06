package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ife */
public final class ife {
    public final ConcurrentHashMap<Class<? extends Object>, Object> a = new ConcurrentHashMap();
    public final double b;
    private final String c;

    public ife(String str, double d) {
        akcr.b(str, "id");
        this.c = str;
        this.b = d;
    }

    public final <T> T a(Class<T> cls) {
        akcr.b(cls, "valueType");
        return this.a.get(cls);
    }
}

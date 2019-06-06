package defpackage;

import defpackage.aipq.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aipr */
public final class aipr<T> implements aipq<T> {
    private final Map<String, ajwy<b<?>>> a;

    /* renamed from: aipr$a */
    public static final class a extends RuntimeException {
        a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    aipr(Map<Class<?>, ajwy<b<?>>> map, Map<String, ajwy<b<?>>> map2, Map<Class<? extends T>, ajwy<b<? extends T>>> map3, Map<String, ajwy<b<? extends T>>> map4) {
        Map a = aipr.a(map, map2);
        Map a2 = aipr.a(map3, map4);
        if (a.isEmpty()) {
            a = a2;
        } else if (!a2.isEmpty()) {
            LinkedHashMap a3 = aipz.a(a.size() + a2.size());
            a3.putAll(a);
            a3.putAll(a2);
            a = a3;
        }
        this.a = a;
    }

    private static <C, V> Map<String, ajwy<b<?>>> a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap a = aipz.a(map.size() + map2.size());
        a.putAll(map2);
        for (Entry entry : map.entrySet()) {
            a.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(a);
    }

    private boolean b(T t) {
        ajwy ajwy = (ajwy) this.a.get(t.getClass().getName());
        if (ajwy == null) {
            return false;
        }
        b bVar = (b) ajwy.get();
        try {
            ((aipq) aiqf.a(bVar.b(t), "%s.create(I) should not return null.", bVar.getClass())).a(t);
            return true;
        } catch (ClassCastException e) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{bVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    private String c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    public final void a(T t) {
        if (!b(t)) {
            throw new IllegalArgumentException(c(t));
        }
    }
}

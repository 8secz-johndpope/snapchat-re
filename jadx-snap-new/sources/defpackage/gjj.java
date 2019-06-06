package defpackage;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.TreeMap;

/* renamed from: gjj */
public abstract class gjj<T, E> {
    private final Class<T> a;

    public gjj(Class<T> cls) {
        this.a = cls;
    }

    private static Object a(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private TreeMap<String, E> a(Object obj, Class cls) {
        Class superclass = cls.getSuperclass();
        TreeMap treeMap = superclass == null ? new TreeMap() : a(superclass.cast(obj), superclass);
        for (Field field : cls.getDeclaredFields()) {
            if (!(!this.a.isAssignableFrom(gjp.b(field.getType())) || Modifier.isTransient(field.getModifiers()) || field.isSynthetic())) {
                field.setAccessible(true);
                Object a = gjj.a(obj, field);
                if (a != null) {
                    treeMap.put(a(field), b(a));
                }
            }
        }
        return treeMap;
    }

    /* Access modifiers changed, original: protected */
    public String a(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        return serializedName != null ? serializedName.value() : field.getName();
    }

    public final TreeMap<String, E> a(Object obj) {
        return a(obj, obj.getClass());
    }

    public abstract E b(Object obj);
}

package defpackage;

import com.brightcove.player.event.Event;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: akls */
public final class akls {
    private static final Map<Class<?>, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b = new HashMap();
    private static final Map<String, String> c;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        a.put(Byte.TYPE, Byte.class);
        a.put(Character.TYPE, Character.class);
        a.put(Short.TYPE, Short.class);
        a.put(Integer.TYPE, Integer.class);
        a.put(Long.TYPE, Long.class);
        a.put(Double.TYPE, Double.class);
        a.put(Float.TYPE, Float.class);
        Map map = a;
        Class cls = Void.TYPE;
        map.put(cls, cls);
        for (Class cls2 : a.keySet()) {
            Class cls3 = (Class) a.get(cls2);
            if (!cls2.equals(cls3)) {
                b.put(cls3, cls2);
            }
        }
        hashMap = new HashMap();
        hashMap.put("int", "I");
        hashMap.put(Event.BOOLEAN, "Z");
        hashMap.put("float", "F");
        hashMap.put("long", "J");
        hashMap.put("short", "S");
        hashMap.put("byte", "B");
        hashMap.put("double", "D");
        hashMap.put("char", "C");
        hashMap.put("void", "V");
        HashMap hashMap2 = new HashMap();
        for (Entry entry : hashMap.entrySet()) {
            hashMap2.put(entry.getValue(), entry.getKey());
        }
        Collections.unmodifiableMap(hashMap);
        c = Collections.unmodifiableMap(hashMap2);
    }

    public static String a(Class<?> cls) {
        String str = "";
        if (cls == null) {
            return str;
        }
        String name = cls.getName();
        if (akly.a(name)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        if (name.startsWith("[")) {
            while (name.charAt(0) == '[') {
                name = name.substring(1);
                stringBuilder.append("[]");
            }
            if (name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';') {
                name = name.substring(1, name.length() - 1);
            }
            if (c.containsKey(name)) {
                name = (String) c.get(name);
            }
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        i = name.indexOf(36, i);
        name = name.substring(lastIndexOf + 1);
        if (i != -1) {
            name = name.replace('$', '.');
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(name);
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }
}

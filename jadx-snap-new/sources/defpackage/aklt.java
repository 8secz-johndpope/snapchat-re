package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: aklt */
public final class aklt {
    public static <E extends Enum<E>> E a(Class<E> cls, String str) {
        if (str == null) {
            return null;
        }
        try {
            return Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static <E extends Enum<E>> Map<String, E> a(Class<E> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            linkedHashMap.put(enumR.name(), enumR);
        }
        return linkedHashMap;
    }
}

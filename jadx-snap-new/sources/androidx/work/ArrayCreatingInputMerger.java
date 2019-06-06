package androidx.work;

import defpackage.po;
import defpackage.po.a;
import defpackage.pp;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ArrayCreatingInputMerger extends pp {
    private static Object a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    public final po a(List<po> list) {
        a aVar = new a();
        Map hashMap = new HashMap();
        for (po poVar : list) {
            for (Entry entry : Collections.unmodifiableMap(poVar.b).entrySet()) {
                Object newInstance;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value.getClass();
                Object obj = hashMap.get(str);
                if (obj != null) {
                    Class cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                        } else {
                            newInstance = Array.newInstance(obj.getClass(), 2);
                            Array.set(newInstance, 0, obj);
                            Array.set(newInstance, 1, value);
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = a(obj, value);
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        value = a(value, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    hashMap.put(str, value);
                } else if (cls.isArray()) {
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(value.getClass(), 1);
                    Array.set(newInstance, 0, value);
                }
                value = newInstance;
                hashMap.put(str, value);
            }
        }
        aVar.a(hashMap);
        return aVar.a();
    }
}

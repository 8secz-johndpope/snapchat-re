package defpackage;

import android.arch.lifecycle.CompositeGeneratedAdaptersObserver;
import android.arch.lifecycle.FullLifecycleObserver;
import android.arch.lifecycle.FullLifecycleObserverAdapter;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.ReflectiveGenericLifecycleObserver;
import android.arch.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o */
public final class o {
    private static Map<Class, Integer> a = new HashMap();
    private static Map<Class, List<Constructor<? extends i>>> b = new HashMap();

    static GenericLifecycleObserver a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (o.b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) b.get(cls);
        int i = 0;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(o.a((Constructor) list.get(0), obj));
        }
        i[] iVarArr = new i[list.size()];
        while (i < list.size()) {
            iVarArr[i] = o.a((Constructor) list.get(i), obj);
            i++;
        }
        return new CompositeGeneratedAdaptersObserver(iVarArr);
    }

    private static i a(Constructor<? extends i> constructor, Object obj) {
        try {
            return (i) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Constructor<? extends i> a(Class<?> cls) {
        String str = ".";
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(canonicalName.replace(str, "_"));
            stringBuilder.append("_LifecycleAdapter");
            canonicalName = stringBuilder.toString();
            if (!name.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(name);
                stringBuilder.append(str);
                stringBuilder.append(canonicalName);
                canonicalName = stringBuilder.toString();
            }
            Constructor declaredConstructor = Class.forName(canonicalName).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static int b(Class<?> cls) {
        if (a.containsKey(cls)) {
            return ((Integer) a.get(cls)).intValue();
        }
        int c = o.c(cls);
        a.put(cls, Integer.valueOf(c));
        return c;
    }

    private static int c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = o.a((Class) cls);
        if (a != null) {
            b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (g.a.a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            Object obj = null;
            if (o.d(superclass)) {
                if (o.b(superclass) == 1) {
                    return 1;
                }
                obj = new ArrayList((Collection) b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (o.d(cls2)) {
                    if (o.b(cls2) == 1) {
                        return 1;
                    }
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    obj.addAll((Collection) b.get(cls2));
                }
            }
            if (obj == null) {
                return 1;
            }
            b.put(cls, obj);
            return 2;
        }
    }

    private static boolean d(Class<?> cls) {
        return cls != null && k.class.isAssignableFrom(cls);
    }
}

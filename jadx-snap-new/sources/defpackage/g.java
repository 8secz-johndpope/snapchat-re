package defpackage;

import defpackage.j.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: g */
public final class g {
    public static g a = new g();
    private final Map<Class, a> b = new HashMap();
    private final Map<Class, Boolean> c = new HashMap();

    /* renamed from: g$a */
    public static class a {
        public final Map<defpackage.j.a, List<b>> a = new HashMap();
        final Map<b, defpackage.j.a> b;

        a(Map<b, defpackage.j.a> map) {
            this.b = map;
            for (Entry entry : map.entrySet()) {
                defpackage.j.a aVar = (defpackage.j.a) entry.getValue();
                List list = (List) this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, l lVar, defpackage.j.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar = (b) list.get(size);
                    try {
                        Method method;
                        Object[] objArr;
                        int i = bVar.a;
                        if (i == 0) {
                            method = bVar.b;
                            objArr = new Object[0];
                        } else if (i == 1) {
                            method = bVar.b;
                            objArr = new Object[]{lVar};
                        } else if (i != 2) {
                            size--;
                        } else {
                            method = bVar.b;
                            objArr = new Object[]{lVar, aVar};
                        }
                        method.invoke(obj, objArr);
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: g$b */
    static class b {
        int a;
        final Method b;

        b(int i, Method method) {
            this.a = i;
            this.b = method;
            this.b.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
            }
        }

        public final int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    g() {
    }

    private a a(Class cls, Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            a b = b(superclass);
            if (b != null) {
                hashMap.putAll(b.b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : b(b2).b.entrySet()) {
                g.a(hashMap, (b) entry.getKey(), (a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = g.c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(l.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                a a = sVar.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    g.a(hashMap, new b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.b.put(cls, aVar);
        this.c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private static void a(Map<b, a> map, b bVar, a aVar, Class cls) {
        a aVar2 = (a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            StringBuilder stringBuilder = new StringBuilder("Method ");
            stringBuilder.append(method.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
            stringBuilder.append(aVar2);
            stringBuilder.append(", new value ");
            stringBuilder.append(aVar);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    private static Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Class cls) {
        if (this.c.containsKey(cls)) {
            return ((Boolean) this.c.get(cls)).booleanValue();
        }
        Method[] c = g.c(cls);
        for (Method annotation : c) {
            if (((s) annotation.getAnnotation(s.class)) != null) {
                a(cls, c);
                return true;
            }
        }
        this.c.put(cls, Boolean.FALSE);
        return false;
    }

    public final a b(Class cls) {
        a aVar = (a) this.b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}

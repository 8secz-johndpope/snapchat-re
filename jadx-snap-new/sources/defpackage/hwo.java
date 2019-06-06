package defpackage;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hwo */
public final class hwo {
    public final Map<Class<? extends hwg<?>>, ajdx<hwm<?, ?>>> a;
    private Map<String, hwn> b;

    public hwo(Map<Class<? extends hwg<?>>, ? extends ajdx<hwm<?, ?>>> map) {
        akcr.b(map, "processorMap");
        this.a = map;
    }

    public final Map<String, hwn> a(hwp hwp) {
        akcr.b(hwp, "scope");
        if (this.b == null) {
            HashMap hashMap = new HashMap();
            for (Entry entry : this.a.entrySet()) {
                if (((Class) entry.getKey()).isAnnotationPresent(hwk.class)) {
                    Annotation annotation = ((Class) entry.getKey()).getAnnotation(hwk.class);
                    if (annotation != null) {
                        hwk hwk = (hwk) annotation;
                        if (hashMap.containsKey(hwk.a())) {
                            throw new IllegalStateException("Can't have two jobs types with the same identifier.");
                        }
                        try {
                            ((Class) entry.getKey()).getConstructor(new Class[]{hwh.class, hwk.b()});
                            Map map = hashMap;
                            String a = hwk.a();
                            Class cls = (Class) entry.getKey();
                            Class b = hwk.b();
                            Object value = entry.getValue();
                            if (value != null) {
                                map.put(a, new hwn(cls, hwp, b, (ajdx) value));
                            } else {
                                throw new ajxt("null cannot be cast to non-null type io.reactivex.Single<com.snap.durablejob.DurableJobProcessor<com.snap.durablejob.DurableJob<*>, *>>");
                            }
                        } catch (NoSuchMethodException unused) {
                            StringBuilder stringBuilder = new StringBuilder("The durable job type ");
                            stringBuilder.append((Class) entry.getKey());
                            stringBuilder.append(' ');
                            stringBuilder.append("must have a constructor ");
                            stringBuilder.append((Class) entry.getKey());
                            stringBuilder.append("({");
                            stringBuilder.append(hwh.class);
                            stringBuilder.append("}, {");
                            stringBuilder.append(akde.a(hwk.b()));
                            stringBuilder.append("})");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.durablejob.DurableJobIdentifier");
                }
                throw new IllegalStateException("Invalid DurableJobIdentifier annotation");
            }
            this.b = ajzm.c((Map) hashMap);
        }
        Map map2 = this.b;
        if (map2 == null) {
            akcr.a("configMap");
        }
        return map2;
    }
}

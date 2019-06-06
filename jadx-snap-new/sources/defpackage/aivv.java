package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: aivv */
public final class aivv {

    /* renamed from: aivv$a */
    public interface a<T> {
        int a(T t);
    }

    private static <T> Iterable<T> a(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    private static <T> Iterable<T> a(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class a : iterable) {
            arrayList.add(aivv.a((Class) cls, a));
        }
        return arrayList;
    }

    private static <T> T a(Class<T> cls, Class<?> cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            ServiceConfigurationError serviceConfigurationError = new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
        }
    }

    public static <T> List<T> a(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, final a<T> aVar) {
        Iterable<Object> a = aivv.a(classLoader) ? aivv.a((Class) cls, (Iterable) iterable) : aivv.a((Class) cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (Object add : a) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new Comparator<T>() {
            public final int compare(T t, T t2) {
                return aVar.a(t) - aVar.a(t2);
            }
        }));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

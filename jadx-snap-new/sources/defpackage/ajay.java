package defpackage;

import java.util.ServiceConfigurationError;

/* renamed from: ajay */
public final class ajay {
    public static <T> T a(Class<?> cls, Class<T> cls2) {
        Class cls3;
        try {
            cls3 = cls3.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
            return cls3;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Provider ");
            stringBuilder.append(cls3.getName());
            stringBuilder.append(" could not be instantiated.");
            throw new ServiceConfigurationError(stringBuilder.toString(), e);
        }
    }
}

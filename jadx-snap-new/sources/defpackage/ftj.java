package defpackage;

import java.lang.reflect.Type;

/* renamed from: ftj */
public final class ftj {

    /* renamed from: ftj$a */
    public interface a<T> {
    }

    public static a<fth> a(fth fth) {
        return new -$$Lambda$ftj$MJkOVdZyOVy3LADYbDlnNOuh2gw(((Enum) fth).getDeclaringClass());
    }

    public static <T extends Enum<T>> Class<T> a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isEnum()) {
                return cls;
            }
        }
        return null;
    }

    public static Enum a(Class cls, String str) {
        try {
            return Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean b(Type type) {
        return ftj.a(type) != null;
    }
}

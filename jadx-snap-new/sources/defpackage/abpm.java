package defpackage;

@Deprecated
/* renamed from: abpm */
public final class abpm {
    public static String a(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(".");
        return lastIndexOf > 0 ? name.substring(lastIndexOf + 1) : name;
    }

    public static String b(Class cls) {
        String a = abpm.a(cls);
        return a.length() > 23 ? a.substring(0, 23) : a;
    }
}

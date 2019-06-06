package defpackage;

/* renamed from: ainv */
public final class ainv<T extends Enum<T>> implements ainu<T, String> {
    private final Class<T> a;

    private ainv(Class<T> cls) {
        this.a = cls;
    }

    public static <T extends Enum<T>> ainv<T> a(Class<T> cls) {
        return new ainv(cls);
    }

    public static String a(T t) {
        return t.name();
    }

    /* renamed from: a */
    public final T decode(String str) {
        return Enum.valueOf(this.a, str);
    }

    public final /* synthetic */ Object encode(Object obj) {
        return ((Enum) obj).name();
    }
}

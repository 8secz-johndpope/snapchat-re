package defpackage;

/* renamed from: auk */
public final class auk {
    public static aum a = aul.a;

    private static void a(Class<?> cls, String str) {
        if (a.a(2)) {
            a.a(cls.getSimpleName(), str);
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (a.a(2)) {
            a.a(cls.getSimpleName(), String.format(null, str, new Object[]{obj}));
        }
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2) {
        if (a.a(2)) {
            a.a(cls.getSimpleName(), String.format(null, str, new Object[]{obj, obj2}));
        }
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (auk.a()) {
            auk.a(cls, String.format(null, str, new Object[]{obj, obj2, obj3}));
        }
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (a.a(2)) {
            a.a(cls.getSimpleName(), String.format(null, str, new Object[]{obj, obj2, obj3, obj4}));
        }
    }

    public static void a(Class<?> cls, String str, Object... objArr) {
        if (a.a(2)) {
            a.a(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static boolean a() {
        return a.a(2);
    }

    public static void b(Class<?> cls, String str, Object... objArr) {
        if (a.a(5)) {
            a.b(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }
}

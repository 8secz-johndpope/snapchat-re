package defpackage;

import defpackage.aiyy.b;

/* renamed from: aiyz */
public final class aiyz<T> implements aiyi<T> {
    private final b<T> a;

    private aiyz(b<T> bVar) {
        this.a = bVar;
    }

    public static <T> aiyz<T> a(b<T> bVar) {
        return new aiyz(bVar);
    }

    public final T a() {
        return aiyy.a.a(this.a);
    }

    public final T a(Object obj) {
        aiyy.a(this.a, obj);
        return null;
    }
}

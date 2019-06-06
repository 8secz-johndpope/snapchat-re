package defpackage;

import android.content.Context;

/* renamed from: aiqt */
public abstract class aiqt<T> implements aiqv<T> {
    private final aiqv<T> a = null;

    public abstract T a();

    public final synchronized T a(Context context, aiqw<T> aiqw) {
        T a;
        a = a();
        if (a == null) {
            a = aiqw.a(context);
            if (a != null) {
                a(a);
            } else {
                throw new NullPointerException();
            }
        }
        return a;
    }

    public abstract void a(T t);
}

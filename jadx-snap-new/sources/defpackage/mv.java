package defpackage;

/* renamed from: mv */
public class mv<T> {
    public final T d;

    mv(T t) {
        if (t != null) {
            this.d = t;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
}

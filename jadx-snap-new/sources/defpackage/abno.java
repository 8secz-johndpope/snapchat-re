package defpackage;

import com.google.common.base.Supplier;

/* renamed from: abno */
public final class abno<T> implements Supplier<T> {
    private final aipn<? extends T> a;

    public abno(aipn<? extends T> aipn) {
        this.a = aipn;
    }

    public final T get() {
        return this.a.get();
    }
}

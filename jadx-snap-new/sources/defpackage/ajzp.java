package defpackage;

import java.util.List;

/* renamed from: ajzp */
final class ajzp<T> extends ajyc<T> {
    private final List<T> a;

    public ajzp(List<? extends T> list) {
        akcr.b(list, "delegate");
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final T get(int i) {
        List list = this.a;
        int a = ajym.a((List) this);
        if (i >= 0 && a >= i) {
            return list.get(ajym.a((List) this) - i);
        }
        StringBuilder stringBuilder = new StringBuilder("Element index ");
        stringBuilder.append(i);
        stringBuilder.append(" must be in range [");
        stringBuilder.append(new akdy(0, ajym.a((List) this)));
        stringBuilder.append("].");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}

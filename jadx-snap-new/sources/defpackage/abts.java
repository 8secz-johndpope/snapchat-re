package defpackage;

import java.util.List;

/* renamed from: abts */
public final class abts {
    public final List<? extends abtt> a;
    private final boolean b;

    public abts(List<? extends abtt> list) {
        this(list, (byte) 0);
    }

    public abts(List<? extends abtt> list, byte b) {
        this.a = list;
        this.b = false;
    }

    public final List<? extends abtt> a() {
        return this.a;
    }

    public final boolean b() {
        return false;
    }
}

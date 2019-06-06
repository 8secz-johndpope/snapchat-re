package defpackage;

import defpackage.mje.a;
import java.util.EnumSet;

/* renamed from: kxq */
public final class kxq implements fth, mje {
    private final EnumSet<a> a = a.READ_ONLY;
    private final fth b;

    public kxq(fth fth) {
        akcr.b(fth, "underlyingKey");
        this.b = fth;
    }

    public final fth.a<?> a() {
        return this.b.a();
    }

    public final ftg b() {
        return this.b.b();
    }

    public final EnumSet<a> c() {
        return this.a;
    }

    public final fth d() {
        return this.b;
    }

    public final String name() {
        return this.b.name();
    }
}

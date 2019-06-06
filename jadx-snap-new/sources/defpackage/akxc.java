package defpackage;

import java.lang.reflect.Type;

/* renamed from: akxc */
final class akxc<R> implements akwi<R, Object> {
    private final Type a;
    private final ajdw b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    akxc(Type type, ajdw ajdw, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = type;
        this.b = ajdw;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final Object a(akwh<R> akwh) {
        ajdp akwx = this.c ? new akwx(akwh) : new akwy(akwh);
        Object akxb = this.d ? new akxb(akwx) : this.e ? new akww(akwx) : akwx;
        ajdw ajdw = this.b;
        if (ajdw != null) {
            akxb = akxb.b(ajdw);
        }
        if (this.f) {
            return akxb.a(ajcw.LATEST);
        }
        if (this.g) {
            return akxb.k();
        }
        if (this.h) {
            return ajvo.a(new ajqo(akxb));
        }
        if (this.i) {
            akxb = akxb.g();
        }
        return akxb;
    }

    public final Type a() {
        return this.a;
    }
}

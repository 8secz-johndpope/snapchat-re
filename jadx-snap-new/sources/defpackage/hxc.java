package defpackage;

import com.google.common.base.Optional;

/* renamed from: hxc */
public final class hxc implements ftk {
    private final hwy a;
    private final boolean b = false;

    public hxc(hwy hwy) {
        this.a = hwy;
    }

    private /* synthetic */ Optional j(fth fth) {
        return Optional.fromNullable(this.a.g(fth, false));
    }

    public final Optional<Boolean> a(fth fth) {
        return Optional.fromNullable(this.a.a(fth, false));
    }

    public final Optional<Float> b(fth fth) {
        return Optional.fromNullable(this.a.b(fth, false));
    }

    public final Optional<Double> c(fth fth) {
        return Optional.fromNullable(this.a.c(fth, false));
    }

    public final Optional<Integer> d(fth fth) {
        return Optional.fromNullable(this.a.d(fth, false));
    }

    public final Optional<Long> e(fth fth) {
        return Optional.fromNullable(this.a.e(fth, false));
    }

    public final Optional<String> f(fth fth) {
        return Optional.fromNullable(this.a.f(fth, false));
    }

    public final ajdp<Optional<Object>> g(fth fth) {
        return ajdp.b(new -$$Lambda$hxc$j2NLQjTSZAXqWBZRsPjbMVCOY6o(this, fth));
    }

    public final void h(fth fth) {
    }

    public final void i(fth fth) {
        hwy hwy = this.a;
        akcr.b(fth, "key");
        hxh a = hwy.e.a(fth);
        if (a != null) {
            hwy.a(a);
        }
    }
}

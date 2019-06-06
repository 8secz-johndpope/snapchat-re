package defpackage;

import com.google.common.base.Optional;

/* renamed from: wnl */
public final class wnl implements ftk {
    private wni a;

    public wnl(wni wni) {
        this.a = wni;
    }

    public final Optional<Boolean> a(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.a(fth, tno.SERVER));
    }

    public final Optional<Float> b(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.d(fth, tno.SERVER));
    }

    public final Optional<Double> c(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.e(fth, tno.SERVER));
    }

    public final Optional<Integer> d(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.c(fth, tno.SERVER));
    }

    public final Optional<Long> e(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.b(fth, tno.SERVER));
    }

    public final Optional<String> f(fth fth) {
        wni wni = this.a;
        return Optional.fromNullable(!wni.b.a(fth) ? null : wni.a.f(fth, tno.SERVER));
    }

    public final ajdp<Optional<Object>> g(fth fth) {
        wni wni = this.a;
        return !wni.b.a(fth) ? ajdp.b(Optional.absent()) : wni.a.g(fth, tno.SERVER);
    }

    public final void h(fth fth) {
    }

    public final void i(fth fth) {
    }
}

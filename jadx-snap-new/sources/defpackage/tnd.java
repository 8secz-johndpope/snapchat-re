package defpackage;

import com.google.common.base.Optional;

/* renamed from: tnd */
public final class tnd {
    public final tnj a;

    public tnd(tnj tnj) {
        akcr.b(tnj, "prefs");
        this.a = tnj;
    }

    public final Boolean a(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.a(fth, tno);
    }

    public final Long b(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.b(fth, tno);
    }

    public final Integer c(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.c(fth, tno);
    }

    public final Float d(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.d(fth, tno);
    }

    public final Double e(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.e(fth, tno);
    }

    public final String f(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return this.a.f(fth, tno);
    }

    public final ajdp<Optional<Object>> g(fth fth, tno tno) {
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        Object g = this.a.g(fth, tno);
        akcr.a(g, "prefs.observeKey(key, type)");
        return g;
    }
}

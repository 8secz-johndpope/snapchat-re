package defpackage;

import java.util.List;

/* renamed from: rzq */
public final class rzq<Req extends sak> implements ryv<Req> {
    private final rzf<Req> a;
    private final List<rzf<Req>> b;

    public rzq(rzf<Req> rzf) {
        this(rzf, (byte) 0);
    }

    private rzq(rzf<Req> rzf, byte b) {
        this.a = rzf;
        this.b = null;
    }

    public final rzf<Req> a() {
        return this.a;
    }
}

package defpackage;

import defpackage.jxj.a;

/* renamed from: jzw */
public final class jzw {
    private final ajwy<jwn> a;
    private final ajwy<jwk> b;
    private final ihh c;

    public jzw(ajwy<jwn> ajwy, ajwy<jwk> ajwy2, ihh ihh) {
        akcr.b(ihh, "clock");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ihh;
    }

    public final jzp a(a aVar, String str, idd idd) {
        akcr.b(str, "id");
        akcr.b(idd, "attribution");
        return new jzp(aVar, str, idd, this.a, this.b, this.c);
    }
}

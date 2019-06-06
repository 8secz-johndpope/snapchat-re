package defpackage;

import defpackage.adkk.a.a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: adkx */
public final class adkx {
    Map<adks, Long> a = new EnumMap(adks.class);
    a b;
    final ide c;
    final String d;
    final adhl e;
    final ihh f;

    public adkx(ide ide, String str, adhl adhl, ihh ihh) {
        akcr.b(ide, "caller");
        akcr.b(str, "playerTag");
        akcr.b(adhl, "glesVersion");
        akcr.b(ihh, "clock");
        this.c = ide;
        this.d = str;
        this.e = adhl;
        this.f = ihh;
    }

    public final Long a(adkw adkw) {
        akcr.b(adkw, "section");
        Long l = (Long) this.a.get(adkw.startEvent);
        Long l2 = (Long) this.a.get(adkw.endEvent);
        return (l == null || l2 == null || l2.longValue() < l.longValue()) ? null : Long.valueOf(l2.longValue() - l.longValue());
    }
}

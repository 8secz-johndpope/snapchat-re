package defpackage;

import defpackage.aksm.a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aktc */
public final class aktc extends aksm {
    public static final aktc n = new aktc(aktb.p);
    private static final ConcurrentHashMap<akrc, aktc> o = new ConcurrentHashMap();

    static {
        o.put(akrc.a, n);
    }

    private aktc(akqx akqx) {
        super(akqx, null);
    }

    public static aktc b(akrc akrc) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        aktc aktc = (aktc) o.get(akrc);
        if (aktc != null) {
            return aktc;
        }
        aktc = new aktc(akte.a(n, akrc));
        aktc aktc2 = (aktc) o.putIfAbsent(akrc, aktc);
        return aktc2 != null ? aktc2 : aktc;
    }

    public final akqx a(akrc akrc) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        return akrc == a() ? this : aktc.b(akrc);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(a aVar) {
        if (this.a.a() == akrc.a) {
            aVar.H = new aktk(aktd.a, akra.c);
            aVar.k = aVar.H.d();
            aVar.G = new akts((aktk) aVar.H, akra.d);
            aVar.C = new akts((aktk) aVar.H, aVar.h, akra.i);
        }
    }

    public final akqx b() {
        return n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aktc)) {
            return false;
        }
        return a().equals(((aktc) obj).a());
    }

    public final int hashCode() {
        return ("ISO".hashCode() * 11) + a().hashCode();
    }

    public final String toString() {
        akrc a = a();
        String str = "ISOChronology";
        if (a == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('[');
        stringBuilder.append(a.b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

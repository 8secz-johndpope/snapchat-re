package defpackage;

import com.google.protobuf.nano.MessageNano;

/* renamed from: aibt */
public final class aibt {
    public static aebp a(aibr aibr) {
        aebp aebp = new aebp();
        if (aibr.a != null) {
            aebp.a = aibo.a(aibr.a);
        }
        if (aibr.b != null) {
            aebp.b = aibr.b.doubleValue();
        }
        if (aibr.c != null) {
            aebp.c = aibr.c.doubleValue();
        }
        if (aibr.d != null) {
            aebp.d = aibr.d.doubleValue();
        }
        return aebp;
    }

    public static aibr a(aebp aebp) {
        aibr aibr = new aibr();
        if (!(aebp.a == null || MessageNano.messageNanoEquals(aebp.a, new aebn()))) {
            aibr.a = aibo.a(aebp.a);
        }
        aibr.b = Double.valueOf(aebp.b);
        aibr.c = Double.valueOf(aebp.c);
        aibr.d = Double.valueOf(aebp.d);
        return aibr;
    }
}

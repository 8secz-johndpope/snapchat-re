package defpackage;

import defpackage.aksm.a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aktb */
public final class aktb extends aksr {
    static final aktb p = aktb.a(akrc.a, 4);
    private static final ConcurrentHashMap<akrc, aktb[]> q = new ConcurrentHashMap();

    private aktb(akqx akqx, int i) {
        super(akqx, i);
    }

    private static aktb a(akrc akrc, int i) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        aktb[] aktbArr = (aktb[]) q.get(akrc);
        if (aktbArr == null) {
            aktbArr = new aktb[7];
            aktb[] aktbArr2 = (aktb[]) q.putIfAbsent(akrc, aktbArr);
            if (aktbArr2 != null) {
                aktbArr = aktbArr2;
            }
        }
        int i2 = i - 1;
        try {
            aktb aktb = aktbArr[i2];
            if (aktb == null) {
                synchronized (aktbArr) {
                    aktb = aktbArr[i2];
                    if (aktb == null) {
                        aktb aktb2 = akrc == akrc.a ? new aktb(null, i) : new aktb(akte.a(aktb.a(akrc.a, i), akrc), i);
                        aktbArr[i2] = aktb2;
                        aktb = aktb2;
                    }
                }
            }
            return aktb;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid min days in first week: ".concat(String.valueOf(i)));
        }
    }

    public final akqx a(akrc akrc) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        return akrc == a() ? this : aktb.a(akrc, 4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(a aVar) {
        if (this.a == null) {
            super.a(aVar);
        }
    }

    public final akqx b() {
        return p;
    }

    /* Access modifiers changed, original: final */
    public final boolean c(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    /* Access modifiers changed, original: final */
    public final long d(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (c(i)) {
                i2--;
            }
        }
        return ((((long) i) * 365) + ((long) (i2 - 719527))) * 86400000;
    }
}

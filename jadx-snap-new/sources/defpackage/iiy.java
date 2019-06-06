package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: iiy */
public final class iiy {
    private final Map<String, iix> a = new LinkedHashMap();
    private final ihh b;

    public iiy(ihh ihh) {
        akcr.b(ihh, "clock");
        this.b = ihh;
    }

    public final iix a(String str) {
        akcr.b(str, "id");
        iix iix = (iix) this.a.get(str);
        if (iix != null) {
            iiz iiz = iix.a;
            if ((iiz.a.isEmpty() ^ 1) != 0) {
                ija ija = (ija) ajyu.h(iiz.a);
                ija.b.compareAndSet(Long.MIN_VALUE, ija.c.c());
            }
        }
        return iix;
    }

    public final void a(String str, long j) {
        iix iix;
        akcr.b(str, "id");
        if (this.a.containsKey(str)) {
            iix = (iix) this.a.get(str);
        } else {
            iix iix2 = new iix(str, j, this.b);
            this.a.put(str, iix2);
            iix = iix2;
        }
        if (iix != null) {
            iiz iiz = iix.a;
            iiz.a.add(new ija(iiz.b, iiz.c));
        }
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: iis */
public final class iis {
    public final Map<String, iiw> a = new LinkedHashMap();
    private final ihh b;

    /* renamed from: iis$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public iis(ihh ihh) {
        akcr.b(ihh, "clock");
        this.b = ihh;
    }

    public final void a(iiw iiw) {
        akcr.b(iiw, "unlockableSwipeInteraction");
        iiv iiv = iiw.a;
        if (this.a.containsKey(iiv.a)) {
            iiw iiw2 = (iiw) this.a.get(iiv.a);
            if (iiw2 != null) {
                iiv iiv2 = iiw2.a;
                if (iiv2 != null) {
                    iiv.g += iiv2.g;
                }
            }
        }
        this.a.put(iiv.a, iiw);
    }
}

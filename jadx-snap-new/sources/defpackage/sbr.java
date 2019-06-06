package defpackage;

import defpackage.sak.a;
import java.util.Map;

/* renamed from: sbr */
public final class sbr {
    public static final ifi a(sak<?> sak) {
        akcr.b(sak, "receiver$0");
        Map m = sak.m();
        if (m != null) {
            Object obj = m.get(sap.a);
            if (obj != null) {
                if (obj != null) {
                    return (ifi) obj;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.framework.network.event.NetEventLogger");
            }
        }
        return null;
    }

    public static final void a(a<?> aVar, ifi ifi) {
        akcr.b(aVar, "builder");
        if (ifi != null) {
            aVar.b(sap.a, ifi);
        }
    }

    public static final void a(a<?> aVar, String str) {
        akcr.b(aVar, "builder");
        akcr.b(str, "name");
        aVar.b(sap.c, str);
    }

    public static final void b(a<?> aVar, String str) {
        akcr.b(aVar, "builder");
        akcr.b(str, "contentType");
        aVar.b(sap.b, str);
    }

    public static final void c(a<?> aVar, String str) {
        akcr.b(aVar, "builder");
        akcr.b(str, "feature");
        aVar.b(sap.d, str);
    }
}

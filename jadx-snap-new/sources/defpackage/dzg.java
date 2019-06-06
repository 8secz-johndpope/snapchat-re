package defpackage;

import defpackage.edg.a;
import java.util.List;

/* renamed from: dzg */
public final class dzg implements dzo {
    public final void a(dpp dpp, a aVar) {
        Object obj = null;
        if (dpp != null) {
            List b = dpp.b();
            if (b != null && b.contains(ecd.CONTINUOUS_PICTURE)) {
                obj = 1;
            }
        }
        if (obj != null) {
            aVar.a = ecd.CONTINUOUS_PICTURE;
        }
    }
}

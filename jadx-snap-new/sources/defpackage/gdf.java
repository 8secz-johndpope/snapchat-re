package defpackage;

import com.brightcove.player.event.EventType;
import defpackage.akhn.a;
import java.util.Map;

/* renamed from: gdf */
public final class gdf extends saa implements akhn {
    private final ryn a;

    public gdf(ryn ryn) {
        akcr.b(ryn, "serverTimeProvider");
        this.a = ryn;
    }

    public final void a(saq<sai> saq, sab sab) {
        akcr.b(saq, EventType.RESPONSE);
        akcr.b(sab, "chain");
        super.a((saq) saq, sab);
        ryn ryn = this.a;
        Map h = saq.h();
        String str = h != null ? (String) h.get("date") : null;
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj == null) {
            if (str == null) {
                akcr.a();
            }
            ryn.a = ryn.a(str);
            ryn.b = Long.valueOf(ryn.c.c());
        }
    }

    public final akhv intercept(a aVar) {
        akhv a = aVar != null ? aVar.a(aVar.a()) : null;
        if (a == null) {
            akcr.a();
        }
        return a;
    }
}

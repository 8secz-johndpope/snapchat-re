package defpackage;

import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.vpm.a;
import defpackage.vpm.b;

/* renamed from: vpo */
public final class vpo implements vpn {
    private final vps a;

    public vpo(vps vps) {
        akcr.b(vps, LocalMessageActionModel.ANALYTICS);
        this.a = vps;
    }

    public final void a(vpm vpm) {
        vpm vpm2 = vpm;
        akcr.b(vpm2, "event");
        if (vpm2 instanceof a) {
            a aVar = (a) vpm2;
            this.a.a(aVar.d, vsf.a(aVar.c), aVar.f, aVar.e, aayd.CONSUME, vsf.a(aVar.b));
            this.a.a(aVar.d, vsf.a(aVar.c), aVar.f, aVar.e, aayd.CONSUME, aVar.a.a, vsf.a(aVar.b));
            return;
        }
        if (vpm2 instanceof b) {
            b bVar = (b) vpm2;
            this.a.a(bVar.c, vsf.a(bVar.d), bVar.f, bVar.e, aayd.SHARE, vsf.a(bVar.b));
            this.a.a(bVar.c, vsf.a(bVar.d), bVar.f, bVar.e, aayd.SHARE, bVar.a.a, vsf.a(bVar.b));
        }
    }
}

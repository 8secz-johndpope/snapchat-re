package defpackage;

import com.google.common.base.Optional;
import defpackage.dpa.a;
import defpackage.dpa.b;
import defpackage.dpa.c;

/* renamed from: ead */
final class ead implements dqi {
    ajwl<Optional<dpp>> a = ajwl.i(Optional.absent());

    ead() {
    }

    public final dpp a() {
        return (dpp) ((Optional) this.a.p()).orNull();
    }

    public final void a(dom dom) {
        dpp a = a();
        if (a != null) {
            a.a(dom);
        }
    }

    public final void a(dom dom, int i, int i2, int i3, int i4) {
        dpp a = a();
        if (a != null) {
            a.a(dom, i, i2, i3, i4);
        }
    }

    public final void a(dpa dpa, b bVar, c cVar) {
        dpp a = a();
        if (a != null) {
            a.a(dpa, bVar, cVar);
            return;
        }
        dpa.a(a.INVALID_STATE, "Null cameraProxy. Possibly called during camera switch.", false, 0, bVar);
    }

    public final void a(dpa dpa, b bVar, c cVar, int i) {
        dpp a = a();
        if (a != null) {
            a.a(dpa, bVar, cVar, false, i);
            return;
        }
        dpa.a(a.INVALID_STATE, "Null cameraProxy. Possibly called during camera switch.", false, 0, bVar);
    }

    public final void a(ecc ecc) {
        dpp a = a();
        if (a != null) {
            a.a(ecc);
        }
    }

    public final ajdp<Optional<dpp>> b() {
        return this.a;
    }

    public final ajdj<dpp> c() {
        return this.a.a((ajfl) -$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).p(-$$Lambda$VEOSW9qHj5rzNhh8F39hRsxavLI.INSTANCE).d();
    }

    public final void d() {
        this.a.a(Optional.absent());
    }
}

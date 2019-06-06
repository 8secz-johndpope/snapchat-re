package defpackage;

import com.google.common.base.Supplier;
import defpackage.dyk.a;
import java.util.List;

/* renamed from: dzl */
public final class dzl implements dzo {
    private final dyk a;
    private final Supplier<eca> b;

    public dzl(Supplier<eca> supplier) {
        this(a.a, supplier);
    }

    private dzl(dyk dyk, Supplier<eca> supplier) {
        this.a = dyk;
        this.b = supplier;
    }

    public final void a(dpp dpp, edg.a aVar) {
        eca eca = (eca) this.b.get();
        dyk dyk = this.a;
        dyj.a dyi = dyk.a.W() ? new dyi() : eca == eca.CAMERA1 ? new dyl() : dyk.a.U() ? new dyi() : (dyk.a.V() && dyk.a.F()) ? new dyi() : new dyl();
        dyj dyj = new dyj(dyi);
        List<ecb> i = dpp.i();
        ecb ecb = null;
        if (!(i == null || i.isEmpty())) {
            for (ecb a : i) {
                ecb = dyj.a.a(a, ecb);
            }
        }
        if (ecb != null) {
            aVar.g = ecb;
        }
    }
}

package defpackage;

import defpackage.vpb.e;
import defpackage.vse.b;
import defpackage.vve.j;
import java.util.Arrays;

/* renamed from: vpf */
public final class vpf implements ajej, vpe {
    private final ajwl<vvc> a = new ajwl();
    private vva b;
    private final zfw c = zgb.a(vpg.e.callsite("ScanDataProviderImpl"));
    private final ajei d = new ajei();

    public vpf(vva vva) {
        this.b = vva;
    }

    public final /* bridge */ /* synthetic */ ajdp a() {
        return this.a;
    }

    public final void a(vpb vpb) {
        if (vpb.d() == aayc.SHAZAM) {
            e eVar = (e) vpb;
            this.a.a(new vvc(Arrays.asList(new j[]{new j(eVar.a)}), "", 0, new b(Integer.valueOf(0))));
            return;
        }
        String a = vpb.a();
        int b = vpb.b();
        ajei ajei = this.d;
        ajdx f = this.b.a(a, b).b((ajdw) this.c.f()).a((ajdw) this.c.l()).f(new -$$Lambda$vpf$hOjoG2nYsRiuhrXEh75DO6ht0QU(a, b));
        ajwl ajwl = this.a;
        ajwl.getClass();
        ajei.a(f.e(new -$$Lambda$pSZGVBJfbo6i9zXZDy9yPmYosDQ(ajwl)));
    }

    public final void dispose() {
        this.d.a();
    }

    public final boolean isDisposed() {
        return this.d.isDisposed();
    }
}

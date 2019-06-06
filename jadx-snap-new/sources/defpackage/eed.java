package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Typeface;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import defpackage.eeg.a.a;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: eed */
public final class eed implements dno {
    public a a;
    public aipn<eee> b;
    public aipn<a> c;
    public Context d;
    public Map<eeb, ajdp<Boolean>> e;
    private final zfw f = zgb.a(dnh.f.callsite("CameraModeContainerActivator"));

    /* renamed from: eed$a */
    public static class a {
        public final ajdp<Boolean> a;

        public a(ajdp<Boolean> ajdp, ajdp<dva> ajdp2, ajdp<ebk> ajdp3) {
            this.a = ajdp.a(ajdp3.a(-$$Lambda$eed$a$xTIIhFT_i30-B7npzoDf4-GWMhs.INSTANCE).p(-$$Lambda$eed$a$Css9VWAu4UFFlweHXgorKSkQ1Zk.INSTANCE), ajdp3.a(-$$Lambda$eed$a$171sJ8FudNt9xzXofbzlZ8Qv5u0.INSTANCE).p(-$$Lambda$eed$a$E0LYAFmOGPWiH0rZXyVWE8f3xTY.INSTANCE), ajdp3.a(-$$Lambda$eed$a$bTog1E4exQlJVRar8ldraTd1TKI.INSTANCE).p(-$$Lambda$eed$a$RL-bp-JC_qwTokvZK9MgXi-Jab0.INSTANCE), ajdp2.a(-$$Lambda$eed$a$l6OwYcHdBgKJhSlHXFbzBOqphZo.INSTANCE).p(-$$Lambda$eed$a$G3Q0GXQWHd44RSabQyX2H5fY3fE.INSTANCE)).e((ajdt) ajdp).j(ajfu.a);
        }

        private static /* synthetic */ boolean d(ebk ebk) {
            return ebk == ebk.REQUESTED;
        }

        private static /* synthetic */ boolean f(ebk ebk) {
            return ebk == ebk.READY;
        }
    }

    private static /* synthetic */ Optional a(Entry entry, Boolean bool) {
        return bool.booleanValue() ? Optional.of(entry.getKey()) : Optional.absent();
    }

    private /* synthetic */ void a(ajei ajei, ajei ajei2, ImmutableSet immutableSet) {
        ajei.a(((a) this.c.get()).a.a((ajdw) this.f.l()).f(new -$$Lambda$eed$07-NVFjeN3vSQET7mPGqgBZLF3w(this)));
        ajei.a(((eee) this.b.get()).a().d().c(new -$$Lambda$eed$RrMU4xFTe35P8K-ift5exelVfcY(this)).a((ajdw) this.f.l()).e(new -$$Lambda$eed$ye0t3Gmkeqpn55abVdDJCPHPn_M(this, ajei, ajei2, immutableSet)));
    }

    private /* synthetic */ void a(ajei ajei, ajei ajei2, ImmutableSet immutableSet, Typeface typeface) {
        ajei.dispose();
        eee eee = (eee) this.b.get();
        LayoutTransition layoutTransition = new LayoutTransition();
        ees.a(layoutTransition);
        eee.b.setLayoutTransition(layoutTransition);
        eef.a a = this.a.a((eee) this.b.get()).a((a) this.c.get()).a((Set) immutableSet).a().a();
        ajei2.a(a.start());
        a.a();
    }

    private /* synthetic */ ajeb b(Object obj) {
        return zki.a(this.d, 2, (ajdw) this.f.f());
    }

    public final ajej start() {
        ajei ajei = new ajei();
        ajei ajei2 = new ajei(ajei);
        ajei.a(ajdp.a(Collections2.transform(this.e.entrySet(), -$$Lambda$eed$-68hE3TZWl53CM5SBcmeTMJT_aE.INSTANCE), -$$Lambda$eed$-OgwNMmw1SvyQiqgxg-L4F_pSGc.INSTANCE).b((ajdw) this.f.h()).a((ajdw) this.f.l()).d().a(-$$Lambda$eed$erPJBTKEAq_WyULkwzecSTLX-5o.INSTANCE).d(new -$$Lambda$eed$FZ7-s50kq9Z3_fn3D-0R-1K_0i0(this, ajei, ajei2)));
        return ajei2;
    }
}

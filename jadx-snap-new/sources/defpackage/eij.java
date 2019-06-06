package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;
import defpackage.dnk.a;
import java.util.Collections;
import java.util.List;

/* renamed from: eij */
public final class eij implements zgj {
    public ajdv<ebo> a;
    public ajws<duu> b;
    public ajwl<Boolean> c;
    public ajwl<Integer> d;
    public eik e;
    public odu f;
    public Supplier<Optional<dnk>> g;
    private idd h;
    private zfw i;
    private Multiset<aesf> j;
    private ajwr<List<abyi>> k = new ajwr();
    private ajwo<ajdj<abyi>> l = null;
    private ajwo<Object> m = new ajwo();
    private boolean n;
    private boolean o;
    private ajei p = new ajei();

    public eij() {
        String str = "CaptureResultCollector";
        this.h = dnh.f.callsite(str);
        this.i = zgb.a(dnh.f.callsite(str));
        this.j = ConcurrentHashMultiset.create();
        this.n = false;
    }

    private void b() {
        this.l = new ajwo();
        this.p.a(this.l.f(-$$Lambda$eij$qqyj6t2ZipXynmOHlRh9EfEmA38.INSTANCE).p(-$$Lambda$eij$dpjewtv_2G-GUkCeymuB4_RItQw.INSTANCE).a(new -$$Lambda$VotEexGYNc04l-aRAfyvrIINI68(this)).b(ajdj.b(ajdx.b(Collections.emptyList()))).c(-$$Lambda$eij$YcGnKIXome1Jfnfq-PraEdE5bYo.INSTANCE).e(new -$$Lambda$eij$suUHS3xjlozH1ol_2uoM3Jr3-5Y(this)));
    }

    private static /* synthetic */ boolean b(Boolean bool) {
        return !bool.booleanValue();
    }

    private gtt c() {
        for (dnk dnk : ((Optional) this.g.get()).asSet()) {
            if (dnk instanceof a) {
                a aVar = (a) dnk;
                if (!aVar.c) {
                    return aVar.a;
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final ajdx<List<abyi>> a(ajdx<List<abyi>> ajdx, ajdx<List<abyi>> ajdx2) {
        ajwr ajwr = new ajwr();
        ajei ajei = this.p;
        ajdx a = ajdx.a((ajeb) ajdx, (ajeb) ajdx2, -$$Lambda$L47I44jNEzSxBHpjPVKnGZiqbeg.INSTANCE).a(new -$$Lambda$eij$UVwkm89xTZytwwhP-skWU7M2drU(this));
        ajwr.getClass();
        ajei.a(a.e(new -$$Lambda$zvL0mt6D4rNOeJhkSMV5KhIsnWs(ajwr)));
        return ajwr;
    }

    public final void a() {
        if (!this.j.isEmpty()) {
            try {
                this.a.a(new ebo(this.k, ebp.a.a(this.j, this.n, this.o), c(), false));
            } catch (Exception unused) {
            }
            this.m.a(ajxw.a);
        }
    }

    public final ajej start() {
        b();
        this.p.a(this.b.f((ajfb) new -$$Lambda$eij$oCG97ufq6FnsgGgx8XV9bUz1EHE(this)));
        this.p.a(this.c.j(ajfu.a).a(-$$Lambda$eij$eydwqeLDmBB26I4m_kSv3eY_eeU.INSTANCE).f(new -$$Lambda$eij$U9_oWnWHXaUM_l0gY4FmjTeYi0E(this)));
        this.p.a(this.m.f((ajfb) new -$$Lambda$eij$_XXB7ypnQ0CIvy6ZdR93b2eD8aE(this)));
        return this.p;
    }
}

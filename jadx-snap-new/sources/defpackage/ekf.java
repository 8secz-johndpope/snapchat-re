package defpackage;

import com.google.common.base.Optional;
import defpackage.eki.a.a;
import defpackage.ekl.b;
import defpackage.ekl.c;

/* renamed from: ekf */
public final class ekf implements dno {
    public dqm a;
    public a b;
    public aipn<ekl> c;
    public dnr d;
    private ekg e;
    private final zfw f = zgb.a(dnh.f.callsite("FlipCameraActivator"));

    private /* synthetic */ Boolean a() {
        return Boolean.valueOf(this.a.f());
    }

    private /* synthetic */ void a(ajei ajei, ajei ajei2, Object obj) {
        ajei.dispose();
        ajei2.a(this.b.a(this.e).a((ekl) this.c.get()).a(Optional.fromNullable(((ekl) this.c.get()).a())).a().a().start());
    }

    private /* synthetic */ void a(ajei ajei, Boolean bool) {
        this.e = ((ekl) this.c.get()).h;
        if (bool.booleanValue()) {
            eea eea = this.e.b;
            this.d.a(eea, "FlipCameraActivator");
            ajei.a(ajek.a(new -$$Lambda$ekf$g86nXswg1xjH6_nlTuq1Un0NjuI(this, eea)));
            this.e.a(this.a.d());
            ajej ajei2 = new ajei();
            ajei.a(ajei2);
            ajei2.a(((ekl) this.c.get()).d().f(new -$$Lambda$ekf$CrGkL5lXqkr4BrWa6GQltoj-g08(this)));
            ekl ekl = (ekl) this.c.get();
            ajej d = ekl.b().d().d((ajfb) new c(ekl));
            akcr.a((Object) d, "flipCameraObservable\n   …wValue)\n                }");
            ajei2.a(d);
            ekl = (ekl) this.c.get();
            d = ekl.c().d().d((ajfb) new b(ekl));
            akcr.a((Object) d, "doubleTapObservable\n    …wValue)\n                }");
            ajei2.a(d);
            ajei.a(((ekl) this.c.get()).e.d().d(new -$$Lambda$ekf$siNAu058b6fAhWMtBLMmXeS414I(this, ajei2, ajei)));
            ajei.a(((ekl) this.c.get()).d);
            return;
        }
        this.e.a.setVisibility(8);
    }

    private void a(boolean z) {
        this.e.a(z);
        ((ekl) this.c.get()).c.set(z);
    }

    public final ajej start() {
        ajei ajei = new ajei();
        ajei.a(ajdx.c(new -$$Lambda$ekf$L4RdQcgveHFTG7D8ZAm6f9CW7z4(this)).b((ajdw) this.f.h()).a((ajdw) this.f.l()).e(new -$$Lambda$ekf$TTzyWTWU_3EHgFZb-qOgMEo1I60(this, ajei)));
        return ajei;
    }
}

package defpackage;

import com.snap.lenses.app.explorer.LensExplorerFragment;
import defpackage.mqt.a;
import java.util.concurrent.Callable;

/* renamed from: lhx */
public final class lhx implements mqt {
    final acgu<zjm> a;
    final acgu<zjm> b;
    final ajwy<achb<zjm, zjk>> c;
    final ajei d;
    final ajdu<a, a> e;
    final zjm f;
    private final ajxe g;
    private final int h;

    /* renamed from: lhx$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ ide b;

        b(zgb zgb, ide ide) {
            this.a = zgb;
            this.b = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b, "DefaultLensExplorerController");
        }
    }

    /* renamed from: lhx$a */
    static final class a<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ lhx a;

        a(lhx lhx) {
            this.a = lhx;
        }

        public final /* synthetic */ Object call() {
            LensExplorerFragment lensExplorerFragment = new LensExplorerFragment();
            ((achb) this.a.c.get()).a((achd) new zjf(this.a.f, lensExplorerFragment, acgv.a().a(this.a.b).a()), this.a.a, null);
            ajdp ajdp = lensExplorerFragment.b;
            Object l = ajdp.a(this.a.e).l();
            akcr.a(l, "compose(analyticsTransformer).subscribe()");
            std.a(l, this.a.d);
            return ajdp;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lhx.class), "qualifiedSchedulers", "getQualifiedSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public /* synthetic */ lhx(ide ide, zgb zgb, ajwy ajwy, ajei ajei, ajdu ajdu, int i) {
        this(ide, zgb, ajwy, ajei, ajdu, kus.a, i);
    }

    private lhx(ide ide, zgb zgb, ajwy<achb<zjm, zjk>> ajwy, ajei ajei, ajdu<a, a> ajdu, zjm zjm, int i) {
        akcr.b(ide, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "navigationHost");
        akcr.b(ajei, "disposables");
        akcr.b(ajdu, "analyticsTransformer");
        akcr.b(zjm, "pageType");
        this.c = ajwy;
        this.d = ajei;
        this.e = ajdu;
        this.f = zjm;
        this.h = i;
        this.g = ajxh.a(new b(zgb, ide));
        Object d = acgu.k().a(acgw.PRESENT).a(achr.BOTTOM_TO_TOP).a((acis) acir.a(acis.d, acjb.b(), new aciq(this.h))).b((achg) this.f).a(true).d();
        akcr.a(d, "NavigationAction.builder…                 .build()");
        this.a = d;
        d = this.a.j();
        akcr.a(d, "explorerPresentAction.reverse()");
        this.b = d;
    }

    public final ajdp<a> a() {
        Object b = ajdp.a((Callable) new a(this)).b((ajdw) ((zfw) this.g.b()).l());
        akcr.a(b, "Observable\n            .…dSchedulers.mainThread())");
        return b;
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewStub;
import com.snapchat.android.R;
import defpackage.mcj.a;

/* renamed from: mbz */
public final class mbz implements mhi<a> {
    private final b a;
    private ajdp<mci> b = ajvo.a(ajot.a);
    private ajdp<mih> c = ajdp.b(mih.e);
    private ajdp<Boolean> d = ajvo.a(ajot.a);

    /* renamed from: mbz$b */
    public interface b {
        ide r();

        zgb s();

        akbl<Context, jn> t();

        ajdp<mmt> u();

        ajdp<lqf> w();

        miw x();
    }

    /* renamed from: mbz$a */
    public static abstract class a implements mha {

        /* renamed from: mbz$a$a */
        interface a {
            a a(ajdp<mci> ajdp);

            a a(b bVar);

            a a();

            a b(ajdp<mih> ajdp);

            a c(ajdp<Boolean> ajdp);
        }

        private ajdp<lqf> f() {
            return e().a(-$$Lambda$mbz$a$22BZZudBpYaaqI_WB__xkg3CnGk.INSTANCE);
        }

        public final ajej a() {
            return b().l();
        }

        public final ajdp<Object> b() {
            return d().b().d(f());
        }

        public abstract zfw c();

        public abstract mcf d();

        public abstract ajdp<lqf> e();
    }

    public mbz(b bVar) {
        this.a = bVar;
    }

    public final /* synthetic */ Object a() {
        return new a().a(this.a).b(this.c).a(this.b).c(this.d).a();
    }

    public final mbz a(ajdp<mih> ajdp) {
        this.c = ajdp;
        return this;
    }

    public final mbz b(ajdp<Boolean> ajdp) {
        this.d = this.d.e((ajdt) ajdp);
        return this;
    }

    public final mbz c(ajdp<ViewStub> ajdp) {
        this.a.s();
        zfw a = zgb.a(this.a.r(), "CarouselTooltipBuilder#attachToViewStub");
        this.b = ajdp.a(mit.a((int) R.layout.lenses_carousel_tooltip_view, mci.class, this.a.t(), false, false, 48)).b((ajdw) a.l()).c((ajdw) a.l());
        return this;
    }
}

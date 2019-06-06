package defpackage;

import android.content.Context;
import android.view.ViewStub;
import com.snapchat.android.R;
import defpackage.maf.a;

/* renamed from: lzy */
public final class lzy implements mhi<a> {
    private final c a;
    private ajdp<maf> b = ajvo.a(ajot.a);

    /* renamed from: lzy$c */
    public interface c {
        ide r();

        zgb s();

        akbl<Context, jn> t();

        ajdp<mmt> u();

        mwe v();

        ajdp<lqf> w();
    }

    /* renamed from: lzy$a */
    public static abstract class a implements mha {

        /* renamed from: lzy$a$a */
        interface a {
            a a(ajdp<maf> ajdp);

            a a(c cVar);

            a a();
        }

        public final ajej a() {
            return b().l();
        }

        public final ajdp<Object> b() {
            return c().b();
        }

        public abstract mad c();
    }

    /* renamed from: lzy$b */
    static abstract class b {
        public static ajdu<a, a> a(ajdp<lqf> ajdp) {
            return new lzx(ajdp);
        }

        public static mad a(ajdp<maf> ajdp, mae mae, zfw zfw, ajdu<a, a> ajdu) {
            return new lzs(ajdp, mae, zfw, ajdu);
        }

        public static mae a(ajdp<mmt> ajdp, mwe mwe, zfw zfw) {
            return new lzv((ajdp) ajdp, mwe, zfw, (byte) 0);
        }

        static zfw a(ide ide) {
            return zgb.a(ide.callsite("Hint"));
        }
    }

    public lzy(c cVar) {
        this.a = cVar;
    }

    public final /* synthetic */ Object a() {
        return new lzr.a().a(this.b).a(this.a).a();
    }

    public final lzy a(ajdp<ViewStub> ajdp) {
        this.a.s();
        zfw a = zgb.a(this.a.r(), "HintBuilder#attachToViewStub");
        this.b = ajdp.a(mit.a((int) R.layout.lenses_camera_hint_view, maf.class, this.a.t(), false, false, 32)).i().a().b((ajdw) a.l()).c((ajdw) a.l());
        return this;
    }
}

package defpackage;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Predicate;
import java.util.List;

/* renamed from: sog */
public class sog extends sna {
    public static final Predicate<sqh> q = new 1();
    private final sxk r;

    /* renamed from: sog$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqj) ((sqh) obj).c(sqh.ce, sqj.DEFAULT_OPERA_PLAYER)) == sqj.OPERA_SC_VIDEO_PLAYER;
        }
    }

    sog(Context context) {
        super(context);
        this.r = new sxk(context);
        this.c.addView(this.r, 0, new LayoutParams(-1, -1, 17));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        this.r.setLayoutParams(layoutParams);
    }

    public final void b() {
        super.b();
        if (this.o != null) {
            ((sxm) this.o).a();
        }
    }

    public final String f() {
        return "SC_VIDEO";
    }

    public final boolean h() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        if (!this.F.a()) {
            sqf sqf = (sqf) this.I.a(sqh.n);
            String str = sqf != null ? sqf.a : null;
            double doubleValue = ((Double) this.I.c(sqh.cf, Double.valueOf(1.0d))).doubleValue();
            String str2 = (String) this.I.a(sqh.cb);
            String d = this.I.d(sqh.cg);
            String d2 = this.I.d(sqh.ch);
            boolean booleanValue = ((Boolean) this.I.c(sqh.cc, Boolean.FALSE)).booleanValue();
            int i = booleanValue ? 5 : (str == null || str2 == null) ? 2 : 3;
            this.o = new sxm(doubleValue, d, (ofq) this.I.a(sqh.ck), (oen) this.I.a(sqh.cl), d2, i, (abtl) this.I.a(sqh.cj), (acaj) this.I.a(sqh.cm), (List) this.I.a(sqh.ci), str2, str, booleanValue);
            this.r.setVisibility(0);
            this.o.a(this.r);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean p() {
        return true;
    }
}

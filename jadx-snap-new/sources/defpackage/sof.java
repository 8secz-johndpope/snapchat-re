package defpackage;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import defpackage.adkk.a.a;
import defpackage.adkk.b;
import defpackage.siw.c;
import java.util.List;

/* renamed from: sof */
public class sof extends smz {
    public static final Predicate<sqh> l = new 1();
    final szq k;
    private final acav m;
    private sxl n;
    private final b o;

    /* renamed from: sof$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqc) ((sqh) obj).c(sqh.cn, sqc.DEFAULT_OPERA_IMAGE_PLAYER)) == sqc.OPERA_SC_IMAGE_PLAYER;
        }
    }

    /* renamed from: sof$2 */
    class 2 implements b {

        /* renamed from: sof$2$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                if (sof.this.F.a()) {
                    sof.this.I();
                }
            }
        }

        2() {
        }

        public final void a() {
            sof.this.k.post(new 1());
        }

        public final void a(final a aVar) {
            sof.this.k.post(new Runnable() {
                public final void run() {
                    if (sof.this.F.a()) {
                        sof.this.a(aVar.a);
                    }
                }
            });
        }

        public final void b() {
        }

        public final void c() {
            sof.this.b.a();
        }
    }

    sof(Context context) {
        this(context, new acav(context));
    }

    private sof(Context context, acav acav) {
        super(context);
        this.k = new szq();
        this.o = new 2();
        this.m = acav;
        this.a.addView(this.m);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        this.m.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(c cVar) {
        if (this.n != null) {
            if (J()) {
                this.n.a = o();
            }
            this.n.a(cVar.c());
            q();
            return;
        }
        throw new IllegalStateException("Initialize image player before file is loaded");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(sqf sqf, int i, int i2, siw.a aVar) {
        sqf sqf2 = sqf;
        int i3 = i;
        int i4 = i2;
        abtl abtl = null;
        String str = sqf2 != null ? sqf2.a : null;
        String d = this.I.d(sqh.ch);
        String str2 = (String) this.I.a(sqh.cb);
        boolean booleanValue = ((Boolean) this.I.c(sqh.cc, Boolean.FALSE)).booleanValue();
        abyc abyc = booleanValue ? abyc.CENTER_CROP : (str == null || str2 == null) ? abyc.CENTER_INSIDE : abyc.NEWPORT;
        abyc abyc2 = abyc;
        ofq ofq = (ofq) this.I.a(sqh.ck);
        acaj acaj = (acaj) this.I.a(sqh.cm);
        if (!(i3 == 0 || i4 == 0)) {
            abtl = new abtl(i3, i4);
        }
        this.n = new sxl(this.m, ofq, d, abyc2, acaj, abtl, this.o, (List) this.I.a(sqh.ci), str2, str, (Supplier) this.I.a(sqh.cR), booleanValue);
        this.n.a();
        this.b.a(D().a(sqf2.a, sqf2.b, i, i2, aVar));
    }

    public final void b() {
        super.b();
        sxl sxl = this.n;
        if (sxl != null) {
            sxl.b.b();
        }
        D();
    }

    public final String f() {
        return "SC_IMAGE";
    }

    public final boolean h() {
        return false;
    }
}

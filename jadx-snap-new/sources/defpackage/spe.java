package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Predicate;
import defpackage.adkk.a.a;
import defpackage.adkk.b;
import java.util.List;

/* renamed from: spe */
public class spe extends spc {
    public static final Predicate<sqh> d = new 1();
    final szq b;
    abtl c;
    private final acav e;
    private sxl f;
    private final b g;

    /* renamed from: spe$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqc) ((sqh) obj).c(sqh.cn, sqc.DEFAULT_OPERA_IMAGE_PLAYER)) == sqc.OPERA_SC_OVERLAY_BLOB_IMAGE_PLAYER;
        }
    }

    /* renamed from: spe$2 */
    class 2 implements b {

        /* renamed from: spe$2$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                if (spe.this.F.a()) {
                    spe.this.a(spe.this.c);
                }
            }
        }

        2() {
        }

        public final void a() {
            spe.this.b.post(new 1());
        }

        public final void a(final a aVar) {
            spe.this.b.post(new Runnable() {
                public final void run() {
                    if (spe.this.F.a()) {
                        spe.this.a(aVar.a);
                    }
                }
            });
        }

        public final void b() {
        }

        public final void c() {
        }
    }

    public spe(Context context) {
        this(context, new acav(context));
    }

    private spe(Context context, acav acav) {
        super(context);
        this.b = new szq();
        this.g = new 2();
        this.e = acav;
        this.a.addView(this.e);
    }

    public final void a(int i) {
    }

    /* Access modifiers changed, original: final */
    public final void a(LayoutParams layoutParams) {
        this.e.setLayoutParams(layoutParams);
    }

    public final void a(ohz ohz) {
        if (ohz.d() != null) {
            this.c = b(ohz);
            sxl sxl = this.f;
            if (sxl != null) {
                sxl.a(((jwj) ohz.d().c.a()).a());
                return;
            }
            throw new IllegalStateException("Initialize image player before file is loaded");
        }
    }

    public final abtl b(ohz ohz) {
        Bitmap a = ohz.d() != null ? ((jwj) ohz.d().c.a()).a() : null;
        return a == null ? null : new abtl(a.getWidth(), a.getHeight());
    }

    public final void b() {
        super.b();
        sxl sxl = this.f;
        if (sxl != null) {
            sxl.b.b();
        }
        D();
    }

    public final String f() {
        return "SC_OVERLAY_BLOB_IMAGE";
    }

    public final void m() {
        String d = this.I.d(sqh.ch);
        sqf sqf = (sqf) this.I.a(sqh.A);
        abtl abtl = null;
        String str = sqf != null ? sqf.a : null;
        ofq ofq = (ofq) this.I.a(sqh.ck);
        acaj acaj = (acaj) this.I.a(sqh.cm);
        int a = this.I.a(sqh.D, 0);
        int a2 = this.I.a(sqh.E, 0);
        if (!(a == 0 || a2 == 0)) {
            abtl = new abtl(a, a2);
        }
        this.f = new sxl(this.e, ofq, d, abyc.CENTER_INSIDE, acaj, abtl, this.g, (List) this.I.a(sqh.ci), (String) this.I.a(sqh.cb), str, null, ((Boolean) this.I.c(sqh.cc, Boolean.FALSE)).booleanValue());
        this.f.a();
    }

    public final void n() {
        this.e.setLayoutParams(new LayoutParams(-1, -1));
    }

    public final void o() {
        z().m();
    }
}
